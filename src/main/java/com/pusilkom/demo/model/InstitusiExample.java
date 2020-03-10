package com.pusilkom.demo.model;

import java.util.ArrayList;
import java.util.List;

public class InstitusiExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public InstitusiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
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

        public Criteria andKodeInstitusiIsNull() {
            addCriterion("kode_institusi is null");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiIsNotNull() {
            addCriterion("kode_institusi is not null");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiEqualTo(String value) {
            addCriterion("kode_institusi =", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiNotEqualTo(String value) {
            addCriterion("kode_institusi <>", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiGreaterThan(String value) {
            addCriterion("kode_institusi >", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiGreaterThanOrEqualTo(String value) {
            addCriterion("kode_institusi >=", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiLessThan(String value) {
            addCriterion("kode_institusi <", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiLessThanOrEqualTo(String value) {
            addCriterion("kode_institusi <=", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiLike(String value) {
            addCriterion("kode_institusi like", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiNotLike(String value) {
            addCriterion("kode_institusi not like", value, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiIn(List<String> values) {
            addCriterion("kode_institusi in", values, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiNotIn(List<String> values) {
            addCriterion("kode_institusi not in", values, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiBetween(String value1, String value2) {
            addCriterion("kode_institusi between", value1, value2, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiNotBetween(String value1, String value2) {
            addCriterion("kode_institusi not between", value1, value2, "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andNamaIsNull() {
            addCriterion("nama is null");
            return (Criteria) this;
        }

        public Criteria andNamaIsNotNull() {
            addCriterion("nama is not null");
            return (Criteria) this;
        }

        public Criteria andNamaEqualTo(String value) {
            addCriterion("nama =", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaNotEqualTo(String value) {
            addCriterion("nama <>", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaGreaterThan(String value) {
            addCriterion("nama >", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaGreaterThanOrEqualTo(String value) {
            addCriterion("nama >=", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaLessThan(String value) {
            addCriterion("nama <", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaLessThanOrEqualTo(String value) {
            addCriterion("nama <=", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaLike(String value) {
            addCriterion("nama like", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaNotLike(String value) {
            addCriterion("nama not like", value, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaIn(List<String> values) {
            addCriterion("nama in", values, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaNotIn(List<String> values) {
            addCriterion("nama not in", values, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaBetween(String value1, String value2) {
            addCriterion("nama between", value1, value2, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaNotBetween(String value1, String value2) {
            addCriterion("nama not between", value1, value2, "nama");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatIsNull() {
            addCriterion("nama_singkat is null");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatIsNotNull() {
            addCriterion("nama_singkat is not null");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatEqualTo(String value) {
            addCriterion("nama_singkat =", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatNotEqualTo(String value) {
            addCriterion("nama_singkat <>", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatGreaterThan(String value) {
            addCriterion("nama_singkat >", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatGreaterThanOrEqualTo(String value) {
            addCriterion("nama_singkat >=", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatLessThan(String value) {
            addCriterion("nama_singkat <", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatLessThanOrEqualTo(String value) {
            addCriterion("nama_singkat <=", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatLike(String value) {
            addCriterion("nama_singkat like", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatNotLike(String value) {
            addCriterion("nama_singkat not like", value, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatIn(List<String> values) {
            addCriterion("nama_singkat in", values, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatNotIn(List<String> values) {
            addCriterion("nama_singkat not in", values, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatBetween(String value1, String value2) {
            addCriterion("nama_singkat between", value1, value2, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatNotBetween(String value1, String value2) {
            addCriterion("nama_singkat not between", value1, value2, "namaSingkat");
            return (Criteria) this;
        }

        public Criteria andFlagAktifIsNull() {
            addCriterion("flag_aktif is null");
            return (Criteria) this;
        }

        public Criteria andFlagAktifIsNotNull() {
            addCriterion("flag_aktif is not null");
            return (Criteria) this;
        }

        public Criteria andFlagAktifEqualTo(Boolean value) {
            addCriterion("flag_aktif =", value, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifNotEqualTo(Boolean value) {
            addCriterion("flag_aktif <>", value, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifGreaterThan(Boolean value) {
            addCriterion("flag_aktif >", value, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifGreaterThanOrEqualTo(Boolean value) {
            addCriterion("flag_aktif >=", value, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifLessThan(Boolean value) {
            addCriterion("flag_aktif <", value, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifLessThanOrEqualTo(Boolean value) {
            addCriterion("flag_aktif <=", value, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifIn(List<Boolean> values) {
            addCriterion("flag_aktif in", values, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifNotIn(List<Boolean> values) {
            addCriterion("flag_aktif not in", values, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifBetween(Boolean value1, Boolean value2) {
            addCriterion("flag_aktif between", value1, value2, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andFlagAktifNotBetween(Boolean value1, Boolean value2) {
            addCriterion("flag_aktif not between", value1, value2, "flagAktif");
            return (Criteria) this;
        }

        public Criteria andKodeInstitusiLikeInsensitive(String value) {
            addCriterion("upper(kode_institusi) like", value.toUpperCase(), "kodeInstitusi");
            return (Criteria) this;
        }

        public Criteria andNamaLikeInsensitive(String value) {
            addCriterion("upper(nama) like", value.toUpperCase(), "nama");
            return (Criteria) this;
        }

        public Criteria andNamaSingkatLikeInsensitive(String value) {
            addCriterion("upper(nama_singkat) like", value.toUpperCase(), "namaSingkat");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.institusi
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.institusi
     *
     * @mbg.generated
     */
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