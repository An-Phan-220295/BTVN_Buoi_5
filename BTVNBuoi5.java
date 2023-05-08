/*
Program:BTVN Buổi 5
Creator : An Phan
Date: 07/05/2023
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class BTVNBuoi5 {
public static void main(String[] args) {
//		timSoLonNhat();
//		checkChanLe();
//		tong3So(); 
//		congTruNhanChia();
//		sinhVienTreNhat();
//		soChanLe();
//		canBoNamTreNhat();
//		sinhVienXaTruongNhat();
	}

public static double inputRealNumber(double chanDuoi,double chanTren, String Text) {
	//Hàm check số đầu vào là số thực.
	
	//Code đầu vào
	Scanner scan = new Scanner(System.in);
	double number;
	while (true) {
		try {
			System.out.print(Text);
			number = scan.nextDouble();
			while (number < chanDuoi || number > chanTren) {
				System.out.println("Vui lòng nhập một số trong khoản "+ chanDuoi+" đến "+chanTren);
				number = scan.nextDouble();
			}
			break;
		} catch (InputMismatchException mme) {
			// TODO: handle exception
			System.out.println("Vui lòng nhập một số");
			scan.nextLine();
		}
	}
	return number;
}

public static int inputIntegerNumber(int chanDuoi,int chanTren, String Text) {
	//Hàm check số đầu vào là số nguyên.
	
	//Code đầu vào
	Scanner scan = new Scanner(System.in);
	int number;
	while (true) {
		try {
			System.out.print(Text);
			number = scan.nextInt();
			while (number < chanDuoi || number > chanTren) {
				System.out.println("Vui lòng nhập một số nguyên trong khoản "+ chanDuoi+" đến "+chanTren);
				number = scan.nextInt();
			}
			break;
		} catch (InputMismatchException mme) {
			// TODO: handle exception
			System.out.println("Vui lòng nhập một số nguyên.");
			scan.nextLine();
		}
	}
	return number;
}

public static int inputIntegerNumberExcept0(int chanDuoi,int chanTren, String Text) {
	//Hàm check số đầu vào là số nguyên khác 0.
	
	//Code đầu vào
	Scanner scan = new Scanner(System.in);
	int number;
	while (true) {
		try {
			System.out.print(Text);
			number = scan.nextInt();
			while (number < chanDuoi || number > chanTren|| number == 0) {
				System.out.println("Vui lòng nhập một số nguyên khác 0 trong khoản "+ chanDuoi+" đến "+chanTren);
				number = scan.nextInt();
			}
			break;
		} catch (InputMismatchException mme) {
			// TODO: handle exception
			System.out.println("Vui lòng nhập một số nguyên khác 0.");
			scan.nextLine();
		}
	}
	return number;
}

public static void timSoLonNhat() {
		//1. Tìm số lớn nhất trong 3 số.
		
		//Code đầu vào
		double so1 = inputRealNumber(-10000,10000, "Vui lòng nhập số thứ nhất: ");
		double so2 = inputRealNumber(-10000,10000, "Vui lòng nhập số thứ hai: ");
		double so3 = inputRealNumber(-10000,10000, "Vui lòng nhập số thứ ba: ");
		double max= so1;
		
		//Code xử lý
		if (so2>max) {
			max = so2;
		}
		if (so3>max) {
			max = so3;
		}
		//Code đầu ra
		System.out.println("Số lớn nhất là :"+max);
	}

public static void checkChanLe() {
		//2. Kiểm tra chẵn lẻ.
		
		//Code đầu vào
		int number = inputIntegerNumber(-10000,10000, "Vui lòng nhập 1 số nguyên cần kiểm tra (nhập 0 để thoát): ");
		if (number == 0 )
			System.exit(0);
		else if (number % 2 == 0 )
			System.out.println(number +" là số chẵn.");
		else 
			System.out.println(number +" là số lẻ.");
	}

public static void tong3So() {
		//3. Tính tổng 3 số do người dùng nhập vào.
	
		//Code đầu vào
		double so1 = inputRealNumber(-10000,10000, "Vui lòng nhập số thứ nhất: ");
		double so2 = inputRealNumber(-10000,10000, "Vui lòng nhập số thứ hai: ");
		double so3 = inputRealNumber(-10000,10000, "Vui lòng nhập số thứ ba: ");
		
		//Code xử lý
		double sum = so1 + so2 + so3;
		
		//Code đầu ra
		System.out.println("Tổng 3 số là: "+sum);
	}

public static void congTruNhanChia() {
		//4.	Xây dựng chương trình tính toán đơn giản cộng, trừ, nhân chia số nguyên khác không.
		//		Yêu cầu SỬ DỤNG HÀM. Xuất thông báo cho người dùng chọn : Nếu 1 là +, 2 là -, 3 là *, 4 là chia.
		String temp;
		Scanner sc = new Scanner (System.in);
		
		//Menu lựa chọn
		System.out.println("1. Tính tổng.");
		System.out.println("2. Tính hiệu.");
		System.out.println("3. Tính nhân.");
		System.out.println("4. Tính chia.");
		System.out.println("0. Thoát.");
		
		//Lựa chọn từ người dùng
		int select = inputIntegerNumber(-1, 5, "Vui lòng nhập lựa chọn từ 0 đến 4 như menu trên: ");
		
		//Xử lý lựa chọn
		switch (select) {
		case 1:
			int sum = 0;
			System.out.println("Bạn đã chọn chương trình tính tổng.");
			System.out.println("Vui lòng nhập các số cần tính và Enter thêm 1 lần để hiển thị kết quả: ");
			temp = sc.nextLine();
			while(!temp.isEmpty()) {
				try {
					if (temp.equals("0"))
					{
						System.out.println("Vui lòng nhập lại số khác 0.");
						temp = sc.nextLine();
					}
					int number = Integer.parseInt(temp);
					sum += number;
					temp = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Vui lòng nhập 1 số.");
					temp = sc.nextLine();
				}
			}
			System.out.println("Phép cộng các số đã nhập là: "+ sum);
			break;
			
		case 2:
			System.out.println("Bạn đã chọn chương trình tính hiệu.");
			System.out.println("Vui lòng nhập các số cần tính và Enter thêm 1 lần để hiển thị kết quả: ");
			temp = sc.nextLine();
			int minus = 0;
			boolean check = true;
			while(!temp.isEmpty()) {
				try {
					if (temp.equals("0"))
					{
						System.out.println("Vui lòng nhập lại số khác 0.");
						temp = sc.nextLine();
					}
					int number = Integer.parseInt(temp);
					if (check) {
						minus = number;
						check = false;
					}
					else
						minus -= number;
					temp = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Vui lòng nhập 1 số.");
					temp = sc.nextLine();
				}
			}
			System.out.println("Phép trừ các số đã nhập là: "+ minus);
			break;
		case 3:
			int multiply = 1;
			System.out.println("Bạn đã chọn chương trình tính tích.");
			System.out.println("Vui lòng nhập các số cần tính và Enter thêm 1 lần để hiển thị kết quả: ");
			temp = sc.nextLine();
			while(!temp.isEmpty()) {
				try {
					if (temp.equals("0"))
					{
						System.out.println("Vui lòng nhập lại số khác 0.");
						temp = sc.nextLine();
					}
					int number = Integer.parseInt(temp);
					multiply *= number;
					temp = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Vui lòng nhập 1 số.");
					temp = sc.nextLine();
				}
			}
			System.out.println("Phép nhân các số đã nhập là: "+ multiply);
			break;
			
		case 4:
			System.out.println("Bạn đã chọn chương trình tính chia.");
			System.out.println("Vui lòng nhập các số cần tính và Enter thêm 1 lần để hiển thị kết quả: ");
			temp = sc.nextLine();
			int d = 0;
			double divide = 0;
			boolean check1 = true;
			while(!temp.isEmpty()) {
				try {
					if (temp.equals("0"))
					{
						System.out.println("Vui lòng nhập lại số khác 0.");
						temp = sc.nextLine();
					}
					int number = Integer.parseInt(temp);
					if (check1) {
						divide = number;
						check1 = false;
					}
					else
						divide /= number;
					temp = sc.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Vui lòng nhập 1 số.");
					temp = sc.nextLine();
				}
			}
			System.out.println("Phép chia các số đã nhập là: "+ divide);
			break;
		case 0:
			System.out.println("Đã thoát chương trình.");
			System.exit(0);
			
		default:
			break;
		}
	}

public static void sinhVienTreNhat() {
		//5.5.	Nhập tên và năm sinh của 3 sinh viên.
		//Hãy viết chương trình xuất ra tên và năm sinh của sinh viên trẻ nhất.
		//Khối đầu vào
		String TEXT_HOTEN_NAMSINH = "Họ và tên: %s - Năm sinh: %d";
		String TEXT = "Sinh viên trẻ nhất là: ";
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Vui lòng nhập tên sinh viên thứ nhất: ");
		String name1 = sc.nextLine();
		int by1 =inputIntegerNumber(0, 3000, "Vui lòng nhập năm sinh sinh viên thứ nhất: ");
		System.out.println();
		
		System.out.print ("Vui lòng nhập tên sinh viên thứ hai: ");
		String name2 = sc.nextLine();
		int by2 =inputIntegerNumber(0, 3000, "Vui lòng nhập năm sinh sinh viên thứ hai: ");
		System.out.println();
		
		System.out.print ("Vui lòng nhập tên sinh viên thứ ba: ");
		String name3 = sc.nextLine();
		int by3 =inputIntegerNumber(0, 3000, "Vui lòng nhập năm sinh sinh viên thứ ba: ");
		System.out.println();
		
		//Khối xử lý+ Đầu ra
		if (by1>by2 && by1>by3) {
			System.out.println(TEXT);
			System.out.printf(TEXT_HOTEN_NAMSINH, name1,by1);
		}

		if (by2>by1 && by2>by3)
		{
			System.out.println(TEXT);
			System.out.printf(TEXT_HOTEN_NAMSINH, name2,by2);
		}
		if (by3>by1 && by3>by2)
		{
			System.out.println(TEXT);
			System.out.printf(TEXT_HOTEN_NAMSINH, name3,by3);
		}
		if (by1==by2 && by1>by3)
		{
			System.out.println(TEXT);
			System.out.printf(TEXT_HOTEN_NAMSINH, name1,by1);
			System.out.println();
			System.out.printf(TEXT_HOTEN_NAMSINH, name2,by2);
		}
		if (by1==by3 && by1>by2)
		{
			System.out.println(TEXT);
			System.out.printf(TEXT_HOTEN_NAMSINH, name1,by1);
			System.out.println();
			System.out.printf(TEXT_HOTEN_NAMSINH, name3,by3);
		}
		if (by2==by3 && by2>by1)
		{
			System.out.println(TEXT);
			System.out.printf(TEXT_HOTEN_NAMSINH, name2,by3);
			System.out.println();
			System.out.printf(TEXT_HOTEN_NAMSINH, name3,by3);
		}
		if (by1==by2 && by2==by3)
		{
			System.out.println(TEXT);
			System.out.printf("Cả 3 sinh viên tên: %s, %s, %s - Năm sinh: %d ",name1, name2, name3, by1);
		}
		
	}

public static void soChanLe() {
	// Khối đầu vào
	int soA, soB, soC;
	int demSoLe =0, demSoChan = 0;
	final String TEXT_NHAP_A ="Nhập số nguyên thứ nhất: ";
	final String TEXT_NHAP_B ="Nhập số nguyên thứ hai: ";
	final String TEXT_NHAP_C ="Nhập số nguyên thứ ba: ";
	final String TEXT_KQ ="Số số chẵn là %d và số số lẻ là %d";

	//Lấy dữ liệu người dùng
	
	soA = inputIntegerNumber(-10000, 10000, TEXT_NHAP_A);
	soB = inputIntegerNumber(-10000, 10000, TEXT_NHAP_B);
	soC = inputIntegerNumber(-10000, 10000, TEXT_NHAP_C);
	
	//Khối xử lý
		if (soA%2==0 && soA !=0)
			demSoChan++ ;
		
		if (soA%2!=0)
			demSoLe++;
	
		if (soB%2==0 && soB !=0)
			demSoChan++;
		
		if (soB%2!=0)
			demSoLe++;
		
		if (soC%2==0 && soC !=0)
			demSoChan++;
		
		if (soC%2!=0)
			demSoLe ++;

	//Khối đầu ra
	System.out.printf(TEXT_KQ,demSoChan, demSoLe);
}

public static void canBoNamTreNhat() {
	//7. 7.	Cho biết tên, năm sinh và giới tính của 3 cán bộ.
	//Hãy viết chương trình tìm và in tên cán bộ Nam trẻ nhất.
	
	/* Khối đầu vào*/
	String nameA, nameB, nameC;
	String sexA,sexB, sexC;
	int byA, byB, byC;//by = BirthYear
	String nameResult,sexResult;
	int byResult;
	
	final String TEXT_NHAP_TEN_A ="Vui lòng nhập tên cán bộ thứ nhất: ";
	final String TEXT_NHAP_NAM_SINH_A ="Vui lòng nhập năm sinh cán bộ thứ nhất: ";
	final String TEXT_NHAP_GIOI_TINH_A ="Vui lòng nhập giới tính cán bộ thứ nhất: ";
	
	final String TEXT_NHAP_TEN_B ="Vui lòng nhập tên cán bộ thứ hai: ";
	final String TEXT_NHAP_NAM_SINH_B ="Vui lòng nhập năm sinh cán bộ thứ hai: ";
	final String TEXT_NHAP_GIOI_TINH_B ="Vui lòng nhập giới tính cán bộ thứ hai: ";
	
	final String TEXT_NHAP_TEN_C ="Vui lòng nhập tên cán bộ thứ ba: ";
	final String TEXT_NHAP_NAM_SINH_C ="Vui lòng nhập năm sinh cán bộ thứ ba: ";
	final String TEXT_NHAP_GIOI_TINH_C ="Vui lòng nhập giới tính cán bộ thứ ba: ";
	
	final String TEXT_A ="Cán bộ tên %s là cán bộ nam trẻ nhất sinh năm %d \n";
	
	//Lấy dữ liệu người dùng
	Scanner sc =new Scanner(System.in);
	
	System.out.print(TEXT_NHAP_TEN_A);
	nameA =sc.nextLine();
	byA = inputIntegerNumber(0,3000, TEXT_NHAP_NAM_SINH_A);
	System.out.print(TEXT_NHAP_GIOI_TINH_A);
	do {
		sexA =sc.next();
		sexA = sexA.toLowerCase();
		if (!sexA.equals("nam") && !sexA.equals("nữ"))
			System.out.println("Vui lòng nhập lại thông tin chính xác là Nam hoặc Nữ.");
			sc.nextLine();
	} while (!sexA.equals("nam") && !sexA.equals("nữ"));
	
	System.out.print(TEXT_NHAP_TEN_B);
	nameB =sc.nextLine();
	byB = inputIntegerNumber(0,3000, TEXT_NHAP_NAM_SINH_B);
	System.out.print(TEXT_NHAP_GIOI_TINH_B);
	do {
		sexB =sc.next();
		sexB = sexB.toLowerCase();
		if (!sexB.equals("nam") && !sexB.equals("nữ"))
			System.out.println("Vui lòng nhập lại thông tin chính xác là Nam hoặc Nữ.");
			sc.nextLine();
	} while (!sexB.equals("nam") && !sexB.equals("nữ"));
	
	System.out.print(TEXT_NHAP_TEN_C);
	nameC =sc.nextLine();
	byC = inputIntegerNumber(0,3000, TEXT_NHAP_NAM_SINH_C);
	System.out.print(TEXT_NHAP_GIOI_TINH_C);
	do {
		sexC =sc.next();
		sexC = sexC.toLowerCase();
		if (!sexC.equals("nam") && !sexC.equals("nữ"))
			System.out.println("Vui lòng nhập lại thông tin chính xác là Nam hoặc Nữ.");
			sc.nextLine();
	} while (!sexC.equals("nam") && !sexC.equals("nữ"));
	
	//Khối xử lý
	nameResult = nameA;
	byResult = byA;
	sexResult = sexA;
	
	if(sexB.equals("nam"))
	{
		if (sexResult.equals("nữ"))
		{
			nameResult = nameB;
			byResult = byB;
			sexResult = sexB;
		}
		if (byB>byResult)
		{
		nameResult = nameB;
		byResult = byB;
		sexResult = sexB;
		}
	}
	
	if(sexC.equals("nam"))
	{
		if (sexResult.equals("nữ"))
		{
			nameResult = nameC;
			byResult = byC;
			sexResult = sexC;
		}
		if (byC>byResult)
		{
		nameResult = nameC;
		byResult = byC;
		sexResult = sexC;
		}
	}

	//Khối đầu ra
	if (byA == byResult && sexA.equals("nam"))
		System.out.printf(TEXT_A,nameA,byA);	
	
	if (byB == byResult && sexB.equals("nam"))
		System.out.printf(TEXT_A,nameB,byC);
	
	if (byC == byResult && sexC.equals("nam"))
		System.out.printf(TEXT_A,nameC,byC);
	
	if (!sexResult.equals("nam"))
		System.out.print("Không có cán bộ nam nào");
	
}

