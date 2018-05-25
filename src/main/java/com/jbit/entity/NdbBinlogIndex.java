package com.jbit.entity;

public class NdbBinlogIndex {
    private Long epoch;

    private Long position;

    private String file;

    private Long inserts;

    private Long updates;

    private Long deletes;

    private Long schemaops;

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    public Long getInserts() {
        return inserts;
    }

    public void setInserts(Long inserts) {
        this.inserts = inserts;
    }

    public Long getUpdates() {
        return updates;
    }

    public void setUpdates(Long updates) {
        this.updates = updates;
    }

    public Long getDeletes() {
        return deletes;
    }

    public void setDeletes(Long deletes) {
        this.deletes = deletes;
    }

    public Long getSchemaops() {
        return schemaops;
    }

    public void setSchemaops(Long schemaops) {
        this.schemaops = schemaops;
    }
}