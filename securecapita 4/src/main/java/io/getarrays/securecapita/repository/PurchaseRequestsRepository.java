package io.getarrays.securecapita.repository;

import io.getarrays.securecapita.domain.PurchaseRequisition;

import java.util.List;

public interface PurchaseRequestsRepository<T extends PurchaseRequisition> {
    List<T> list();

    T create(T data, Long userId);

    T get(Long id);

    boolean delete(Long id);

    /* More Complex */
    T findOneWithUser(Long id);

}
