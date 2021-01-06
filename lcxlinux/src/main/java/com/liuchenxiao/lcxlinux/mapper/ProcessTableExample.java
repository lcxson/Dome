package com.liuchenxiao.lcxlinux.mapper;

import java.util.ArrayList;
import java.util.List;

public class ProcessTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ProcessTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Integer value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Integer value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Integer value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Integer value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Integer> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Integer> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Integer value1, Integer value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNull() {
            addCriterion("process_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("process_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("process_name =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("process_name <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("process_name >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_name >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("process_name <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("process_name <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("process_name like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("process_name not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("process_name in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("process_name not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("process_name between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("process_name not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateIsNull() {
            addCriterion("process_translate is null");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateIsNotNull() {
            addCriterion("process_translate is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateEqualTo(String value) {
            addCriterion("process_translate =", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateNotEqualTo(String value) {
            addCriterion("process_translate <>", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateGreaterThan(String value) {
            addCriterion("process_translate >", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateGreaterThanOrEqualTo(String value) {
            addCriterion("process_translate >=", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateLessThan(String value) {
            addCriterion("process_translate <", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateLessThanOrEqualTo(String value) {
            addCriterion("process_translate <=", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateLike(String value) {
            addCriterion("process_translate like", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateNotLike(String value) {
            addCriterion("process_translate not like", value, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateIn(List<String> values) {
            addCriterion("process_translate in", values, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateNotIn(List<String> values) {
            addCriterion("process_translate not in", values, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateBetween(String value1, String value2) {
            addCriterion("process_translate between", value1, value2, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andProcessTranslateNotBetween(String value1, String value2) {
            addCriterion("process_translate not between", value1, value2, "processTranslate");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("host_ip is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("host_ip is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("host_ip =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("host_ip <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("host_ip >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("host_ip >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("host_ip <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("host_ip <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("host_ip like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("host_ip not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("host_ip in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("host_ip not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("host_ip between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("host_ip not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andProcessStartIsNull() {
            addCriterion("process_start is null");
            return (Criteria) this;
        }

        public Criteria andProcessStartIsNotNull() {
            addCriterion("process_start is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStartEqualTo(String value) {
            addCriterion("process_start =", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartNotEqualTo(String value) {
            addCriterion("process_start <>", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartGreaterThan(String value) {
            addCriterion("process_start >", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartGreaterThanOrEqualTo(String value) {
            addCriterion("process_start >=", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartLessThan(String value) {
            addCriterion("process_start <", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartLessThanOrEqualTo(String value) {
            addCriterion("process_start <=", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartLike(String value) {
            addCriterion("process_start like", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartNotLike(String value) {
            addCriterion("process_start not like", value, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartIn(List<String> values) {
            addCriterion("process_start in", values, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartNotIn(List<String> values) {
            addCriterion("process_start not in", values, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartBetween(String value1, String value2) {
            addCriterion("process_start between", value1, value2, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStartNotBetween(String value1, String value2) {
            addCriterion("process_start not between", value1, value2, "processStart");
            return (Criteria) this;
        }

        public Criteria andProcessStopIsNull() {
            addCriterion("process_stop is null");
            return (Criteria) this;
        }

        public Criteria andProcessStopIsNotNull() {
            addCriterion("process_stop is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStopEqualTo(String value) {
            addCriterion("process_stop =", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopNotEqualTo(String value) {
            addCriterion("process_stop <>", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopGreaterThan(String value) {
            addCriterion("process_stop >", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopGreaterThanOrEqualTo(String value) {
            addCriterion("process_stop >=", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopLessThan(String value) {
            addCriterion("process_stop <", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopLessThanOrEqualTo(String value) {
            addCriterion("process_stop <=", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopLike(String value) {
            addCriterion("process_stop like", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopNotLike(String value) {
            addCriterion("process_stop not like", value, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopIn(List<String> values) {
            addCriterion("process_stop in", values, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopNotIn(List<String> values) {
            addCriterion("process_stop not in", values, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopBetween(String value1, String value2) {
            addCriterion("process_stop between", value1, value2, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessStopNotBetween(String value1, String value2) {
            addCriterion("process_stop not between", value1, value2, "processStop");
            return (Criteria) this;
        }

        public Criteria andProcessSelIsNull() {
            addCriterion("process_sel is null");
            return (Criteria) this;
        }

        public Criteria andProcessSelIsNotNull() {
            addCriterion("process_sel is not null");
            return (Criteria) this;
        }

        public Criteria andProcessSelEqualTo(String value) {
            addCriterion("process_sel =", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelNotEqualTo(String value) {
            addCriterion("process_sel <>", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelGreaterThan(String value) {
            addCriterion("process_sel >", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelGreaterThanOrEqualTo(String value) {
            addCriterion("process_sel >=", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelLessThan(String value) {
            addCriterion("process_sel <", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelLessThanOrEqualTo(String value) {
            addCriterion("process_sel <=", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelLike(String value) {
            addCriterion("process_sel like", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelNotLike(String value) {
            addCriterion("process_sel not like", value, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelIn(List<String> values) {
            addCriterion("process_sel in", values, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelNotIn(List<String> values) {
            addCriterion("process_sel not in", values, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelBetween(String value1, String value2) {
            addCriterion("process_sel between", value1, value2, "processSel");
            return (Criteria) this;
        }

        public Criteria andProcessSelNotBetween(String value1, String value2) {
            addCriterion("process_sel not between", value1, value2, "processSel");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}