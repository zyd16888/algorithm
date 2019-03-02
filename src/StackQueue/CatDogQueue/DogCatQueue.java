package StackQueue.CatDogQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述:
 * 用户可调用add方法将cat类或者dog类的实例放到队列中
 * 用户可以调用pollAll方法，将队列中所有的示例按照队列的先后顺序依次弹出
 * 用户可以调用pollDog方法，将队列中的dog类示例按进队列的先后顺序依次弹出
 * 用户可以调用pollCat方法，将队列中的cat类示例按进队列的先后顺序依次弹出
 * 用户可以调用isEmpty方法，检查队列中是否还有dog或cat类的实例
 * 用户可以调用isDogEmpty方法，检查队列中是否还有dog的实例
 * 用户可以调用isCatEmpty方法，检查队列中是否还有cat的实例
 * @author dong
 * @date 2019-01-16 17:35
 */
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
        this.count = 0;
    }

    public void add(Pet pet){
        if (pet.getPetType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet, this.count++));
        } else if (pet.getPetType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        } else {
            throw new RuntimeException("err, not dog or cat");
        }
    }

    public Pet pollAll(){
        if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()){
            if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            } else {
                return this.catQ.poll().getPet();
            }
        } else if (!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        } else if (!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("err, queue is empty!");
        }
    }

    public Dog pollDog(){
        if (!this.isDogQueueEmpty()){
            return (Dog) this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("Dog queue is empty!");
        }
    }

    public Cat pollCat(){
        if (!this.isCatQueueEmpty()){
            return (Cat) this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("Cat queue is empty");
        }
    }
    public boolean sEmpty(){
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }


    public boolean isCatQueueEmpty() {
        return this.catQ.isEmpty();
    }


    public boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }


}
