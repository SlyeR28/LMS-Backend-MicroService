package com.lms.common.audit;

public interface AuditEventPublisher {

    void publish(AuditEvent event);
}