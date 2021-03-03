package abstraction;
class Data{
	private int no;
	private String name;
	private String address;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String nane) {
		this.name = nane;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

class DisplayData{
	Data d;
public void getData(Data d) {
	this.d=d;
	System.out.println(d.getAddress()+"  "+d.getName()+"   "+d.getNo());
	
}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
 Data d=new Data();
d.setName("james");
 d.setAddress("guntur");
 d.setName("knr");
 d.setNo(123);
 DisplayData display=new DisplayData();
 display.getData(d);
	}

}
