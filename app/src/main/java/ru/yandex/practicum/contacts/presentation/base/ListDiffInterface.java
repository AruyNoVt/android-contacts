package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T>  {
    boolean theSameAs(T itemUi);

    boolean equals(Object obj);
}
