package Builder;

import lombok.Data;

@Data
public class Cat {
    private String name;
    private int age;

    public Cat(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }


    static class Builder{
        private String name;
        private int age;

        public Builder(){
            this.name="Undefined";
            this.age = 0;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }


        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Cat build(){
            return new Cat(this);
        }

    }
}


