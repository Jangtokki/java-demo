package java_023_jdbc;

import java.util.List;

public class Departments_controller {

	public Departments_controller() {
		
	}
	
	public List<DepartmentsDTO> departmentsAllProcess() {
		DepartmentsDAO dao = DepartmentsDAO.getInstance();

return dao.listDepartments();
		
		
	}
	
	public List<DepartmentsDTO> departmentsSearchProcess(String data){
		DepartmentsDAO dao = DepartmentsDAO.getInstance();
		return dao.searchDepartments(data);
	}
}

