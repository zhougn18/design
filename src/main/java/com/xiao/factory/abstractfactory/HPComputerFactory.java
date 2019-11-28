package com.xiao.factory.abstractfactory;

/**
 * 不同的工厂可以生产不同品牌的产品
 */
public class HPComputerFactory extends AbstractComputerFactory {
    @Override
    public KeyBoard getKeyBoard() {
        return new HPKeyBoard();
    }

    @Override
    public Memory getMemory() {
        return new HPMemory();
    }

    @Override
    public Mouse getMouse() {
        return new HPMouse();
    }
}
