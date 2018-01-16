package com.lyc.common;

public enum Result {
    SUCCESS(1,true),ERROR(0,false);
    private boolean success;
    private int code;

    Result(int code,boolean state){
        this.success = state;
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public static Result getResult(int index){
        for (Result item : values()){
            if(item.code == index){
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Result.SUCCESS.isSuccess());
        System.out.println(Result.getResult(2));
        System.out.println("你好");
    }
}
