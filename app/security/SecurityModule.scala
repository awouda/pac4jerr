package security

import org.pac4j.oauth.config.OAuth20Configuration
import org.pac4j.oauth.profile.generic.GenericOAuth20ProfileDefinition

class SecurityModule {

  def oauth = {
    val config = new OAuth20Configuration
    val profileDefinition:GenericOAuth20ProfileDefinition = new GenericOAuth20ProfileDefinition
    profileDefinition.setProfileUrl("https://localhost:443")
    config.setProfileDefinition(profileDefinition)

    /*

    above code fails, which is odd as GenericOauth20ProfileDefinition extends OAuthProfileDefintion via OAuth20ProfileDefinition

    [info] Compiling 1 Scala source to /home/alex/IdeaProjects/pac4jerr/target/scala-2.12/classes...
    [error] /home/alex/IdeaProjects/pac4jerr/app/security/SecurityModule.scala:12: type mismatch;
    [error]  found   : org.pac4j.oauth.profile.generic.GenericOAuth20ProfileDefinition
    [error]  required: org.pac4j.oauth.profile.definition.OAuthProfileDefinition[_ <: org.pac4j.core.profile.CommonProfile, _ <: com.github.scribejava.core.model.Token, _ <: org.pac4j.oauth.config.OAuthConfiguration[_ <: org.pac4j.core.client.IndirectClient[_ <: org.pac4j.core.credentials.Credentials, _ <: org.pac4j.core.profile.CommonProfile], _ <: com.github.scribejava.core.oauth.OAuthService[_], _ <: com.github.scribejava.core.model.Token]]
    [error]     config.setProfileDefinition(profileDefinition)
    [error]                                 ^
    [error] one error found
    [error] (compile:compileIncremental) Compilation failed

     */

  }


}
