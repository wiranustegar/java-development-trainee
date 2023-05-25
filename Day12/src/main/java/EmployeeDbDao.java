import id.co.indivara.jdt12.api.json.EmployeeDAOJson;
import id.co.indivara.jdt12.dao.EmployeeDAO;

public class EmployeeDbDao {
    public static void main(String[] args) throws Exception {

        EmployeeDAO dao = new EmployeeDAO();
        EmployeeDAOJson test = new EmployeeDAOJson(dao);
//        test.createEmployeeJson("d:/datasentho.json");
//        test.updateEmployeeJson("d:/saida.json");
//        test.deleteEmployeeJson("d:/saida.json");
//        test.findEmployeeByIdJson(103,"d:/cariaidi.json");
//        test.createManyEmployeeJson("d:/dataadhi.json");
        test.findAllEmployeeJson("d:/sekantor.json");
    }
}
