import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author dong
 * @date 2019/08/24 10:16
 * TODO: 实现一种猫狗队列的结构
 * 1. 用户可以调用 add 方法将 cat 或者 dog 放入队列中
 * 2. 用户可以调用 pollAll 方法将队列中的 cat 和 dog 按照进队列的先后顺序依次弹出
 * 3. 用户可以调用 pollDog 方法将队列中的 dog 按照进队列的先后顺序依次弹出
 * 4. 用户可以调用 pollCat 方法将队列中的 cat 按照进队列的先后顺序依次弹出
 * 5. 用户可以调用 isEmpty 方法检查队列中是否还有 dog 或 cat
 * 6. 用户可以调用 isDogEmpty 方法检查队列中是否还有 dog
 * 7. 用户可以调用 isCatEmpty 方法检查队列中是否还有 cat
 */

public class DogCatQueue{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DogCat dc = new DogCat();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String operator = sc.next();
            if (operator.equals("add")){
                String name = sc.next();
                int num = sc.nextInt();
                Pet pet = new Pet(name, num);
                dc.add(pet);
            }else if (operator.equals("pollAll")){
                while (!dc.isEmpty()) {
                    Pet pet = dc.pollAll();
                    System.out.println(pet.getPetType() + " " + pet.getNum());
                }
            }else if (operator.equals("isEmpty")){
                System.out.println(dc.isEmpty() ? "yes" : "no");
            }else if (operator.equals("isDogEmpty")){
                System.out.println(dc.isDogQueueEmpty() ? "yes" : "no");
            }else if (operator.equals("isCatEmpty")){
                System.out.println(dc.isCatQueueEmpty() ? "yes" : "no");
            }else if (operator.equals("pollDog")){
                while (!dc.isDogQueueEmpty()) {
                    Pet dog = dc.pollDog();
                    System.out.println(dog.getPetType() + " " + dog.getNum());
                }
            }else if (operator.equals("pollCat")){
                while (!dc.isCatQueueEmpty()) {
                    Pet cat = dc.pollCat();
                    System.out.println(cat.getPetType() + " " + cat.getNum());
                }
            }
        }
    }
}

class DogCat {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCat() {
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
        this.count = 0;
    }

    public void add(Pet pet){
        if (pet.getPetType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet, this.count++));
        }else if(pet.getPetType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        }else {
            throw new RuntimeException("error, not dog or cat");
        }
    }

    public Pet pollAll(){
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }else {
                return this.catQ.poll().getPet();
            }
        }else if (!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else if (!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else {
           throw new RuntimeException("error, queue is empty");
        }
    }

    public boolean isEmpty(){
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty(){
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty(){
        return this.catQ.isEmpty();
    }
    public Pet pollDog(){
        if (!this.isDogQueueEmpty()){
            return this.dogQ.poll().getPet();
        }else {
            throw new RuntimeException("Dog queue is empty");
        }
    }

    public Pet pollCat(){
        if (!this.isCatQueueEmpty()){
            return this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("Cat queue is empty");
        }
    }
}

/**
 * TODO: 动物父类，定义类型
 */
class Pet{
    private String type;
    private int num;
    public Pet(String type, int num){
        this.type = type;
        this.num = num;
    }
    public String getPetType(){
        return this.type;
    }
    public int getNum(){
        return this.num;
    }
}

class Dog extends Pet{

    public Dog(String type, int num) {
        super(type, num);
    }
}

class Cat extends Pet{

    public Cat(String type, int num) {
        super(type, num);
    }
}

/**
 * TODO：插入队列，返回数值
 */
class PetEnterQueue{
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet(){
        return this.pet;
    }


    public long getCount(){
        return this.count;
    }

    public String getEnterPetType(){
        return this.pet.getPetType();
    }
}