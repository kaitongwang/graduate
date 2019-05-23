package com.lzjd.mis.graduate.api.domain.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        public Criteria andApplyCodeIsNull() {
            addCriterion("apply_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("apply_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("apply_code =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("apply_code <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("apply_code >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_code >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("apply_code <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("apply_code <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("apply_code like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("apply_code not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("apply_code in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("apply_code not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("apply_code between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("apply_code not between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyTextIsNull() {
            addCriterion("apply_text is null");
            return (Criteria) this;
        }

        public Criteria andApplyTextIsNotNull() {
            addCriterion("apply_text is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTextEqualTo(String value) {
            addCriterion("apply_text =", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextNotEqualTo(String value) {
            addCriterion("apply_text <>", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextGreaterThan(String value) {
            addCriterion("apply_text >", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextGreaterThanOrEqualTo(String value) {
            addCriterion("apply_text >=", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextLessThan(String value) {
            addCriterion("apply_text <", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextLessThanOrEqualTo(String value) {
            addCriterion("apply_text <=", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextLike(String value) {
            addCriterion("apply_text like", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextNotLike(String value) {
            addCriterion("apply_text not like", value, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextIn(List<String> values) {
            addCriterion("apply_text in", values, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextNotIn(List<String> values) {
            addCriterion("apply_text not in", values, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextBetween(String value1, String value2) {
            addCriterion("apply_text between", value1, value2, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyTextNotBetween(String value1, String value2) {
            addCriterion("apply_text not between", value1, value2, "applyText");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIsNull() {
            addCriterion("apply_user_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIsNotNull() {
            addCriterion("apply_user_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeEqualTo(String value) {
            addCriterion("apply_user_code =", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotEqualTo(String value) {
            addCriterion("apply_user_code <>", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeGreaterThan(String value) {
            addCriterion("apply_user_code >", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_code >=", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLessThan(String value) {
            addCriterion("apply_user_code <", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLessThanOrEqualTo(String value) {
            addCriterion("apply_user_code <=", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeLike(String value) {
            addCriterion("apply_user_code like", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotLike(String value) {
            addCriterion("apply_user_code not like", value, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeIn(List<String> values) {
            addCriterion("apply_user_code in", values, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotIn(List<String> values) {
            addCriterion("apply_user_code not in", values, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeBetween(String value1, String value2) {
            addCriterion("apply_user_code between", value1, value2, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserCodeNotBetween(String value1, String value2) {
            addCriterion("apply_user_code not between", value1, value2, "applyUserCode");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNull() {
            addCriterion("apply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNotNull() {
            addCriterion("apply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameEqualTo(String value) {
            addCriterion("apply_user_name =", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotEqualTo(String value) {
            addCriterion("apply_user_name <>", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThan(String value) {
            addCriterion("apply_user_name >", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_name >=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThan(String value) {
            addCriterion("apply_user_name <", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("apply_user_name <=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLike(String value) {
            addCriterion("apply_user_name like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotLike(String value) {
            addCriterion("apply_user_name not like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIn(List<String> values) {
            addCriterion("apply_user_name in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotIn(List<String> values) {
            addCriterion("apply_user_name not in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameBetween(String value1, String value2) {
            addCriterion("apply_user_name between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotBetween(String value1, String value2) {
            addCriterion("apply_user_name not between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeIsNull() {
            addCriterion("apply_type_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeIsNotNull() {
            addCriterion("apply_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeEqualTo(String value) {
            addCriterion("apply_type_code =", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeNotEqualTo(String value) {
            addCriterion("apply_type_code <>", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeGreaterThan(String value) {
            addCriterion("apply_type_code >", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type_code >=", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeLessThan(String value) {
            addCriterion("apply_type_code <", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("apply_type_code <=", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeLike(String value) {
            addCriterion("apply_type_code like", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeNotLike(String value) {
            addCriterion("apply_type_code not like", value, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeIn(List<String> values) {
            addCriterion("apply_type_code in", values, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeNotIn(List<String> values) {
            addCriterion("apply_type_code not in", values, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeBetween(String value1, String value2) {
            addCriterion("apply_type_code between", value1, value2, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeCodeNotBetween(String value1, String value2) {
            addCriterion("apply_type_code not between", value1, value2, "applyTypeCode");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameIsNull() {
            addCriterion("apply_type_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameIsNotNull() {
            addCriterion("apply_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameEqualTo(String value) {
            addCriterion("apply_type_name =", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameNotEqualTo(String value) {
            addCriterion("apply_type_name <>", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameGreaterThan(String value) {
            addCriterion("apply_type_name >", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type_name >=", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameLessThan(String value) {
            addCriterion("apply_type_name <", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameLessThanOrEqualTo(String value) {
            addCriterion("apply_type_name <=", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameLike(String value) {
            addCriterion("apply_type_name like", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameNotLike(String value) {
            addCriterion("apply_type_name not like", value, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameIn(List<String> values) {
            addCriterion("apply_type_name in", values, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameNotIn(List<String> values) {
            addCriterion("apply_type_name not in", values, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameBetween(String value1, String value2) {
            addCriterion("apply_type_name between", value1, value2, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNameNotBetween(String value1, String value2) {
            addCriterion("apply_type_name not between", value1, value2, "applyTypeName");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeIsNull() {
            addCriterion("apply_status_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeIsNotNull() {
            addCriterion("apply_status_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeEqualTo(String value) {
            addCriterion("apply_status_code =", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeNotEqualTo(String value) {
            addCriterion("apply_status_code <>", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeGreaterThan(String value) {
            addCriterion("apply_status_code >", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_status_code >=", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeLessThan(String value) {
            addCriterion("apply_status_code <", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("apply_status_code <=", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeLike(String value) {
            addCriterion("apply_status_code like", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeNotLike(String value) {
            addCriterion("apply_status_code not like", value, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeIn(List<String> values) {
            addCriterion("apply_status_code in", values, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeNotIn(List<String> values) {
            addCriterion("apply_status_code not in", values, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeBetween(String value1, String value2) {
            addCriterion("apply_status_code between", value1, value2, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplyStatusCodeNotBetween(String value1, String value2) {
            addCriterion("apply_status_code not between", value1, value2, "applyStatusCode");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameIsNull() {
            addCriterion("apply_satatus_name is null");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameIsNotNull() {
            addCriterion("apply_satatus_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameEqualTo(String value) {
            addCriterion("apply_satatus_name =", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameNotEqualTo(String value) {
            addCriterion("apply_satatus_name <>", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameGreaterThan(String value) {
            addCriterion("apply_satatus_name >", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_satatus_name >=", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameLessThan(String value) {
            addCriterion("apply_satatus_name <", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameLessThanOrEqualTo(String value) {
            addCriterion("apply_satatus_name <=", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameLike(String value) {
            addCriterion("apply_satatus_name like", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameNotLike(String value) {
            addCriterion("apply_satatus_name not like", value, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameIn(List<String> values) {
            addCriterion("apply_satatus_name in", values, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameNotIn(List<String> values) {
            addCriterion("apply_satatus_name not in", values, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameBetween(String value1, String value2) {
            addCriterion("apply_satatus_name between", value1, value2, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplySatatusNameNotBetween(String value1, String value2) {
            addCriterion("apply_satatus_name not between", value1, value2, "applySatatusName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
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