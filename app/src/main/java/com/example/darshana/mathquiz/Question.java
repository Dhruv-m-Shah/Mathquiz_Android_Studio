package com.example.darshana.mathquiz;

public class Question {
    public String Q;
    public String O1;
    public int is_correct;
    public String O2;
    public String O3;
    public String O4;
    public void setQ(String m) {Q = m; }
    public void setO1(String m)
    {
        O1 = m;
    }
    public void setO2(String m)
    {
        O2 = m;
    }
    public void setO3(String m)
    {
        O3 = m;
    }
    public void setO4(String m)
    {
        O4 = m;
    }
    public void setIs_correct(int m)
    {
        is_correct = m;
    }
    public int getIs_correct()
    {
        return is_correct;
    }

    public Question(String Q_, String O1_, String O2_, String O3_, String O4_, int is_correct_){
        Q = Q_;
        O1 = O1_;
        O2 = O2_;
        O3 = O3_;
        O4 = O4_;
        is_correct = is_correct_;
    }

}
