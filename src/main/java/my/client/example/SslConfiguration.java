package my.client.example;
//
//import java.net.URL;
//
//import javax.net.ssl.SSLContext;
//
//import org.apache.http.ssl.SSLContextBuilder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.netflix.discovery.DiscoveryClient;
//
///**
// * Contains the configuration for a Eureka HTTP client, that needs a specific truststore to connect to
// * a SSL secured Eureka server 
// */
//@Configuration
//public class SslConfiguration {
//  private static final Logger logger = LoggerFactory.getLogger(SslConfiguration.class);
//
//  @Value("${http.client.ssl.trust-store}")
//  private URL trustStore;
//  @Value("${http.client.ssl.trust-store-password}")
//  private String trustStorePassword;
//
//  /**
//   * Setzt beim DiscoveryClient den SSL Context.
//   */
//  @Bean
//  public DiscoveryClient.DiscoveryClientOptionalArgs getTrustStoredEurekaClient(SSLContext sslContext) {
//    DiscoveryClient.DiscoveryClientOptionalArgs args = new DiscoveryClient.DiscoveryClientOptionalArgs();
//    args.setSSLContext(sslContext);
//    return args;
//  }
//
//  /**
//   * Erzeugt auf Basis des Truststores, der in der Konfiguration http.client.ssl.trust-store zu finden ist.
//   */
//  @Bean
//  public SSLContext sslContext() throws Exception {
//    logger.info("initialize ssl context bean with keystore {} ", trustStore);
//    return new SSLContextBuilder().loadTrustMaterial(trustStore, trustStorePassword.toCharArray()).build();
//  }
//}