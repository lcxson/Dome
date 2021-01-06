package com.liuchenxiao.lcxlinux.mapper;

import java.util.ArrayList;
import java.util.List;

public class HostTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HostTableExample() {
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

        public Criteria andHostIdIsNull() {
            addCriterion("host_id is null");
            return (Criteria) this;
        }

        public Criteria andHostIdIsNotNull() {
            addCriterion("host_id is not null");
            return (Criteria) this;
        }

        public Criteria andHostIdEqualTo(Integer value) {
            addCriterion("host_id =", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotEqualTo(Integer value) {
            addCriterion("host_id <>", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThan(Integer value) {
            addCriterion("host_id >", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("host_id >=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThan(Integer value) {
            addCriterion("host_id <", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdLessThanOrEqualTo(Integer value) {
            addCriterion("host_id <=", value, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdIn(List<Integer> values) {
            addCriterion("host_id in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotIn(List<Integer> values) {
            addCriterion("host_id not in", values, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdBetween(Integer value1, Integer value2) {
            addCriterion("host_id between", value1, value2, "hostId");
            return (Criteria) this;
        }

        public Criteria andHostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("host_id not between", value1, value2, "hostId");
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

        public Criteria andHostNameIsNull() {
            addCriterion("host_name is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("host_name is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("host_name =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("host_name <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("host_name >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("host_name >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("host_name <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("host_name <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("host_name like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("host_name not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("host_name in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("host_name not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("host_name between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("host_name not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
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