package com.tms.lesson5.Season;


public enum Month {
    январь,
    февраль,
    март,
    апрель,
    май,
    июнь,
    июль,
    август,
    сентябрь,
    октябрь,
    ноябрь,
    декабрь;


    public void sravnenie(){
        switch (this) {
            case январь:
            case декабрь:
            case февраль:
                System.out.println(Season.winter);
                break;
            case март:
            case апрель:
            case май:
                System.out.println(Season.spring);
                break;
            case июнь:
            case июль:
            case август:
                System.out.println(Season.summer);
                break;
            case сентябрь:
            case октябрь:
            case ноябрь:
                System.out.println(Season.outym);
                break;


        }

            }
        }



