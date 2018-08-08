package uvb78.wedding.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiYangpan on 2018/7/20  12:07 PM.
 * with INTELLIJ IDEA on rmbp osx 10.11
 * 描述:
 */
public class test {

    static List<Integer> sample = new ArrayList<>();

    static int res = 1+2+3;

    public static void main(String[] args){
        init();  //初始化样本数组
        for (int y = 4; y <= 10000; y++){
            if (iszhishu(y)){
                System.out.println(y);
                res+=y;
            }
        }

        System.out.println(res);
    }

    static void init(){
        for (int x = 2; x <= 10000; x++){   //样本是2.......10000
            sample.add(x);
        }
    }


    static boolean iszhishu(int src){

        for(int _t : sample){
            if (_t < src){

                //double hh = src/(double) _t;

                if (cont(sample,(double)(src/(double) _t))){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean cont(List<Integer> yy,double test){
        for (int m : yy){
            if (m > test){
                return false;
            }
            else if (test == m){
                return true;
            }
        }

        return false;
    }
}
