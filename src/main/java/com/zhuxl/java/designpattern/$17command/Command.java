package com.zhuxl.java.designpattern.$17command;

/**
 * 司令员下令让士兵去干件事情，从整个事情的角度来考虑，司令员的作用是，发出口令，
 * 口令经过传递，传到了士兵耳朵里，士兵去执行。这个过程好在，三者相互解耦，
 * 任何一方都不用去依赖其他人，只需要做好自己的事儿就行，司令员要的是结果，
 * 不会去关注到底士兵是怎么实现的
 */
public interface Command {
    void exec();
}
