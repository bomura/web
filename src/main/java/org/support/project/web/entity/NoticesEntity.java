package org.support.project.web.entity;

import org.support.project.web.entity.gen.GenNoticesEntity;

import java.util.List;
import java.util.Map;

import org.support.project.common.bean.ValidateError;
import org.support.project.di.Container;
import org.support.project.di.DI;
import org.support.project.di.Instance;

import java.sql.Timestamp;


/**
 * 告知
 */
@DI(instance = Instance.Prototype)
public class NoticesEntity extends GenNoticesEntity {

    /** SerialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * Get instance from DI container.
     * @return instance
     */
    public static NoticesEntity get() {
        return Container.getComp(NoticesEntity.class);
    }

    /**
     * Constructor.
     */
    public NoticesEntity() {
        super();
    }

    /**
     * Constructor
     * @param no NO
     */

    public NoticesEntity(Integer no) {
        super( no);
    }

}
