package java_023_jdbc;

import java.util.List;
import java.util.Scanner;

public class java_223_jdbc {

	/*
	 * MVC 패턴
	 * Moderl : 데이터관리
	 * View : 결과 화면에 출력
	 * Controller : 클라이언트 요청과 응답처리, Model과 View를 연결
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Departments_controller dController = new Departments_controller();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("선택 : 1.전체, 2.검색어");
		int input = Integer.parseInt(sc.nextLine());
		if(input==1) {
			List<DepartmentsDTO> aList = dController.departmentsAllProcess();
			display(aList);
		}else if(input==2) {
			System.out.println("부서입력 : ");
			String line = sc.nextLine();
			List<DepartmentsDTO> aList = dController.departmentsSearchProcess(line);
			display(aList);
		}
		
		
		
	}
	
	private static void display(List<DepartmentsDTO> aList) {
		for(DepartmentsDTO dto : aList) {
			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(),
					dto.getDepartment_name(), dto.getManager_id(), dto.getLocation_id());}
	}
	}


