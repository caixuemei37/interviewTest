import java.util.concurrent.ConcurrentHashMap;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

public class test3 {

	private ConcurrentHashMap<Long, LUN> lunMap = new ConcurrentHashMap<Long, LUN>();

	@Path("/lun/create")
	@POST
	public void create(LUN... luns) {
		for (LUN lun : luns) {
			lunMap.put(lun.getId(), lun);
		}
	}

	@Path("/lun/delete")
	@DELETE
	public void delete(Long... ids) {
		for (Long id : ids) {
			lunMap.remove(id);
		}
	}

	@Path("/lun/update")
	@PUT
	public void update(LUN... luns) {
		for (LUN lun : luns) {
			lunMap.put(lun.getId(), lun);
		}
	}

	@Path("/lun/retriveInfo")
	@GET
	public LUN get(long id) {
		return lunMap.get(id);
	}

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
}
