package wang.liangchen.matrix.iam.authorization.domain.aggregate;

import wang.liangchen.matrix.framework.commons.object.ObjectUtil;
import wang.liangchen.matrix.framework.commons.type.ClassUtil;
import wang.liangchen.matrix.framework.data.annotation.ColumnMarkDelete;
import wang.liangchen.matrix.framework.data.dao.entity.RootEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Liangchen.Wang
 */
@Entity(name = "matrix_authorization_allowlist")
@Table(name = "matrix_authorization_allowlist")
public class AuthorizationAllowlist extends RootEntity {
    @Id
    @Column(name = "allowlist_id")
    private Long allowlistId;
    @Column(name = "tenant_code")
    private String tenantCode;
    @Column(name = "app_code")
    private String appCode;
    @Column(name = "permission_uri")
    private String permissionUri;
    @Column(name = "data_mode")
    private Short dataMode;
    @Version
    @Column(name = "version")
    private Integer version;
    @Column(name = "sort")
    private Integer sort;
    @Column(name = "owner")
    private String owner;
    @Column(name = "creator")
    private String creator;
    @Column(name = "create_datetime")
    private LocalDateTime createDatetime;
    @Column(name = "modifier")
    private String modifier;
    @Column(name = "modify_datetime")
    private LocalDateTime modifyDatetime;
    @Column(name = "summary")
    private String summary;
    @ColumnMarkDelete("deleted")
    @Column(name = "state")
    private String state;

    public static AuthorizationAllowlist valueOf(Object source) {
        return ObjectUtil.INSTANCE.copyProperties(source, AuthorizationAllowlist.class);
    }

    public static AuthorizationAllowlist newInstance() {
        return ClassUtil.INSTANCE.instantiate(AuthorizationAllowlist.class);
    }

    public Long getAllowlistId() {
        return this.allowlistId;
    }
    public void setAllowlistId(Long allowlistId) {
        this.allowlistId = allowlistId;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }
    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }
    public String getAppCode() {
        return this.appCode;
    }
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
    public String getPermissionUri() {
        return this.permissionUri;
    }
    public void setPermissionUri(String permissionUri) {
        this.permissionUri = permissionUri;
    }
    public Short getDataMode() {
        return this.dataMode;
    }
    public void setDataMode(Short dataMode) {
        this.dataMode = dataMode;
    }
    public Integer getVersion() {
        return this.version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    public Integer getSort() {
        return this.sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getCreator() {
        return this.creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public LocalDateTime getCreateDatetime() {
        return this.createDatetime;
    }
    public void setCreateDatetime(LocalDateTime createDatetime) {
        this.createDatetime = createDatetime;
    }
    public String getModifier() {
        return this.modifier;
    }
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
    public LocalDateTime getModifyDatetime() {
        return this.modifyDatetime;
    }
    public void setModifyDatetime(LocalDateTime modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }
    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getState() {
        return this.state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AuthorizationAllowlist{");
        builder.append("allowlistId = ").append(allowlistId).append(", ");
        builder.append("tenantCode = ").append(tenantCode).append(", ");
        builder.append("appCode = ").append(appCode).append(", ");
        builder.append("permissionUri = ").append(permissionUri).append(", ");
        builder.append("dataMode = ").append(dataMode).append(", ");
        builder.append("version = ").append(version).append(", ");
        builder.append("sort = ").append(sort).append(", ");
        builder.append("owner = ").append(owner).append(", ");
        builder.append("creator = ").append(creator).append(", ");
        builder.append("createDatetime = ").append(createDatetime).append(", ");
        builder.append("modifier = ").append(modifier).append(", ");
        builder.append("modifyDatetime = ").append(modifyDatetime).append(", ");
        builder.append("summary = ").append(summary).append(", ");
        builder.append("state = ").append(state).append(", ");
        builder.deleteCharAt(builder.length() - 1);
        builder.append("}");
        return builder.toString();
    }
}