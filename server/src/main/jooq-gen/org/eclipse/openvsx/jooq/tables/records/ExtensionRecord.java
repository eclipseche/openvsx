/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import org.eclipse.openvsx.jooq.tables.Extension;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExtensionRecord extends UpdatableRecordImpl<ExtensionRecord> implements Record7<Long, Double, Integer, String, Long, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.extension.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.extension.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.extension.average_rating</code>.
     */
    public void setAverageRating(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.extension.average_rating</code>.
     */
    public Double getAverageRating() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>public.extension.download_count</code>.
     */
    public void setDownloadCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.extension.download_count</code>.
     */
    public Integer getDownloadCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.extension.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.extension.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.extension.namespace_id</code>.
     */
    public void setNamespaceId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.extension.namespace_id</code>.
     */
    public Long getNamespaceId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.extension.public_id</code>.
     */
    public void setPublicId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.extension.public_id</code>.
     */
    public String getPublicId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.extension.active</code>.
     */
    public void setActive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.extension.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Double, Integer, String, Long, String, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Double, Integer, String, Long, String, Boolean> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Extension.EXTENSION.ID;
    }

    @Override
    public Field<Double> field2() {
        return Extension.EXTENSION.AVERAGE_RATING;
    }

    @Override
    public Field<Integer> field3() {
        return Extension.EXTENSION.DOWNLOAD_COUNT;
    }

    @Override
    public Field<String> field4() {
        return Extension.EXTENSION.NAME;
    }

    @Override
    public Field<Long> field5() {
        return Extension.EXTENSION.NAMESPACE_ID;
    }

    @Override
    public Field<String> field6() {
        return Extension.EXTENSION.PUBLIC_ID;
    }

    @Override
    public Field<Boolean> field7() {
        return Extension.EXTENSION.ACTIVE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Double component2() {
        return getAverageRating();
    }

    @Override
    public Integer component3() {
        return getDownloadCount();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Long component5() {
        return getNamespaceId();
    }

    @Override
    public String component6() {
        return getPublicId();
    }

    @Override
    public Boolean component7() {
        return getActive();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Double value2() {
        return getAverageRating();
    }

    @Override
    public Integer value3() {
        return getDownloadCount();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Long value5() {
        return getNamespaceId();
    }

    @Override
    public String value6() {
        return getPublicId();
    }

    @Override
    public Boolean value7() {
        return getActive();
    }

    @Override
    public ExtensionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ExtensionRecord value2(Double value) {
        setAverageRating(value);
        return this;
    }

    @Override
    public ExtensionRecord value3(Integer value) {
        setDownloadCount(value);
        return this;
    }

    @Override
    public ExtensionRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public ExtensionRecord value5(Long value) {
        setNamespaceId(value);
        return this;
    }

    @Override
    public ExtensionRecord value6(String value) {
        setPublicId(value);
        return this;
    }

    @Override
    public ExtensionRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public ExtensionRecord values(Long value1, Double value2, Integer value3, String value4, Long value5, String value6, Boolean value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExtensionRecord
     */
    public ExtensionRecord() {
        super(Extension.EXTENSION);
    }

    /**
     * Create a detached, initialised ExtensionRecord
     */
    public ExtensionRecord(Long id, Double averageRating, Integer downloadCount, String name, Long namespaceId, String publicId, Boolean active) {
        super(Extension.EXTENSION);

        setId(id);
        setAverageRating(averageRating);
        setDownloadCount(downloadCount);
        setName(name);
        setNamespaceId(namespaceId);
        setPublicId(publicId);
        setActive(active);
    }
}