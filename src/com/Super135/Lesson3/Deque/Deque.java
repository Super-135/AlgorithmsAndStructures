package com.Super135.Lesson3.Deque;

import com.Super135.Lesson3.Queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);

    boolean insertRieght(E value);

    E removeLevt();

    E removeRieght();

}
