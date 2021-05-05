public class Reparatie {

    private Integer code;
    private String[] status = new String[]{"AA","BB","CC"};
    private String[] priority = new String[]{"DD","EE","FF"};
    private String problem;
    private String solution;

    public Reparatie(Integer code, String[] status, String[] priority, String problem, String solution){
        this.code = code;
        this.status = status;
        this.priority = priority;
        this.problem = problem;
        this.solution = solution;
    }
    public Reparatie(){}

    public Integer getCode(){
        return code;
    }

    public String[] getStatus(){
        return status;
    }
    public void getStringStatus(int i){
        System.out.println(status[i-1]);
    }

    public String[] getPriority(){
        return priority;
    }
    public void getStringPriority(int i){
        System.out.println(priority[i-1]);
    }

    public String getProblem(){
        return problem;
    }

    public String getSolution(){
        return solution;
    }
}
