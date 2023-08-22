import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class testin {

	public static void main(String[] args) throws IOException {
//		File file = new File("ad.txt");
//		Scanner scanner = new Scanner(file);
//		String a = scanner.nextLine();
//		int b = Integer.parseInt(a);
//		System.out.println(a);
//		FileWriter fileWriter = new FileWriter(file, true);
//		fileWriter.write("aa"+"\n");
//		fileWriter.flush();
//		fileWriter.write("aa"+"\n");
//		fileWriter.flush();
//		fileWriter.write("aa");
//		Scanner scanner = new Scanner(file);
//		System.out.println(scanner.next());
//		System.out.println(scanner.next());
//		FileWriter fileWriter = new FileWriter(file);
//		fileWriter.write("1"+"\n"+"1");
//		fileWriter.flush();
		
//		Scanner scanner = new Scanner(System.in);
//		while(scanner.hasNextInt() && scanner.nextInt()>0) {
//			System.out.println(scanner.nextInt());
//		}
//		System.out.println(scanner.next());

//		LocalDate date = LocalDate.parse("2022-12-10");
//		LocalDate christmas = LocalDate.parse("2017-12-25");
//		System.out.println(date.toString());
//		  try {
//			  
//		SimpleDateFormat  dateFormat = new  SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//			dateFormat.parse("2012-13-02");
//			System.out.println("성공");
//		} catch (ParseException e) {
//			System.out.println("이상");
//		}
		
//		Double[] a = new Double[] {0.1, 0.2, 0.3};
//		System.out.println(Arrays.toString(a));
		
//		ArrayList<Integer> integers = new ArrayList<Integer>();
//		
//		integers.add(1);
//		integers.add(2);
//		
//		System.out.println(integers.get(2));
		
		LocalDate date = LocalDate.now().plusMonths(18);
		System.out.println(date.toString());
	}

}
