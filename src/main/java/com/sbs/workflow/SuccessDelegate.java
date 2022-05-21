package com.sbs.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class SuccessDelegate implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger(SuccessDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("***Success***");
        LOGGER.info("ProcessDefinitionId = " + delegateExecution.getProcessDefinitionId()
                + ", " + "CurrentActivityId = " + delegateExecution.getCurrentActivityId()
                + ", " + "CurrentActivityName = " + delegateExecution.getCurrentActivityName()
                + ", " + "ProcessInstanceId = " + delegateExecution.getProcessInstanceId()
                + ", " + "ProcessBusinessKey = " + delegateExecution.getProcessBusinessKey()
                + ", " + "executionId = " + delegateExecution.getId());
    }
}
