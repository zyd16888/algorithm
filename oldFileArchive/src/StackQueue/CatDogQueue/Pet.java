package StackQueue.CatDogQueue;

/**
 * 描述:
 * 宠物类
 *
 * @author dong
 * @date 2019-01-16 17:02
 */
public class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getPetType() {
        return type;
    }

    public void setPetType(String type) {
        this.type = type;
    }
}
