public class GoPerformanceTest extends GoCodeInsightFixtureTestCase {     public void testUnusedFunction ( ) {   doInspectionTest ( new GoUnusedFunctionInspection ( ) , TimeUnit . MINUTES . toMillis ( 3 ) ) ;   }   public void testUnusedImport ( ) {     } }  
public abstract class BaseActivity extends SlidingFragmentActivity { public void test ( ) {   SlidingMenu sm = getSlidingMenu ( ) ;   sm . setTouchModeAbove ( SlidingMenu . TOUCHMODE_MARGIN ) ;   sm . setBehindOffsetRes ( R . dimen . slidingmenu_offset ) ;   setSlidingActionBarEnabled ( false ) ;   }       }  
public class ApplicationMasterTest {   ;   }   private static class ApplicationMasterPrivateAccess {   private final ApplicationMaster mMaster ;   private ApplicationMasterPrivateAccess ( ApplicationMaster master ) {     } }   
public final class ChannelImpl implements Channel {     public void request ( int numMessages ) {   stream . request ( numMessages ) ;   }     }  
public class EngineWrapper_ImmutabilityCheckEngine {     public void test ( ) {   Engine e = new StoreDirect ( null ) ;   e = new EngineWrapper . ImmutabilityCheckEngine ( e ) ;   List rec = new ArrayList ( ) ;     } }  
public class Tmp { public interface CC {     int DEFAULT_CACHE_SIZE = 1024 * 32 ;   String DEFAULT_CACHE = DBMaker . Keys . cache_hashTable ;     } }  
import static org . junit . Assert . assertNull ;   public class BsonDocumentBufferSerializerTest extends MongoClientTestBase {   BsonDocumentBufferSerializer serializer =   new BsonDocumentBufferSerializer ( new PowerOfTwoByteBufferPool ( 24 ) , PrimitiveSerializers . createDefault ( ) ) ;       }  
public class DatastoreImpl implements Datastore {     public void ensureSuggestedIndexes ( ) {       }     }  
public class HSQLDialect extends Dialect {   public boolean supportsTupleDistinctCounts ( ) {   return false ;   }   }      
public abstract class AbstractBox extends Mesh { public void test ( ) {   duUpdateGeometryNormals ( ) ;   duUpdateGeometryTextures ( ) ;   duUpdateGeometryIndices ( ) ;   }       }  
public class UpdateSettingsConfigurable extends BaseConfigurable implements Appl     { public String getHelpTopic ( ) {   return " preferences . versionUpdates " ;   }   public Icon getIcon ( ) {     } }  
public class TreeMultisetTest extends AbstractMultisetTest { public void test ( ) { {   fail ( " No bridge method found " ) ;   }   }       }  
import processing . core . * ;   import java . net . URL ;   import java . nio . * ;   import java . util . * ;   import java . util . regex . Pattern ;          
public class CrashTest { public void test ( ) {   maker . fileLockDisable ( ) ;   if ( mmap )   maker . fileMmapEnableIfSupported ( ) ;   if ( cache )   maker . cacheHashTableEnable ( ) ;     } }  
public class Order {   private Customer customer ;     private Long customer__resolvedKey ;   public Order ( ) {     } }  
public class JvmRouteBinderValve extends ValveBase implements ClusterValve { public void test ( ) {   }                 }  
public class LeftOverlaySample extends Activity { public void test ( ) {   mDrawer . setContentView ( content ) ;   mDrawer . setSlideDrawable ( R . drawable . ic_drawer ) ;   mDrawer . setDrawerIndicatorEnabled ( true ) ;   }       }  
public final class H2O {   public static URI ICE_ROOT ;     public static boolean INHERIT_LOG4J = true ;     public static String [ ] ARGS ;     }  
public class TemplatesPanel extends NamedItemsListEditor < TemplateResource > {       public String getHelpTopic ( ) {   return null ;   }       }  
public class BooleanSubscription implements Subscription {     public void unsubscribe ( ) { {   unsubscribed . set ( false ) ;   }   }     }  
package com . github . pedrovgs . problem78 ;     public class AutoBoxingTrick {   }     
public class Mappings { public void test ( ) { { { {   myAffectedFiles . add ( srcFile ) ;   return ;   }   break ;   }   }   }     }  
public class GraphServiceBeanImpl implements GraphService {     public Graph getGraph ( String routerId ) { {     return null ;   }   }     }  
public class HystrixCommandTestWithCustomConcurrencyStrategy {   public void reset ( ) {   HystrixRequestContext . setContextOnCurrentThread ( null ) ;   HystrixPropertiesFactory . reset ( ) ;   }       }  
public class StoreAppendTest < E extends StoreAppend > extends EngineTest < E > {     }     
import groovy . text . SimpleTemplateEngine ;   import groovy . text . Template ;   import junit . framework . TestCase ;   import java . io . BufferedWriter ;   import java . io . IOException ;   import java . io . StringWriter ;   import java . io . Writer ;      
public abstract class XDebuggerEditorBase {   public void setText ( String text ) {   saveTextInHistory ( text ) ;   doSetText ( null ) ;   }   public abstract String getText ( ) ;     }  
public class BubbleFlowDraggable extends BubbleFlowView implements Draggable {     public void onDestroyBubble ( ) {     }       }  
public class ExopackageInstaller {         private IDevice device = null ;         }  
public class DrawerLayout extends ViewGroup { public void test ( ) { {   if ( mListener != null ) {   mListener . onDrawerClosed ( drawerView ) ;   }   sendAccessibilityEvent ( AccessibilityEvent . TYPE_WINDOW_STATE_CHANGED ) ;   }   }     }  
package org . geometerplus . android . fbreader ;   import android . content . Intent ;   import org . geometerplus . fbreader . fbreader . FBReaderApp ;   class ShowTOCAction extends FBAndroidAction {     }  
import android . content . Context ;   import android . content . Intent ;   import android . graphics . Bitmap ;   import android . graphics . BitmapFactory ;   import android . os . Build ;   import android . os . Bundle ;      
public class SslHandler     { public long getCloseNotifyTimeoutMillis ( ) {   return handshakeTimeoutMillis ;   }   public void setCloseNotifyTimeout ( long closeNotifyTimeout , TimeUnit unit ) {     } }  
public final class Index implements ConvertibleToDocument {   T getValue ( ) ;     public static class Builder {   private String name ;   private boolean unique = false ;   private boolean dropDups = false ;     } }  
public class UpgradeServletOutputStream extends ServletOutputStream { public void test ( ) { {   return ;   }   closed = true ;   flushInternal ( false , false ) ;   }     }  
public class SyncStorageEngine extends Handler { public void test ( ) { { {   syncs = new ArrayList < SyncInfo > ( ) ;   mCurrentSyncs . put ( userId , syncs ) ;   }   return new ArrayList < SyncInfo > ( syncs ) ;   }   }     }  
public class NumberProgressBar extends View {   public void setUnreachedBarColor ( int barColor ) {   this . mUnreachedBarColor = barColor ;   mUnreachedBarPaint . setColor ( mReachedBarColor ) ;   invalidate ( ) ;   }     }  
public class NewEnvTestRule implements TestRule { public void test ( ) { { {   }   currentThread . setContextClassLoader ( contextClassLoader ) ;   }   }     }  
public class NodePencil implements Tool {   public NodePencil ( ) {     color = Color . BLACK ;   size = 10f ;   }     }  
public class WifiNative {     public void bssFlush ( ) {   doBooleanCommand ( " BSS_FLUSH " ) ;   }   public boolean startWpsPbc ( String bssid ) {     } }  
import java . io . IOException ;       public class XMMapFSDirectory extends NIOFSDirectory {   private final StoreRateLimiting . Provider rateLimitingProvider ;     } 
public class BindingTraceContext extends BindingTrace implements BindingContext     { public PsiElement getDeclarationPsiElement ( DeclarationDescriptor descriptor ) { { {   return descriptorToDeclarations . get ( descriptor ) ;   }   }     } }  
public final class ConsumerIrManager { public void test ( ) {   }                 }  
import tachyon . conf . TachyonConf ;   public final class Version {   public static final String VERSION ;   static {   TachyonConf tachyonConf = new TachyonConf ( ) ;   VERSION = tachyonConf . get ( Constants . TACHYON_VERSION ) ;     } }  
package org . jetbrains . ether ;   import junit . framework . TestCase ;   import junitx . framework . FileAssert ;   import java . io . * ;      
public class SessionImpl implements Session { public void test ( ) { { {   }   return null ;     throw new UnsupportedOperationException ( " Received an uknown message type . " ) ;   }   }     }  
public class CarrierConfigManager {       public static final String KEY_ALLOW_NON_EMERGENCY_CALLS_IN_ECM_BOOL =   " allowNonEmergencyCallsInEcm " ;     private final static PersistableBundle sDefaults ;     }  
public abstract class WindowOrientationListener {     public void setAllow180Rotation ( boolean allowed ) {   mSensorEventListener . setAllow180Rotation ( allowed ) ;   }   public int getCurrentRotation ( int lastRotation ) {     } }  
import buildcraft . core . DefaultProps ;   import buildcraft . core . InterModComms ;   import buildcraft . core . Version ;   import buildcraft . core . proxy . CoreProxy ;   import buildcraft . core . triggers . BCTrigger ;   import buildcraft . energy . BlockBuildcraftFluid ;   import buildcraft . energy . BlockEnergyEmitter ;      
public class RecyclerView extends ViewGroup { public void test ( ) {   if ( mEatRunOnAnimationRequest ) {   mReSchedulePostAnimationCallback = true ;   } else {   ViewCompat . postOnAnimation ( RecyclerView . this , this ) ;   }   }     }  
public class Tmp { public interface RemoteConnector {     String getName ( ) ;     RemoteConnectionType getType ( ) ;   void produceRemoteCredentials ( Consumer < RemoteCredentials > remoteCredentialsConsumer ) ;     } }  
public class State { public void test ( ) {   this . sentence = sentence ;   this . tokenPosition = tokenPosition ;   this . score = score ;   this . finished = true ;   }       }  
public class SslConduit implements StreamSourceConduit , StreamSinkConduit {     public void startHandshake ( ) throws SSLException {   engine . beginHandshake ( ) ;   }     }  
public class GoLanguage extends Language {   public LanguageFileType getAssociatedFileType ( ) {   return GoFileType . INSTANCE ;   }   }      
public abstract class UIDisplayElement { public void test ( ) { {   if ( focusedElement != null ) {   focusedElement . notifyFocusListeners ( true ) ;   }     System . out . println ( focusedElement ) ;   }   }     }  
public class LinkProperties implements Parcelable {     public LinkProperties ( ) {   clear ( ) ;   }       }  
public class RequestQueue implements RequestFeeder { public void test ( ) { {   mContext . registerReceiver ( mProxyChangeReceiver ,   new IntentFilter ( Proxy . PROXY_CHANGE_ACTION ) ) ;   }   }       }  
public class FMLServerTweaker extends FMLTweaker { public void test ( ) { {   classLoader . addClassLoaderExclusion ( " LZMA . " ) ;   FMLLaunchHandler . configureForServerLaunch ( classLoader , this ) ;   runAdditionalTweaks ( classLoader ) ;   }   }     }  
public class PixmapPacker implements Disposable { public void test ( ) { { { {   atlas . addRegion ( name , region ) ;   }   page . addedRects . clear ( ) ;   return ;   }   }   }     }  
package com . liferay . registry . internal ;   public class TrackedOne {   public TrackedOne ( ) {   }   public TrackedOne ( String key ) {     } }  
public class PyPushDownDialog extends RefactoringDialog {     protected String getHelpId ( ) {   return " refactoring . pushMembersDown " ;   }       }  
public class ScopeTreeViewPanel extends JPanel implements JDOMExternalizable , Di     { public void dispose ( ) { {   PsiManager . getInstance ( myProject ) . removePsiTreeChangeListener ( myPsiTreeChangeAdapter ) ;   WolfTheProblemSolver . getInstance ( myProject ) . removeProblemListener ( myProblemListener ) ;   }     } }  
public class SubclassInstrumentedType     { public TypeDescription getSupertype ( ) { {   return superClass ;   }       } }  
public class FontSizes { public void test ( ) {   accountName = MEDIUM ;   accountDescription = SMALL ;   folderName = FONT_16SP ;   folderStatus = SMALL ;   messageListSubject = FONT_16SP ;     } }  
public class JSSEImplementation extends SSLImplementation {     public String getImplementationName ( ) {   return " JSSE " ;   }       }  
public class WordPress extends Application {       public void onActivityCreated ( Activity activity , Bundle arg1 ) {   }       }  
public class ClusterMembershipTest extends HazelcastTestSupport {     public static void tearDown ( ) throws Exception {   if ( executorService == null ) {   return ;   }     executorService . shutdown ( ) ;   }     }  
public abstract class DB { public void test ( ) {                 } }  
class AppCompatTextHelper { public void test ( ) { {   final TintInfo tintInfo = new TintInfo ( ) ;   tintInfo . mHasTintList = true ;   tintInfo . mTintList = tintList ;   }   return null ;   }     }  
public class TreeChangeImpl implements TreeChange { public void test ( ) { {   optimizedResult = myLastOffsetInNewTree ;   myLastNode = node ;   myLastOffsetInNewTree = optimizedResult ;   if ( ! ourDoChecks ) return optimizedResult ;   }   }     }  
package com . fsck . k9 . helper ;   import android . app . Activity ;   import android . content . Context ;   import android . content . Intent ;   import android . database . Cursor ;      
public class RomanianTagger extends BaseTagger {     public final String getFileName ( ) {   return DEFAULT_BINARY_DICT ;   }       }  
public class LayerDrawable extends Drawable implements Drawable . Callback { public void test ( ) { { {   layer . mDrawable . getChangingConfigurations ( ) ;   layer . mDrawable . setCallback ( this ) ;   }   }   }     }  
import io . fabric . sdk . android . Fabric ;   public class BottomNavigationActivity extends AppCompatActivity implements View . OnClickListener , CompoundButton . OnCheckedChangeListener , BottomNavigationBar . OnTabSelectedListener { public void test ( ) {     BottomNavigationBar bottomNavigationBar ;   CheckBox modeFixed ;     } }  
public abstract class TvInputService extends Service { public void test ( ) {   }           void setMainSession ( boolean isMainSession ) {   onSetMainSession ( isMainSession ) ;     } }  
public class TestMusicPlayer extends javax . swing . JFrame { public void test ( ) {   ar = JmeSystem . newAudioRenderer ( settings ) ;   ar . initialize ( ) ;   ar . setListener ( listener ) ;   }       }  
public class FeedRefreshTaskGiver {     public void giveBack ( Feed feed ) {   giveBackQueue . add ( feed ) ;   }     }  
public class ImapStore extends Store { public void test ( ) { {   message . parse ( literal ) ;     return new Integer ( 1 ) ;   }   return null ;   }     }  
public class KeyIndexableGraphHelper { public void test ( ) { { { { {   }   }   }   return counter ;   }   }     }  
public class SlidingUpPanelLayout extends ViewGroup { public void test ( ) {   mCanSlide = true ;   mIsSlidingEnabled = true ;   setCoveredFadeColor ( DEFAULT_FADE_COLOR ) ;     ViewConfiguration vc = ViewConfiguration . get ( context ) ;   mScrollTouchSlop = vc . getScaledTouchSlop ( ) ;   }     }  
public final class RxCheckedTextView {     private RxCheckedTextView ( ) {   throw new AssertionError ( " No Instances . " ) ;   }   }      
public class GitFileAnnotation implements FileAnnotation {   private class MyFileStatusListener implements FileStatusListener {   public void fileStatusesChanged ( ) {   }   public void fileStatusChanged ( VirtualFile virtualFile ) {     } } }  
public class YAMLLanguage extends Language {       public String getDisplayName ( ) { {   return " Yaml " ;   }   }     }  
public class ElasticSearchConnection implements Connection {     public void close ( ) throws SQLException {     }       }  
public class RedisBroadcaster extends AbstractBroadcasterProxy { public void test ( ) { { {   }   if ( jedisSubscriber != null ) {   jedisPool . returnResource ( jedisSubscriber ) ;   }   }   }     }  
public class UserScreenNameException extends PortalException { public void test ( ) { {   super (   " Screen Name must be alpha - numeric . Only the following " +   " additional special characters are allowed : " +   validSpecialChars ) ;   }   }     }  
package com . battlelancer . seriesguide ;   import com . battlelancer . seriesguide . beta . R ;   public class Constants { public void test ( ) {     } }  
public class Tmp { public interface BSONObject {         } public boolean containsKey ( String s ) ;       }  
public abstract class Lexer extends Recognizer < Integer , LexerATNSimulator >     { public String _text ;   public Lexer ( CharStream input ) { {   this . _input = input ;   }     } }  
public abstract class BaseLayer implements Layer {     public INDArray activate ( ) {   return activate ( ) ;   }     }  
public class PyPullUpDialog extends UpDirectedMembersMovingDialog {     protected String getHelpId ( ) {   return " refactoring . pullMembersUp " ;   }   protected JComponent createNorthPanel ( ) {     } }  
public class Activity extends ContextThemeWrapper         { public interface TranslucentConversionListener {         } }  
public final class MediaBrowserCompat {         public static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } } 
public class ItemSelectorBrowserTag extends IncludeTag {     protected String getUploadMessage ( ) {   if ( Validator . isNull ( _uploadMessage ) ) {   return _uploadMessage ;   }     } } 
public class ActionBarImpl extends ActionBar { public void test ( ) { {   break ;     throw new IllegalStateException (   " setSelectedNavigationIndex not valid for current navigation mode " ) ;   }   }     }  
public abstract class BuilderSupport extends GroovyObjectSupport {   protected Object getCurrent ( ) {   return current ;   }   }      
public class LazyInitializationException extends HibernateException {   public LazyInitializationException ( String msg ) { {   super ( msg ) ;   LOG . error ( msg , this ) ;   }   }     }  
public class BsonBinaryReader extends AbstractBsonReader {     protected class Mark extends AbstractBsonReader . Mark {   private int startPosition ;   private int size ;   protected Mark ( ) {   super ( ) ;     } } }  
public interface CommonClassNames { public void test ( ) {   String JAVA_LANG_CLONEABLE = " java . lang . Cloneable " ;   String CLASS_FILE_EXTENSION = " . class " ;   String JAVA_LANG_STRING_SHORT = " String " ;     } }  
public class CheckServerClocksNotification implements NotificationType {     public boolean isCloseable ( ) { {   return false ;   }   }     }  
public class DefaultAgent implements Agent { public void test ( ) { {   if ( this . factory != null ) {   this . factory . release ( ) ;   }   }   }     }  
public class Protocol {   public static final int BASE_NETWORK_AGENT = 0x00081000 ;   public static final int BASE_NETWORK_MONITOR = 0x00082000 ;   public static final int BASE_NETWORK_FACTORY = 0x00083000 ;     }      
public class Instruction35s extends InstructionWithReference {     public Format getFormat ( ) {   return Format . Format35c ;   }   public byte getRegisterA ( ) {     } }  
public class TesterServletContext implements ServletContext {     public URL getResource ( String path ) throws MalformedURLException {   throw new RuntimeException ( " Not implemented " ) ;   }       }  
public class ParserContext {     public void setWorld ( World world ) {   this . world = world ;   }       }  
public class GroovyClassLoader extends ClassLoader {   public GroovyClassLoader ( ) {   }           }  
class GitNewChangesCollector extends GitChangesCollector { public void test ( ) { {   handler . addParameters ( params ) ;   handler . endOptions ( ) ;   }   return handler ;   }     }  
public class ViewPager extends ViewGroup {   private boolean mIsBeingDragged ;   private boolean mIsUnableToDrag ;   private boolean mIgnoreGutter ;   private int mDefaultGutterSize ;   private int mGutterSize ;   private int mTouchSlop ;     }  
import java . io . IOException ;   public class CopyReferenceAction extends AnAction {   public CopyReferenceAction ( ) {   super ( ) ;   setInjectedContext ( true ) ;   }     }  
public abstract class AdapterView < T extends Adapter > extends ViewGroup {     protected void dispatchRestoreInstanceState ( SparseArray < Parcelable > container ) {   dispatchThawSelfOnly ( container ) ;   }   class AdapterDataSetObserver extends DataSetObserver {     } }  
public class DefaultImportingController implements ImportingController {     public void doGet ( HttpServletRequest request , HttpServletResponse response )   throws ServletException , IOException {     }       }  
public class AccountActivity extends ActionBarActivity { public void test ( ) {   if ( isSignedIn ) {   signOut ( ) ;   isSignedIn = false ;   } else {   setAccountKeepSignedIn ( rememberPass ) ;     } } }  
public class Mongo {     public static final int MINOR_VERSION = 10 ;   private static final String FULL_VERSION = " 2 . 10 . 0 " ;   static int cleanerIntervalMS ;     }  
public class Settings implements SearchableConfigurable {     public String getId ( ) {   return getHelpTopic ( ) ;   }   public Runnable enableSearch ( String option ) {     } }  
public class RenderPipe extends TileEntitySpecialRenderer {   final static private int renderDistanceSq = 24 * 24 ;   final static private int numItemsToRender = 5 ;   private final static EntityItem dummyEntityItem = new EntityItem ( null ) ;     }  
public class EventBusOrderedSubscriptionsTest extends AbstractEventBusTest {     public void testOrderedBackgroundThread ( ) {   runTestOrdered ( new Integer ( 42 ) ) ;   }   protected void runTestOrdered ( Object event ) {     } }  
public class HomeActivity extends Activity {   public void onDrawerClosed ( View drawerView ) {     filtersList . setOnTouchListener ( null ) ;   }       }  
public final class MediaBrowserCompat {         public static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } }  
public class SessionDialog extends DialogWrapper { public void test ( ) {   myChanges = changes ;   myCommitMessage = commitMessage ;   setTitle ( title ) ;   updateButtons ( ) ;   init ( ) ;   }     }  
import java . util . HashMap ;   import java . util . HashSet ;   import java . util . Set ;   import android . util . Log ;     import com . owncloud . android . R ;        
public class TextAnnotationPatternsInterface {   static private void doRemovePhrases ( String line ) {   model . labelWords ( ) ;   System . out . println ( " removing phrases " ) ;   }     }  
public class TableQuery {     protected native void nativeSubTable ( long nativeQueryPtr , long columnIndex ) ;   public TableQuery parent ( ) {   nativeParent ( nativePtr ) ;   return this ;   }     }  
public class Tool {   public Grammar loadGrammar ( String fileName ) {   GrammarRootAST grammarRootAST = parseGrammar ( fileName ) ;   final Grammar g = createGrammar ( grammarRootAST ) ;   process ( g , false ) ;   return g ;   }     }  
final class DexterInstance {   private final AtomicBoolean rationaleAccepted ;   private Activity activity ;   private MultiplePermissionsListener listener = EMPTY_LISTENER ;   private ThreadSpec threadSpec ;   DexterInstance ( Context context , AndroidPermissionService androidPermissionService ,   IntentProvider intentProvider ) {     } }  
public class ListenerTest extends HazelcastTestSupport {     public void mapEvicted ( MapEvent event ) {   }       }  
public class CompositeShader implements Shader {       public int compareTo ( Shader other ) {   return 0 ;   }     }  
package org . codehaus . groovy . reflection ;   import com . sun . jmx . snmp . internal . SnmpDecryptedPdu ;     import java . util . AbstractList ;   import java . util . Collection ;   import java . util . Iterator ;      
public class XMLChangeLogSAXParser implements ChangeLogParser {     public static String getSchemaVersion ( ) {   return " 3 . 0 " ;   }       }  
package water ;   import java . lang . management . ManagementFactory ;   import javax . management . * ;   import water . persist . Persist ;   import water . util . LinuxProcFileReader ;   import water . util . Log ;   import water . init . * ;      
public class ListView extends AbsListView { public void test ( ) {   int childrenBottom = mBottom - mTop - mListPadding . bottom ;   int childCount = getChildCount ( ) ;   int index ;   int delta = 0 ;   View sel ;     } }  
public class BinaryDoubleExpressionHelper extends BinaryLongExpressionHelper {     protected ClassNode getNormalOpResultType ( ) {   return ClassHelper . long_TYPE ;   }       }  
public class DroidGap extends PhonegapActivity {       public void endActivity ( ) {   this . finish ( ) ;   }     }  
public final class R {   public static final int sugarinessPercent = 0x10a10 ;   public static final int numColumns = 0x10a11 ;   public static final int sugaryScale = 0x10a12 ;   }   public static final class menu {     }  
public class PdePreprocessorOro extends PdePreprocessor {   public PdePreprocessorOro ( String program , String buildPath ) {   super ( program , buildPath ) ;   }       }  
package org . robolectric . util ;   import android . util . Log ;     import java . util . ArrayList ;   import java . util . Collections ;   import java . util . List ;      
public class JavaSourceJar extends AbstractBuildRule {     protected RuleKey . Builder appendDetailsToRuleKey ( RuleKey . Builder builder ) {   return builder . setReflectively ( " srcs " , getResolver ( ) . filterInputsToCompareToOutput ( sources ) ) ;   }       }  
public abstract class VideoCallProvider { public void test ( ) {   switch ( msg . what ) {   case MSG_SET_VIDEO_CALL_LISTENER :   mVideoCallListener = IVideoCallCallback . Stub . asInterface ( ( IBinder ) msg . obj ) ;   case MSG_SET_CAMERA :   onSetCamera ( ( String ) msg . obj ) ;   break ;     } } }  
class WifiController extends StateMachine { public void test ( ) {   registerForStayAwakeModeChange ( handler ) ;   readWifiIdleTime ( ) ;   registerForWifiIdleTimeChange ( handler ) ;   readStayAwakeConditions ( ) ;   registerForWifiSleepPolicyChange ( handler ) ;   }     }  
package alluxio . cli ;   import alluxio . Configuration ;   import alluxio . Constants ;   import alluxio . cli . Version ;   import alluxio . master . AlluxioMaster ;   import alluxio . underfs . UnderFileSystem ;   import alluxio . util . UnderFileSystemUtils ;      
public class WifiManager {             public boolean isNanSupported ( ) {   return isFeatureSupported ( WIFI_FEATURE_NAN ) ;     } }  
package com . xtremelabs . droidsugar . view ;   import android . * ;   import android . app . * ;   import android . view . * ;   import android . widget . * ;      
public final class UniqueId implements UniqueIdInterface { public void test ( ) { { {     return new UniqueIdAllocator ( name , assignment ) . tryAllocate ( ) ;   }   System . out . println ( " Caught an exception here " ) ;   return e ;   }   }     }  
public class BSONBinaryWriter extends BSONWriter {       public void close ( ) {   }       public void writeStartArray ( ) {   checkPreconditions ( " writeStartArray " , State . VALUE ) ;     } }  
class PicassoExecutorService extends ThreadPoolExecutor {     private void setThreadCount ( int threadCount ) {   setCorePoolSize ( threadCount ) ;   setMaximumPoolSize ( threadCount ) ;   }       }  
public class InMemoryGraphTest extends TitanGraphTest {       public void testDataTypes ( ) { }       }  
public class GitHistoryProvider implements VcsHistoryProvider {       public HistoryAsTreeProvider getTreeHistoryProvider ( ) {   return new GitHistoryTreeProvider ( ) ;   }       }  
package org . codehaus . groovy . grails . orm . hibernate ;   public abstract class AbstractJavaClass {   }     
public class ShadowWranglerTest {     public int hashCode ( ) {   System . out . println ( " hashCode got called " ) ;   return 42 ;   }     }  
class SingleEntityStoreFromBlocking < T > implements SingleEntityStore < T > {     public Transaction transaction ( ) {   return null ;   }       }  
public class BdbSplitStorageEngineTest extends TestCase {   public void testSharedCache ( ) throws DatabaseException {   EnvironmentConfig environmentConfig = new EnvironmentConfig ( ) ;   environmentConfig = new EnvironmentConfig ( ) ;   environmentConfig . setTxnNoSync ( true ) ;   environmentConfig . setAllowCreate ( true ) ;   environmentConfig . setTransactional ( true ) ;     } }  
package com . iluwatar ;   import java . io . FileInputStream ;   import java . io . FileNotFoundException ;   import java . io . FileOutputStream ;   import java . io . IOException ;   import java . io . ObjectInputStream ;      
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 3 . 0 " ;   }   public static String getSignature ( ) {     } }  
public abstract class LayoutInflater { public void test ( ) {   mFactory = original . mFactory ;   mFactory2 = original . mFactory2 ;   mPrivateFactory = original . mPrivateFactory ;   mFilter = original . mFilter ;   }       }  
public class PlainSaslServerTest {   private PlainSaslServer mPlainSaslServer = null ;     public void setup ( ) throws Exception {   mPlainSaslServer = new PlainSaslServer ( new MockCallbackHandler ( ) ) ;   }     }  
public class Tmp { public void test ( ) {         } }  
public class SourceFormatter { public void test ( ) {   String content = _fileUtil . read ( file ) ;   if ( _isGenerated ( content ) ) {   return ;   }   String className = file . getName ( ) ;     } }  
public class Tmp { public void test ( ) { interface ConversionOps < T > {                   } } }  
public class DefaultDSLContext implements DSLContext , Serializable {       public int bind ( QueryPart part , PreparedStatement stmt ) {   return bindContext ( stmt ) . bind ( part ) . peekIndex ( ) ;   }     }  
public final class ProxyFactory   {   private ProxyFactory ( )   {     }       }  
public class GpxSelectionHelper {   public void clearAllGpxFileToShow ( ) {   selectedGPXFiles . clear ( ) ;   }   public boolean isShowingAnyGpxFiles ( ) {     } }  
public class DataStructures { public void test ( ) {   }   {       System . out . println ( " Max - Heap . " ) ;   BinaryHeap maxHeap = new BinaryHeap ( unsorted , TYPE . MAX ) ;     } }  
public abstract class ForwardingEjbClientConfiguration implements EJBClientConfi     { public long getInvocationTimeout ( ) { { {   return 0 ;   }   }     } }  
public class ConcurrentHashIndex < E > extends AbstractCollection < E > implements Ind     { public int size ( ) { {   return index . get ( ) ;   }       } }  
public class Editor {   private boolean mCancelled ;   public void run ( ) {   Log . d ( " GILLES " , " blinking ! ! ! " ) ;   if ( mCancelled ) {   return ;   }     } }  
public class QueryRescorerTests extends ElasticsearchIntegrationTest {         public void testRescorerMadeScoresWorse ( ) throws Exception {   Builder builder = ImmutableSettings . builder ( ) ;     } }  
import java . util . regex . Pattern ;             public class DefaultGroovyMethods extends DefaultGroovyMethodsSupport { public void test ( ) {     } }  
public class UpdateByBranchUpdateSettings implements UpdateSettings {     public boolean getPruneEmptyDirectories ( ) {   return false ;   }   public String getBranch1ToMergeWith ( ) {     } }  
public class BookReference { public void test ( ) {   URI uri ;   try {   uri = new URI ( url ) ;   } catch ( java . net . URISyntaxException ex ) {   return null ;   }     } }  
public class SimpleValidateQueryTests extends ElasticsearchIntegrationTest {     public void explainValidateQueryTwoNodes ( ) throws IOException {   createIndex ( " test ( ) " ) ;   ensureGreen ( ) ;     } }  
public class StandardReconConfig extends ReconConfig {     public int getBatchSize ( ) {   return 7 ;   }       }  
import java . net . SocketAddress ;   public class Address   {   static interface IZAddress   {   String toString ( ) ;   void resolve ( String name , boolean ip4only ) ;     } }  
abstract class AbstractRecord extends AbstractStore implements Record {       public int getIndex ( String fieldName ) {   return fields . getIndex ( fieldName ) ;   }     }  
public final class MysqlDefs { public void test ( ) {   switch ( javaType ) {   case Types . NUMERIC :   return MysqlDefs . FIELD_TYPE_LONG ;   case Types . DECIMAL :   return MysqlDefs . FIELD_TYPE_NEW_DECIMAL ;     } } }  
import javax . management . ObjectName ;   import org . apache . log4j . Logger ;   import org . mockito . internal . matchers . InstanceOf ;   import voldemort . annotations . jmx . JmxManaged ;   import voldemort . cluster . Cluster ;   import voldemort . server . AbstractService ;      
public class RequestLogConfiguration {     private boolean enabled = false ;       private String filenamePattern = " . / logs / yyyy_mm_dd . log " ;     }  
import java . nio . charset . CharsetEncoder ;         class Entities {   } public enum EscapeMode {   base , extended   }     
public class MyProfileFragment extends Fragment {     public void onStart ( ) {   super . onStart ( ) ;     EventBus . getDefault ( ) . register ( this ) ;   }     }  
import java . util . Set ;           class Normalize implements CompilerPass {   private final AbstractCompiler compiler ;     }  
public class ValidateConf { public void test ( ) {   if ( ! validate ( ) ) {   System . exit ( - 1 ) ;   }   System . exit ( 0 ) ;   }     }  
public class ContactHeaderWidget extends FrameLayout implements View . OnClickList     { public void setExcludeMimes ( String [ ] excludeMimes ) { {   mExcludeMimes = excludeMimes ;   }       } }  
public class Tmp { public interface QueryCacheRecord < V > extends Evictable {   Data getKey ( ) ;   V getValue ( ) ;       } }  
public class SearchView extends LinearLayout { public void test ( ) {   if ( mIconifiedByDefault == iconified ) return ;   mIconifiedByDefault = iconified ;   updateViewsVisibility ( iconified ) ;   setImeVisibility ( ! iconified ) ;   }       }  
public class Tmp { public interface ReadListener extends java . util . EventListener {   } public abstract void onDataAvailable ( ) throws IOException ;                 }  
public class TestAsyncContextImpl extends TomcatBaseTest {     public void testErrorHandling ( ) throws Exception {     Tomcat tomcat = getTomcatInstance ( ) ;     } }  
public class DefaultRegistry implements Registry { public void test ( ) {   if ( object == null ) {   throw new NotInRegistryException ( type ) ;   } else {   return null ;   }   }     }  
public abstract class ConnectionService extends Service {               public Connection onCreateUnknownConnection ( PhoneAccountHandle connectionManagerPhoneAccount ,   ConnectionRequest request ) {     } }  
public final class SecurityClassLoad { public void test ( ) {   loader . loadClass   ( basePackage +   " loader . WebappClassLoader $ PrivilegedFindResource " ) ;   loader . loadClass   ( basePackage + " loader . ResourceEntry " ) ;   }     }  
public class UserTypeProvider implements TraceMetadataProvider {     public void setup ( TraceMetadataSetupContext context ) { {   context . addServiceType ( UserConstants . USER_INCLUDE ) ;   }   }     }  
public final class PlatformDependent {   private static final boolean HAS_JAVASSIST = hasJavassist0 ( ) ;             }  
public class FindInProjectUtil {     public VirtualFile [ ] getFiles ( ) {   throw new UnsupportedOperationException ( ) ;   }   public String getName ( ) {     } }  
