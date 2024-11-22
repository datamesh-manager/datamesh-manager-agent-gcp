package datameshmanager.gcp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "datameshmanager.client.gcp")
public record GcpProperties(
    String host,
    String token,
    AccessmanagementProperties accessmanagement,
    AssetProperties assets
) {

  public record AccessmanagementProperties(
      String agentid,
      Boolean enabled,
      String role,
      AccessmanagementMappingProperties mapping
  ) {
    public record AccessmanagementMappingProperties(
        AccessmanagementMappingCustomfieldProperties dataproduct,
        AccessmanagementMappingCustomfieldProperties team
    ) {
      public record AccessmanagementMappingCustomfieldProperties(
          String customfield
      ) {
      }
    }
  }

  public record AssetProperties(
      String agentid,
      Boolean enabled
  ) {
  }

}
