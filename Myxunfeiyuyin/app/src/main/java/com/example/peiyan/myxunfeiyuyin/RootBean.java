package com.example.peiyan.myxunfeiyuyin;

import java.util.ArrayList;

/**
 * Created by peiyan on 2017/7/30.
 */

public class RootBean {
    public ArrayList<WS> ws;
    public class WS{
        public ArrayList<CW> cw;
    }
    public class CW{
        public String w;
    }
}


