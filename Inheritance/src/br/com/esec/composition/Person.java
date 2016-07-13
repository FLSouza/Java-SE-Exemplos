package br.com.esec.composition;

public class Person {
	//A composição em Java é alcançada usando variáveis de instância que se
	//referem a outro objeto. Person tem um Job.
    private Job job;
   
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }
}
