package cn.loverot.base.constant.e;

public enum TableEnum implements BaseEnum {
    ALTER_ADD("add"),
    ALTER_MODIFY("modify"),
    ALTER_DROP("drop");

    private String obj;

    private TableEnum(String obj) {
        this.obj = obj;
    }

    public int toInt() {
        return 0;
    }

    public String toString() {
        return this.obj.toString();
    }
}
