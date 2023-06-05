package Train;

public class Test {
    //Biến toàn cục, hay còn gọi là biến instance
	//Không cần trả giá trị, default value là giá trị của kiểu dữ liệu đó 
	private int bankinh;
	private int Chuvi;
	public static String Ten = "Nguyen Hoang Phuong";
	public Test() {
		
	}
	public void setBanKinh(int bankinh) {	
			this.bankinh=bankinh;	
	}
	public int getBanKinh() {
		return bankinh;
	}
	public void setChuVi(int Chuvi) {
		this.Chuvi=Chuvi;
	}
	
	public int TinhChuvi() {
		return Chuvi+1;
	}
	
	public void In() {
		//Biến local , được khai báo trong phương thức nào đó, chỉ được sử dụng trong này 
		int k ;
		System.out.print(getBanKinh());
	}

	public static void main(String[] args) {
		Test ts= new Test();
		ts.setBanKinh(3);
		int hehe=ts.TinhChuvi();
		System.out.print(hehe);
	}
	
	// Cần test gì nữa không nhỉ?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
	// Ủa git là thế này thôi đó hả  
	// Thì ra cũng đơn giản mà nhỉ?
	// Để làm việc vói Git 

}
