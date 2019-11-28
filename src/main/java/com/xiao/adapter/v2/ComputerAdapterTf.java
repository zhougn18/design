package com.xiao.adapter.v2;

/**
 * 因为computer类的readSD只能读sdcard
 * 如果要想使computer支持读TfCard功能  可以在computer类中加readTf功能  这样就需要修改computer类
 * 如果不修改computer类 就可以让computer类支持读TfCard 可以采用适配器模式
 */
public class ComputerAdapterTf extends SDCard {
    private TFCard tfCard;
    public ComputerAdapterTf(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTf();
    }
}
