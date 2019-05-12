package com.lzjd.mis.graduate.api.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class WageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEpmCodeIsNull() {
            addCriterion("epm_code is null");
            return (Criteria) this;
        }

        public Criteria andEpmCodeIsNotNull() {
            addCriterion("epm_code is not null");
            return (Criteria) this;
        }

        public Criteria andEpmCodeEqualTo(String value) {
            addCriterion("epm_code =", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeNotEqualTo(String value) {
            addCriterion("epm_code <>", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeGreaterThan(String value) {
            addCriterion("epm_code >", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeGreaterThanOrEqualTo(String value) {
            addCriterion("epm_code >=", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeLessThan(String value) {
            addCriterion("epm_code <", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeLessThanOrEqualTo(String value) {
            addCriterion("epm_code <=", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeLike(String value) {
            addCriterion("epm_code like", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeNotLike(String value) {
            addCriterion("epm_code not like", value, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeIn(List<String> values) {
            addCriterion("epm_code in", values, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeNotIn(List<String> values) {
            addCriterion("epm_code not in", values, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeBetween(String value1, String value2) {
            addCriterion("epm_code between", value1, value2, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmCodeNotBetween(String value1, String value2) {
            addCriterion("epm_code not between", value1, value2, "epmCode");
            return (Criteria) this;
        }

        public Criteria andEpmNameIsNull() {
            addCriterion("epm_name is null");
            return (Criteria) this;
        }

        public Criteria andEpmNameIsNotNull() {
            addCriterion("epm_name is not null");
            return (Criteria) this;
        }

        public Criteria andEpmNameEqualTo(String value) {
            addCriterion("epm_name =", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameNotEqualTo(String value) {
            addCriterion("epm_name <>", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameGreaterThan(String value) {
            addCriterion("epm_name >", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameGreaterThanOrEqualTo(String value) {
            addCriterion("epm_name >=", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameLessThan(String value) {
            addCriterion("epm_name <", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameLessThanOrEqualTo(String value) {
            addCriterion("epm_name <=", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameLike(String value) {
            addCriterion("epm_name like", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameNotLike(String value) {
            addCriterion("epm_name not like", value, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameIn(List<String> values) {
            addCriterion("epm_name in", values, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameNotIn(List<String> values) {
            addCriterion("epm_name not in", values, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameBetween(String value1, String value2) {
            addCriterion("epm_name between", value1, value2, "epmName");
            return (Criteria) this;
        }

        public Criteria andEpmNameNotBetween(String value1, String value2) {
            addCriterion("epm_name not between", value1, value2, "epmName");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNull() {
            addCriterion("Base_salary is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("Base_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(Long value) {
            addCriterion("Base_salary =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(Long value) {
            addCriterion("Base_salary <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(Long value) {
            addCriterion("Base_salary >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("Base_salary >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(Long value) {
            addCriterion("Base_salary <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(Long value) {
            addCriterion("Base_salary <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<Long> values) {
            addCriterion("Base_salary in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<Long> values) {
            addCriterion("Base_salary not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(Long value1, Long value2) {
            addCriterion("Base_salary between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(Long value1, Long value2) {
            addCriterion("Base_salary not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNull() {
            addCriterion("performance is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("performance is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(Long value) {
            addCriterion("performance =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(Long value) {
            addCriterion("performance <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(Long value) {
            addCriterion("performance >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(Long value) {
            addCriterion("performance >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(Long value) {
            addCriterion("performance <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(Long value) {
            addCriterion("performance <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<Long> values) {
            addCriterion("performance in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<Long> values) {
            addCriterion("performance not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(Long value1, Long value2) {
            addCriterion("performance between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(Long value1, Long value2) {
            addCriterion("performance not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Long value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Long value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Long value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Long value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Long value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Long value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Long> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Long> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Long value1, Long value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Long value1, Long value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }
    }

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