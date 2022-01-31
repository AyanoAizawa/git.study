package study;

	import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

	public class Study {

		public static void main(String[] args) {
			String greeting = "HelloWorld";
			System.out.println(greeting);

			System.out.println("--------------------------");

			int sum = 0;
			for (int i = 0; i <= 10; i++) {
				sum += i;
			}
			System.out.println("1から10まで足した数は" + sum);

			int a = IntStream.rangeClosed(5, 15).sum();
			System.out.println("5から15まで足した数は" + a);

			System.out.println("--------------------------");

			LocalDate date1 = LocalDate.now();
			System.out.println("今日は" + date1 + "  " + date1.getDayOfWeek());

			System.out.println("今日の3年後は" + date1.plusYears(3) + "  " + date1.plusYears(3).getDayOfWeek());
			DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)");
			String date3 = date1.plusYears(3).format(date2);
			System.out.println(date3);

			System.out.println("--------------------------");

			int n = 1;
			if (n == 1) {
				System.out.println("1なら真");
			} else if (n == 0) {
				System.out.println("0なら偽");
			} else {
				System.out.println("1か0指定");
			}
			
			
			System.out.println("--------------------------");
			
				Map<Integer, String> citrus = new HashMap<>();
            try {
				citrus.put(1, "Lemon");
				citrus.put(2, "Orange");
				citrus.put(3, "Grapefuruit");
				citrus.put(5, "Buntan");

				System.out.println(citrus.get(2));
				System.out.println(citrus.get(5));
			} catch (Exception e) {
				System.out.println("エラーです");
			}
		}
	}