public static void sinhVienXaTruongNhat() {
	//8.Cho biết tên và tọa độ nhà của 3 sinh viên. Cho biết toạ độ của trường đại học.
	//Hãy viết chương trình cho máy in tên sinh viên ở xa trường đại học nhất.
	
	//Khối đầu vào
	String tenA, tenB,tenC;
	double xA,xB,xC,yA,yB,yC;
	double xT,yT;
	double dA, dB, dC ; 
	double max;
	
	
	final String TEXT_NHAP_TOA_DO_X ="Vui lòng nhập tọa độ X: ";
	final String TEXT_NHAP_TOA_DO_Y ="Vui lòng nhập tọa độ Y: ";
	final String TEXT_THONG_TIN_A ="Nhập tên học sinh A: ";
	final String TEXT_THONG_TIN_B ="Nhập tên học sinh B: ";
	final String TEXT_THONG_TIN_C ="Nhập tên học sinh C: ";
	final String TEXT_THONG_TIN_TH ="Thông tin trường học";
	final String TEXT_KQ =" là học sinh ở xa trường nhất với tọa độ (";
	final String TEXT_KQ_1 =",";
	final String TEXT_KQ_2 =")";
	
	//Lấy dữ liệu người dùng
	Scanner sc = new Scanner(System.in);
	
	System.out.print(TEXT_THONG_TIN_A);
	tenA = sc.next();
	xA = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_X);
	yA = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_Y);
	System.out.println();
	
	System.out.print(TEXT_THONG_TIN_B);
	tenB = sc.next();
	xB = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_X);
	yB = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_Y);
	System.out.println();
	
	System.out.print(TEXT_THONG_TIN_C);
	tenC = sc.next();
	xC = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_X);
	yC = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_Y);
	System.out.println();
	
	System.out.println(TEXT_THONG_TIN_TH);
	xT = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_X);
	yT = inputRealNumber(-10000, 10000, TEXT_NHAP_TOA_DO_Y);
	System.out.println();
	
	//Khối xử lý
	dA = Math.sqrt(Math.pow(xA-xT, 2)+Math.pow(yA-yT, 2));
	dB = Math.sqrt(Math.pow(xB-xT, 2)+Math.pow(yB-yT, 2));
	dC = Math.sqrt(Math.pow(xC-xT, 2)+Math.pow(yC-yT, 2));
	
	max =dA;
	
	if (dB>max)
		max =dB;
	
	if (dC>max)
		max =dC;
	
	//Khối đầu ra
	if(dA == max)
		System.out.println(tenA + TEXT_KQ +xA +TEXT_KQ_1+ yA+TEXT_KQ_2);
	
	if(dB == max)
		System.out.println(tenB + TEXT_KQ +xB +TEXT_KQ_1+ yB+TEXT_KQ_2);
	
	if(dC == max)
		System.out.println(tenC + TEXT_KQ +xC +TEXT_KQ_1+ yC+TEXT_KQ_2);
}

}
