package com.iesemilidarder.bisern;

public class SystemUtilHelper {
    private SystemUtilHelper (){
        //todo: OS generalization
    }
    public static void consolePrint (String message) {
        System.out.println(message);
    }

    public static void logError(Exception e){
        consolePrint("Error:"+ e);
    }
}

