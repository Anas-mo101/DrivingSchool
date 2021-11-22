

public class Person {
    private String no;
    private String name;
    private String approval;
    private String status;
    
    public Person(String no, String name, String approval,String status) {
        this.no = no;
        this.name = name;
        this.approval = approval;
        this.status = status;
    }
    
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getApproval() {
        return approval;
    }
    public void setApproval(String approval) {
        this.approval= approval;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    

}
