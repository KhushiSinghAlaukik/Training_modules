package day16;

import java.util.ArrayList;

class Repository<T>{
    ArrayList<T> data = new ArrayList<>();
    public void save(T item){
        data.add(item);
    }
    public void display(){
        for(T item: data){
            System.out.println(item);
        }
    }
    public T find(int i){
        if(i>=0 && i<data.size()){
            return data.get(i);
        }return null;
    }
}
public class Main {
    public static void main(String[] args){
        Repository<String> StrRepo = new Repository<>();
        StrRepo.save("PHP");
        StrRepo.save("Ruby");
        StrRepo.save("Golang");

        System.out.println("String Repo :");
        StrRepo.display();

        Repository<Integer> IntRepo = new Repository<>();
        IntRepo.save(10);
        IntRepo.save(20);
        IntRepo.save(40);

        System.out.println("Integer Repo: ");
        IntRepo.display();

        System.out.println("Element at index 1: "+IntRepo.find(1));
    }
}
