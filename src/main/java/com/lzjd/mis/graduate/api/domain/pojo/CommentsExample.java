package com.lzjd.mis.graduate.api.domain.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
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

        public Criteria andScoreCodeIsNull() {
            addCriterion("score_code is null");
            return (Criteria) this;
        }

        public Criteria andScoreCodeIsNotNull() {
            addCriterion("score_code is not null");
            return (Criteria) this;
        }

        public Criteria andScoreCodeEqualTo(String value) {
            addCriterion("score_code =", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeNotEqualTo(String value) {
            addCriterion("score_code <>", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeGreaterThan(String value) {
            addCriterion("score_code >", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("score_code >=", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeLessThan(String value) {
            addCriterion("score_code <", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeLessThanOrEqualTo(String value) {
            addCriterion("score_code <=", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeLike(String value) {
            addCriterion("score_code like", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeNotLike(String value) {
            addCriterion("score_code not like", value, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeIn(List<String> values) {
            addCriterion("score_code in", values, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeNotIn(List<String> values) {
            addCriterion("score_code not in", values, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeBetween(String value1, String value2) {
            addCriterion("score_code between", value1, value2, "scoreCode");
            return (Criteria) this;
        }

        public Criteria andScoreCodeNotBetween(String value1, String value2) {
            addCriterion("score_code not between", value1, value2, "scoreCode");
            return (Criteria) this;
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andOderCodeIsNull() {
            addCriterion("oder_code is null");
            return (Criteria) this;
        }

        public Criteria andOderCodeIsNotNull() {
            addCriterion("oder_code is not null");
            return (Criteria) this;
        }

        public Criteria andOderCodeEqualTo(String value) {
            addCriterion("oder_code =", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeNotEqualTo(String value) {
            addCriterion("oder_code <>", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeGreaterThan(String value) {
            addCriterion("oder_code >", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("oder_code >=", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeLessThan(String value) {
            addCriterion("oder_code <", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeLessThanOrEqualTo(String value) {
            addCriterion("oder_code <=", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeLike(String value) {
            addCriterion("oder_code like", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeNotLike(String value) {
            addCriterion("oder_code not like", value, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeIn(List<String> values) {
            addCriterion("oder_code in", values, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeNotIn(List<String> values) {
            addCriterion("oder_code not in", values, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeBetween(String value1, String value2) {
            addCriterion("oder_code between", value1, value2, "oderCode");
            return (Criteria) this;
        }

        public Criteria andOderCodeNotBetween(String value1, String value2) {
            addCriterion("oder_code not between", value1, value2, "oderCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeIsNull() {
            addCriterion("employees_code is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeIsNotNull() {
            addCriterion("employees_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeEqualTo(String value) {
            addCriterion("employees_code =", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeNotEqualTo(String value) {
            addCriterion("employees_code <>", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeGreaterThan(String value) {
            addCriterion("employees_code >", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("employees_code >=", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeLessThan(String value) {
            addCriterion("employees_code <", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeLessThanOrEqualTo(String value) {
            addCriterion("employees_code <=", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeLike(String value) {
            addCriterion("employees_code like", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeNotLike(String value) {
            addCriterion("employees_code not like", value, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeIn(List<String> values) {
            addCriterion("employees_code in", values, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeNotIn(List<String> values) {
            addCriterion("employees_code not in", values, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeBetween(String value1, String value2) {
            addCriterion("employees_code between", value1, value2, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andEmployeesCodeNotBetween(String value1, String value2) {
            addCriterion("employees_code not between", value1, value2, "employeesCode");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andScoreNameIsNull() {
            addCriterion("score_name is null");
            return (Criteria) this;
        }

        public Criteria andScoreNameIsNotNull() {
            addCriterion("score_name is not null");
            return (Criteria) this;
        }

        public Criteria andScoreNameEqualTo(String value) {
            addCriterion("score_name =", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotEqualTo(String value) {
            addCriterion("score_name <>", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameGreaterThan(String value) {
            addCriterion("score_name >", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("score_name >=", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameLessThan(String value) {
            addCriterion("score_name <", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameLessThanOrEqualTo(String value) {
            addCriterion("score_name <=", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameLike(String value) {
            addCriterion("score_name like", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotLike(String value) {
            addCriterion("score_name not like", value, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameIn(List<String> values) {
            addCriterion("score_name in", values, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotIn(List<String> values) {
            addCriterion("score_name not in", values, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameBetween(String value1, String value2) {
            addCriterion("score_name between", value1, value2, "scoreName");
            return (Criteria) this;
        }

        public Criteria andScoreNameNotBetween(String value1, String value2) {
            addCriterion("score_name not between", value1, value2, "scoreName");
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