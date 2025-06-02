package com.ngom.dev.niit.sn.jenkins.services.interfaces;

import java.util.List;

public interface GenericOperation<D, R, ID> {

    D save(R request);
    D update(ID id, R request);
    D findById(ID id);
    List<D> findAll();
    void deleteById(ID id);
}
