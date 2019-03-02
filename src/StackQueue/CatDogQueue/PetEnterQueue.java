package StackQueue.CatDogQueue;

/**
 * 描述:
 *
 * @author dong
 * @date 2019-01-16 17:20
 */
public class PetEnterQueue {
    private Pet pet;
    private long count;
    public PetEnterQueue(Pet pet, long count){
        this.pet = pet;
        this.count = count;
    }
    public Pet getPet(){
        return this.pet;
    }
    public long getCount(){
        return this.count;
    }

    public  String getEnterPetType(){
        return this.pet.getPetType();
    }

}
