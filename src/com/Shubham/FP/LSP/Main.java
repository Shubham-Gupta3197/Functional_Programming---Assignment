package com.Shubham.FP.LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main
{
    static StringBuilder result=new StringBuilder("");

    public static void printDB(int index, List<Member> myList)
    {
        if(index>=myList.size())
            return;
        Member member=myList.get(index);
        String string= member.getDatabase();
        result.append(string+"\n");
        printDB(index+1,myList);
    }

    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();
        myList.add(new LifetimeMember("Shubham",new Date()));
        myList.add(new AnnualMember("Gupta",new Date()));
        myList.add(new EnquiryUser("Knolder"));
        printDB(0, myList);
        System.out.println(result);
    }
}
