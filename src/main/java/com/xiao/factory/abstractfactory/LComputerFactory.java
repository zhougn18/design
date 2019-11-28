package com.xiao.factory.abstractfactory;
/**
 * 不同的工厂可以生产不同品牌的产品
 */
public class LComputerFactory extends AbstractComputerFactory {
    @Override
    public KeyBoard getKeyBoard() {
        return new LKeyBoard();
    }

    @Override
    public Memory getMemory() {
        return new LMemory();
    }

    @Override
    public Mouse getMouse() {
        return new LMouse();
    }
}
