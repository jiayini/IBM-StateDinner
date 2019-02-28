package food;

public enum StyleOfFood {
    LENG("冷盘",1),
    CHUAN("川菜",2),
    YUE("粤菜",3),
    LU("鲁菜",4),
    XIANG("湘菜",5),
    SU("苏菜",6),
    JING("京菜",7),
    HUI("徽菜",8),
    E("鄂菜",9),
    MIN("闽菜",10),
    ZHE("浙菜",11),
    FRUIT("水果",12);

    private String name;
    private Integer type;

    StyleOfFood(String name ,Integer type) {
        this.name = name;
        this.type = type;
    }

    public String getNameByType(int type) {
        for (StyleOfFood styleOfFood : values()) {
            if (styleOfFood.getType().equals(type)) {
                return styleOfFood.name;
            }
        }
        return null;
    }



    public Integer getType() {
        return type;
    }


}
