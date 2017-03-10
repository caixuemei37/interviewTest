import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Path("/lun")
public class test3 {

	private SimpleMemoryPersistencyLayer persistentLayer = new SimpleMemoryPersistencyLayer();

	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response create(LUN lun) {
		persistentLayer.create(lun);
		return Response.ok().build();
	}

	@DELETE
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("/{id}")
	public Response delete(@PathParam("id") long id) {
		if (persistentLayer.get(id) == null) {
			throw new IllegalStateException("No such LUN:" + id);
		}

		persistentLayer.delete(id);
		return Response.ok().build();
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("/{id}")
	public Response update(@PathParam("id") long id, LUN lun) {
		if (persistentLayer.get(id) == null) {
			throw new IllegalStateException("No such LUN:" + id);
		}

		persistentLayer.update(lun);
		return Response.ok().build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("/{id}")
	public LUN get(long id) {
		if (persistentLayer.get(id) == null) {
			throw new IllegalStateException("No such LUN:" + id);
		}

		return persistentLayer.get(id);
	}

	@XmlRootElement(name = "lun")
	@XmlAccessorType(XmlAccessType.PROPERTY)
	public static class LUN {
		private long id;
		private long size;
		private String label;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getSize() {
			return size;
		}

		public void setSize(long size) {
			this.size = size;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

	}

	private static class SimpleMemoryPersistencyLayer {
		private ConcurrentHashMap<Long, LUN> lunMap = new ConcurrentHashMap<Long, LUN>();

		public void create(LUN... luns) {
			for (LUN lun : luns) {
				lunMap.put(lun.getId(), lun);
			}
		}

		public void delete(Long... ids) {
			for (Long id : ids) {
				lunMap.remove(id);
			}
		}

		public void update(LUN... luns) {
			for (LUN lun : luns) {
				lunMap.put(lun.getId(), lun);
			}
		}

		public LUN get(long id) {
			return lunMap.get(id);
		}
	}
}
