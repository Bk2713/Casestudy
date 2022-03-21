package hiber.tns.entity;
 
import javax.persistence.*;

@Entity
public class Student {
		@Id
		private int uid;
		private String name;
		public int getUid() {
			return uid;
			
		}
		public void setUid(int uid) {
			this.uid=uid;
			
		}
		public String getName() {
			return name;
		}
}

