package worker;
import java.util.*;

public class ArrayList_worker{
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        System.out.println("增加四个员工：");
        workers.add(new Worker("zhang3",18,3000));
        workers.add(new Worker("li4",25,3500));
        workers.add(new Worker("wang5",22,3200));
        workers.add(new Worker("li4",25,3500));
        sop1(workers);
        
        System.out.println("\n在li4前面增加一个员工zhao6：");
        AddWhere(workers,"li4",new Worker("zhao6",24,3300));
        sop1(workers);
        
        System.out.println("\n删除指定员工wang5：");
        Del(workers,"wang5");
        sop2(workers);
    }

    static void sop1(ArrayList<Worker> o){
        for(Worker worker:o){
            System.out.println(worker.getName()+" "+worker.getAge()+" "+worker.getSalary());
        }
    }
    
    static void sop2(ArrayList<Worker> o){
        Iterator<Worker> it = o.iterator();
        while(it.hasNext()){
            Worker worker = it.next();
            System.out.println(worker.getName()+" "+worker.getAge()+" "+worker.getSalary());
        }
    }

    static void Del(ArrayList<Worker> o,String del){
        for (int i = 0; i < o.size(); i++ ){
            if(o.get(i).getName()==del){
                o.remove(i);
                i--;
            }
        }
    }

    static void AddWhere(ArrayList<Worker> o,String where,Worker w){
        for (int i = 0; i < o.size(); i++ ){
            if(o.get(i).getName()==where){
                o.add(i,w);
                break;
            }
        }
    }
}