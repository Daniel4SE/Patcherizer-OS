public abstract class Connection {     public static String stateToString ( int state ) {   switch ( state ) {   case State . NEW :   return " NEW " ;   case State . RINGING :     } } } 
public class NotificationStackScrollLayout extends ViewGroup     { public void onChildAnimationFinished ( ) { {   applyCurrentState ( ) ;   mAnimationEvents . clear ( ) ;   }     } } 
public abstract class PoolingHttpDestination < C extends Connection > extends HttpD   { public void close ( )   { {   connectionPool . close ( ) ;   }     } } 
public class CounterLatch {   private final Sync sync ;   private final AtomicLong count ;   private long signal ;   private volatile boolean released = false ;       } 
package groovy . util ;   import groovy . lang . Closure ;   import groovy . lang . GroovyObject ;   import groovy . lang . GroovyObjectSupport ;   import groovy . lang . Writable ;   import org . codehaus . groovy . runtime . DefaultGroovyMethods ;     
public class PyCodeStyleSettingsProvider extends CodeStyleSettingsProvider {     public String getHelpTopic ( ) { { {   return null ;   }   } ;   }     } 
public class UpgradeSocial extends UpgradeProcess { public void test ( ) { { {   continue ;   }   return modifiedDate ;   }   }     } 
public class LightweightHint extends UserDataHolderBase implements Hint {       public boolean vetoesHiding ( ) {   return false ;   }     } 
public class Tmp { public interface ModelBuilder < T > extends LongRunningOperation {         ModelBuilder < T > withCancellationToken ( CancellationToken cancellationToken ) ;       } } 
import java . util . ArrayList ;   import java . util . List ;   public class KafkaConfig implements Serializable {   public static interface BrokerHosts {   }     } 
public class ShowcaseView extends RelativeLayout     { public static class Builder {   final ShowcaseView showcaseView ;   private final Activity activity ;   private ViewGroup parent ;     } } 
public class EntryEvent extends EventObject {   public int getEventType ( ) {   return eventType ;   }     public String toString ( ) {     } } 
public class DeletionRetentionStrategy extends AbstractIndexCountBasedRetentionS     { public Class < ? > configurationClass ( ) { { {   return DeletionRetentionStrategy . class ;   }   }     } } 
public class Tmp { public interface CommandSender {   } public boolean isPlayer ( ) ;                 } 
public class Tmp { public interface IdeaPlugin extends DomElement {     List < GenericDomValue < String > > getChangeNoteses ( ) ;   GenericDomValue < String > addChangeNotes ( ) ;     } } 
class IonDrawable extends Drawable { public void test ( ) { {   imageView . setImageDrawable ( drawable ) ;   IonBitmapRequestBuilder . doAnimation ( imageView , inAnimation , inAnimationResource ) ;   imageViewFuture . setComplete ( e , imageView ) ;     }   }     } 
import static java . lang . String . format ;     public final class ValidationUtil {           } 
public class ViewConfiguration {         private static final int OVERSCROLL_DISTANCE = 2 ;         } 
public class CompilationChecker {     public boolean ignoreOptionalProblems ( ) { {   return true ;   }   }     } 
package water ;   import java . lang . management . ManagementFactory ;   import javax . management . * ;   import water . persist . Persist ;   import water . util . LinuxProcFileReader ;   import water . util . Log ;   import water . init . * ;     
public class RoundedAvatarDrawable extends Drawable {   private final int mBitmapHeight ;   private Paint mPaintBorder ;   private int mBorderWidth = 6 ;   public RoundedAvatarDrawable ( Bitmap bitmap ) {   mBitmap = bitmap ;     } } 
public class EntityLaser extends Entity {   public String getTexture ( ) {   return texture ;   }     }     
public class AssociationsTest {       public void checkAdd ( PsiElement element ) throws IncorrectOperationException {   }   public class AssociationsTest {   }     public void checkDelete ( ) throws IncorrectOperationException {   }     } 
public abstract class Rule {           public int getFalsePositives ( ) {   return - 1 ;     } } 
package org . mongodb . util ;   public class FieldHelpers {   public static boolean asBoolean ( Object fieldValue ) {     } } 
public class AsyncTwitterTest extends TestCase implements TwitterListener {   private synchronized void waitForResponse ( ) {   try {   this . wait ( 15000 ) ;   } catch ( InterruptedException e ) {   e . printStackTrace ( ) ;   }     } } 
public abstract class CloseableResource < T > implements Closeable {         public abstract void close ( ) ;   }     
public final class ShortcutUtils { public void test ( ) { { { {   }   } ;     AndroidUtils . executeAsyncTask ( shortCutTask ) ;   }   }     } 
public class SearchContainerTag < R > extends ParamAndPropertyAncestorTagImpl { public void test ( ) {   _rowChecker = null ;   _searchContainer = null ;   _searchTerms = null ;   _totalVar = SearchContainer . DEFAULT_TOTAL_VAR ;   _var = SearchContainer . DEFAULT_VAR ;     } } 
public class TridentTopologyBuilder { public void test ( ) { { {   bd . allGrouping ( masterCoordinator ( batchGroup ) , MasterBatchCoordinator . COMMIT_STREAM_ID ) ;   }   for ( Map m : c . componentConfs ) {   scd . addConfigurations ( m ) ;   }   }   }     } 
public class AsyncHttpClient { public void test ( ) {   ConnManagerParams . setMaxTotalConnections ( httpParams , DEFAULT_MAX_CONNECTIONS ) ;   HttpConnectionParams . setSoTimeout ( httpParams , socketTimeout ) ;   HttpConnectionParams . setTcpNoDelay ( httpParams , true ) ;   HttpConnectionParams . setSocketBufferSize ( httpParams , DEFAULT_SOCKET_BUFFER_SIZE ) ;     } } 
public class EnterpriseServerBuilder extends ServerBuilder     { public void stop ( )   { { {   configFile . delete ( ) ;   }   } ;     } } 
public final class ResourceLeakDetector < T > {           public static boolean isEnabled ( ) {   return ! disabled ;   }     } 
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 2 . 1 " ;   public static String getVersion ( ) {   return VERSION ;     } } 
public class AudioManager { public void test ( ) {   }                 } 
public class Tmp { public interface Property {   Boolean getReadOnly ( ) ;   void setReadOnly ( Boolean example ) ;   Integer getPosition ( ) ;     } } 
public final class CheckForInOverArray     { public void hotSwapScript ( Node scriptRoot , Node originalRoot ) { { {   NodeTraversal . traverseEs6 ( compiler , originalRoot , this ) ;   }   }     } } 
public class ConfigureDelegate extends GroovyObjectSupport { public void test ( ) { {     }   onMissing . execute ( name ) ;       return delegate . getProperty ( name ) ;   }     } 
public class ActionUtil { public void test ( ) { { {   presentation . putClientProperty ( WAS_ENABLED_BEFORE_DUMB , enabledBeforeUpdate ) ;   }   presentation . setEnabled ( false ) ;   presentation . setVisible ( false ) ;   }   }     } 
import com . intellij . openapi . fileTypes . SyntaxHighlighter ;   import org . jetbrains . annotations . NotNull ;   public class JetSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {     protected SyntaxHighlighter createHighlighter ( ) {   return new JetHighlighter ( ) ;     } } 
public class PipePowerWood extends Pipe implements IPowerReceptor {     public void setPowerProvider ( IPowerProvider provider ) {   provider = powerProvider ;   }       } 
public class HdfsFileInputStreamIntegrationTest {       public void seekTest ( ) throws IOException {   seekTest ( mInMemInputStream ) ;   }     } 
public class RegTestParams extends TestNet2Params { public void test ( ) {   super ( ) ;   interval = 10000 ;   proofOfWorkLimit = PROOF_OF_WORK_LIMIT ;   subsidyDecreaseBlockCount = 10000 ;   port = 18444 ;   }     } 
public class EmailLens extends Lens { public void test ( ) {   if ( ! attachments . isEmpty ( ) ) {   intent . putParcelableArrayListExtra ( Intent . EXTRA_STREAM , attachments ) ;   }   return intent ;     } } 
import java . util . * ;         public class DBMaker < DBMakerT extends DBMaker < DBMakerT > > {   protected final String TRUE = " true " ;     } 
public abstract class Editor extends JFrame implements RunnerListener {     public void actionPerformed ( ActionEvent e ) {   System . out . println ( e . getActionCommand ( ) ) ;   handleCut ( ) ;   }     } 
public class SharedLibraryTest {     public static void afterClass ( ) throws BrutException {     }       } 
public class DexBuffer { public void test ( ) { {   }   sb . append ( " ) " ) ;   return sb . toString ( ) ;   }     } 
public class JavaxJsonTreeGlassfish extends JavaxJsonTree {     public String getName ( ) {   return " javax json / tree / glassfish " ;   }   public static void register ( TestGroups groups ) {     } } 
public class DisUnityProcessor implements Runnable , FileVisitor < Path > { public void test ( ) {   if ( ! Files . exists ( outputDir ) ) {   Files . createDirectory ( outputDir ) ;   }   }   AssetBundle ab = new AssetBundle ( ) ;     } 
import java . util . Map ;   public class AWSClient {   private String endpoint ;   private String defaultHostHeader = " ec2 . amazonaws . com " ;   private final AwsConfig awsConfig ;     } 
public class DLFileEntryAssetRenderer     { public String getSummary ( Locale locale ) { {   return HtmlUtil . stripHtml ( _fileEntry . getDescription ( ) ) ;   }       } } 
public class Context         { public static final int FEATURE_PARENT_PROTO_PROPRTIES = 5 ;       } 
public class Media implements java . io . Serializable {   public Player player ;     public String copyright ;   public Media ( ) { }     } 
import org . ejml . simple . SimpleMatrix ;       public class SimpleTensor implements Serializable {   private SimpleMatrix [ ] slices ;   final int numRows ;   final int numCols ;     } 
public class YahooAccountRegistration {   private String password ;   private boolean rememberPassword ;         } 
public final class WebViewCore {     public boolean dispatchWebKitEvent ( MotionEvent event , int eventType , int flags ) {   switch ( eventType ) {   case WebViewInputDispatcher . EVENT_TYPE_CLICK :   return nativeMouseClick ( mNativeClass ) ;     } } } 
public class CalendarCellView extends TextView {   public void setHighlighted ( boolean highlighted ) {   isHighlighted = highlighted ;   }   protected int [ ] onCreateDrawableState ( int extraSpace ) {     } } 
public class CommandLine { public void test ( ) { {   if ( cll . handleFile ( file ) ) {   found = true ;   args [ i ] = null ;   break ;   }   }   }     } 
public class SubsamplingScaleImageView extends View {       private void reset ( boolean newImage ) {   setOnTouchListener ( null ) ;   scale = 0f ;   scaleStart = 0f ;   vTranslate = null ;     } } 
import android . view . animation . Interpolator ;   import android . widget . FrameLayout ;   import android . widget . Scroller ;   import com . slidinglayersample . R ;     public class SlidingLayer extends FrameLayout {       } 
public class TestStateStorage implements Disposable { public void test ( ) {   if ( myMap == null ) return ;   try {   myMap . close ( ) ;   }   catch ( IOException e ) {   LOG . error ( e ) ;     } } } 
public class RenderScriptGL extends RenderScript { public void test ( ) { {   }   mMessageThread = new MessageThread ( this ) ;   mMessageThread . start ( ) ;   }       } 
public class GridLabelRenderer {       public int getLabelVerticalSecondScaleWidth ( ) {   return mLabelVerticalSecondScaleWidth ;   }       } 
public class ContributionTab {         private void createComponents ( ) {   Container pane = panel ;     } } 
public class DeleteTest extends SchemaLoader   { public static void tearDown ( ) throws Exception   { {   cluster . close ( ) ;   cassandra . stop ( ) ;   }       } } 
public class JournalIntegrationTest { public void test ( ) { {   }   fsMaster . stop ( ) ;   }               } 
public abstract class Logger { public void test ( ) { {   error ( resultMessage , new Throwable ( ) ) ;   }   return value ;   }     } 
public class HgProjectConfigurable implements SearchableConfigurable {     public String getHelpTopic ( ) {   return null ;   }   public JComponent createComponent ( ) {     } } 
public final class TvContract {         public static final String PARAM_BROWSABLE_ONLY = " browable_only " ;         } 
public class IWindowManagerImpl implements IWindowManager {     public void overridePendingAppTransitionMultiThumb ( AppTransitionAnimationSpec [ ] specs ,   IRemoteCallback callback , boolean scaleUp ) {     }     } 
public class MyAccountPageTest {     public static void setUp ( ) {   adminWsClient = newAdminWsClient ( orchestrator ) ;   }     } 
public class Tmp { public enum TextureFormat {   DXT1 ,   UNUSED11 ,   DXT5 ,   UNUSED13 ,   UNUSED14 ,   UNUSED15 ,   UNUSED16 ,     } } 
public class SQLiteAssetHelper extends SQLiteOpenHelper {       public void setForcedUpgradeVersion ( int version ) {   mForcedUpgradeVersion = version ;   }       } 
public final class SpongeGame implements Game {     public String getAPIVersion ( ) {   return apiVersion != null ? apiVersion : " UNKNOWN " ;   }     } 
public class OkHttpClientHttpRequestFactoryTests extends AbstractHttpRequestFact       { public void httpMethods ( ) throws Exception { {   assertHttpMethod ( " patch " , HttpMethod . PATCH ) ;   }     } } 
public class SpellCheckerSession {   private static String taskToString ( int task ) {   switch ( task ) {   case TASK_CANCEL :   return " STATE_WAIT_CONNECTION " ;   case TASK_GET_SUGGESTIONS_MULTIPLE :   return " TASK_GET_SUGGESTIONS_MULTIPLE " ;   case TASK_CLOSE :     } } } 
public class PyExceptionBreakpointProperties extends ExceptionBreakpointProperti   { public PyExceptionBreakpointProperties ( final String exception ) { {   myException = exception ;   myNotifyOnTerminate = true ;   myIgnoreLibraries = true ;   }       } } 
public class ODistributedThreadLocal extends ThreadLocal < Boolean > {   public static ODistributedThreadLocal INSTANCE = new ODistributedThreadLocal ( ) ;   public boolean distributedExecution = false ;   }     
import java . util . List ;         public class Undertow {   private final int bufferSize ;   private final int buffersPerRegion ;     } 
public class DeleteMountPointEntry implements JournalEntry {     public JournalEntryType getType ( ) {   return JournalEntryType . ADD_MOUNTPOINT ;   }       } 
public class ServerRestInterfaceRealm extends AuthorizingRealm { public void test ( ) {   setAuthenticationTokenClass ( SessionIdAuthenticationToken . class ) ;     setCredentialsMatcher ( new AllowAllCredentialsMatcher ( ) ) ;   }       } 
  package com . phonegap ;   import java . io . EOFException ;   import java . io . FileOutputStream ;   import java . io . IOException ;   import java . io . InputStream ;     
abstract public class ContentProviderStoreBase < T , U > {     abstract protected U getIdFor ( T item ) ;   abstract protected Uri getContentUri ( ) ;   }     
public class TvView extends SurfaceView { public void test ( ) {   if ( mSession != null ) {   release ( ) ;   }   }       } 
public class PortalImpl implements Portal { public void test ( ) { { {   }   }   return false ;   }     } 
public class Tmp { public interface Channel {             } public void setName ( String name ) ;     } 
public class TupleInfo   { public enum Type   {   FIXED_INT_64 ( SIZE_OF_LONG ) ,   DOUBLE ( SIZE_OF_DOUBLE ) ,   VARIABLE_BINARY ( 1 ) ;   private final int size ;     } } 
public class MetaContactImpl   { public void test ( ) {   synchronized ( parentGroupModLock )   {   int totalStatus = 0 ;         } } } 
public class ConfigurationBundle {     private Set < Dashboard > dashboards = Collections . emptySet ( ) ;       private Set < GrokPattern > grokPatterns = Collections . emptySet ( ) ;   public String getId ( ) {     } } 
public class ItemWrench extends ItemBuildCraft implements IToolWrench {   public ItemWrench ( int i ) {   super ( i ) ;   }       } 
public class PyCodeStyleSettingsProvider extends CodeStyleSettingsProvider {   public String getConfigurableDisplayName ( ) {   return " Python " ;   }   }     
public class PortletRequestDispatcherImplTest {       public URLEncoder getURLEncoderInstance ( ) {   return null ;   }     } 
public class AndroidSdkImpl extends AndroidSdk {     public int getPlatformToolsRevision ( ) {     return 7 ;   }   private static class MyTargetWrapper implements IAndroidTarget {     } } 
final class BasicInvocationFuture < E > implements InternalCompletableFuture < E > { public void test ( ) { { { {   wait ( currentTimeoutMs ) ;   currentTimeoutMs = pollTimeoutMs - ( Clock . currentTimeMillis ( ) - waitStart ) ;   }   notifyAll ( ) ;   }   }   }     } 
public class DependencyParseAnnotator extends SentenceAnnotator {     public Set < Requirement > requirementsSatisfied ( ) {   return new HashSet < > ( ) ;   }   public static String signature ( String annotatorName , Properties props ) {     } } 
public abstract class SplitWordsMacro extends MacroBase {       protected String convertCase ( String word ) {     return word ;   }   }     
public class SingleInspectionProfilePanel extends JPanel {     protected void onScopeAdded ( ) {   updateOptionsAndDescriptionPanel ( ) ;   }     } 
public class TourViewActivity extends SherlockFragmentActivity { public void test ( ) {   try {   dlg . dismiss ( ) ;   } catch ( Exception ex ) {     }   startTourView ( ) ;   } ;     } 
public class CompressionServletResponseWrapper               { public void setCompressionThreshold ( int threshold ) {   if ( debug > 1 ) {     } } } 
public class BytesType extends AbstractType   { public String getString ( byte [ ] bytes )   { { {   return Arrays . toString ( bytes ) ;   }   }     } } 
public class NioEndpoint extends AbstractEndpoint < NioChannel > { public void test ( ) { { {   }   }   writeLatch = null ;   setReadTimeout ( soTimeout ) ;   setWriteTimeout ( soTimeout ) ;   }     } 
public class Activity extends ContextThemeWrapper       { public boolean popBackStack ( ) { {   return popBackStack ( null , 1 ) ;   }       } } 
public class ChatRoomMemberIrcImpl     { public Contact getContact ( )   { {   return null ;   }     } } 
public class ViewPager extends ViewGroup { public void test ( ) { { { {   }   }   populate ( newCurrItem ) ;   requestLayout ( ) ;   }   }     } 
package javax . el ;           public class ELClass { public void test ( ) {     } } 
public class GsdEnterAlwaysCollapsedParallaxFragment extends BaseFeatureFragment     { public int getContentLayout ( ) { {   return R . layout . fragment_gsd_enter_always_collapsed ;   }       } } 
public class ClassGen {     public ClassGen getParentGen ( ) {   return parentGen ;   }   public AnnotationGen getAnnotationGen ( ) {     } } 
public class ViewPagerActions {     public String getDescription ( ) {   return " ViewPager move one page to the right " ;   }       } 
public class BufferedTokenStream < T extends Token > implements TokenStream {     public void reset ( ) {   p = 0 ;   }       } 
public final class Path_Delegate {     private static void native_destroyMeasure ( long nPathMeasure ) {   sPathMeasureManager . removeJavaReferenceFor ( nPathMeasure ) ;   }       } 
public final class ClientContext {   private static TachyonConf sTachyonConf ;   private static InetSocketAddress sMasterAddress ;   private static ClientMetrics sClientMetrics ;   private static Random sRandom ;   private static boolean sInitialized ;   static {     } } 
public class WikiPageTrashHandlerTest extends BaseTrashHandlerTestCase {         public void testAddPageWithSameTitleAsImplicitlyDeletedPageVersion ( )   throws Exception {     } } 
public class Sketch { public void test ( ) {   current = code [ which ] ;   currentIndex = which ;   current . visited = System . currentTimeMillis ( ) ;   editor . setCode ( current ) ;     editor . header . repaint ( ) ;     } } 
public class UserLocalServiceImpl extends UserLocalServiceBaseImpl { public void test ( ) {   User user = userPersistence . findByPrimaryKey ( userId ) ;   userPersistence . update ( user ) ;   return user ;     } } 
public final class ScreenMagnifier extends IMagnificationCallbacks . Stub   { public MagnifiedContentInteractonStateHandler ( Context context ) { {   mScaleGestureDetector = new ScaleGestureDetector ( context , this ) ;   mGestureDetector = new GestureDetector ( context , this ) ;   }     } } 
public class BackgroundTaskQueuingMessageListener extends BaseMessageListener { public void test ( ) {   _backgroundTaskLocalService . fetchFirstBackgroundTask (   taskExecutorClassName , BackgroundTaskConstants . STATUS_QUEUED ) ;   if ( backgroundTask != null ) {   return ;   }     } } 
public class BackupImapStore extends ImapStore { public void test ( ) { {   Collections . addAll ( messages , msgs ) ;   }   return messages ;   }     } 
public final class Timber {   ;   private Timber ( ) {   }       } 
public class JavaScriptTarget extends Target {     public String getVersion ( ) {   return " 4 . 5 " ;   }   public Set < String > getBadWords ( ) {     } } 
public class OsmEditingPlugin extends OsmandPlugin {       public void mapActivityCreate ( MapActivity activity ) {   }         public Class < ? extends Activity > getSettingsActivity ( ) {   return SettingsOsmEditingActivity . class ;   }     } 
import java . nio . ByteBuffer ;       final class Murmur3 {   private static final int seed = 0 ;   private static final int C1 = 0xcc9e2d51 ;   private static final int C2 = 0x1b873593 ;     } 
public class Tmp { public interface WorkflowedModel {   } public boolean isExpired ( ) ;   public boolean isPending ( ) ;   public void setStatus ( int status ) ;     } 
public class SQLiteDatabase extends SQLiteClosable {   private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100 ;   private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000 ;   private static final int SLEEP_AFTER_YIELD_QUANTUM = 500 ;   private long mLastLockMessageTime = 0L ;     } 
public class MarkupTemplateEngine extends TemplateEngine {     }   static class TemplateResource {   private final String baseName ;   private final String locale ;   private final String extension ;     } 
public class FileTransferProxy extends BasicModule     { public boolean hasInfo ( String name , String node , JID senderJID ) { {   Log . info ( " Name Info : " + name ) ;   return true ;   }     } } 
public class SiteSettingsFragment extends PreferenceFragment     { public void onDismiss ( DialogInterface dialog ) { {   mEditingList = null ;   }     } } 
import android . util . FloatMath ;         public final class Number3D {    public float x ;   public float y ;   public float z ;  }   
public class DBMaker {         public DBMaker asyncThreadSetDaemon ( ) {   this . _asyncThreadDaemon = true ;   return this ;   }     } 
public class Tmp { public interface DruidAbstractDataSourceMBean {   long getCreateErrorCount ( ) ;   int getMaxActive ( ) ;   long getTimeBetweenConnectErrorMillis ( ) ;     } } 
public abstract class AbstractActiveService {   public void activate ( ) {   start ( ) ;   }     } 
public class Capture extends PImage implements PConstants { public void test ( ) {   capturing = true ;   pipeline . play ( ) ;   pipeline . getState ( ) ;   if ( init ) {   checkResIsValid ( ) ;     } } } 
public class PyUtil {     public static boolean isPackage ( PsiFile file ) {   return turnInitIntoDir ( file ) != null ;   }       } 
abstract public class TreeImportingParserBase implements ImportingParser { public void test ( ) { { {   }   }   XmlImportUtilities . createColumnsFromImport ( project , rootColumnGroup ) ;   project . columnModel . update ( ) ;   }     } 
public class DrawHandler extends Handler {     public void quit ( ) {   removeMessages ( QUIT ) ;   sendEmptyMessage ( QUIT ) ;   }     } 
public final class DrawMessage {   public void setLastInChain ( boolean lastInChain ) {   this . lastInChain = lastInChain ;   }       } 
public class Camera {       public List < Area > getMeteringAreas ( ) {   return splitArea ( KEY_METERING_AREAS ) ;   }       } 
public class MetaDataSerializer extends EntitySerializer {   private final String beanSuffix ;   private final String beanPackageName ;   private final NamingStrategy namingStrategy ;     } 
public class PApplet extends Applet       { public String dataPath ( String where ) { {   return path + File . separator + " data " + where ;   }     } } 
public class SiteMembershipsControlPanelEntry extends BaseControlPanelEntry { public void test ( ) { {   return true ;   }   return false ;   }     } 
public class ViewPager extends ViewGroup {   protected void onAttachedToWindow ( ) {   super . onAttachedToWindow ( ) ;   mFirstLayout = true ;   if ( mAdapter != null ) {   populate ( ) ;   }   }       } 
public class PGraphicsAndroid3D extends PGraphics {   public void resetMatrix ( ) {   modelview . reset ( ) ;   projmodelview . set ( projection ) ;   }     } 
public class ConsoleLogOutputStream extends PrintStream {     public void println ( Object x ) {   printStream . println ( x ) ;   }     } 
public class Tree extends JTree implements ComponentWithEmptyText , ComponentWith   { public void holdSelection ( ) {   myHeldSelection = getSelectionPaths ( ) ;   clearSelection ( ) ;   }   public void unholdSelection ( ) {     } } 
public abstract class AbstractInternalLogger implements InternalLogger , Serializ     { public void info ( Throwable t ) { {   info ( EXCEPTION_MESSAGE , t ) ;     }       } } 
public class SupportFragment extends Fragment implements ISupportFragment {     public void onActivityCreated ( Bundle savedInstanceState ) {   super . onActivityCreated ( savedInstanceState ) ;   View view = getView ( ) ;   initFragmentBackground ( view ) ;     } } 
public final class Bitmap implements Parcelable {     protected void finalize ( ) throws Throwable {   try {   nativeDestructor ( mNativeBitmap ) ;   } finally {   super . finalize ( ) ;     } } } 
public class FileInStreamTest implements Tester < FileInStream > {     public void after ( ) {   ClientContext . reset ( ) ;   }       } 
public class DirectServletRegistry { public void test ( ) { { {   if ( _log . isDebugEnabled ( ) ) {   _log . debug ( " Reload dependent " + dependant ) ;   }   }   }   }     } 
public class PGL {     protected class PGLListener implements GLEventListener {     public void display ( GLAutoDrawable glDrawable ) {   drawable = glDrawable ;     } } } 
public class DroidGap extends Activity { public void test ( ) {   appView . setWebChromeClient ( new GapClient ( this ) ) ;   appView . setInitialScale ( 100 ) ;   WebSettings settings = appView . getSettings ( ) ;   settings . setJavaScriptEnabled ( true ) ;     } } 
public class KeyguardTransportControlView extends FrameLayout { public void test ( ) {   mAudioManager . unregisterRemoteController ( mRemoteController ) ;   KeyguardUpdateMonitor . getInstance ( mContext ) . removeCallback ( mUpdateMonitor ) ;   mUserSeeking = false ;   }   void setBadgeIcon ( Drawable bmp ) {     } } 
final class DexterInstance {   private final AtomicBoolean rationaleAccepted ;   private Activity activity ;   private MultiplePermissionsListener listener ;     DexterInstance ( Context context , AndroidPermissionService androidPermissionService ,   IntentProvider intentProvider ) {   this . context = context ;     } } 
public class PyConsoleStackFrameConnector implements XStackFrameAwareSession {     public void reportError ( String message ) {   throw new NotImplementedException ( ) ;   }       } 
public class SourceCodeTraversal extends TraversalHelper { public void test ( ) { { { {   break ;   }   }   }   }     } 
public final class WorkerClient extends ClientBase { public void test ( ) {   mIsLocal = isLocal ;   mClientMetrics = Preconditions . checkNotNull ( clientMetrics ) ;   mHeartbeatExecutor = new WorkerClientHeartbeatExecutor ( this ) ;     }       } 
package com . ning . billing . analytics ;   import java . util . List ;   import java . util . UUID ;   import org . joda . time . DateTime ;   import org . slf4j . Logger ;     
public class JetFileType extends LanguageFileType {     public String getName ( ) {   return " jet " ;   }       } 
public class PrettyJSON extends JSONStringer { public void test ( ) { { {   }   }   System . out . println ( w . toString ( ) ) ;     return w . toString ( ) ;   }     } 
public class StandardServerSF extends StoreFactoryBase { public void test ( ) {   }                 } 
public class Request implements HttpServletRequest { public void test ( ) {   cookiesConverted = true ;   parseCookies ( ) ;   ServerCookies serverCookies = coyoteRequest . getCookies ( ) ;     } } 
public class BlockWorkerTest {             public void hasBlockMetaTest ( ) {     } } 
package storm . kafka ;   public class TopicOffsetOutOfRangeException extends FailedFetchException {   public TopicOffsetOutOfRangeException ( String message ) {   super ( message ) ;     } }
import java . util . regex . Matcher ;   import java . util . regex . Pattern ;   import javax . annotation . concurrent . NotThreadSafe ;   import javax . annotation . concurrent . ThreadSafe ;         
public class Splash extends JDialog implements StartupProgress {   protected void paintComponent ( Graphics g ) {   super . paintComponent ( g ) ;   mySplashIsVisible = true ;   paintProgress ( g ) ;   }   } ;     
public abstract class BasketItem extends NetworkCatalogItem {     public String getStringId ( ) {   return " " ;   }   public final void add ( NetworkBookItem book ) {     } } 
public class StreamRule {     public String getValue ( ) {   return value ;   }   public int getType ( ) {     } } 
public class Options implements Serializable {     public TestOptions newTestOptions ( ) {   return newTestOptions ( ) ;   }     } 
public class ScanResult implements Parcelable {   public int frequency ;             public long timestamp ;     } 
class ActionBarActivityDelegateICS extends ActionBarActivityDelegate { public void test ( ) {   if ( frameworkMode != null ) {   wrappedMode = new ActionModeWrapper ( context ,   mActivity . startActionMode ( wrappedCallback ) ) ;   wrappedCallback . setLastStartedActionMode ( wrappedMode ) ;   }     } } 
public class WordPress extends Application {   public synchronized static void updateCurrentBlogStats ( ) {     Blog currentBlog = WordPress . getCurrentBlog ( ) ;   if ( currentBlog != null ) {   String blogID = null ;     } } } 
public class CountriesFragment extends ListFragment {     public void onSaveInstanceState ( Bundle state ) {   state . putInt ( STATE_CHECKED ,   getListView ( ) . getCheckedItemPosition ( ) ) ;   }     } 
public abstract class Context {         public static final String NETWORK_SCORE_SERVICE = " network_score " ;       } 
import org . apache . juli . logging . LogFactory ;             public final class JspRuntimeContext { public void test ( ) {     } } 
public class ProfilerType extends EditableFileType   { public String getDefaultExtension ( )   { { {   return " Rprof " ;   }   }     } } 
import java . util . Iterator ;               public class XML { public void test ( ) {     } } 
public class FriendlyURLServlet extends HttpServlet { public void test ( ) {   Layout layout = layoutFriendlyURLComposite . getLayout ( ) ;   String layoutFriendlyURLCompositeFriendlyURL =   layoutFriendlyURLComposite . getFriendlyURL ( ) ;     } } 
public class IQVersionHandler extends IQHandler implements ServerFeaturesProvide   { public void initialize ( XMPPServer server ) {   super . initialize ( server ) ;   localServer = server ;   }   public IQHandlerInfo getInfo ( ) {     } } 
public class PermissionsResolverManager implements PermissionsResolver {   public void load ( ) {   findResolver ( ) ;   permissionResolver . load ( ) ;   }   public boolean hasPermission ( String name , String permission ) {     } } 
public class VetControllerTests {     private VetController vetController ;       private WebApplicationContext ctx ;   private MockMvc mockMvc ;     } 
public abstract class AdapterView < T extends Adapter > extends ViewGroup { public void test ( ) { {   }   event . setItemCount ( getCount ( ) ) ;   event . setCurrentItemIndex ( getSelectedItemPosition ( ) ) ;   }       } 
public class LayoutManager extends RecyclerView . LayoutManager { public void test ( ) { {   return ;   }   mRequestPosition = 222 ;   requestLayout ( ) ;   }     } 
public class Verifier implements GroovyClassVisitor , Opcodes { public void test ( ) {   ConstructorNode dummy = new ConstructorNode ( 0 , null ) ;   addInitialization ( node , dummy ) ;   node . visitContents ( this ) ;   return ;   }     } 
public class YUICompressor { public void test ( ) {   JavaScriptToken token ;   ScriptOrFnScope currentScope ;   token = getToken ( 0 ) ;   assert token . getType ( ) == Token . CATCH ;   token = consumeToken ( ) ;   assert token . getType ( ) == Token . LP ;     } } 
public class TestBeanNameELResolver {       private BeanNameELResolver createBeanNameELResolver ( ) {   return createBeanNameELResolver ( false ) ;   }   private BeanNameELResolver createBeanNameELResolver ( boolean allowCreate ) {     } } 
public class IconicsImageView extends ImageView { public void test ( ) { {     setImageDrawable ( mIcon ) ;   setScaleType ( ScaleType . MATRIX ) ;   }   }     } 
public class IpReachabilityMonitor {     private final class NetlinkSocketObserver implements Runnable {   private static final String TAG = " NetlinkSocketObserver " ;   private NetlinkSocket mSocket ;       } } 
public class FileBody implements AsyncHttpRequestBody < File > {     public boolean readFullyOnRequest ( ) {   return true ;   }       } 
public class NativeLibraryHelper {     public static boolean removeNativeBinariesLI ( String nativeLibraryPath ) {   return removeNativeBinariesFromDirLI ( new File ( nativeLibraryPath ) ) ;   }     } 
public class Config   { public Integer rpc_recv_buff_size_in_bytes ;   public Boolean start_native_transport = false ;   public Integer native_transport_port = 8000 ;   public Integer native_transport_min_threads = 16 ;   public Integer native_transport_max_threads = 128 ;     } 
public class ClientConfig {   private volatile long failureDetectorThresholdInterval = FailureDetectorConfig . DEFAULT_THRESHOLD_INTERVAL ;   private volatile long failureDetectorAsyncRecoveryInterval = FailureDetectorConfig . DEFAULT_ASYNC_RECOVERY_INTERVAL ;   private volatile int maxBootstrapRetries = 1 ;   public ClientConfig ( ) { }     } 
public class MutableDateTime extends AbstractDateTime               { public DateTimeField getRoundingField ( ) {   return iRoundingField ;     } } 
final class MoveJob extends CopyJob {     public Notification getProgressNotification ( ) {   return getProgressNotification ( R . string . copy_preparing ) ;   }       } 
public class Vpn extends INetworkManagementEventObserver . Stub { public void test ( ) {   config . packageName = mPackageName ;   config . interfaceName = mInterfaceName ;   showNotification ( pm , app , config ) ;   return descriptor ;   }     } 
public class Tmp { public interface ResolvableDependencies {               ResolutionResult getResolutionResult ( ) ;     } } 
public class UnifiedDiffViewer extends ListenerDiffViewerBase { public void test ( ) { {   myStatusPanel . update ( ) ;   myPanel . setGoodContent ( ) ;   } ;   }     } 
public class JavaMethodsConflictResolver implements PsiConflictResolver { public void test ( ) { {   if ( method . isVarArgs ( ) ) return ;   if ( method . getParameterList ( ) . getParametersCount ( ) == argumentsCount ) {   parametersNumberMatch = true ;   break ;   }   }   }     } 
public abstract class RxRatpack {   private final ExecControl execControl ;   public ExecutionBackedSubscriber ( ExecControl execControl , Subscriber < ? super T > subscriber ) {   this . execControl = execControl ;   this . subscriber = subscriber ;   }     } 
public final class WebAttributes {       public static final String AUTHENTICATION_EXCEPTION = " SPRING_SECURITY_LAST_EXCEPTION " ;   public static final String LAST_USERNAME = " SPRING_SECURITY_LAST_USERNAME " ;   }     
public class Tmp { public interface IIdentifyable < T > {                 } } 
public final class SharedPreferencesEx implements SharedPreferences {   private long mFileSize ;   private static int cTryMaxCount = 10 ;   private static int cTryWaitMs = 100 ;   public SharedPreferencesEx ( File prefFile ) {   mFile = prefFile ;     } } 
public class PostsActivity extends WPActionBarActivity implements OnPostSelected     { public void onRefresh ( boolean start ) {   if ( start ) {   startAnimatingRefreshButton ( refreshMenuItem ) ;   isRefreshing = true ;   } else {     } } } 
public class Tmp { public interface Wrapper extends Container {             } public boolean isAsyncSupported ( ) ;     } 
public class GroovyClassLoader extends ClassLoader {   public GroovyClassLoader ( ) {   }           } 
public class Printer {   private String indent = " " ;   private final StringBuilder out ;   Printer ( StringBuilder out ) {   this . out = out ;   }     } 
public class AccountActivity extends ThemeableActivity { public void test ( ) {   mUseTor . setChecked ( settings . getUseTor ( ) ) ;   getOTRKeyInfo ( ) ;   settings . close ( ) ;   cursor . close ( ) ;     } } 
import java . io . File ;   public class GroovycTask   extends CompileTaskSupport   {   private boolean force ;   public void setForce ( final boolean flag ) {   this . force = flag ;     } } 
package android . app . admin ;   import android . annotation . SdkConstant ;   import android . annotation . SdkConstant . SdkConstantType ;   import android . app . Activity ;   import android . content . AbstractRestrictionsProvider ;   import android . content . ComponentName ;     
public class MacroFactory {     public static void register ( Macro macro ) { {   myMacroTable . put ( macro . getName ( ) , macro ) ;   }   }     } 
public class OsMoThread {     public void reconnect ( ) { {   reconnect = true ;   }   }     } 
public class MaterialRippleLayout extends FrameLayout {     public RippleBuilder rippleInAdapter ( boolean inAdapter ) {   this . rippleInAdapter ( inAdapter ) ;   return this ;   }     } 
public class AttributeEqualBuilder implements CategoryBuilder {     public boolean init ( Graph graph ) {   return true ;   }     } 
package com . interview . tree ;   import javax . swing . * ;   import java . util . Optional ;   import java . util . concurrent . atomic . AtomicInteger ;   import java . util . concurrent . atomic . AtomicReference ;     
import java . util . List ;               public class BasicSemanticChecks extends GrammarTreeVisitor { public void test ( ) {       } } 
public class CalendarPickerView extends ListView {     interface OnDateSelectedListener {   public void onDateSelected ( Date date ) ;   }   }     
public final class FacebookSdk { public void test ( ) { {   throw new FacebookException ( CALLBACK_OFFSET_NEGATIVE ) ;   }   FacebookSdk . callbackRequestCodeOffset = callbackRequestCodeOffset ;   sdkInitialize ( applicationContext ) ;   }       } 
package com . SecUpwN . AIMSICD . service ;   import android . content . DialogInterface ;   import android . content . Intent ;   import android . content . SharedPreferences ;   import android . location . Location ;     
public class JspC extends Task implements Options {               public void execute ( ) {     } } 
public class ReaderWebView extends WebView { public void test ( ) {   mCustomView = null ;   mCustomViewCallback = null ;     mReaderWebView . onPause ( ) ;   }   boolean isCustomViewShowing ( ) {     } } 
public class AnswerHelper { public void test ( ) { { { {   return false ;   }   }   return true ;   }   }     } 
public class TestStandardSessionIdGenerator {       public void testValidateWithJvmRouteWithPerid ( ) {   Assert . assertTrue ( generator . validateSessionId ( VALID + " . g . h . i " ) ) ;   }     } 
class KeyguardStatusViewManager implements SecurityMessageDisplay { public void test ( ) { {   mHandler . removeCallbacks ( mClearSecurityMessageRunnable ) ;   mHandler . postDelayed ( mClearSecurityMessageRunnable , SECURITY_MESSAGE_DURATION ) ;   }   }       } 
public final class AnimChannel { public void test ( ) { { {   }   }   animation = null ;   System . out . println ( " Setting notified false " ) ;   notified = false ;   }     } 
public class ChildBrowser extends Plugin {     private void closeDialog ( ) {   if ( dialog != null ) {   dialog . dismiss ( ) ;   }   }     } 
public abstract class BaseOutputWriter implements OutputWriter { public void test ( ) { { {   result = ( Boolean ) foo ;   }   }   return result ;   }       } 
class KeyguardStatusViewManager implements SecurityMessageDisplay { public void test ( ) { {   mHandler . removeCallbacks ( mClearSecurityMessageRunnable ) ;   mHandler . postDelayed ( mClearSecurityMessageRunnable , SECURITY_MESSAGE_DURATION ) ;   }   }       } 
public class CallSipImpl     { public Iterator getCallParticipants ( )   { {   return callParticipants . iterator ( ) ;   }       } } 
package com . mongodb ;     public class WriteResult {   private final com . mongodb . WriteConcern writeConcern ;   private final int n ;   private final boolean updateOfExisting ;   private final Object upsertedId ;     } 
public class BulletPhysics implements PhysicsEngine {   public void dispose ( ) {   discreteDynamicsWorld . destroy ( ) ;   wrapper . dispose ( ) ;   }       } 
public class WebView extends AbsoluteLayout       { public static void freeMemoryForTests ( ) { {   checkThread ( ) ;   getFactory ( ) . getStatics ( ) . freeMemoryForTests ( ) ;   }     } } 
package com . fsck . k9 . activity ;   import java . util . ArrayList ;   import java . util . Arrays ;   import java . util . List ;   import android . os . AsyncTask ;     
public abstract class SimpleHttpClient {   private String responseBody ;   private List < String > bodyUriElements = null ;   protected void setPort ( int thePort ) {   port = thePort ;   }     }  
package greendroid . image ;   import greendroid . util . Config ;   import greendroid . util . GDUtils ;   import java . io . FileInputStream ;   import java . io . InputStream ;   import java . net . URL ;   import java . util . concurrent . ExecutorService ;     
package com . activeandroid ;   class Params {   public static final boolean IS_TRIAL = false ;   public static final boolean LOGGING_ENABLED = true ;     } 
public class OsmandMapTileView implements IMapDownloaderCallback { public void test ( ) {   if ( contextMenuLayer != null ) {   contextMenuLayer . onTouchEvent ( event , getCurrentRotatedTileBox ( ) ) ;   }   return true ;   }     } 
public class VoiceRouter { public void test ( ) { { {   lastTimeMakeUTwpAnnounced = System . currentTimeMillis ( ) ;   }   }   return ;   }     } 
public class XCameraDevice2 extends XHook {     public String getClassName ( ) {   return " android . hardware . camera2 . impl . CameraDevice " ;   }       } 
public class QueryableIndexSegment implements Segment   {   private final QueryableIndex index ;   private final String identifier ;   private boolean nullStorage = false ;   public QueryableIndexSegment ( final String segmentIdentifier , QueryableIndex index )   {     } } 
class SnackContainer extends FrameLayout {   public void clearSnacks ( boolean animate ) {   mSnacks . clear ( ) ;   if ( animate ) mHideRunnable . run ( ) ;   }     } 
import hex . rf . DRF . DRFFuture ;   import hex . rf . Tree . StatType ;   import org . junit . Test ;   import water . * ;   import water . DRemoteTask . DFuture ;   import water . parser . ParseDataset ;   public class DatasetCornerCasesTest extends TestUtil {     } 
package hex . deeplearning ;   import hex . FrameSplitter ;   import org . apache . tools . ant . taskdefs . Sleep ;   import water . TestUtil ;   import org . junit . Assert ;     
package buildcraft . api . recipes ;   import java . util . LinkedList ;     import buildcraft . core . inventory . StackHelper ;   import net . minecraft . item . ItemStack ;   public class AssemblyRecipe {     } 
public abstract class BufferedBlockInStream extends BlockInStream { public void test ( ) {   mBuffer = allocateBuffer ( ) ;   mBufferIsValid = false ;   mClosed = false ;   }       } 
public class FrenchTagger extends BaseTagger {   public FrenchTagger ( ) { {   super ( ) ;   setLocale ( Locale . FRENCH ) ;   }   }     } 
public class SearchView extends LinearLayout implements CollapsibleActionView {       public void onActionViewExpanded ( ) {   mExpandedInActionView = true ;   mCollapsedImeOptions = mQueryTextView . getImeOptions ( ) ;   mQueryTextView . setImeOptions ( mCollapsedImeOptions | EditorInfo . IME_FLAG_NO_FULLSCREEN ) ;     } } 
public class ConfigurationImpl     { public void clearCache ( ) { {   _values . clear ( ) ;   }       } } 
public class TitlePageIndicator extends View implements PageIndicator {   public void setFooterColor ( int footerColor ) {   mPaintFooterLine . setColor ( footerColor ) ;   invalidate ( ) ;   }     } 
public interface Graph {   public final static class Initializer {   public static Graph init ( ) { {   return Dagger_Graph . builder ( )   . build ( ) ;   }   }     } } 
public class SASLDigestMD5Mechanism extends SASLMechanism {     protected String getName ( ) {   return " CRAM MD5 " ;   }   }     
public class PrivacyService extends IPrivacyService . Stub { public void test ( ) {   synchronized ( mRestrictionCache ) {   mRestrictionCache . clear ( ) ;   }   synchronized ( mSettingCache ) {   mSettingCache . clear ( ) ;   }     } } 
public final class AudioTrack {     public void run ( ) {   try {   toRelease . release ( ) ;   } finally {   releasingConditionVariable . open ( ) ;     } } } 
public class DiscoveryNode implements Writeable < DiscoveryNode > , ToXContent { public void test ( ) { { {   roles . add ( role ) ;   }   }   return roles ;   }       } 
public class TimeoutTest extends TestBase { public void test ( ) {   try {   t . verify ( data ) ;   } catch ( MockitoAssertionError e ) { } ;   verify ( mode , times ( 5 ) ) . verify ( data ) ;     } } 
public class HgVFSListener extends VcsVFSListener {     protected VcsDeleteType needConfirmDeletion ( final VirtualFile file ) {   return ChangeListManagerImpl . getInstanceImpl ( myProject ) . getUnversionedFiles ( ) . contains ( file )   ? VcsDeleteType . SILENT   : VcsDeleteType . CONFIRM ;   }     } 
public class AsyncHttpClientConfig {       public boolean hasResponseFilters ( ) {   return ! requestFilters . isEmpty ( ) ;   }       } 
public class BuildRuleSuccess {   private final Type type ;   private static enum Property {   SHOULD_INITIALIZE_FROM_DISK_AFTER_BUILDING ,   SHOULD_UPLOAD_RESULTING_ARTIFACT ,   SHOULD_WRITE_RECORDED_METADATA_TO_DISK ,   }     } 
abstract class CommunicationProtocol   { public void test ( ) { { {   dest . writeBytes ( bytes ) ;   }   }   }     } 
public class PGraphicsOpenGL extends PGraphics3D { public void test ( ) { {     canvas . setSize ( width , height ) ;   }   defaultsInited = false ;   }     } 
public class HeaderOrderTestCase { public void test ( ) {   if ( Modifier . isTransient ( field . getModifiers ( ) ) ) {   continue ;   }   Object value = field . get ( null ) ;   if ( ! ( value instanceof HttpString ) ) {   continue ;     } } } 
public class PGraphicsOpenGL extends PGraphics3D {     protected class ImageCache extends PMetadata {   int tindex = - 1 ;   int tpixels [ ] ;   IntBuffer tbuffer ;     } } 
public class SSLHostConfigCertificate { {     }   private static enum StoreType { KEYSTORE , PEM } ;     }     
public class FileCopierUnitTest {     public void setUp ( ) throws Exception {   fileCopier = new FileCopier ( ) ;   }       } 
public class CompilerTest extends GroovyTestCase { public void test ( ) {   dir . mkdirs ( ) ;   CompilerConfiguration config = new CompilerConfiguration ( ) ;   config . setDebug ( dumpClass ) ;   compiler = new Compiler ( config ) ;     } } 
public class ForgeInternalHandler   { public void test ( ) { { {   entity . setDead ( ) ;   event . setCanceled ( true ) ;   event . world . spawnEntityInWorld ( entity ) ;   }   }   }     } 
public class ActionBarView extends AbsActionBarView implements DecorToolbar { public void test ( ) {   mNavItemSelectedListener = l ;   if ( mSpinner != null ) {   mSpinner . setAdapter ( adapter ) ;   }   }     } 
public class PropertyAttributeParserTest   { public void test ( ) {   try   {   parseAsValueModelAttribute ( illegalStaticResourceAttributeValue . value ) ;   fail ( " Expect an exception thrown " ) ;   } catch ( MalformedAttributeException e )   {     } } } 
public class MockComponentManager extends UserDataHolderBase implements Componen     { public void dispose ( ) { {   }       } } 
class ConfigThread extends Thread {   private Configuration config ;   private boolean done = false ;   private JLanguageTool langTool ;   private ConfigurationDialog cfgDialog ;   ConfigThread ( final Language docLanguage , final Configuration config ) {     } } 
public abstract class HardwareRenderer {   public static boolean sSystemRendererDisabled = false ;     public static boolean sUseRenderThread = true ;   private boolean mEnabled ;   private boolean mRequested = true ;     } 
public class PrivacyManager {     public int hashCode ( ) {   return mMethodName . hashCode ( ) ;   }       } 
public class Caches implements BatchComponent , Startable {     public void start ( ) {   }       } 
public class GroupLocalServiceImpl extends GroupLocalServiceBaseImpl {     protected List < PortletDataHandler > getPortletDataHandlers ( Group group ) {   List < Portlet > portlets = portletLocalService . getPortlets (   group . getCompanyId ( ) ) ;     } } 
public class HomeActivity extends Activity { public void test ( ) { {   }   MainApplication . checkForProVersion ( getApplicationContext ( ) ) ;   }       } 
public abstract class Pair < T1 , T2 >     { public T1 first ( )   { {   return first ( ) ;   }       } } 
public class ReaderPostListFragment extends Fragment     { public FilterCriteria onRecallSelection ( ) { {   ReaderTag tag = AppPrefs . getReaderTag ( ) ;   return tag ;   }       } } 
public class NotDefinedException extends RuntimeException { public void test ( ) { {   }   }       } 
class Http2Parser { public void test ( ) {   }   void setHpackDecoder ( HpackDecoder hpackDecoder ) {   this . hpackDecoder = hpackDecoder ;   }               } 
public class TileEngineIron extends TileEngineWithInventory implements IFluidHan     { public void overheat ( ) { {     tankCoolant . setFluid ( null ) ;   }     } } 
public class PipeTransportItems extends PipeTransport { public void test ( ) { { {     }   }   }       } 
public class DBPort { public void test ( ) {   _socket . setTcpNoDelay ( ! USE_NAGLE ) ;   _socket . setSoTimeout ( _options . socketTimeout ) ;   _socket . setSoLinger ( true , 0 ) ;   _in = new BufferedInputStream ( _socket . getInputStream ( ) ) ;   _out = _socket . getOutputStream ( ) ;   return true ;     } } 
public class IntervalHistogramRecorder {     public synchronized Histogram getIntervalHistogram ( ) {   Histogram intervalHistogram = new Histogram ( inactiveHistogram ) ;   getIntervalHistogramInto ( new Histogram ( inactiveHistogram ) ) ;   return intervalHistogram ;   }     } 
public class ResourceCertificateSource implements CertificateSource {   public ResourceCertificateSource ( int resourceId , Context context ) {   mResourceId = resourceId ;   mContext = context . getApplicationContext ( ) ;   }   private void ensureInitialized ( ) {     } } 
public class MDCInterceptor implements ExecInterceptor {     public MDCInterceptor ( ) {     }     public static MDCInterceptor instance ( ) {   return INSTANCE ;   }     } 
public class ActivityItemBase implements TraktEntity {     public Date timestamp ;   public When when ;   public Elapsed elapsed ;   public ActivityType type ;     } 
public class ConvertAtomicToLongAdderIntention extends PsiElementBaseIntentionAc     { public boolean startInWriteAction ( ) { {   return true ;   }       } } 
public class HttpConfiguration {   public String getRootPath ( ) {   return rootPath ;   }     public void setRootPath ( String rootPath ) {   this . rootPath = rootPath ;   }   }     
public class HttpUtils {     public void configHttpGetCacheDefaultExpiry ( long defaultExpiry ) {   sHttpGetCache . setDefaultExpiryTime ( defaultExpiry ) ;   }     } 
public final class BluetoothLeAdvertiser {     public void stopAdvertising ( final AdvertiseCallback callback ) {   synchronized ( mLeAdvertisers ) {   BluetoothLeUtils . checkAdapterStateOn ( mBluetoothAdapter ) ;   if ( callback == null ) {   throw new IllegalArgumentException ( " callback cannot be null " ) ;   }     } } } 
public class VertxOptions {       public long getWarningExceptionTime ( ) {   return warningExceptionTime ;   }       } 
public abstract class DockingStation {     public boolean linkIsDocked ( ) {   if ( isTaken ( ) ) {   return robotTaking ( ) . getDockingStation ( ) == this ;   } else {   return false ;     } } } 
public class MasterClient extends CommunicationProtocol implements Master , Chann   { public void test ( ) { {   msgLog . logMessage ( " MasterClient shutdown " , true ) ;   channelPool . close ( true ) ;   }   }     } 
public abstract class AbstractJRubyMojo extends AbstractMojo {           protected File gemDirectory ;     } 
import java . util . Set ;     public class PointQuadTree < T extends PointQuadTree . Item > {   public static interface Item {   Point getPoint ( ) ;   }     } 
public class Solo {     public void clickOnView ( View view ) {   waiter . waitForView ( view , SMALLTIMEOUT ) ;   clicker . clickOnScreen ( view ) ;   }     } 
public class HexDumpProxyInboundHandler extends SimpleChannelUpstreamHandler { public void test ( ) { { {   e . getChannel ( ) . close ( ) ;   }   }     }     } 
public class MemoryCache {   public void clear ( ) {   cache . clear ( ) ;   }   long getSizeInBytes ( Bitmap bitmap ) {     } } 
public class MotionTrack extends AbstractCinematicEvent implements Control {     public void onStop ( ) {   currentWayPoint = 0 ;   }     } 
public class From implements Sqlable {   public < T extends Model > T executeSingle ( ) {   if ( mQueryBase instanceof Select ) {   return SQLiteUtils . rawQuerySingle ( mType , toSql ( ) , getArguments ( ) ) ;   }   else {     } } } 
import io . realm . RealmChangeListener ;   import io . realm . RealmList ;   public class ParameterizedTestExample extends AndroidTestCase {   private Realm realm ;     } 
package android . text . method ;   import android . text . Selection ;   import android . text . SpannableStringBuilder ;   import java . text . BreakIterator ;   import java . util . Locale ;       
public class MaterialMatParamOverrideTest {         public void testChildOverridesParent ( ) {   material ( " Common / MatDefs / Light / Lighting . j3md " ) ;     } } 
public class Http11NioProcessor implements ActionHook { public void test ( ) {   keptAlive = true ;   if ( ! inputBuffer . parseHeaders ( ) ) {   openSocket = true ;   socket . getPoller ( ) . add ( socket ) ;   recycle = false ;   break ;   }     } } 
public class BuildCraftCore {     public void serverStarting ( FMLServerStartingEvent event ) {   CommandHandler commandManager = ( CommandHandler ) event . getServer ( ) . getCommandManager ( ) ;   commandManager . registerCommand ( new CommandBuildCraft ( ) ) ;   }   public void loadRecipes ( ) {     } } 
public class JSONObjectBody implements AsyncHttpRequestBody < JSONObject > {     public String getContentType ( ) {   return " application / json " ;   }       } 
public class SmsBackupService extends ServiceBase {   private int skip ( ) {   updateMaxSyncedDateSms ( getMaxItemDateSms ( ) ) ;   updateMaxSyncedDateMms ( getMaxItemDateMms ( ) ) ;   sItemsToSync = 0 ;   sCurrentSyncedItems = 0 ;     } } 
public class PyMagicLiteralRenameHandler implements RenameHandler {     public boolean isRenaming ( DataContext dataContext ) {   return true ;   }       } 
public class RepositoryInfo {     public String getUrl ( ) {   return myRepository . getChildText ( " url " ) ;   }       } 
public abstract class AbstractFailureDetector implements FailureDetector { public void test ( ) {   NodeStatus nodeStatus = getNodeStatus ( node ) ;   synchronized ( nodeStatus ) {   if ( ! isAvailable ( node ) )   nodeStatus . wait ( ) ;   }   }     } 
public class AsyncTwitterTest extends TestCase implements TwitterListener {     public void testGetFriends ( ) throws Exception {   twitterAPI1 . getFriendsAsync ( id2 , this ) ;   waitForResponse ( ) ;   boolean found = false ;     } } 
public class Result {   public static int SC_403_FORBIDDEN = 403 ;   public static int SC_404_NOT_FOUND = 404 ;   public static int SC_501_NOT_IMPLEMENTED = 501 ;     } 
import java . util . Set ;   public final class ChannelPromiseAggregator implements ChannelFutureListener {   private final ChannelPromise aggregatePromise ;     private Set < ChannelPromise > pendingPromises ;     } 
public final class EditorHistoryManager implements ProjectComponent , JDOMExterna     { public void selectionChanged ( final FileEditorManagerEvent event ) { { {   updateHistoryEntry ( event . getOldFile ( ) , true ) ;   }   }     } } 
public class MultiTerrainLodControl extends TerrainLodControl {       public void removeTerrain ( TerrainQuad tq ) {   removedTerrains . remove ( tq ) ;   }       } 
public class TtsSpan implements ParcelableSpan {       public MeasureBuilder setIntegerPart ( long integerPart ) {   return setNumber ( String . valueOf ( integerPart ) ) ;   }       } 
public class PrivacyService { public void test ( ) {   result . methodName = restriction . methodName ;   result . restricted = restrict ;   result . asked = true ;   setRestrictionInternal ( result ) ;   }     } 
public class JavaDebuggerSupport extends DebuggerSupport {       public DebuggerActionHandler getEvaluateHandler ( ) {   return myEvaluateActionHandler ;   }       } 
public class BroadcasterTest {     public void unSetUp ( ) throws Exception {   broadcaster . removeAtmosphereResource ( ar ) ;   }       } 
public class EpisodesAdapter extends CursorAdapter { public void test ( ) {   mLayoutInflater = ( LayoutInflater ) context   . getSystemService ( Context . LAYOUT_INFLATER_SERVICE ) ;   mOnClickListener = listener ;   }       } 
package net . minecraftforge . event . entity ;   import net . minecraft . src . Entity ;   import net . minecraft . src . World ;   public class EntityJoinWorldEvent extends EntityEvent   {     } 
import org . jetbrains . annotations . NotNull ;   import java . util . List ;   import java . util . Set ;         public class GitFetch extends GitRepositoryAction {         } 
public class MessageSummary {   public Object getField ( String key ) {   return message . getField ( key ) ;   }   }     
public class DeepLearningSpiralsTest extends TestUtil { public void test ( ) { { { {   }   pred . delete ( ) ;   mymodel . delete ( ) ;   }   }   }     } 
public class ApkDecoder {   public void setFrameworkTag ( String tag ) throws AndrolibException {   mFrameTag = tag ;   if ( hasResources ( ) ) {   getResTable ( ) . setFrameTag ( tag ) ;   }   }     } 
public class GitBlit implements ServletContextListener { public void test ( ) { {   return null ;   }   addToCachedRepositoryList ( model ) ;   return model ;   }       } 
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 2 . 0 " ;   public static String getVersion ( ) {   return VERSION ;     } } 
public class SourceMapGeneratorV2 implements SourceMapGenerator {     private static final String BASE64_MAP =   " ABCDEFGHIJKLMNOPQRSTUVWXYZ " +   " abcdefghijklmnopqrstuvwzyz " +   " 0123456789 + / " ;       } 
public class ByteFormat extends Format {       public String format ( long bytes ) {   return format ( bytes ) ;   }       } 
public abstract class ResultMessage extends Message . Response   { public static class SetKeyspace extends ResultMessage   {   private final String keyspace ;   public SetKeyspace ( String keyspace )   {     } } }
public abstract class AbstractJPATest {       public void Substring2 ( ) {   QCompany company = QCompany . company ;   StringExpression name = company . name ;     } } 
public class LocalBlueprintsTest extends GraphTest {     public Graph generateGraph ( String uid ) {   throw new UnsupportedOperationException ( ) ;   }     } 
public class SherpafyStageFragment extends SherlockFragment {   public SherpafyStageFragment ( ) {   }   public TourInformation getTour ( ) {   return tour ;   }       public void onAttach ( Activity activity ) {   super . onAttach ( activity ) ;     } } 
public class Note extends Syncable { public void test ( ) {   mNoteJSON = json ;     mComment = null ;   mCommentPreview = null ;   mSubject = null ;     } } 
public class InstalledPluginsTableModel extends PluginTableModel { public void test ( ) { {   }   if ( ! enabled . booleanValue ( ) ) {   deps . add ( pluginId ) ;   return false ;   }   return true ;   }     } 
public class View implements Drawable . Callback , KeyEvent . Callback , Accessibility       { public void dispatchSystemUiVisibilityChanged ( int visibility ) {   mSystemUiVisibility = visibility ;   if ( mOnSystemUiVisibilityChangeListener != null ) {   mOnSystemUiVisibilityChangeListener . onSystemUiVisibilityChange (   visibility & ~ PUBLIC_STATUS_BAR_VISIBILITY_MASK ) ;     } } } 
public class StandardContext extends ContainerBase       { public void setPath ( String path ) { {     setName ( path ) ;   }     } } 
public class VideoplayerActivity extends MediaplayerActivity {   private static class VideoControlsHider extends Handler {   private static final int DELAY = 5000 ;   private WeakReference < VideoplayerActivity > activity ;     } } 
public class PostfixCompletionConfigurable implements SearchableConfigurable , Ed       { public String getHelpTopic ( ) { {   return getId ( ) ;   }       } } 
public class Http11OutputBuffer implements OutputBuffer {   public void init ( SocketWrapperBase < ? > socketWrapper ) {   this . socketWrapper = socketWrapper ;     }     } 
public class MainMenuActivity extends Activity { public void test ( ) {   getMyApplication ( ) . setAppCustomization ( new SherpafyCustomization ( ) ) ;   startActivity ( mapIntent ) ;   finish ( ) ;   }   boolean exit = false ;     } 
public class Html2Text     { public static synchronized String extractText ( String html )   {   if ( parser == null )   parser = new HTMLParserCallBack ( ) ;     } } 
public abstract class PythonModuleTypeBase < T extends ModuleBuilder > extends Modu     { public String getDescription ( ) {   return " Provides facilities for developing Python applications " ;   }   public Icon getBigIcon ( ) {     } } 
public class IndexCreator { public void test ( ) {       if ( logMapDataWarn == null ) {   log = logMapDataWarn ;   }   if ( renderingTypes == null ) {     } } } 
class ParseState {   public void reset ( ) { {   this . state = 0 ;   this . pos = 0 ;   }   }     } 
public class WebView extends AbsoluteLayout       { public static void freeMemoryForTests ( ) { {   checkThread ( ) ;   getFactory ( ) . getStatics ( ) . freeMemoryForTests ( ) ;   }     } } 
public class Reference < T > {       public boolean isNotSet ( ) { {   return value != null ;   }   }     } 
public class ImageWallpaper extends WallpaperService {   private void updateWallpaperLocked ( ) {   Throwable exception = null ;   try {   mWallpaperManager . forgetLoadedWallpaper ( ) ;   mBackground = null ;   mBackground = mWallpaperManager . getBitmap ( ) ;   } catch ( RuntimeException e ) {     } } } 
import com . facebook . android . Facebook ;   import com . facebook . android . Facebook . DialogListener ;   import com . facebook . android . FacebookError ;   public class ConnectPlugin extends Plugin {    public static final String SINGLE_SIGN_ON_DISABLED = " service_disabled " ;   private final String TAG = " ConnectPlugin " ;     } 
public abstract class Optional < T > implements Serializable { public void test ( ) { { { { { {   return endOfData ( ) ;   }   } ;   } ;   } ;   }     } }
public class PhoneAccount implements Parcelable { public void test ( ) {   if ( mIconBitmap == null ) {   out . writeInt ( 0 ) ;   } else {   mIconBitmap . writeToParcel ( out , flags ) ;   }   out . writeInt ( mIconTint ) ;     } } 
import java . util . HashMap ;   import java . util . List ;   import java . util . Map ;   import org . hibernate . validator . cfg . defs . GenericConstraintDef ;   import rx . Observable ;     
public class GitVcsConfigurable implements Configurable {       public String getHelpTopic ( ) {   return null ;   }       } 
public class Tmp { public void test ( ) {             } } 
public class CuboidRegion extends AbstractRegion implements FlatRegion { public void test ( ) {   super ( world ) ;   this . pos1 = pos1 ;   this . pos2 = pos2 ;   }       } 
public class NettyResponse implements Response { public void test ( ) {   for ( HttpResponseBodyPart part : bodyParts )   target . put ( part . getBodyPartBytes ( ) ) ;   return target ;   }     } 
public class LocalOpenstreetmapActivity extends ListActivity {   private OpenstreetmapRemoteUtil remotepoi ;   private OsmBugsRemoteUtil remotebug ;   protected OsmPoint [ ] toUpload ;   private ArrayList < OsmPoint > dataPoints ;     } 
public class XHTMLText {       public XHTMLText appendBrTag ( ) {   text . closeElement ( BR ) ;   return this ;   }     } 
public class WebViewDatabase { public void test ( ) {   }   long getCacheTotalSize ( ) {   long size = 0 ;   Cursor cursor = null ;   final String query = " SELECT SUM ( contentlength ) as sum FROM cache " ;     } } 
public class ABTestingUtils {   public static boolean isFeatureEnabled ( Feature feature ) {   switch ( feature ) {   case HELPSHIFT :   return false ;   }   return false ;   }     } 
public class PoshiRunnerGetterUtil { public void test ( ) {   Element rootElement = document . getRootElement ( ) ;   PoshiRunnerValidation . validate ( rootElement , filePath ) ;     return rootElement ;   }     } 
public class RealTimeCounter { public void test ( ) {   }   void incrementPosition ( ) {   pos = ( pos + 1 ) % GRANULARITY ;   }     } 
public class PortletProviderUtil { public void test ( ) {   _addServiceTrackerMap . open ( ) ;   _browseServiceTrackerMap . open ( ) ;   _editServiceTrackerMap . open ( ) ;   _viewServiceTrackerMap . open ( ) ;   }     } 
public abstract class MongoCollectionSplitter extends MongoSplitter {   public static final MaxKey MAX_KEY_TYPE = new MaxKey ( ) ;   protected Mongo mongo ;   protected DBCollection inputCollection ;   protected Configuration conf ;   protected MongoURI inputURI ;   protected MongoURI authURI ;     } 
public class VertxImpl implements VertxInternal , MetricsProvider {     public synchronized TimeoutStream resume ( ) {   this . paused = false ;   return null ;   }       } 
public class ConnectorServerTest       { public void testConnServerWithRmiDefaultPort ( ) throws Exception   {       } } 
public class FreeFlowContainer extends AbsLayoutContainer { public void test ( ) {   if ( viewPortY > mScrollableHeight )   viewPortY = mScrollableHeight ;       Log . d ( " debug " , " > viewportY " + viewPortY ) ;   }     } 
public class SchematicTile extends SchematicBlock { public void test ( ) { {   if ( tile != null ) {   tile . writeToNBT ( tileNBT ) ;   }   }   }     } 
public class VoldemortConfig implements Serializable {   private final long pusherPollMs ;   public VoldemortConfig ( ) {   this ( new Props ( ) ) ;   }     public VoldemortConfig ( Properties props ) {   this ( new Props ( props ) ) ;   }     } 
package javaslang ;   import java . lang . reflect . Constructor ;   import java . lang . reflect . InvocationTargetException ;   public final class Assertions { public void test ( ) {       } } 
public class RendererConfiguration implements Cloneable , JDOMExternalizable {     public void addRenderer ( NodeRenderer renderer ) {   myRepresentationNodes . add ( renderer ) ;   }       } 
public class ImportTrayPreferences extends TrayModulePreferences {     protected void onCreate ( final int initialVersion ) {   migrate ( ) ;   }     } 
package flow ;   public final class Preconditions {   private Preconditions ( ) {   }     } 
import com . google . javascript . rhino . Node ;         public class ProcessClosurePrimitivesTest extends CompilerTestCase {   private String additionalCode ;   private String additionalEndCode ;     } 
public class CustomTemplateCallback {   public PsiFile getFile ( ) {   return myFile ;   }   }     
public final class Fun {     }   public interface Function1 < R , A > {   R run ( A a ) ;   }     
public class StorageService implements IEndpointStateChangeSubscriber , StorageSe   { public void test ( ) {   if ( daemon == null )   {   throw new IllegalStateException ( " No configured RPC daemon " ) ;   }   return daemon . isRPCServerRunning ( ) ;   }     } 
import java . util . logging . Logger ;     public class DepsGenerator {   enum InclusionStrategy {   ALWAYS ,   WHEN_IN_SRCS ,   DO_NOT_DUPLICATE     } } 
class IntroduceFieldDialog extends DialogWrapper { public void test ( ) {   JavaRefactoringSettings . getInstance ( ) . INTRODUCE_FIELD_VISIBILITY = getFieldVisibility ( ) ;   myNameSuggestionsManager . nameSelected ( ) ;   super . doOKAction ( ) ;   }     } 
public class PFont implements PConstants {     public String getPostScriptName ( ) {   return psname ;   }     } 
public class GitBranchIsNotFullyMergedDialog extends DialogWrapper { public void test ( ) {   setTitle ( " Branch Is Not Fully Merged " ) ;   setOKButtonText ( " Delete " ) ;   setCancelButtonText ( " Cancel " ) ;   }     } 
package com . puppycrawl . tools . checkstyle . coding ;   import test . OverloadInput ;   class OverloadInput   { public void test ( ) {     } } 
public class ServiceManager implements ServiceManagerMBean {     public boolean isActive ( ) {   return _serviceMonitorAdvice . isActive ( ) ;   }       } 
public class MaterialRefreshLayout extends FrameLayout { public void test ( ) { {   progressSize = BIG_PROGRESS_SIZE ;   }   isLoadMore = t . getBoolean ( R . styleable . MaterialRefreshLayout_isLoadMore , false ) ;   }     } 
public class CachedListTest extends TestBase {       public void testReloadAllUpdatesListObjects ( ) {   ModelCache modelCache = new ModelCache ( 2 , 1 , 1 ) ;   String id = " 123 " ;     } } 
public final class Bootstrap { public void test ( ) {                   } } 
import javax . annotation . concurrent . ThreadSafe ;   public final class RetryHandlingBlockMasterClient extends AbstractMasterClient   implements BlockMasterClient {     private BlockMasterClientService . Client mClient ;       } 
public class Tmp { public interface IdeaPlugin extends DomElement {   GenericAttributeValue < String > getUrl ( ) ;     GenericDomValue < String > getName ( ) ;     } } 
public class Tmp { public interface QueryHandler {         } public boolean createNativeQueryTyped ( ) ;         } 
public final class R {   public static final class anim {   } public static final int test_anim_1 = 0x10700 ;   public static final int animation_list = 0x10700 ;   }   public static final class raw {     } 
public class KeyguardUpdateMonitor {   private int mFailedAttempts = 0 ;   private int mFailedBiometricUnlockAttempts = 0 ;   private static final int FAILED_BIOMETRIC_UNLOCK_ATTEMPTS_BEFORE_BACKUP = 5 ;   private boolean mClockVisible ;     } 
import com . jwetherell . algorithms . graph . TopologicalSort ;   public class DataStructures {   private static final int SIZE = 1000 ;   private static Integer [ ] unsorted = null ;   public static void main ( String [ ] args ) {     } } 
public class TestRemoteIpFilter extends TomcatBaseTest {   private static final long serialVersionUID = 1L ;   HttpServletRequest request ;   public HttpServletRequest getRequest ( ) {   return request ;     } } 
public class PersonDetailFragment extends Fragment {   public void setPersonDetails ( long personID , int localTableBlogID ) { {   mPersonID = personID ;   mLocalTableBlogID = localTableBlogID ;   }   }     } 
public abstract class AlertCondition implements EmbeddedPersistable { public void test ( ) { {   return false ;   }   return lastAlertSecondsAgo < grace * 60 ;   }       } 
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 3 . 3 " ;   }   public static String getSignature ( ) {     } } 
public class SampleFactory implements SampleSource {   public SampleFactory ( Graph graph ) {   this . graph = graph ;   this . setSearchRadiusM ( 200 ) ;   }   private Graph graph ;     } 
class ConnectionContext {     public void onFailure ( Throwable t ) { {   Messages . sendErrorResponse ( channel , Exceptions . messageOf ( t ) ) ;   Messages . sendReadyForQuery ( channel ) ;   }   }     } 
public class Location implements Cloneable {       protected Location clone ( ) {   return new Location ( world , x , y , z , yaw , pitch ) ;   }   }     
final class SQLiteBooksDatabase extends BooksDatabase { public void test ( ) {   statement . bindLong ( 2 , lastModified ) ;   try {   return statement . simpleQueryForString ( ) ;   } catch ( SQLiteDoneException e ) {   return null ;   }   }     } 
public class LocalComponentDependencyMetadata implements LocalOriginDependencyMe     { public String getDependencyConfiguration ( ) { {   return dependencyConfiguration ;   }       } } 
public class VectAlignTest {     public void testRandomLinearInterpolateAligns ( ) throws Exception {   testRandomAligns ( VectAlign . Mode . LINEAR_INTERPOLATE ) ;   }   public void testRandomAligns ( VectAlign . Mode mode ) throws Exception {     } } 
public class JobUtil { public void test ( ) {   try {   job . scheduleAndWaitForResults ( ) ;   }   catch ( ProcessCanceledException e ) {   throw e ;   }   catch ( Throwable throwable ) {     } } } 
public class AtmosphereInterceptorWriter extends AsyncIOWriterAdapter {     public LinkedList < AsyncIOInterceptor > filters ( ) { {   return filters ( ) ;   }   }     } 
public class PythonParsingTest extends ParsingTestCase {   protected void setUp ( ) throws Exception {   super . setUp ( ) ;   registerExtensionPoint ( PythonDialectsTokenSetContributor . EP_NAME , PythonDialectsTokenSetContributor . class ) ;   }       } 
public class QueueContainer implements IdentifiedDataSerializable { public void test ( ) { { {   throw new HazelcastException ( e ) ;   }   }   txMap . put ( item . getItemId ( ) , new TxQueueItem ( item ) . setTransactionId ( transactionId ) ) ;   return item ;   }     } 
public class IWindowManagerImpl implements IWindowManager {       public void showAssistant ( ) {     }       public IBinder getFocusedWindowToken ( ) {     return null ;     } } 
public class NotImplementedRequestDelayControl implements RequestDelayControl {     public void clearDelay ( ) {   throw new UnsupportedOperationException ( " Socket control isn ' t available in this configuration " ) ;   }       } 
import java . io . IOException ;     public class DiandianProcessorTest {     public void test ( ) throws IOException {   DiandianBlogProcessor diaoyuwengProcessor = new DiandianBlogProcessor ( ) ;     } } 
public class PGraphicsOpenGL extends PGraphics {       public PSurface createSurface ( ) {   return new PSurfaceJOGL ( this ) ;   }     } 
abstract class RequestArcAction extends FeatureAction { public void test ( ) { { {   return ;   }   disableArcTransmission ( ) ;   }   }     } 
abstract class HeadlessBootstrap extends ZapBootstrap {   public HeadlessBootstrap ( CommandLine args ) {   super ( args ) ;   }       } 
public class MtpDatabase {   protected void finalize ( ) throws Throwable {   try {   native_finalize ( ) ;   mDevicePropDb . close ( ) ;   } finally {   super . finalize ( ) ;   }     } } 
public class NativeRunnable implements Runnable {   private final HybridData mHybridData ;   private NativeRunnable ( HybridData hybridData ) {   mHybridData = hybridData ;   }     } 
public class IntentionSettingsConfigurable extends BaseConfigurable implements A     { public String getHelpTopic ( ) {   return " preferences . errorHighlight " ;   }   public void disposeComponent ( ) {     } } 
public class KeyguardManager {     public boolean isKeyguardLocked ( ) {   try {   return mWM . isKeyguardSecure ( ) ;   } catch ( RemoteException ex ) {   return false ;   }     } } 
final class DefaultChannelPipeline implements ChannelPipeline { public void test ( ) { {   }   }     final Channel channel ;   final DefaultChannelHandlerContext head ;     } 
public class KeyguardManager {     public boolean isKeyguardLocked ( ) {   try {   return mWM . isKeyguardSecure ( ) ;   } catch ( RemoteException ex ) {   return false ;   }     } } 
package com . mongodb ;       public class MongoInterruptedException extends MongoException {   public MongoInterruptedException ( final InterruptedException e ) {   super ( " A driver operation has been interrupted " , e ) ;   }     } 
public class PApplet implements PConstants { public void test ( ) {                   } } 
public class TextureView extends View {     public void setLayerType ( int layerType , Paint paint ) {   if ( paint != mLayerPaint ) {   mLayerPaint = paint ;   invalidate ( ) ;   }   }     } 
public class WebView extends AbsoluteLayout       { public static String findAddress ( String addr ) { {   checkThread ( ) ;   return getFactory ( ) . getStatics ( ) . findAddress ( addr ) ;   }     } } 
class PublicationImagePadding4 extends PublicationImageStatusFields     { public class PublicationImage   extends PublicationImagePadding4   implements AutoCloseable , NakMessageSender , DriverManagedResource   {   } public enum Status   {     } } 
public final class PageDecorations implements ServerComponent {     public PageDecoration [ ] get ( ) { {   return decorations ;   }   }     } 
public abstract class BaseTransformer implements Transformer { public void test ( ) {   try {   templateParser =   ( TemplateParser ) InstanceFactory . newInstance (   templateParserClassName ) ;   }   catch ( Exception e ) {     } } } 
public class MainActivity extends Activity {   protected void onCreate ( Bundle savedInstanceState ) {   super . onCreate ( savedInstanceState ) ;   setContentView ( R . layout . activity_main ) ;   }     } 
public class FakeTextView extends FakeView {   public void setText ( CharSequence text ) {   this . textResourceId = UNINITIALIZED_ATTRIBUTE ;   this . text = text ;   }     } 
package org . json ;                 public class JSONPointerException extends JSONException {   private static final long serialVersionUID = 8872944667561856751L ;     } 
public class JmeSystem {     public static String getFullName ( ) {   return " jMonkey Engine 3 Alpha 0 . 6 " ;   }   public static InputStream getResourceAsStream ( String name ) {     } } 
class TestJavaLR { public void test ( ) { {   System . err . println ( " exception : " + e ) ;   e . printStackTrace ( System . err ) ;   }   }     } 
public abstract class AttributeDefinition {     public String [ ] getRequires ( ) {   return alternatives ;   }   public EnumSet < AttributeAccess . Flag > getFlags ( ) {     } } 
public final class Versioned < T > implements Serializable {   private static final long serialVersionUID = 1 ;   private VectorClock version ;   private volatile T object ;   public Versioned ( T object ) {     } } 
public final class CallOptions { public void test ( ) {   deadlineNanoTime = other . deadlineNanoTime ;   authority = other . authority ;   requestKey = other . requestKey ;   }       } 
package water . exec ;   import java . util . * ;     import org . apache . commons . lang . ArrayUtils ;     import water . * ;   import water . fvec . * ;     
public class TreeTraversalInSpiralOrder {             public void spiralWithOneDeque ( Node root ) {   if ( root == null ) {     } } } 
public class PyUnboundLocalVariableInspection extends LocalInspectionTool {     public boolean isEnabledByDefault ( ) {   return true ;   }       } 
public abstract class ContentResolver {   public ContentResolver ( Context context ) {   mContext = context != null ? context : ActivityThread . currentApplication ( ) ;   mPackageName = context . getBasePackageName ( ) ;   }       } 
public class RandomTransitionGenerator implements TransitionGenerator { public void test ( ) {   mLastGenTrans = new Transition ( srcRect , dstRect , mTransitionDuration ,   mTransitionInterpolator ) ;   mLastDrawableBounds = drawableBounds ;   return mLastGenTrans ;   }     } 
public abstract class AbstractLocalTachyonCluster {   protected BlockWorker mWorker ;   protected LineageWorker mLineageWorker ;   protected UnderFileSystemCluster mUfsCluster = null ;   protected String mTachyonHome ;   protected String mHostname ;     } 
package com . google . bitcoin . core ;   import com . sun . tools . internal . ws . wsdl . document . Output ;     import java . io . IOException ;   import java . io . OutputStream ;   import java . io . Serializable ;     
public class XDebuggerMultilineEditor extends XDebuggerEditorBase { public void test ( ) { { {   return false ;   }   } ;   }       } 
public class MetricRegistry implements MetricSet {     public Map < String , Metric > getMetrics ( ) {   return metrics ;   }       } 
public class LineageFileOutStream extends FileOutStream {     protected void scheduleAsyncPersist ( ) throws IOException {     return ;   }   }     
public class WifiScanner { public void test ( ) {   validateChannel ( ) ;   HotlistSettings settings = new HotlistSettings ( ) ;   settings . bssidInfos = bssidInfos ;   sAsyncChannel . sendMessage ( CMD_SET_HOTLIST , 0 , putListener ( listener ) , settings ) ;   }     } 
public class JmsNamespaceHandlerTests extends TestCase {   static class TestErrorHandler implements ErrorHandler {     public void handleError ( Throwable t ) { {   }   }     } } 
public class PImage implements PConstants , Cloneable { public void test ( ) {   modified = true ;   mx1 = 0 ;   my1 = 0 ;   mx2 = width ;   my2 = height ;   }     } 
import java . util . Random ;   public class NeuronsTest extends water . TestUtil {   public static void setup ( ) { stall_till_cloudsize ( 1 ) ; }     public void matrixVecTest ( ) {   int rows = 2048 ;     } } 
import java . util . Set ;             public class RequestFileFilter {   private final StoreDefinition storeDefinition ;     } 
public class Tmp { public interface DsGetDC extends StdCallLibrary {   } public DS_DOMAIN_TRUSTS ( Pointer p ) { { { {   super ( p ) ;   }   } ;   }     } } 
import java . io . IOException ;     public class InstallCommand extends AbstractCommandRunner < InstallCommandOptions > {   protected InstallCommand ( CommandRunnerParams params ) {   super ( params ) ;   }     } 
public class WebSettings { public void test ( ) {   if ( mBlockNetworkLoads != flag ) {   mBlockNetworkLoads = flag ;   verifyNetworkAccess ( ) ;   }   }     } 
public class SquidCursorTest extends DatabaseTestCase { public void test ( ) { { {   evens . moveToPosition ( i ) ;   assertEquals ( i * 2 , evens . get ( Thing . BAR ) . intValue ( ) ) ;   }   }   }     } 
public class AsmClassGenerator extends ClassGenerator { public void test ( ) {   Variable variable = compileStack . getVariable ( variableName , false ) ;   VariableScope scope = compileStack . getScope ( ) ;   if ( variable == null ) {   processClassVariable ( variableName ) ;   } else {     } } } 
public class GradientDrawable extends Drawable { public void test ( ) {   mUseLevel = state . mUseLevel ;   mUseLevelForShape = state . mUseLevelForShape ;   mOpaqueOverBounds = state . mOpaqueOverBounds ;   mThemeAttrs = state . mThemeAttrs ;   mAttrSize = state . mAttrSize ;   mAttrGradient = state . mAttrGradient ;     } } 
public class SliderLayout extends RelativeLayout {   ;   public void startAutoCycle ( ) {   startAutoCycle ( 1000 , mSliderDuration , mAutoRecover ) ;   }       } 
public abstract class HazelcastTestSupport { public void test ( ) { {   }   printAllStackTraces ( ) ;     throw error ;   }     } 
public class CoreProxy {     public static void setField804 ( EntityItem item , float value ) {   item . field_804_d = value ;   }   public static File getPropertyFile ( ) {     } } 
class DatabaseDumpHandler extends BaseWikipediaDumpHandler { public void test ( ) {   contextTools . setContextSize ( CONTEXT_SIZE ) ;   contextTools . setErrorMarkerStart ( MARKER_START ) ;   contextTools . setErrorMarkerEnd ( MARKER_END ) ;   }       } 
import jackpal . androidterm . emulatorview . TermSession ;   import jackpal . androidterm . util . TermSettings ;   public class TermView extends EmulatorView {   private static final String TAG = " TermView " ;   public TermView ( Context context , TermSession session , DisplayMetrics metrics ) {   super ( context , session , metrics ) ;     } } 
package biz . bokhorst . xprivacy ;   import java . util . Date ;   import android . util . Log ;     public class CRestriction {   private long mExpiry ;   public int mUid ;     } 
public class PermissionCheckerBagImpl implements PermissionCheckerBag { public void test ( ) { { {   }   }   return false ;   }     } 
public class Downloader   { public String downloadAsString ( String url ) throws IOException   { { {   HttpURLConnection conn = createConnection ( url ) ;   conn . connect ( ) ;   return Helper . isToString ( fetch ( url ) ) ;   }   }     } } 
public class UrlMappingUtils { public void test ( ) { { {   WebUtils . cleanupIncludeRequestAttributes ( request , toRestore ) ;   }   }             }     } 
public class LiquibaseServletListener implements ServletContextListener { public void test ( ) { {   }   if ( connection != null ) {   connection . close ( ) ;   connection . close ( ) ;   }   }     } 
import php . runtime . reflection . ModuleEntity ;   import java . io . File ;   import java . io . PrintStream ;   import java . util . logging . ConsoleHandler ;   public class CLI {   private final Arguments arguments ;     } 
public class GridSectionLayoutManager extends SectionLayoutManager { public void test ( ) { { {   bottomMostEdge = bottomEdge ;   }   }   return endEdge ;   }       } 
public class AppWidgetHost {   private OnClickHandler mOnClickHandler ;   public AppWidgetHost ( Context context , int hostId ) {   this ( context , hostId , null , Looper . getMainLooper ( ) ) ;   }       } 
public class WebappServiceLoader < T > { public void test ( ) { {   if ( line . length ( ) == 0 ) {   continue ;   }   if ( servicesFound . contains ( line ) ) {   continue ;   }   servicesFound . add ( line ) ;   }   }     } 
public class DLAppLocalServiceTest {     private Group _group ;     private Repository _repository ;   }     
public class AsyncDataSetIterator implements DataSetIterator {     public List < String > getLabels ( ) {   return null ;   }       } 
public abstract class UpdaterTestCase {     public void setUp ( ) throws Exception {   myTempDirFixture = IdeaTestFixtureFactory . getFixtureFactory ( ) . createTempDirTestFixture ( ) ;   myTempDirFixture . setUp ( ) ;     } } 
public class RunTests { public void test ( ) { { { {   }   }   TestRunner . run ( s ) ;   }   }     } 
public final class AccessibilityManager { public void test ( ) { { {   sInstance = new AccessibilityManager ( context , service ) ;   }   }     AccessibilityManager accessibilityManager =   ( AccessibilityManager ) context . getSystemService ( Context . ACCESSIBILITY_SERVICE ) ;   return sInstance ;   }     } 
public class RibbonConfig { public void test ( ) {   }                 } 
public abstract class CompletionPhase implements Disposable {     public int newCompletionStarted ( int time , boolean repeated ) { {   CompletionServiceImpl . setCompletionPhase ( NoCompletion ) ;   return time ;   }   }     } 
public class ConfusionMatrix extends Iced { public void test ( ) {   prediction_error_by_class = classErr ( ) ;   prediction_error = err ( ) ;   this . domain = domain ;   }       } 
final class MountListener implements Runnable { public void test ( ) {   byte [ ] buffer = new byte [ 100 ] ;   writeCommand ( VOLD_CMD_SEND_UMS_STATUS ) ;   while ( true ) {   int count = inputStream . read ( buffer ) ;     } } } 
import org . wordpress . android . ui . stats . WPComLoginActivity ;           public class AuthErrorDialogFragment extends SherlockDialogFragment { public void test ( ) {     } } 
public class MatcherFilter implements Filter { public void test ( ) {   boolean consumedByStaticFile = StaticFiles . consume ( httpRequest , httpResponse ) ;   if ( consumedByStaticFile ) {       return ;   }     } } 
public class TestBug49158 extends CookiesBaseTest { public void test ( ) { {   session . invalidate ( ) ;   session = req . getSession ( ) ;   session . invalidate ( ) ;   session = req . getSession ( ) ;   }   }     } 
public class LogEvent extends AbstractBuckEvent {     public boolean eventsArePair ( BuckEvent event ) {   if ( ! ( event instanceof BuckEvent ) ) {   return false ;   }     } }  
class TreeJCodeGen extends TreeVisitor < RuntimeException > { public void test ( ) { {   visit ( ) ;   closure ( _sb ) ;   _sb . p ( _csb ) ;   System . err . print ( _csb . toString ( ) ) ;   }   }     } 
public class ArgumentsMarshalTest extends TestCase {   TestLibrary lib ;   protected void setUp ( ) {   System . out . println ( getName ( ) ) ;   lib = ( TestLibrary ) Native . loadLibrary ( " testlib " , TestLibrary . class ) ;   }     } 
public class GCMIntentService extends GCMBaseIntentService {   private UserActivityDao userActivityDao ;   public GCMIntentService ( ) {   super ( ) ;   DependencyInjectionService . getInstance ( ) . inject ( this ) ;   }     } 
public class SeriesGuideApplication extends Application { public void test ( ) {     ImageCache . getInstance ( getApplicationContext ( ) ) ;     Utils . runNotificationService ( this ) ;   }     } 
public class ErrorBar extends JPanel {     protected void done ( ) {   int bigCount = 0 ;   int totalLines = 0 ;   int currentTab = 0 ;   for ( SketchCode sc : editor . getSketch ( ) . getCode ( ) ) {     } } } 
package com . intellij . codeInsight . daemon ;           public abstract class LineMarkerProviderDescriptor extends GutterIconDescriptor implements LineMarkerProvider { public void test ( ) {   }     } 
public class OrchidSocketImpl extends SocketImpl {     public void setOption ( int optID , Object value ) throws SocketException {   throw new UnsupportedOperationException ( ) ;   }   public Object getOption ( int optID ) throws SocketException {     } } 
public class QuartzEndpoint extends DefaultEndpoint {     public boolean isSingleton ( ) {   return false ;   }       } 
public class Tmp { public interface ClientDiscoveryHandler {   }     public void onDiscoveredHost ( DatagramPacket packet , Kryo kryo ) {     }     } 
import com . zaxxer . hikari . util . UtilityElf ;   public class ConnectionStateTest   {     public void testAutoCommit ( ) throws SQLException   {   try ( HikariDataSource ds = new HikariDataSource ( ) ) {     } } } 
public class HttpLocationFactory         { public URI createQueryLocation ( QueryId queryId )   {   Preconditions . checkNotNull ( queryId , " queryId is null " ) ;     } } 
class Slurper implements Runnable {   private DBCursor processFullOplog ( ) throws InterruptedException , SlurperException {   Timestamp < ? > currentTimestamp = getCurrentOplogTimestamp ( ) ;   addInsertToStream ( currentTimestamp , null ) ;   return oplogCursor ( currentTimestamp ) ;   }     } 
public class InternalOsmAndAPIImpl implements InternalOsmAndAPI {     public TargetPointsHelper getTargetPointsHelper ( ) {     return null ;   }       } 
import java . util . Vector ;       public class PortalInitableUtil {   public synchronized static void init ( PortalInitable initable ) {   if ( _initables == null ) {   initable . portalInit ( ) ;     } } } 
class CatalogExpander extends NetworkItemsLoader { public void test ( ) { { {   if ( myAuthenticator != null ) {   myAuthenticator . run ( f . URL ) ;   }   System . err . println ( " AUTH URI XX = " + f . URL ) ;   }   }   }     } 
package com . mongodb ;   public class MongoException extends Exception {   public MongoException ( String msg ) {   super ( msg ) ;     } }
class InstanceInfoReplicator implements Runnable {     public void stop ( ) {   scheduler . shutdown ( ) ;   started . set ( false ) ;   }     } 
package com . jwetherell . algorithms . sequence ;   public class SubsequenceCounter {   private static char [ ] seq = null ;   private static char [ ] subseq = null ;   private static int [ ] [ ] tbl = null ;     } 
public class PortletConfigurationPortlet extends StrutsPortlet {     }   class ConfigurationPortletPortletConfig extends PortletConfigImpl {   ConfigurationPortletPortletConfig (   PortletConfigImpl wrappedPortletConfig ) {     } } 
public class PythonUtil { public void test ( ) { { {   allComponents . addNativeLibraries (   Paths . get ( ent . getKey ( ) ) ,   ent . getValue ( ) ,   params . getBuildTarget ( ) ) ;   }   }   }     } 
public class Tmp { public void test ( ) {           } } 
public class CompilerOptions implements Serializable {     public static LanguageMode fromString ( String value ) {   switch ( value ) {   case " ECMASCRIPT6_STRICT " :   case " ES6_STRICT " :     } } } 
public class SQLExprParser extends SQLParser { public void test ( ) {   SQLExpr notTarget = expr ( ) ;   accept ( Token . RPAREN ) ;   notTarget = exprRest ( notTarget ) ;   sqlExpr = new SQLNotExpr ( notTarget ) ;     } } 
public class K2JvmCliTest extends CliBaseTest {   public void script ( ) throws Exception {   executeCompilerCompareOutputJVM ( ) ;   }   }     
public class LocalTachyonClusterResource implements TestRule { public void test ( ) {   mConfParams = confParams ;   }             } 
public final class UiAutomation { public void test ( ) {   canvas . translate ( - screenshotWidth / 2 , - screenshotHeight / 2 ) ;   canvas . drawBitmap ( screenShot , 0 , 0 , null ) ;   canvas . setBitmap ( null ) ;   screenShot = unrotatedScreenShot ;   }     } 
public class TxLog     { public void close ( ) throws IOException   { {   logBuffer . getFileChannel ( ) . close ( ) ;   }     } } 
public class Tmp { public void test ( ) {               } } 
package android . animation ;   import java . util . ArrayList ;   import java . util . Collection ;   import java . util . HashMap ;   import java . util . Iterator ;   import java . util . List ;       
public class MetaHistoryServiceImpl   { public void test ( ) {   synchronized ( progressListeners )   {   progressListeners . add ( listener ) ;   }   }     } 
import java . util . Map ;   public class MapSizeRequest extends MapAllPartitionsClientRequest implements Portable , RetryableRequest , SecureRequest {   private String name ;     public MapSizeRequest ( ) {   }     } 
public class HeadlessMaterial extends BaseMaterial {     public void reload ( MaterialData newData ) {   this . data = data ;   }       } 
import android . test . suitebuilder . annotation . LargeTest ;   import java . io . File ;   public class SQLiteGeneralTest extends AndroidTestCase {   private SQLiteDatabase mDatabase ;   private File mDatabaseFile ;     } 
public class HttpRequest {     public static class HttpRequestException extends RuntimeException {     private static final long serialVersionUID = - 1170466989781746231L ;       } } 
public class TestSelectorOptions {     public String getDefaultMetaVariable ( ) { { {   return " LIST < TEST SELECTORS > " ;   }   }   }     } 
public final class UndertowSession implements Session {     public String getNegotiatedSubprotocol ( ) {   return null ;   }       } 
public class BubbleView extends FrameLayout {     protected void loadFavicon ( ) {   maybeCancelFaviconLoad ( ) ;   final int tabFaviconSize = getResources ( ) . getDimensionPixelSize ( R . dimen . browser_toolbar_favicon_size ) ;     } } 
public class SourceCodeTraversal extends TraversalHelper { public void test ( ) { { { {   break ;   }   }   }   }     } 
public class TileBuilder extends TileAbstractBuilder implements IMachine { public void test ( ) {   updateRequirements ( ) ;   return ;   }     } 
public class IdeSettingsDialog extends DialogWrapper implements DataProvider { public void test ( ) { { {   myEditor . apply ( ) ;   myEditor . revalidate ( ) ;   myEditor . repaint ( ) ;   }   }   }     } 
public class ZenFooter extends LinearLayout {   public void onConfigurationChanged ( ) { {   mSpTexts . update ( ) ;   }   }     } 
public class Tmp { public ISeq rest ( ) {   } public int count ( ) { {   if ( oa != null )   return oa . length ;   return Array . getLength ( array ) - i ;   }     } } 
class AccessibilityInjectorFallback { public void test ( ) { {   event . setFromIndex ( 0 ) ;   event . setToIndex ( selection . length ( ) ) ;   sendAccessibilityEvent ( event ) ;   event . recycle ( ) ;   }   }     } 
public class PhoneWindowManager implements WindowManagerPolicy { public void test ( ) { { {   msg . setAsynchronous ( true ) ;   msg . sendToTarget ( ) ;   }   }   }     } 
public class ViewOverlay {   public void clear ( ) {   removeAllViews ( ) ;   if ( mDrawables != null ) {   mDrawables . clear ( ) ;   }   }     } 
public class GridSearch extends Job { public void test ( ) {   }   void updateErrors ( ArrayList < JobInfo > infos ) {   errors = new double [ jobs . length ] ;   int i = 0 ;   for ( Job job : jobs ) {     } } } 
public class ViaInstruction extends Instruction   { public int getViaCount ( )   { {   return viaPosition ;   }     } } 
public abstract class MediaBrowserService extends Service {             public class Result < T > {   private Object mDebug ;     } } 
public class WifiConfiguration implements Parcelable {       public boolean isValid ( ) {   if ( SSID == null )   return false ;   if ( allowedKeyManagement == null )   return false ;     } } 
public class BuildoutConfigurable implements Configurable , NonDefaultProjectConf       { public String getDisplayName ( ) { {   return " Buildout Support " ;   }       } } 
public class MainActivity extends ReactActivity {     protected List < ReactPackage > getPackages ( ) {   return Arrays . < ReactPackage > asList (   new MainReactPackage ( ) ) ;   }   }     
public abstract class BaseDownloadTask {       public boolean isRunning ( ) {   if ( ! isUsing ( ) ) {   return false ;   }     } } 
public class PortletDisplayTemplateImpl implements PortletDisplayTemplate {     private static final Transformer _transformer = new Transformer (   PropsKeys . DYNAMIC_DATA_LISTS_ERROR_TEMPLATE , true ) ;   }     
public final class AlluxioLineage extends AbstractLineageClient {             public static synchronized AlluxioLineage get ( LineageContext context ) {     } } 
public class DistTest       { public void testLikeDistro_SetupDemoBase ( ) throws Exception   {   File basePath = testdir . getEmptyDir ( ) ;     } } 
public class Poller extends PollerBase implements Runnable   { public void start ( )   { {   worker = new Thread ( this , name ) ;   worker . start ( ) ;   }     } } 
public class OperationDialog extends JDialog { public void test ( ) {   contentPane . add ( makeButtonPanel ( ) , BorderLayout . SOUTH ) ;   pack ( ) ;   }       } 
public class TemplateContextHelper { public void test ( ) {   try {   variables . put (   " saxReaderUtil " ,   utilLocator . findUtil ( SAXReaderUtil . class . getName ( ) ) ) ;   }   catch ( SecurityException se ) {     } } } 
public class ServerTestCase { public void test ( ) { {   if ( server != null )   server . stop ( ) ;   }       }     } 
public class PhotoView extends ImageView implements IPhotoView {     public Matrix getDisplayMatrix ( ) {   return mAttacher . getDrawMatrix ( ) ;   }       } 
public class DiagnosticGroups { public void test ( ) {   DiagnosticGroups . registerGroup ( " invalidProvide " ,   ProcessClosurePrimitives . INVALID_PROVIDE_ERROR ) ;   DiagnosticGroups . registerGroup ( " es6Typed " ,   RhinoErrorReporter . MISPLACED_TYPE_SYNTAX ) ;   }     } 
public class Tmp { public interface ExecHandle {     ExecHandle start ( ) ;   void abort ( ) ;   ExecResult waitForFinish ( ) ;     } } 
public class WorldSpecificSaveHandler implements ISaveHandler     { public File getMapFileFromName ( String name )   { { {   System . out . println ( new File ( dataDir , name + " . dat " ) ) ;   return new File ( dataDir , name + " . dat " ) ;   }   }     } } 
public class Tmp { public enum TreeType {     SMALL_JUNGLE ,             JUNGLE_BUSH ,     } } 
public class CommonShortcuts {     public static ShortcutSet getMoveEnd ( ) {   return shortcutsById ( IdeActions . ACTION_EDITOR_MOVE_LINE_START ) ;   }   public static ShortcutSet getRecentFiles ( ) {     } } 
public class MockFSDirectoryService extends FsDirectoryService {     public Directory [ ] build ( ) throws IOException {   return helper . wrapAllInplace ( delegateService . build ( ) ) ;   }       } 
public class TileLaser extends TileBuildCraft implements IPowerReceptor {     protected void findTable ( ) {   System . out . println ( " SEARCH " ) ;   int meta = worldObj . getBlockMetadata ( xCoord , yCoord , zCoord ) ;   int minX = xCoord - 5 ;     } } 
public class Astroboy2Test {     public void teardown ( ) {   RoboGuice . destroyInjector ( Robolectric . application ) ;   }     } 
public class ShadowLocation {   public void __constructor__ ( String provider ) {   this . provider = provider ;   }       } 
class ItemLoader {     public void run ( ) {   if ( itemViewReused ( mRequest ) ) {   return ;   }     } } 
public class JmfMediaManager extends JingleMediaManager {     public JmfMediaManager ( ) {   setupPayloads ( ) ;   setupJMF ( ) ;   }       } 
import de . danielnaber . languagetool . rules . RuleMatch ;         public class Main {   private final static int CONTEXT_SIZE = 25 ;     }  
package mypackage ;   import java . io . IOException ;   import java . io . PrintWriter ;   import java . util . Enumeration ;   import javax . servlet . ServletException ;   import javax . servlet . http . HttpServlet ;     
public class Tmp { public interface DSLContext extends Scope , AutoCloseable {           } } 
public class DescriptorResolver {     public static ConstructorDescriptorImpl createPrimaryConstructorForObject (   PsiElement object ,   ClassDescriptor classDescriptor ,   BindingTrace trace   ) {     } } 
public class PluginManagerMain {   public void filter ( ) {   if ( installedPluginTable . isShowing ( ) ) {   filter ( installedPluginsModel , myFilteredInstalled ) ;   }   else {   filter ( availablePluginsModel , myFilteredAvailable ) ;     } } } 
public class PhotoViewerActivity extends SherlockFragmentActivity implements OnP     { public void onPhotoLoadStatusChanged ( boolean finished ) {   setProgressBarIndeterminateVisibility ( ! finished ) ;   }   public void onPlacePicked ( Place place ) {     } } 
public class PhoneWindow extends Window implements MenuBuilder . Callback { public void test ( ) {   if ( cb == null ) {   return false ;   } else {   return cb . onSearchRequested ( ) ;   }   }     } 
public class CordovaActivity extends Activity {   protected void onSaveInstanceState ( Bundle outState )   {   super . onSaveInstanceState ( outState ) ;   cordovaInterface . onSaveInstanceState ( outState ) ;   }       } 
public class SvnVersionFilterComponent extends StandardVersionFilterComponent {   protected void installCheckBoxListener ( final ActionListener filterListener ) {   super . installCheckBoxListener ( filterListener ) ;   myAuthorField . addActionListener ( filterListener ) ;   }     } 
class PreferenceInflater { public void test ( ) {   for ( final String prefix : prefixes ) {   try {   clazz = classLoader . loadClass ( prefix + name ) ;   } catch ( final ClassNotFoundException e ) {   notFoundException = e ;   }     } } } 
public class LibraryLoadTest extends TestCase {     public void testLoadAWTAfterJNA ( ) {   if ( Pointer . SIZE > 0 ) {   Toolkit . getDefaultToolkit ( ) ;   }     } } 
public class MarkupBuilder extends BuilderSupport {         public Object getMkp ( ) {   return new MarkupBuilderHelper ( this ) ;   }     } 
public class S3Client { public void test ( ) { { {   }   }   }     } 
public abstract class AbstractBaseTest {   protected Configuration configuration = Connections . getConfiguration ( ) ;   protected SQLTemplates templates = configuration . getTemplates ( ) ;       protected String expectedQuery ;     } 
import java . util . Properties ;         public class ExternalResources {   private ExternalResources ( ) {     } } 
public class CommandFailureException extends MongoException {             public CommandResult getCommandResult ( ) {   return commandResult ;   }     } 
public final class MeasureKey {       public Developer getDevelope ( ) {   return developer ;   }     } 
import sun . misc . URLClassPath ;         public class QuasarURLClassLoaderHelper {   private final URLClassLoader cl ;   private final QuasarInstrumentor instrumentor ;     } 
class TiffUtil {   public static int getAutoRotateAngleFromOrientation ( int orientation ) {   switch ( orientation ) {   case ExifInterface . ORIENTATION_NORMAL :   return 0 ;   case ExifInterface . ORIENTATION_ROTATE_180 :   return 180 ;     } } } 
public class TrainParser { public void test ( ) { { { {   state = transition . apply ( state ) ;   }   }     System . err . println ( transitionIndex ) ;     }   }     } 
public class BasicBSONObject extends LinkedHashMap < String , Object > implements BSO         { public boolean containsKey ( String key ) { {   return containsField ( key ) ;   }     } } 
public class ClientSession extends Session {   public void packetReceived ( Packet packet ) {   packet . setFrom ( getAddress ( ) ) ;   }   }     
public abstract class StoreBase   { public void processExpires ( ) {   String [ ] keys = null ;   if ( ! started ) {   return ;   }     } } 
public class Tmp { public enum SQLDialect {   ;   private static final SQLDialect [ ] FAMILIES ;     } } 
public class MockitoTest extends TestBase { public void test ( ) {       }     } 
public class DebugProcessEvents extends DebugProcessImpl { public void test ( ) { { { { {   return ;   }   }   }   }   }     } 
public class WsSession implements Session { public void test ( ) { { { {   }   }   }       }     } 
import java . text . ParseException ;   import java . util . ArrayList ;   import java . util . Date ;   import java . util . List ;   import java . util . Locale ;   import org . joda . time . DateTime ;   import org . joda . time . DateTimeConstants ;     
public class EmojiconTextView extends TextView {     public void setEmojiconSize ( int pixels ) {   mEmojiconSize = pixels ;   }       } 
abstract public class GraphView extends LinearLayout { public void test ( ) {   setLayoutParams ( new LayoutParams ( LayoutParams . FILL_PARENT , LayoutParams . FILL_PARENT ) ) ;   if ( title == null )   title = " " ;   else   this . title = title ;     } } 
public class TermSettings {   private String mShell ;   private String mInitialCommand ;   private boolean mUTF8ByDefault = false ;   private int mBackKeyAction = BACK_KEY_SENDS_ESC ;   private String mTermType ;   private boolean mCloseOnExit = true ;     } 
import java . util . regex . Pattern ;               public class DefaultGroovyMethods { public void test ( ) {     } } 
public class RouterImpl implements Router {     public List < Route > getRoutes ( ) {   return _routes ;   }       } 
public class PyStringLiteralFileReferenceSet extends RootFileReferenceSet {     protected void reparse ( ) {   if ( myStringLiteralExpression != null ) {   MyTextRangeConsumer textRangeConsumer = new MyTextRangeConsumer ( this ) ;     } } } 
import java . util . List ;   import java . util . Random ;   import android . content . Context ;   import android . os . Binder ;   import android . os . Build ;   import android . os . Process ;   import android . util . Log ;     
public class Client implements Runnable { public void test ( ) { {   }   if ( isDisposeRegistered ) {   parent . unregisterMethod ( " dispose " , this ) ;   }   dispose ( ) ;   }     } 
import java . io . IOException ;             public class AssetBundleEntryInfo implements Struct { public void test ( ) {     } } 
public class GPXUtilities { public void test ( ) {   double totalSpeedSum = 0 ;   points = 0 ;   double channelThres = 5 ;   double channelBase ;   double channelTop ;   double channelBottom ;     } } 
public abstract class GoStubbedElementImpl < T extends StubBase < ? > > extends StubBa     { public String toString ( ) { {   return getNode ( ) . getElementType ( ) . toString ( ) ;   }       } } 
import alluxio . client . WriteType ;   import alluxio . shell . AbstractAlluxioShellTest ;   import org . junit . Assert ;   import org . junit . Test ;       
public class ExpandedActivity extends Activity { public void test ( ) {   if ( Constant . EXPANDED_ACTIVITY_DEBUG ) {   rootView . setBackgroundColor ( 0x5500ff00 ) ;   }   initHotwordService ( ) ;     } } 
package tachyon . util . io ;   import java . io . File ;   import java . io . FileOutputStream ;   import java . io . IOException ;   import java . nio . ByteBuffer ;     
public class ModifyKeyboardShortcutsWidget extends ModalDialogBase     { public Object getKey ( CommandBinding item )   { { {   return item . getName ( ) ;   }   } ;     } } 
class PowerManagerService extends IPowerManager . Stub   { public void enableUserActivity ( boolean enabled ) { {   synchronized ( mLocks ) {   mUserActivityAllowed = enabled ;   mLastEventTime = SystemClock . uptimeMillis ( ) ;   }   }     } } 
public class YAxis extends AxisBase {       public void setGranularityEnabled ( boolean enabled ) {   mGranularityEnabled = true ;   }       } 
final class Log4JLogger extends Logger {       public void error ( String message , Throwable th ) { {   error ( message , th ) ;   }   }     } 
public class NativeLibraryHelper {     public static boolean removeNativeBinariesLI ( String nativeLibraryPath ) {   return removeNativeBinariesFromDirLI ( new File ( nativeLibraryPath ) ) ;   }     } 
import android . widget . FrameLayout ;   import android . widget . ImageView ;   import android . widget . LinearLayout ;   import android . widget . PopupWindow ;   import android . widget . TextView ;       
import java . util . concurrent . ConcurrentHashMap ;   import java . util . concurrent . atomic . AtomicInteger ;   public class Var implements IFn {   static class Frame {       } } 
import voldemort . utils . Time ;   public class KeyedResourcePoolTest {   protected static int POOL_SIZE = 5 ;   protected static long TIMEOUT_MS = 100 ;   protected TestResourceFactory factory ;   protected KeyedResourcePool < String , TestResource > pool ;     } 
public class GroupLocalServiceImpl extends GroupLocalServiceBaseImpl { public void test ( ) {     unscheduleStaging ( group ) ;   if ( group . hasStagingGroup ( ) ) {     } } } 
public class FileConsumerCustomExceptionHandlerTest extends ContextTestSupport { public void test ( ) { { {   }   } ;   }           } 
public class WordPress extends Application {     public void onActivityCreated ( Activity activity , Bundle arg1 ) {   WPActivityUtils . applyLocale ( activity ) ;   }     } 
public class SubtasksListFragment extends TaskListFragment {     protected void refresh ( ) {   setUpTaskList ( ) ;   }     } 
public class IndexRangesMigrationPeriodical extends Periodical {     public boolean isDaemon ( ) {   return false ;   }       } 
public class SimpleAppServer extends AbstractAppServer     { public String getDescription ( )   { { { {   return " Built in command . Exits the client " ;   }   }   }     } } 
public class AtmosphereFramework {     public void objectFactory ( AtmosphereObjectFactory objectFactory ) {   this . objectFactory = objectFactory ;   }       } 
public class GitMergeUtil { public void test ( ) {   for ( String fileName : unmergedNames ) {   VirtualFile f = lfs . findFileByPath ( fileName ) ;   if ( f != null ) {   unmerged . add ( f ) ;   }   }     } } 
public class ResourceLinkFactory       { public static void setGlobalContext ( Context newGlobalContext ) { {   if ( globalContext != null )   return ;   globalContext = newGlobalContext ;   }     } } 
public class DBObjectCodec implements CollectibleCodec < DBObject > {   private final CodecRegistry codecRegistry ;   private final BsonTypeClassMap bsonTypeClassMap ;   private final DB db ;   private final DBObjectFactory objectFactory ;   private final IdGenerator idGenerator = new ObjectIdGenerator ( ) ;     } 
public class Leg {         public boolean interlineWithPreviousLeg = false ;       } 
package voldemort . server . protocol . admin ;       public class AsyncOperationStatus {   private String status ;   private boolean complete = false ;   private final int id ;     } 
public class CameraPreview extends SurfaceView implements SurfaceHolder . Callback     { public void surfaceCreated ( SurfaceHolder surfaceHolder ) { {   mSurfaceCreated = true ;   showCameraPreview ( ) ;   }       } } 
public class TridentKafkaState implements State { public void test ( ) { { { { {   }   }   }   }   }     } 
public final class ServerImpl extends Server { public void test ( ) {   if ( shutdown ) {   return this ;   }   transportServer . shutdown ( ) ;   shutdown = true ;   timeoutService . shutdown ( ) ;   return this ;   }     } 
public class ClassFilterEditor extends JPanel implements ComponentWithEmptyText   { public void removeRow ( final int idx ) { { {   myFilters . remove ( idx ) ;   fireTableDataChanged ( ) ;   }   }     } } 
public class CompilerOptions implements Serializable , Cloneable {           private LanguageMode languageOut ;     } 
final class ZLOwnXMLParser { public void test ( ) {   while ( true ) {   int count = streamReader . read ( buffer ) ;   if ( count <= 0 ) {   return ;   }   if ( count < buffer . length ) {     } } } } 
public final class MediaBrowserCompat {         public static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } } 
public class DefaultBroadcaster implements Broadcaster {     protected void entryDone ( final BroadcasterFuture < ? > f ) {   notifyBroadcastListener ( ) ;   if ( f != null ) f . done ( ) ;   }     } 
public abstract class FilteredSearchContext extends SearchContext {     public void accessed ( long accessTime ) {   accessed ( accessTime ) ;   }       } 
public class RedisClient extends DB { public void test ( ) {   String password = props . getProperty ( PASSWORD_PROPERTY ) ;   if ( password != null ) {   jedis . auth ( password ) ;   jedis . flushAll ( ) ;   }   }     } 
public class SchedulingPolicyService extends ISchedulingPolicyService . Stub {     private static final int PRIORITY_MIN = 1 ;   private static final int PRIORITY_MAX = 2 ;   public SchedulingPolicyService ( ) {   }     } 
public class OpenIDAuthenticationProcessingFilter extends AbstractProcessingFilt     { public int getOrder ( ) { { {   return FilterChainOrder . AUTHENTICATION_PROCESSING_FILTER ;   }   }     } } 
class TelephonyRegistry extends ITelephonyRegistry . Stub { public void test ( ) {   if ( ! checkNotifyPermission ( " notifyDataActivity ( ) " ) ) {   return ;   }   handleRemoveListLocked ( ) ;   synchronized ( mRecords ) {   mDataActivity = state ;   for ( Record r : mRecords ) {     } } } } 
public class PortletPreferencesListener implements ModelListener {     public void onAfterCreate ( BaseModel model ) throws ModelListenerException {   clearCache ( model ) ;   }   public void onBeforeRemove ( BaseModel model ) throws ModelListenerException {     } } 
public class XIoBridge extends XHook { public void test ( ) { {   return ;     if ( isRestricted ( param ) )   param . setResult ( new FileNotFoundException ( ) ) ;   }   }     } 
public class DelaunayTriangulatorTest extends GdxTest { public void test ( ) {   }   void triangulate ( ) {   seed = 4139368480425561099l ;   MathUtils . random . setSeed ( seed ) ;   int pointCount = 100 ;     } } 
public class FocusTrackback {     private boolean wrongOS ( ) {   return SystemInfo . isWindows ;   }   private void register ( final Window parent ) {     } } 
public class ActivityShare extends Activity { public void test ( ) {     setContentView ( R . layout . sharelist ) ;   getWindow ( ) . setSoftInputMode ( WindowManager . LayoutParams . SOFT_INPUT_STATE_ALWAYS_HIDDEN ) ;     if ( action . equals ( ACTION_TOGGLE ) ) {     } } } 
public class PacketTransceiverImpl implements PacketTransceiver {         public void receive ( Packet packet ) {   if ( packet . isHeaderSet ( Packet . HEADER_OP ) ) {   operationService . executeOperation ( packet ) ;     } } } 
public class ClientConfig {               public TimeoutConfig getTimeoutConfig ( ) {   return timeoutConfig ;     } } 
public class DrawerLayout extends ViewGroup {     public int getViewHorizontalDragRange ( View child ) {   return child . getWidth ( ) ;   }       } 
public class AtmosphereRequest extends HttpServletRequestWrapper {       public HttpSession getSession ( ) {   return b . request . getSession ( false ) ;   }       } 
public class PLWJGL extends PGL {     protected void getGL ( PGL pgl ) {   }   }     
public class FreeFlowContainer extends AbsLayoutContainer { public void test ( ) {   v . setRotation ( 0 ) ;   v . setScaleX ( 1f ) ;   v . setScaleY ( 1f ) ;   viewpool . returnViewToPool ( v ) ;   }     } 
public class CompatibilityEngine extends AbstractEngine {     public void initScreenshot ( GL gl , GLU glu ) {   initDisplayLists ( gl , glu ) ;   }       } 
public class Form {   public static final String TYPE_FORM = " form " ;   public static final String TYPE_SUBMIT = " submit " ;   public static final String TYPE_RESULT = " result " ;   private DataForm dataForm ;     } 
public class StreamRule { public void test ( ) { {   for ( Type type : Type . values ( ) )   if ( type . id == id )   return type ;   }   }     } 
import org . codehaus . groovy . runtime . InvokerInvocationException ;               public class GroovyMain { public void test ( ) {     } } 
public class Canvas {               public final Matrix getMatrix ( ) {   Matrix m = new Matrix ( ) ;       } } 
public class ProjectJdkImpl extends UserDataHolderBase implements JDOMExternaliz     { public void rootsChanged ( ) {   if ( myListeners . isEmpty ( ) ) {   return ;   }     } } 
import water . * ;   public class WaterMeterCpuTicks extends Iced {     int nodeidx ;     public long [ ] [ ] cpu_ticks ;     } 
import java . util . List ;   public class ReadonlyStatusHandlerImpl extends ReadonlyStatusHandler implements ProjectComponent , JDOMExternalizable {   private final Project myProject ;   public boolean SHOW_DIALOG ;   public ReadonlyStatusHandlerImpl ( Project project ) {   myProject = project ;     } } 
public class Client implements IConnection {   private final int buffer_size ;   private boolean closing ;   private Integer messageBatchSize ;   private AtomicLong pendings ;     } 
public class Tmp { public enum Material {   RAW_CHICKEN ( 365 ) ,   COOKED_CHICKEN ( 366 ) ,   ROTTEN_FLESH ( 367 ) ,   ENDER_PEARL ( 368 ) ,   BLAZE_ROD ( 369 ) ,   GHAST_TEAR ( 370 ) ,   GOLD_NUGGET ( 371 ) ,     } } 
public class PShader { public void test ( ) {   parent = null ;   pgMain = null ;   pgl = null ;   context = pgl . createEmptyContext ( ) ;   this . vertexURL = null ;   this . fragmentURL = null ;     } } 
public class RecyclerView extends ViewGroup { public void test ( ) { {   mLayout . onAdapterChanged ( oldAdapter , mAdapter ) ;   }   mRecycler . onAdapterChanged ( oldAdapter , mAdapter ) ;   requestLayout ( ) ;   }     } 
public class StorageService implements IEndpointStateChangeSubscriber , StorageSe   {   public void run ( )   {   Gossiper . instance . stop ( ) ;   MessagingService . instance ( ) . shutdown ( ) ;   StageManager . shutdownNow ( ) ;     } } 
public final class ContactsContract {   public static final int TYPE_HOME = 1 ;   public static final int TYPE_WORK = 2 ;   public static final int TYPE_OTHER = 3 ;         } 
public class PlaybackService { public void test ( ) {   if ( mSeek > 0 ) {   mPlayer . seekTo ( mSeek ) ;   }   mPlayer . start ( ) ;   break ;   }     } 
public class ClearScrollResponse extends ActionResponse implements StatusToXCont     { public XContentBuilder toXContent ( XContentBuilder builder , Params params ) throws IOException { {   builder . startObject ( ) ;   builder . endObject ( ) ;   return builder ;   }     } } 
public class FMLServerHandler implements IFMLSidedHandler   { public void test ( ) {   server = minecraftServer ;   ObfuscationReflectionHelper . detectObfuscation ( World . class ) ;   FMLCommonHandler . instance ( ) . beginLoading ( this ) ;   Loader . instance ( ) . loadMods ( ) ;   }     } 
public class Tmp { public void test ( ) {               } } 
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 2 . 2 " ;   public static String getVersion ( ) {   return VERSION ;     } } 
public class RequestFacade implements HttpServletRequest {   public void login ( String username , String password )   throws ServletException {   login ( username , password ) ;   }   public void logout ( ) throws ServletException {     } } 
public class MessageHistoryServiceImpl   { public void localUserPresenceChanged ( LocalUserChatRoomPresenceChangeEvent evt )   {   if ( evt . getEventType ( ) ==   LocalUserChatRoomPresenceChangeEvent . CHAT_ROOM_JOINED )   {   evt . getChatRoom ( ) . addMessageListener ( this ) ;   }     } } 
public class AccelListener extends Plugin implements SensorEventListener { public void test ( ) {   if ( this . status == AccelListener . STOPPED ) {   return ;   }   this . accuracy = accuracy ;   }     } 
public class HikariDataSource extends HikariConfig implements DataSource     { public int hashCode ( )   { {   return password . hashCode ( ) ;   }       } } 
public abstract class BaseDataReader {   public void stop ( ) {   isStopped = true ;   }   public void waitFor ( ) throws InterruptedException {     } } 
public class FloatTextureData implements TextureData {   public boolean isManaged ( ) {   return true ;   }   }     
public class TwoWayView extends AdapterView < ListAdapter > { public void test ( ) { {   }   lp . id = mAdapter . getItemId ( position ) ;   lp . viewType = mAdapter . getItemViewType ( position ) ;   child . setLayoutParams ( lp ) ;   }     } 
package zmq ;   public class YQueue < T >   {     private class Chunk < T >   {   final T [ ] values ;   final int [ ] pos ;     } } 
public final class RingBuffer < T > extends Sequencer   { public void test ( ) {   this ( eventFactory , size ,   ClaimStrategy . Option . MULTI_THREADED ,   WaitStrategy . Option . SLEEPING ) ;   }       } 
public class TtsService extends Service implements OnCompletionListener { public void test ( ) { { {   if ( synthAvailable ) {   synthesizerLock . unlock ( ) ;   }   }   }   }     } 
import javax . swing . * ;       public class UnassignedVariableAccessInspection extends GroovyLocalInspectionBase {   public boolean myIgnoreBooleanExpressions = false ;         } 
public class Helper   { public static final double round2 ( double value )   { { {   return Math . round ( value * 100 ) / 100 ;   }   }     } } 
public class NumpyUfuncs { public void test ( ) { {   UFUNC_LIST . add ( " ceil " ) ;   UFUNC_LIST . add ( " trunc " ) ;   }   }     } 
public class ZContext implements Closeable     { public ZContext ( int ioThreads_ ) {   context = null ;   sockets = new CopyOnWriteArrayList < Socket > ( ) ;   ioThreads = ioThreads_ ;   linger = 0 ;     } } 
public class NinePatch {   public float getTotalHeight ( ) {   return topHeight + middleHeight + bottomHeight ;   }     public Texture getTexture ( ) {   return texture ;   }   }     
public abstract class TwoWayLayoutManager extends LayoutManager {     public int getFirstVisiblePosition ( ) {   return mFirstPosition ;   }     } 
public class UserGroupLocalServiceImpl extends UserGroupLocalServiceBaseImpl {     public UserGroup fetchUserGroup ( long companyId , String name )   throws PortalException , SystemException {   return userGroupPersistence . fetchByC_N ( companyId , name ) ;   }     } 
import android . webkit . WebView ;       public class WebElementCreator {   private ArrayList < WebElement > webElements ;   private Sleeper sleeper ;     } 
public class PortletDisplay implements Serializable {     public void setTitle ( String title ) {   title = HtmlUtil . escape ( title ) ;     _title = title ;       } } 
public class SSLHostConfigCertificate {     public Type getType ( ) {   return type ;   }     } 
public class BlockDoesNotExistException extends AlluxioException {             public BlockDoesNotExistException ( String message ) {     } } 
public class AIRobotLookForStation extends AIRobot { public void test ( ) {   return ;   }       double potentialStationDistance = Float . MAX_VALUE ;   DockingStation potentialStation = null ;     } 
public class VoldemortIOUtilsTest {     public void testCloseQuietlyNullHttpResponse ( ) {   VoldemortIOUtils . closeQuietly ( null ) ;   }       } 
public class CommitLog implements CommitLogMBean     { public void resetUnsafe ( )   { {   allocator . resetUnsafe ( ) ;   }     } } 
public class ContentExchange extends CachedExchange   {   int _contentLength = 1024 ;   String _encoding = " utf - 8 " ;   ByteArrayOutputStream _responseContent ;   File _fileForUpload ;     } 
final class SocketReceiveBufferPool { public void test ( ) { {   }   ByteBuffer buf = ByteBuffer . allocateDirect ( normalizeCapacity ( size ) ) ;   buf . clear ( ) ;   return buf ;   }     } 
public class TextureView extends View {   public void setOpaque ( boolean opaque ) {   if ( opaque != mOpaque ) {   mOpaque = opaque ;   updateLayer ( ) ;   }   }     } 
public class ApplicationMode {     public static List < ApplicationMode > allPossibleValues ( OsmandSettings settings ) {   return values ;   }     } 
public class JournalShutdownIntegrationTest {   private ExecutorService mExecutorsForClient ;     public static SystemPropertyRule mDisableHdfsCacheRule =   new SystemPropertyRule ( " fs . hdfs . impl . disable . cache " , " true " ) ;       } 
import org . opensolaris . opengrok . web . Util ;   public class TarAnalyzer extends FileAnalyzer {   private StringBuilder content ;   private int len ;   private static final Reader dummy = new StringReader ( " " ) ;     } 
public class Editor { public void test ( ) {   if ( mPositionListener != null ) {   mPositionListener . onScrollChanged ( ) ;   }   }       } 
public class BooksIntegrationTest {     public static void tearDown ( ) {   Spark . clearRoutes ( ) ;   Spark . stop ( ) ;   }     } 
public class ConsistencyCheck { public void test ( ) { { {   }   }   }       } 
package com . mongodb ;             public class MongoServerSelectionException extends MongoClientException {   private static final long serialVersionUID = - 1497309903649297430L ;     } 
public class User implements Cacheable {     public String getEmail ( ) {   return email ;   }   public void setEmail ( String email ) {     } } 
public class Tool {     public File inputDirectory ;   public String outputDirectory ;   public String libDirectory ;   public boolean generate_ATN_dot = false ;     } 
public class CommonUtils { public void test ( ) {   ByteBuffer ret = ByteBuffer . allocate ( buf . limit ( ) - buf . position ( ) ) ;   ret . put ( buf ) ;   ret . flip ( ) ;   return ret ;   }     } 
public class EventDispatcher extends VirtualFileAdapter implements VirtualFileMa     { public void updatingDone ( ) {   assert isRefreshing ( ) ;   if ( myRefreshDepth == 0 ) {       } } } 
public class LocalSession {               public void setCUIVersion ( int cuiVersion ) {   this . cuiVersion = cuiVersion ;     } } 
public class ConversationPrefsHelper {     public SharedPreferences getConversationPrefs ( ) { {   return mPrefs ;   }   }     } 
public class MainService extends Service {     public void onCreate ( ) {   Crashlytics . start ( this ) ;     } } 
public final class Internal {       public static boolean inMilliseconds ( final byte [ ] qualifier ,   final byte offset ) {   return inMilliseconds ( qualifier [ offset ] ) ;   }     } 
class WifiController extends StateMachine { public void test ( ) {   registerForStayAwakeModeChange ( handler ) ;   readWifiIdleTime ( ) ;   registerForWifiIdleTimeChange ( handler ) ;   readStayAwakeConditions ( ) ;   registerForWifiSleepPolicyChange ( handler ) ;   }     } 
public class HttpUtils {     public void configHttpGetCacheDefaultExpiry ( long defaultExpiry ) {   currRequestExpiry = defaultExpiry ;   HttpGetCache . setDefaultExpiryTime ( defaultExpiry ) ;   }   public void configCurrRequestExpiry ( long currRequestExpiry ) {     } } 
package com . notnoop . apns ;         public class APNS {   private APNS ( ) { throw new AssertionError ( " Uninstantiable class " ) ; }     }  
public class RenderPipe extends TileEntitySpecialRenderer {   final static private int renderDistanceSq = 24 * 24 ;   final static private int numItemsToRender = 3 ;   private final static EntityItem dummyEntityItem = new EntityItem ( null ) ;     } 
class IonDrawable extends Drawable {   private WeakReference < IonDrawable > ionDrawableRef ;   private WeakReference < ImageView > imageViewRef ;   private String bitmapKey ;   private String parentKey ;   private SimpleFuture < ImageView > imageViewFuture = new SimpleFuture < ImageView > ( ) ;   private Animation inAnimation ;   private int inAnimationResource ;     } 
package rajawali . animation ;   import java . util . Stack ;   import rajawali . math . Vector3 ;   import rajawali . util . RajLog ;   public class BezierPath3D implements ISpline {     } 
import php . runtime . ext . support . compile . ConstantsContainer ;   public class InfoConstants extends ConstantsContainer {   public static String PATH_SEPARATOR = Constants . PATH_SEPARATOR ;   }     
public final class KeyDispatcher implements Flow . Dispatcher {   public static final class Builder {   private final Activity activity ;   private KeyChanger keyChanger ;   private Builder ( Activity activity , KeyChanger keyChanger ) {   this . activity = activity ;     } } } 
public class VariableInspector extends JDialog { public void test ( ) {   thisFields = new ArrayList < VariableNode > ( ) ;   declaredThisFields = new ArrayList < VariableNode > ( ) ;   return scrollPane ;   }     } 
public class Base { public void test ( ) {   getSketchbookToolsFolder ( ) . mkdirs ( ) ;   getSketchbookModesFolder ( ) . mkdirs ( ) ;   getSketchbookExamplesFolder ( ) . mkdirs ( ) ;   }     } 
public class ConstantIntroduceHandler extends IntroduceHandler {     protected String getHelpId ( ) {   return " refactoring . introduceConstant " ;   }   }     
public class WebView extends AbsoluteLayout       { public Picture capturePicture ( ) {   Picture result = new Picture ( ) ;   nativeCopyBaseContentToPicture ( result ) ;   return result ;     } } 
  package dagger . internal ;   import dagger . ObjectGraph ;   import dagger . internal . Binding . InvalidBindingException ;   import java . util . ArrayList ;   import java . util . Collections ;     
package com . iluwatar ;   public class Item { public void test ( ) {     }     } 
public class EmbeddedElasticSearchClient { public void test ( ) { {     deleteIndex ( indexName ) ;   }   }     } 
public class Image extends Widget {   public void setAlign ( int align ) {   this . align = align ;   }   public float getMinWidth ( ) {     } } 
public class LabelAdjust extends AbstractLayout implements Layout {     public void initAlgo ( ) {   }   public void goAlgo ( ) {     } } 
public class WXRequest {         public static final int DEFAULT_TIMEOUT_MS = 2500 ;   }     
public class WSDecoder { public void test ( ) {   if ( finalFlag ) {   if ( fragmentedOpCode > 0 )   opcode = fragmentedOpCode ;   switch ( opcode ) {   case OPCODE_TEXT :   return new Frame . TextFrame ( content ) ;     } } } } 
public class Activity extends ContextThemeWrapper     { public boolean onMenuOpened ( int featureId , Menu menu ) {   if ( featureId == Window . FEATURE_ACTION_BAR ) {   if ( mActionBar != null ) {   mActionBar . dispatchMenuVisibilityChanged ( true ) ;   } else {     } } } } 
public class MBCategoryLocalServiceImpl extends MBCategoryLocalServiceBaseImpl { public void test ( ) { {   curCategory . setDisplayStyle ( displayStyle ) ;   mbCategoryPersistence . update ( curCategory , false ) ;   }   }     } 
public class ActivityStack { public void test ( ) { {   }   if ( w > 0 ) {   return mService . mWindowManager . screenshotApplications ( w , h ) ;   }   return null ;   }     } 
public class Configuration             { public void setAllowPackage ( boolean aAllowPackage )   {     } } 
public abstract class GroovyPage extends Script {     public String getPluginContextPath ( ) {   return pluginContextPath ;   }   public void cleanup ( ) {     } } 
package jackpal . androidterm ;   import android . content . Context ;   import android . util . DisplayMetrics ;   import android . util . Log ;   import jackpal . androidterm . emulatorview . ColorScheme ;   import jackpal . androidterm . emulatorview . EmulatorView ;     
public class HttpRequest {       public String getParas ( ) {   return HttpUtils . joinParas ( parasMap ) ;   }       } 
public class HTML5VideoFullScreen extends HTML5VideoView     { public void showControllerInFullScreen ( ) { {   mMediaController . show ( 0 ) ;   }       } } 
public final class StripedExecutor implements Executor { public void test ( ) {   for ( Worker worker : workers ) {   worker . workQueue . clear ( ) ;   }   }     } 
final class ActivityStack { public void test ( ) {   mWindowManager . moveTaskToTop ( tr . taskId ) ;   mStackSupervisor . resumeTopActivitiesLocked ( ) ;   EventLog . writeEvent ( EventLogTags . AM_TASK_TO_FRONT , tr . userId , tr . taskId ) ;     } } 
public class NativeMemoryChunk implements Closeable {   private static final String TAG = " NativeMemoryChunk " ;   static {   SoLoaderShim . loadLibrary ( " gnustl_shared " ) ;   SoLoaderShim . loadLibrary ( " memchunk " ) ;   }     } 
public class JBTabbedPane extends JTabbedPane implements HierarchyListener { public void test ( ) {   UIUtil . setNotOpaqueRecursively ( component ) ;   setInsets ( component ) ;   revalidate ( ) ;   repaint ( ) ;   }     } 
public class BinaryRoutePlanner { public void test ( ) { {   ctx . finalReverseEndSegment = next . segmentStart ;   ctx . finalReverseRoute = opposite ;   }   }     boolean alreadyVisited = visitedSegments . contains ( nts ) ;     } 
package com . iluwatar . delegation . simple ;   import com . iluwatar . delegation . simple . printers . App ;   import org . junit . Test ;   public class AppTest { public void test ( ) {     } } 
public abstract class AbstractContextSelectToolbarStatusPanel extends AbstractPa   { public void contextsChanged ( ) { {   log . debug ( " Contexts changed . . . " ) ;   contextSelectBox . reloadContexts ( false ) ;   }       } } 
public class DRFTest extends TestUtil { public void test ( ) {   parms . _max_depth = 2 ;   parms . _nfolds = 2 ;   parms . _ntrees = 3 ;   DRF job = new DRF ( parms ) ;     } } 
public class MasterClient extends CommunicationProtocol implements Master , Chann   { public void test ( ) { {   msgLog . logMessage ( " MasterClient shutdown " , true ) ;   channelPool . close ( true ) ;   }   }     } 
public final class ActivityThread {     private void handleBindApplication ( AppBindData data ) {   if ( data . trackAllocation ) {   DdmVmInternal . enableRecentAllocations ( true ) ;   }     } } 
public class PostsActivity extends WPActionBarActivity implements OnPostSelected   { public void onClick ( DialogInterface dialog ,   int whichButton ) { {   post . delete ( ) ;   attemptToSelectPost ( ) ;   postList . loadPosts ( false ) ;   }     } } 
public class App extends Application {   public void onCreate ( ) { {   super . onCreate ( ) ;   PluginManager . init ( this ) ;     }   }     } 
public class StringOutputStream extends OutputStream {   StringBuilder mBuf ;   public void write ( int data ) throws IOException {   mBuf . append ( ( char ) data ) ;   }     } 
public final class Request { public void test ( ) {   parameters . setQuery ( queryMB ) ;   parameters . setURLDecoder ( urlDecoder ) ;   parameters . setHeaders ( headers ) ;   }     } 
final class CompilerExecutor { public void test ( ) { { { {   }   return result ;   }   }     } }
public class BasicBSONList extends ArrayList < Object > implements BSONObject {         public boolean containsKey ( String key ) {   return containsField ( key ) ;   }     } 
public abstract class AbstractOutputBuffer < S > implements OutputBuffer {         protected final OutputBuffer outputStreamOutputBuffer ;         } 
public class TerminalView { public void test ( ) {   if ( myDockContainer == null ) {   myDockContainer = new TerminalDockContainer ( toolWindow ) ;   DockManager . getInstance ( myProject ) . register ( myDockContainer ) ;   }   }     } 
package Question9_1 ;   import java . util . HashMap ;     public class Question {   public static int countWaysDP ( int n , int [ ] map ) {     } } 
public class MultipleParentClassLoader extends ClassLoader { public void test ( ) { {   classLoaders . add ( type . getClassLoader ( ) ) ;   }   return append ( classLoaders ) ;     }       } 
package ninja ;   import static org . junit . Assert . assertTrue ;     import java . lang . reflect . InvocationTargetException ;   import java . lang . reflect . Method ;   import java . util . ArrayList ;     
public class PhotosBaseAdapter extends BaseAdapter { public void test ( ) {   PhotoItemLayout layout = ( PhotoItemLayout ) view ;   layout . getImageView ( ) . requestThumbnail ( getItem ( position ) , true ) ;   layout . setChecked ( true ) ;   return view ;   }     } 
public class Systrace {   public static final long TRACE_TAG_REACT_JAVA_BRIDGE = 0L ;   public static final long TRACE_TAG_REACT_FRESCO = 0L ;   public enum EventScope {   THREAD ( ' t ' ) ,     } } 
public class CameraView extends ViewGroup implements AutoFocusCallback { public void test ( ) { {   previewDestroyed ( ) ;   removeView ( previewStrategy . getWidget ( ) ) ;   }   }       } 
public class DownloadActivity extends SherlockFragmentActivity { public void test ( ) { {   }   getSupportActionBar ( ) . setHomeButtonEnabled ( true ) ;   }       } 
final class PooledUnsafeDirectByteBuf extends PooledByteBuf < ByteBuffer > {     protected ByteBuffer newInternalNioBuffer ( ByteBuffer memory ) {   return memory . duplicate ( ) ;   }       } 
public abstract class Pair < T1 , T2 >     { public T1 first ( )   { {   return first ( ) ;   }       } } 
public final class ClusterService implements Runnable , Constants {   private long lastCheck = 0 ;   private boolean running = true ;   private final ThreadWatcher threadWatcher = new ThreadWatcher ( ) ;     } 
public class JUnit3RunnerWithInners extends Runner implements Filterable , Sortab     { public void filter ( Filter filter ) throws NoTestsRemainException { {   initialize ( ) ;   delegateRunner . filter ( filter ) ;   }     } } 
public class ScopeConfigurable extends NamedConfigurable < NamedScope > {       public String getHelpTopic ( ) {   return null ;   }   public JComponent createOptionsPanel ( ) {     } } 
public class Http11InputBuffer implements InputBuffer {         protected class SocketInputBuffer implements InputBuffer {         } } 
package rx . exceptions ;   import static org . junit . Assert . assertEquals ;   import static org . junit . Assert . assertFalse ;   import java . io . ByteArrayOutputStream ;   import java . io . PrintStream ;     
public class SelectTemplateStep extends ModuleWizardStep {     public void updateDataModel ( ) {   if ( mySettingsStep != null ) {   mySettingsStep . updateDataModel ( ) ;   }     } } 
public abstract class FragmentHostCallback < E > extends FragmentContainer { public void test ( ) {   }   void onAttachFragment ( Fragment fragment ) {   fragment . onAttach ( mContext ) ;   }   void doLoaderStart ( ) {     } } 
public class MotionGroup extends AbstractActionGroup   { public void test ( ) {   int line = EditorHelper . normalizeVisualLine ( editor , EditorHelper . getCurrentVisualLine ( editor ) + cntForward ) ;   if ( line <= 0 )   {   return 0 ;   }     } } 
package org . opensolaris . opengrok . history ;   import java . io . BufferedReader ;   import java . io . ByteArrayInputStream ;   import java . io . StringReader ;   import org . junit . After ;   import org . junit . AfterClass ;     
import serializers . JavaBuiltIn ;   import serializers . Serializer ;   import serializers . TestGroups ;   import data . media . Image ;   import data . media . Media ;   import data . media . MediaContent ;   import com . alibaba . fastjson . JSON ;     
import io . undertow . util . HttpString ;               public class SetHeaderHandler implements HttpHandler { public void test ( ) {     } } 
public class CursorWindow extends SQLiteClosable { public void test ( ) {   if ( mWindowPtr != null ) {     nativeDispose ( mWindowPtr ) ;   mWindowPtr = 0 ;   }   }     } 
public class Peer {       public VersionMessage getVersionMessage ( ) {   return versionMessage ;   }       } 
public class DebugFlags {   public static final boolean COOKIE_SYNC_MANAGER = false ;   public static final boolean TRACE_API = false ;   public static final boolean TRACE_CALLBACK = false ;   public static final boolean TRACE_JAVASCRIPT_BRIDGE = false ;   public static final boolean URL_UTIL = false ;   public static final boolean WEB_SYNC_MANAGER = false ;     } 
public final class Response {                 public String getContentLanguage ( ) {     } } 
public class DrawerLayout extends ViewGroup { public void test ( ) { {   if ( mListener != null ) {   mListener . onDrawerClosed ( drawerView ) ;   }   sendAccessibilityEvent ( AccessibilityEvent . TYPE_WINDOW_STATE_CHANGED ) ;   }   }     } 
public final class Resources {     public String toString ( ) { {   return " Resources . newByteSource ( " + url + " ) " ;   }   }     } 
public class ThreadRenamingRunnable implements Runnable { public void test ( ) {   try {   currentThread . setName ( threadName ) ;   renamed = true ;   } catch ( Exception e ) {     }     } } 
public class ConversationFragment extends Fragment {     public void success ( Contact contact ) {   activity . encryptTextMessage ( message ) ;   }     } 
public class Http11AprProcessor implements ActionHook { public void test ( ) {     error = false ;   keepAlive = true ;   int keepAliveLeft = maxKeepAliveRequests ;     } } 
public class DownloadStatus {   public DownloadStatus ( FeedFile feedfile , String title ) {   this . feedfile = feedfile ;   this . title = title ;   }     } 
import buildcraft . BuildCraftBuilders ;   import buildcraft . core . ItemBuildCraft ;   import buildcraft . core . blueprints . BptBase ;   import net . minecraft . src . Entity ;   import net . minecraft . src . ItemStack ;   import net . minecraft . src . World ;     
public class SecureNio2Channel extends Nio2Channel {   public void reset ( AsynchronousSocketChannel channel , SocketWrapperBase < Nio2Channel > socket )   throws IOException {   super . reset ( channel , socket ) ;   sniComplete = false ;   handshakeComplete = false ;   closed = false ;     } } 
import org . gradle . platform . base . TransformationFileType ;             public class JvmResources implements TransformationFileType { public void test ( ) {   }     } 
public class DirectRequestDispatcherUtil { public void test ( ) {   if ( pos != - 1 ) {   queryString = fullPath . substring ( pos + 1 ) ;   fullPath = fullPath . substring ( 0 , pos ) ;   }     } } 
public class SchematicToBuild {   public Schematic getSchematic ( ) {   if ( schematic == null ) {   return schematic ;   } else {   return new SchematicMask ( false ) ;   }   }     } 
public final class Constants {         public static final boolean ASTRID_LITE = true ;         } 
package spark . embeddedserver ;     public class NotSupportedException extends RuntimeException {           } 
import com . hazelcast . nio . Address ;         class Router {   private final LoadBalancer loadBalancer ;     } 
public class UndertowConnector implements Connector {     public boolean isReverse ( ) {   return true ;   }       } 
public class CxxBuckConfig {   public CxxCompilationDatabaseFormat getCompilationDatabaseFormat ( ) { {   return delegate   . getEnum ( cxxSection , " compilation_database_format " , CxxCompilationDatabaseFormat . class )   . or ( CxxCompilationDatabaseFormat . NUCLIDE ) ;   }   }     } 
public class OutputChannel extends Channel { public void test ( ) {     if ( buffer . size ( ) == 0 ) {   return ;   }     } } 
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParen           { public Behavior getBehavior ( ) { {   return mBehavior ;   }     } } 
public class ClipboardManager extends android . text . ClipboardManager {     public boolean hasText ( ) {   try {   return getService ( ) . hasPrimaryClip ( ) ;   } catch ( RemoteException e ) {   return false ;   }     } } 
public class RedissonLockEntry {   public RedissonLockEntry ( Promise < Boolean > promise ) {   super ( ) ;   this . latch = new Semaphore ( 1 ) ;   this . promise = promise ;   }     } 
import org . junit . Test ;   import cucumber . runtime . RuntimeOptions ;         public class RuntimeOptionsFactoryTest   { public void test ( ) {       } } 
public class FlowManager {     public static synchronized void destroy ( ) {   context = null ;   }       } 
public class AccessCanBeTightenedInspection extends BaseJavaBatchLocalInspection       { public String getGroupDisplayName ( ) { {   return GroupNames . CLASS_LAYOUT_GROUP_NAME ;   }       } } 
public final class Settings {     public static final String [ ] CLONE_TO_MANAGED_PROFILE = {   DATE_FORMAT ,   TIME_12_24   } ;     } 
public class CodeFormatterFacade implements Constants {     private boolean useNewFormatter ( FileType fileType ) {   return true ;   }   private ASTNode processRange ( ASTNode element , int [ ] bounds ) {     } } 
public class MetaDataMappingService extends AbstractComponent {     public void onAckTimeout ( ) {   listener . onResponse ( new ClusterStateUpdateResponse ( true ) ) ;   }       } 
final class ActivityStack { public void test ( ) {   mWindowManager . moveTaskToTop ( tr . taskId ) ;   mStackSupervisor . resumeTopActivitiesLocked ( ) ;   EventLog . writeEvent ( EventLogTags . AM_TASK_TO_FRONT , tr . userId , tr . taskId ) ;     } } 
public class BroadcastFilterTest {     }   private final static class Filter implements BroadcastFilter {   final String msg ;     } 
public class BinaryMapIndexReader {   ;       private final RandomAccessFile raf ;   protected final File file ;       } 
public class Tmp { public interface Exchange {   String GROUPED_EXCHANGE = " CamelGroupedExchange " ;   String HTTP_CHARACTER_ENCODING = " CamelHttpCharacterEncoding " ;   String HTTP_METHOD = " CamelHttpMethod " ;   String HTTP_PATH = " CamelHttpPath " ;     } } 
public class ActionBarView extends AbsActionBarView {     public void setLogo ( int resId ) {   mContext . getResources ( ) . getDrawable ( resId ) ;   }       } 
public class AccessibilityNodeInfo implements Parcelable { public void test ( ) {   }                 } 
public class BlockInStream extends InStream {   private InputStream mCheckpointInputStream = null ;   private long mCheckpointReadByte ;   private boolean mClosed = false ;   BlockInStream ( TachyonFile file , ReadType readType , int blockIndex ) throws IOException {     } } 
public class addAccount extends Activity { public void test ( ) {   boolean success = false ;   if ( blogName == " " ) {   blogName = " ( No Blog Title ) " ;   }   boolean wpcomFlag = false ;     } } 
public class FileTypeIndex extends ScalarIndexExtension < FileType >     { public boolean dependsOnFileContent ( ) { {   return true ;   }       } } 
import java . util . Arrays ;   import java . util . List ;   import javax . security . auth . login . LoginContext ;   import javax . security . auth . login . LoginException ;   import org . apache . catalina . Realm ;     
public class EntityMechanicalArm extends Entity implements IEntityAdditionalSpaw   { public EntityMechanicalArm ( World world ) {   super ( world ) ;   Thread . dumpStack ( ) ;   makeParts ( world ) ;     dataWatcher . addObject ( 2 , 1 ) ;     } } 
public class PyExtractSuperclassDialog extends UpDirectedMembersMovingDialog {     protected String getHelpId ( ) {   return " refactoring . extract . superclass . dialog " ;   }       } 
public class Authentication extends Model {   private boolean valid ;   public boolean isValid ( ) {   return valid ;   }     } 
public abstract class PGL {     public void enableFBOLayer ( ) {   fboLayerEnabledReq = true ;   }     } 
public class Http11NioProtocol extends AbstractHttp11JsseProtocol < NioChannel > {     public int getPollerThreadPriority ( ) {   return ( ( NioEndpoint ) getEndpoint ( ) ) . getThreadPriority ( ) ;   }     } 
public class DeltaRequest implements Externalizable { public void test ( ) {   }               } 
public class HighlightableComponent extends JComponent { public void test ( ) {     FontMetrics defFontMetrics = getFontMetrics ( getFont ( ) ) ;   if ( myText == null ) {     } } } 
public class HitTest { public void test ( ) {   o1 . setFilename ( " bar " ) ;   assertFalse ( o2 . equals ( o1 ) ) ;   assertFalse ( o1 . equals ( o2 ) ) ;   }       } 
public class HomeActivity extends Activity {     boolean mExpanded = true ;       public void onResume ( ) {   super . onResume ( ) ;     } } 
import cpw . mods . fml . common . registry . LanguageRegistry ;   public class ModLoader   {           } 
import java . io . File ;   public class GroovycTask   extends CompileTaskSupport   {   private boolean force ;   public void setForce ( final boolean flag ) {   this . force = flag ;     } } 
public class ImageWallpaper extends WallpaperService {   private static final boolean DEBUG = false ;   static final boolean FIXED_SIZED_SURFACE = true ;   static final boolean USE_OPENGL = false ;   WallpaperManager mWallpaperManager ;     } 
public class View implements Drawable . Callback2 , KeyEvent . Callback , Accessibilit       { public void setBackgroundDrawable ( Drawable d ) {   boolean requestLayout = false ;   mBackgroundResource = 0 ;     } } 
public class FileListListAdapter extends BaseAdapter implements ListAdapter { public void test ( ) { { {   }   }     break ;   }     } 
public class MenuDrawer extends ViewGroup { public void test ( ) { {   Bundle state = ( Bundle ) in ;   final boolean menuOpen = state . getBoolean ( STATE_MENU_VISIBLE ) ;   setContentLeft ( menuOpen ? mMenuWidth : 0 ) ;   }   }     } 
public class HistoryEntry { public void test ( ) {   if ( date != null ) {   this . date = ( Date ) date . clone ( ) ;   } else {   date = null ;   }   }     } 
public class DataFlowRunner { public void test ( ) { {   for ( DfaVariableValue value : vars ) {   copy . flushDependencies ( value ) ;   }   return copy ;   }   }     } 
import android . graphics . Bitmap ;     public class WebHistoryItem implements Cloneable {         }        
public class TextIconGenerator { public void test ( ) {   switch ( style ) {   case STYLE_DEFAULT :   case STYLE_WHITE :   return R . drawable . bubble_white ;   case STYLE_RED :   case STYLE_BLUE :   case STYLE_GREEN :     } } } 
public class AstCache {   public void close ( ) {   parser . close ( ) ;   clearDiskCache ( ) ;   }     } 
public class ApplicationServletRegistration     { public String getClassName ( ) { {   return wrapper . getServletClass ( ) ;   }}     public String getInitParameter ( String name ) {     } } 
public class PortletKeys {   public static final String DOCUMENT_LIBRARY_DISPLAY = " 110 " ;   public static final String DOCUMENT_SELECTOR =   " com_liferay_documentselector_web_portlet_DocumentSelectorPortlet " ;   public static final String DYNAMIC_DATA_LIST_DISPLAY = " 169 " ;     } 
public class NodePencil implements Tool {   public NodePencil ( ) {     color = Color . BLACK ;   size = 1f ;   }   public void select ( ) {     } } 
public class BatteryProperty implements Parcelable {   public static final int BATTERY_PROP_CHARGE_COUNTER = 1 ;   public static final int BATTERY_PROP_CURRENT_NOW = 2 ;   public static final int BATTERY_PROP_CURRENT_AVG = 3 ;   public int valueInt ;     } 
public interface CommonClassNames { public void test ( ) {   String CLASS_FILE_EXTENSION = " . class " ;   String JAVA_LANG_STRING_SHORT = " String " ;   }     } 
  package zmq ;   import java . util . ArrayList ;   import java . util . Iterator ;   import java . util . Map ;   import java . util . Map . Entry ;     
public class DataStructures {   private static Integer [ ] unsorted = null ;   private static String string = null ;   private static boolean debug = false ;   private static boolean debugTime = true ;   public static void main ( String [ ] args ) {     } } 
public class TestsuiteSanityTestCase { public void test ( ) {   }     } 
public class ContextConfig implements LifecycleListener {     private String getJaspicAppContext ( ) {   return context . getServletContext ( ) . getVirtualServerName ( ) + " " + context . getPath ( ) ;   }     } 
public class MenuDrawer extends ViewGroup { public void test ( ) { {   break ;     }   }     } 
public class Tmp { public enum Material {   NETHER_BRICK ( 112 ) ,   NETHER_FENCE ( 113 ) ,   NETHER_BRICK_STAIRS ( 114 ) ,   NETHER_WATER ( 115 ) ,   ENCHANTMENT_TABLE ( 116 ) ,   BREWING_STAND ( 117 ) ,   CAULDRON ( 118 ) ,     } } 
public class DrawableContainer extends Drawable implements Drawable . Callback {   private long mExitAnimationEnd ;   private Drawable mLastDrawable ;   private Insets mInsets ;       } 
import java . lang . reflect . Field ;     public abstract class AbstractViewModel {   public void unsubscribe ( ) { {   }   }     } 
public class EditPostActivity extends Activity {   private static int PAGE_SETTINGS = 1 ;   private static int PAGE_PREVIEW = 2 ;   private static final int AUTOSAVE_INTERVAL_MILLIS = 30000 ;   private Handler mAutoSaveHandler ;       } 
import java . util . regex . Pattern ;               public class DefaultGroovyMethods { public void test ( ) {     } } 
public abstract class BSONReader implements Closeable {     }   protected enum State {           } 
public class AsmClassGenerator extends ClassGenerator {     public void visitTryCatchFinally ( TryCatchStatement statement ) {   onLineNumber ( statement , " visitTryCatchFinally " ) ;   visitStatement ( statement ) ;   MethodVisitor mv = controller . getMethodVisitor ( ) ;   CompileStack compileStack = controller . getCompileStack ( ) ;     } } 
class DatabaseHelper extends SQLiteOpenHelper {   private void executeSqlScript ( SQLiteDatabase db , String file ) {   Log . d ( Params . LOGGING_TAG , file ) ;   }   private static void createTable ( SQLiteDatabase db , Class < ? extends ActiveRecordBase < ? > > table ) {     } } 
import net . minecraft . src . ItemStack ;   public class LiquidManager {   public static LinkedList < LiquidData > liquids = new LinkedList < LiquidData > ( ) ;   public static LiquidStack getLiquidForFilledItem ( ItemStack filledItem ) {     } } 
public class LambdaExpression { public void test ( ) {   if ( formalParamCount > argCount ) {   throw new ELException ( Util . message ( context ,   " error . lambda . args . tooFew " ,   Integer . valueOf ( argCount ) ,   Integer . valueOf ( formalParamCount ) ) ) ;   }     } } 
public class ParserAnnotator implements Annotator {     public Set < Requirement > requires ( ) {   return TOKENIZE_AND_SSPLIT ;   }       } 
public class ExportImportImpl implements ExportImport { public void test ( ) {   portletDataContext . addReferenceElement (   entityStagedModel , entityElement , fileEntry ,   FileEntry . class ,   PortletDataContext . REFERENCE_TYPE_DEPENDENCY ,   ! exportReferencedContent ) ;     } } 
public class TestBatchInsert       { public void makeSureLoopsCanBeCreated ( )   {   BatchInserter graphDb = newBatchInserter ( ) ;     } } 
import tachyon . worker . WorkerContext ;     public final class LocalTachyonCluster extends AbstractLocalTachyonCluster {   private LocalTachyonMaster mMaster ;   private TachyonConf mClientConf ;         } 
import android . app . FragmentManager ;   import android . content . Context ;   import android . support . v13 . app . FragmentPagerAdapter ;     public class SampleAdapter extends FragmentPagerAdapter {   Context ctxt = null ;     } 
public class ProtocolProviderServiceJabberImpl     { public SmackServiceNode getJingleNodesServiceNode ( )   { {   return jingleNodesServiceNode ;   }       } } 
package com . ning . billing . account ;   import com . ning . billing . KillbillTestSuite ;   public class AccountTestSuite extends KillbillTestSuite {   }     
public class Auth     { public static void setup ( )   {   setupAuthKeyspace ( ) ;   setupUsersTable ( ) ;     } } 
public class NotificationCompat { public void test ( ) {   CharSequence mContentInfo ;   int mNumber ;   int mPriority ;   boolean mShowWhen ;   boolean mUseChronometer ;   Style mStyle ;   CharSequence mSubText ;     } } 
public abstract class MasterDetailsComponent implements Configurable , DetailsCom     { public JComponent createComponent ( ) {   reInitWholePanelIfNeeded ( ) ;   updateSelectionFromTree ( ) ;     } } 
public final class Multimaps { public void test ( ) {     }       } 
class EmbeddedChannel extends AbstractChannel {       protected int doRead ( ) throws Exception {   return 0 ;   }     }
import java . util . Random ;     public class ControlledRandom extends Random {   public ControlledRandom ( ) {   super ( ) ;   }         } 
public class SingleInspectionProfilePanel extends JPanel {     protected void onScopeAdded ( ) {   updateOptionsAndDescriptionPanel ( ) ;   }   } ;     
public class MyListActivity extends ListActivity {   String [ ] bestFoods ;     MyBaseAdapter adapter ;     protected void onCreate ( Bundle savedInstanceState ) {     } } 
public class ListScrollingUtil { public void test ( ) {   Rectangle cellBounds = list . getCellBounds ( top , bottom ) ;   if ( cellBounds != null ) {   cellBounds . x = 0 ;   cellBounds . y = 0 ;   list . scrollRectToVisible ( cellBounds ) ;   }   }     } 
public class GroupRole extends BaseIdentifiable {     public boolean isAnyone ( ) {   return groupId == ANYONE_GROUP_ID ;   }       } 
public class SubscriptionInfo implements Parcelable {   private CharSequence mDisplayName ;             private CharSequence mCarrierName ;     } 
public class TCKTest { public void test ( ) { {   Config conf = FluxMain . buildConfig ( topologyDef ) ;   StormTopology topology = FluxMain . buildTopology ( topologyDef ) ;   assertNotNull ( topology ) ;     }   }     } 
public class IconTag extends IncludeTag { public void test ( ) { {   id = PortalUtil . generateRandomKey ( request , IconTag . class . getName ( ) ) ;   }   return id ;   }     } 
package org . json ;               public class JSONException extends RuntimeException { public void test ( ) {       } } 
public abstract class Constant {         public String toString ( ) {   return " [ " + tag + " ] " ;     } } 
public class SPTWalker { public void test ( ) {     if ( speed > avgSpeed )   speed = avgSpeed ;   speed = avgSpeed ;   }       } 
public class LayoutManager extends RecyclerView . LayoutManager { public void test ( ) {   isHeader = a . getBoolean (   R . styleable . superslim_LayoutManager_slm_isHeader ,   false ) ;   headerDisplay = a . getInt (   R . styleable . superslim_LayoutManager_slm_headerDisplay ,   DEFAULT_HEADER_DISPLAY ) ;     } } 
public class PhoneStatusBar extends BaseStatusBar {     public void createAndAddWindows ( ) {   addStatusBarWindow ( ) ;   addExpandedWindow ( ) ;   }   private void addStatusBarWindow ( ) {     } } 
public class Main { public void test ( ) {   if ( options . has ( HELP ) ) {   parser . printHelpOn ( System . out ) ;   }   configureLogger ( options ) ;     } } 
public class FindMethodDuplicatesTest extends LightCodeInsightTestCase {     protected Sdk getProjectJDK ( ) {   return JavaSdkImpl . getMockJdk ( " java 1 . 5 " ) ;   }   private void doTest ( ) throws Exception {     } } 
class IInputMethodSessionWrapper extends IInputMethodSession . Stub     { public void executeMessage ( Message msg ) {   switch ( msg . what ) {   case DO_FINISH_INPUT :   mInputMethodSession . finishInput ( ) ;     } } } 
public class BatteryProperty implements Parcelable {     public static final int BATTERY_PROP_CHARGE_COUNTER = 1 ;   public static final int BATTERY_PROP_CURRENT_NOW = 2 ;   public int valueInt ;     } 
public class TestTomcatClassLoader extends TomcatBaseTest {   private static final class ClassLoaderReport extends HttpServlet {   private static final long serialVersionUID = 1L ;   ClassLoader custom ;   public ClassLoaderReport ( ClassLoader custom ) {   this . custom = custom ;     } } } 
package org . geometerplus . android . fbreader ;   import java . util . LinkedList ;   import android . app . SearchManager ;   import android . content . Intent ;   import android . net . Uri ;   import android . os . Bundle ;     
public class NetworkIdentity {     public int hashCode ( ) {   return Objects . hashCode ( mType , mSubType , mSubscriberId ) ;   }       } 
      public class PlaceHolder {     } 
public class TestDistributeConfigSerialization extends AbstractServerClusterTest     { public void test ( ) throws Exception { {   init ( 2 ) ;   execute ( ) ;   }     } } 
import junit . framework . TestCase ;   import edu . stanford . nlp . parser . lexparser . LexicalizedParser ;   import edu . stanford . nlp . tagger . maxent . MaxentTagger ;   import org . junit . Test ;         
public class FMLCommonHandler   { public boolean shouldServerBeKilledQuietly ( )   { {   return sidedDelegate . shouldServerShouldBeKilledQuietly ( ) ;   }     } } 
public class ShadowTextView extends ShadowView {     public void setText ( int textResourceId ) {   this . text = getResources ( ) . getText ( textResourceId ) ;   System . out . println ( text ) ;   }       } 
public class CallbackProxy extends Handler implements EventSender , LayoutTestCon     { public void clearAllDatabases ( ) {   WebStorage . getInstance ( ) . deleteAllDatabases ( ) ;   }   public void setDatabaseQuota ( long quota ) {     } } 
import antlr . LexerSharedInputState ;             public class UnicodeLexerSharedInputState extends LexerSharedInputState {   private final UnicodeEscapingReader escapingReader ;     } 
public class SpringLoadedPositionManager implements PositionManager { public void test ( ) { { {   }   }   return null ;   }     } 
public class DatePicker extends FrameLayout { public void test ( ) {   mYear = ss . getYear ( ) ;   mMonth = ss . getMonth ( ) ;   mDay = ss . getDay ( ) ;   }       } 
public class Tmp { public enum BSONType {   MAX_KEY ( 0x7f ) ;   private static final BSONType [ ] LOOKUP_TABLE = new BSONType [ MIN_KEY . getValue ( ) + 1 ] ;     private final int value ;   static {     } } } 
import tachyon . conf . TachyonConf ;   public final class Version {   public static final String VERSION ;   private Version ( ) { }   static {   TachyonConf tachyonConf = new TachyonConf ( ) ;     } } 
public class Stage extends InputAdapter implements Disposable {   public void reset ( ) { { {   listenerActor = null ;   listener = null ;   }   }   }     } 
public class GenericExporter { public void test ( ) {   }                 } 
import tachyon . TachyonURI ;   import tachyon . conf . TachyonConf ;   import tachyon . thrift . InvalidPathException ;   import tachyon . underfs . UnderFileSystem ;   import sun . misc . Cleaner ;   import sun . nio . ch . DirectBuffer ;     
package org . graylog2 . messagehandlers . gelf ;   import java . io . IOException ;   import java . net . DatagramPacket ;   import java . util . concurrent . ExecutorService ;   import java . util . concurrent . Executors ;     
import io . realm . RealmChangeListener ;   import io . realm . RealmList ;   public class ParameterizedTestExample extends AndroidTestCase {   private Realm realm ; }
public class ResourceBundleRenameUtil {     public boolean checkInput ( final String inputString ) {   return inputString . indexOf ( ' . ' ) < 0 ;   }       } 
public class ThemePreviewFragment extends Fragment { public void test ( ) {   mWebView . getSettings ( ) . setCacheMode ( WebSettings . LOAD_NO_CACHE ) ;   mWebView . getSettings ( ) . setSavePassword ( false ) ;   loadAuthenticatedUrl ( previewURL ) ;     } } 
public class MediaPlayer               { public native boolean isPlaying ( ) ;     } 
public abstract class WsRemoteEndpointImplBase implements RemoteEndpoint {           private static class OutputBufferFlushSendHandler implements SendHandler {     } } 
package tachyon . master . next . filesystem ;   import java . io . FileNotFoundException ;   import java . io . IOException ;   import java . util . ArrayList ;   import java . util . Collections ;     
public class PApplet extends Activity implements PConstants , Runnable {   public void onDestroy ( ) {   System . out . println ( " PApplet . onDestroy ( ) called " ) ;   super . onDestroy ( ) ;   }     } 
public class XmppConnectionService extends Service {     public void deleteAccount ( Account account ) {   Log . d ( LOGTAG , " called delete account " ) ;   if ( account . getXmppConnection ( ) != null ) {   this . disconnect ( account , true ) ;   }     } } 
public class MapConfig implements DataSerializable {   private StorageType storageType = null ;   private boolean statisticsEnabled = false ;   public enum InMemoryFormat {   BINARY , OBJECT , CACHED     } } 
public class RedissonConcurrentMapTest extends BaseConcurrentTest { public void test ( ) { {   }   assertMapSize ( 5 , name ) ;   redisson . getKeys ( ) . flushdb ( ) ;   redisson . shutdown ( ) ;   }       } 
public class PSurfaceNEWT implements PSurface { public void test ( ) { {   System . err . println ( " 3 . set size " ) ;   sketchWidth = sketch . width = width ;   sketchHeight = sketch . height = height ;   }   }     } 
public class MockFactory < T > { public void test ( ) {       enhancer . setClassLoader ( MockFactory . class . getClassLoader ( ) ) ;   return enhancer ;     } } 
public class StreamStateMachine {   public synchronized void closeIfIdle ( ) {   if ( state == State . IDLE ) {   state = State . CLOSED_FINAL ;   }   }     } 
public class VideoEditorImpl implements VideoEditor { public void test ( ) {     int height = 480 ;   int width = 854 ;   switch ( getAspectRatio ( ) ) {   case MediaProperties . ASPECT_RATIO_3_2 :   width = 720 ;   break ;     } } } 
class InstallPluginCommand extends CliTool . Command { public void test ( ) { { {   zipInput . closeEntry ( ) ;   }   }   return target ;   }     } 
public class DataStructures {   private static Integer [ ] unsorted = null ;   private static String string = null ;   private static boolean debug = false ;   private static boolean debugTime = true ;   public static void main ( String [ ] args ) {     } } 
public final class AnimChannel { public void test ( ) { { {   }   }   animation = null ;     notified = false ;   }     } 
public class MustacheWriter extends Writer {   private static ExecutorService es = Executors . newCachedThreadPool ( ) ;   private Writer writer ;   protected MustacheWriter ( Writer writer ) {   this . writer = writer ;   }     } 
public class GraphCommitCellRender extends AbstractPaddingCellRender {     private GraphCommitCell getAssertGraphCommitCell ( Object value ) {   assert value instanceof GraphCommitCell ;   return ( GraphCommitCell ) value ;   }     } 
public class JSError {   public final String sourceName ;     final Node node ;     public final int lineNumber ;     } 
public class ImportingJob implements Jsonizable { public void test ( ) {   JSONUtilities . safePut ( cfg , " hasData " , false ) ;   this . config = cfg ;   dir . mkdirs ( ) ;   }     } 
public class ProcessorUtility implements ControllerListener {     public synchronized boolean waitForState ( Processor processor , int state )   {   System . out . println ( " d1 " ) ;   processor . addControllerListener ( this ) ;   setFailed ( false ) ;     } } 
public class KeyguardUpdateMonitor { public void test ( ) {     mSimState = IccCard . State . READY ;   mBatteryStatus = BATTERY_STATUS_FULL ;   mBatteryLevel = 100 ;   mTelephonyPlmn = getDefaultPlmn ( ) ;     } } 
import org . apache . commons . lang . builder . HashCodeBuilder ;     public class FieldModifiers {   String one ;   String two ;   protected String three ;   private String four ;     } 
class TemplateParser {     protected void onValue ( DbSqlBuilder sqlBuilder , String expression ) {   sqlBuilder . value ( expression ) ;   }     } 
import com . liferay . portal . kernel . exception . PortalException ;         public class ReservedUserScreenNameException extends PortalException {   public ReservedUserScreenNameException ( ) {     } } 
public class ImageListActivity extends AbsListViewBaseActivity { public void test ( ) { {   if ( firstDisplay ) {   FadeInBitmapDisplayer . animate ( imageView , 500 ) ;   displayedImages . add ( imageUri ) ;   } else {   imageView . setImageBitmap ( loadedImage ) ;   }   }   }     } 
public final class EmbeddedNeo implements NeoService   { public EmbeddedNeo ( String storeDir )   { {     }       } } 
public class DrmManagerClient {     public int acquireRights ( DrmInfoRequest drmInfoRequest ) {   DrmInfo drmInfo = acquireDrmInfo ( drmInfoRequest ) ;   return processDrmInfo ( drmInfo ) ;   }     } 
public class TouchFeedbackDrawable extends LayerDrawable { public void test ( ) {   if ( mActiveRipplesCount >= MAX_RIPPLES ) {   Log . e ( LOG_TAG , " Max ripple count exceeded " , new RuntimeException ( ) ) ;   }   final Ripple ripple = mTouchedRipples . get ( id ) ;     } } 
public abstract class MasterBase implements Master {   protected boolean isLeaderMode ( ) {   return mIsLeader ;   }     protected boolean isStandbyMode ( ) {   return ! mIsLeader ;   }     } 
public class FastArray implements Cloneable {   public Object [ ] getArray ( ) {   return data ;   }   }     
import rx . plugins . RxJavaPlugins ;         public class Schedulers {   private final Scheduler computationScheduler ;   private final Scheduler ioScheduler ;     } 
public class Allocation extends BaseObj { public void test ( ) {   if ( typeID != 0 ) {   mType = new Type ( typeID , mRS ) ;   mType . updateFromNative ( ) ;   }   }     } 
public class ActivityStack { public void test ( ) { {   }   if ( w > 0 ) {   return mService . mWindowManager . screenshotApplications ( w , h ) ;   }   return null ;   }     } 
public abstract class TWLayoutManager extends LayoutManager {     public void scrollToPosition ( int position ) {   Log . d ( " BOOM " , " scrollToPosition called : " + position ) ;   scrollToPositionWithOffset ( position , 0 ) ;   }     } 
public class S3Client { public void test ( ) { { {   }   }         }     } 
public class MockBlock extends Block   {   public MockBlock ( int id )   { {   super ( id , Material . field_1316_v ) ;   }   }     } 
public class OtpsEvaluatedIndividual {   private OtpsIndividual individual ;     private long time ;   private int boardings ;     } 
public class NewLineBlocksIterator implements Iterator < Block > {     public void remove ( ) { {   }   }     } 
public class JazzyViewPager extends ViewPager { public void test ( ) { { {   ViewHelper . setScaleY ( right , mScale ) ;   ViewHelper . setTranslationX ( right , mTrans ) ;   }   }   }     } 
public final class GitPusher { public void test ( ) { { {   break ;   }   }   return pushResult ;   }     } 
public class ConcurrentMapConfiguration extends AbstractConfiguration {       protected final void addPropertyDirect ( String key , Object value ) {   props . put ( key , value ) ;   }     } 
public class ZooClient extends AbstractZooKeeperManager     { public void shutdown ( )   { {   this . shutdown = true ;   super . shutdown ( ) ;   }     } } 
import static com . zegoggles . smssync . App . TAG ;   public class ThreadHelper {   private Class telephonyThreads ;   private Method getOrCreateThreadId ;   private boolean threadsAvailable = true ;     } 
public class ShadowAdapterView extends ShadowViewGroup {       public Object getSelectedItem ( ) {   int pos = getSelectedItemPosition ( ) ;   return getItemAtPosition ( pos ) ;   }     } 
public final class GnssStatus {       public float getElevationDegrees ( int satIndex ) {   return 0f ;   }       } 
public class ServletRequestWrapper implements ServletRequest {     public void addAsyncListener ( AsyncListener listener ,   ServletRequest servletRequest , ServletResponse servletResponse ) {   addAsyncListener ( listener , servletRequest , servletResponse ) ;   }       } 
import java . util . Date ;   import android . app . Activity ;   import android . os . Bundle ;   import android . view . KeyEvent ;   import android . widget . TextView ;   import com . googlecode . androidannotations . annotations . EActivity ;     
public class BatteryStatsImpl extends BatteryStats {       public LongSamplingCounter getIdleTimeCounter ( ) {   return mRxTimeMillis ;   }       } 
class SwitchProfileAction extends FBAction {   public void run ( ) { {   Reader . setColorProfileName ( myProfileName ) ;   Reader . repaintView ( ) ;   }   }     } 
public final class HandlerScheduler extends Scheduler {   static class HandlerWorker extends Worker {   private final Handler handler ;   private final CompositeSubscription compositeSubscription = new CompositeSubscription ( ) ;     } } 
public final class ReinitializeFileEntry extends JournalEntry {               public long getTTL ( ) {     } } 
public class GitVcs extends AbstractVcs < CommittedChangeList > {       public GitVersion getVersion ( ) {   return myVersion ;   }     } 
class InterceptedInvocation implements Invocation , VerificationAwareInvocation {     public int hashCode ( ) {   return 1 ;   }     } 
public abstract class AbstractAndroidMojo extends AbstractMojo {             private Sdk sdk ;     } 
public class PGraphicsOpenGL extends PGraphics {   protected void reinitPrimary ( ) {   lightsAllocated = false ;   matricesAllocated = false ;     allocate ( ) ;       } } 
import buildcraft . transport . BlockGenericPipe ;   import buildcraft . transport . Gate ;   import buildcraft . transport . GateVanilla ;   import buildcraft . transport . Pipe ;   import buildcraft . transport . Gate . GateKind ;   import net . minecraft . src . Block ;   import net . minecraft . src . ItemStack ;     
public class BSONBinaryWriterTest {     public void testWriteObjectId ( ) {   final ObjectId id = ObjectId . massageToObjectId ( " 50d3332018c6a1d8d1662b61 " ) ;   writer . writeStartDocument ( ) ;     } } 
public class ServiceBeanMethodInvocationFactoryImplTest { public void test ( ) {   EmailAddress emailAddress = EmailAddressUtil . create ( emailAddressId ) ;   emailAddress . setAddress ( address ) ;   return emailAddress ;     } } 
public class AccessorForPropertyDescriptor extends PropertyDescriptor { public void test ( ) { { {   super ( property , Collections . < AnnotationDescriptor > emptyList ( ) , Modality . FINAL , Visibilities . PUBLIC ,   false ,   false , Kind . DECLARATION ) ;   }   }   }     } 
public final class TimestampType         { public String getName ( )   {   return " timestamp " ;     } } 
public class MessageList   { public void test ( ) { {   finish ( ) ;     Accounts . listAccounts ( getApplicationContext ( ) ) ;   }   }     } 
package com . interview . tree ;   class Count { public void test ( ) {   int size ;   }     } 
public class JDBCStore extends StoreBase { public void test ( ) {                   } } 
final class ActivityRecord { public void test ( ) {   configDestroy = false ;   keysPaused = false ;   inHistory = false ;   visible = true ;   nowVisible = false ;   idle = false ;   hasBeenLaunched = false ;     } } 
public class Explode extends Visibility {   public Explode ( Context context , AttributeSet attrs ) {   super ( context , attrs ) ;   }   private void captureValues ( TransitionValues transitionValues ) {     } } 
public class IconDrawable extends Drawable {     public int getOpacity ( ) { {   return 255 ;   }   }     } 
public class AsyncHttpClientConfig {         public Builder addRequestFilter ( ResponseFilter responseFilter ) {   responseFilters . add ( responseFilter ) ;   return this ;   }     } 
public class DrawHandler extends Handler {     public long getCurrentTime ( ) {   if ( mInSeekingAction ) {   return mDesireSeekingTime ;   }     } } 
public class BikeRentalStationService {     public void addStation ( BikeRentalStation station ) {   stations . add ( station ) ;   }     } 
public class DB {       public void dropDatabase ( ) { {   database . commands ( ) . drop ( ) ;   }   }     } 
public class QueryOperators {   public static final String SIZE = " $ size " ;   public static final String EXISTS = " $ exists " ;   public static final String WHERE = " $ where " ;   }     
public class FileProjectManager extends ProjectManager { public void test ( ) { { { {   }   }   }   }       } 
public class NativeObjectManager { public void test ( ) { { {   }   }   refMap . clear ( ) ;   }       } 
public abstract class NanoHTTPD {   private final int myPort ;   private ServerSocket myServerSocket ;   private SSLServerSocketFactory sslServerSocketFactory ;     } 
import org . mockito . stubbing . Answer ;   public class ReturnsVoid implements Answer < Object > {     public Object answer ( InvocationOnMock invocation ) throws Throwable {   return null ;   }     } 
public class TwoWayView extends AdapterView < ListAdapter > {     }   private static class SavedState extends BaseSavedState {   int position ;   int offset ;     } 
public final class ContactsContract {         public static final String IS_READ_ONLY = " is_read_only " ;   }       
public abstract class Visibility extends Transition { public void test ( ) { {   if ( mIsForcedVisibility ) {   mView . setTransitionAlpha ( 0 ) ;   } else {   mView . setTransitionVisibility ( mFinalVisibility ) ;   }   }   }     } 
public class RunMojo             { public ActivityNotFoundException ( )   {     } } 
public class StringServletResponse extends HttpServletResponseWrapper { public void test ( ) {   _unsyncByteArrayOutputStream . reset ( ) ;   _unsyncStringWriter = new UnsyncStringWriter ( true ) ;   _printWriter = new PrintWriter ( _unsyncStringWriter ) ;   }     } 
public class FakeBase64 {     public static String encodeToString ( byte [ ] input , int flags ) { {   System . out . println ( " HELLO ! ! ! " ) ;   return new String ( input ) + " __fake_Base64_encode_string__ " + flags ;   }   }     } 
public class ExecutionDelayTest extends HazelcastTestSupport {   public static class Task implements Callable , Serializable {   private String uuid ;     } public Task ( ) {   }     } 
import org . junit . * ;   import water . * ;   import water . fvec . * ;   public class DRFClassificationTest extends TestUtil {    public static void stall ( ) { stall_till_cloudsize ( 1 ) ; } }    
package android . view ;   import android . animation . Animatable ;   import android . animation . Animator ;   import android . animation . ValueAnimator ;   import android . animation . TimeInterpolator ;     
public class KafkaUtils { public void test ( ) { { { {   }   }   }     ;   }     } 
public class Account implements BaseAccount   { public void test ( ) {   try   {   LocalStore localStore = getLocalStore ( ) ;   localStore . resetVisibleLimits ( getDisplayCount ( ) ) ;   }   catch ( MessagingException e )   {     } } } 
public class Mockito extends Matchers { public void test ( ) {   }                 } 
public class FilterInvocation {     public HttpServletResponse getHttpResponse ( ) {   return ( HttpServletResponse ) response ;   }       } 
public class PyPreFormatProcessor implements PreFormatProcessor { public void test ( ) { {   }   myRange = range ;   element . accept ( this ) ;   return element . getTextRange ( ) ;   }       } 
import java . io . * ;   import java . util . zip . Inflater ;   public class GELFServer {   private static final int MAX_PACKET_SIZE = 4096 ;   private DatagramSocket serverSocket = null ;     } 
public class CheckerTest   { public void testPackageNames ( ) throws CheckstyleException   {   final Checker c = new Checker ( ) ;         } } 
public class RotateAnimation3D extends Animation3D {   protected double mDegreesToRotate ;   protected double mRotateFrom ;   protected double mRotationAngle ;   protected double mRotateX , mRotateY , mRotateZ ;   protected Number3D mRotationAxis ;   protected Quaternion mQuat ;   protected Quaternion mQuatFrom ;     } 
public abstract class Structure {   public AutoAllocated ( int size ) { {   super ( size ) ;     clear ( ) ;   }   }     } 
public class MtpDatabase { public void test ( ) {   return new int [ ] {     MtpConstants . FORMAT_UNDEFINED ,   } ;   }     } 
class AndroidParcelableExtension implements TypeGenerationExtension {   private final Types types ;   public AndroidParcelableExtension ( Types types ) {   this . types = types ;   }     } 
public class ServletContextImpl implements ServletContext {     public String getServerInfo ( ) {   return null ;   }       } 
public class DeltaSession extends StandardSession implements Externalizable , Clus       { public void setId ( String id ) { {   super . setId ( id ) ;   resetDeltaRequest ( ) ;   }     } } 
final class DefaultChannelPipeline implements ChannelPipeline {     }   static abstract class HeadHandler implements ChannelOutboundHandler {   protected final Unsafe unsafe ;   ByteBuf byteSink ;     } 
package com . phonegap ;   import java . lang . reflect . Field ;     import android . os . Bundle ;   public class StandAlone extends DroidGap {     } 
public class ApplicationInitializerTest {   private FeatureToggleService featureToggleService ;     private CcTrayActivityListener ccTrayActivityListener ;       private ContextRefreshedEvent contextRefreshedEvent ;     } 
package tachyon . master ;   import java . io . File ;   import java . io . IOException ;   import java . net . InetSocketAddress ;   import java . util . ArrayList ;   import java . util . List ;     
public class ProjectCommandTest { public void test ( ) {   checkPredicate ( projectConfigPredicate , EMPTY_PARSE_DATA , javaLibraryRule , false ) ;   checkPredicate ( projectConfigPredicate , EMPTY_PARSE_DATA , ruleConfig , true ) ;     BuildCommandOptions buildOptions = command . buildCommandOptions ;   MoreAsserts . assertContainsOne (   buildOptions . getArguments ( ) , javaLibraryTargetName . getFullyQualifiedName ( ) ) ;     } } 
public class CypherPluginFunctionalTest implements GraphHolder     { public void startServer ( ) {   server = new WrappingNeoServerBootstrapper (   graphdb ) ;   server . start ( ) ;     } } 
public abstract class DataConnection extends HierarchicalStateMachine { public void test ( ) {   clearSettings ( ) ;   setDbg ( true ) ;   addState ( mDefaultState ) ;   addState ( mInactiveState , mDefaultState ) ;   addState ( mActivatingState , mDefaultState ) ;     } } 
package com . liferay . portal . model . impl ;     public class ReleaseImpl extends ReleaseBaseImpl {   public String getBundleSymbolicName ( ) {   return getServletContextName ( ) ;   }     } 
public class WriteResult {                 public int getN ( ) {     } } 
public class ShadowView {   public void clearAnimation ( ) {   if ( animation != null ) {   animation . cancel ( ) ;   }   }     } 
import java . util . Set ;               final class PolymerPass extends AbstractPostOrderCallback implements HotSwapCompilerPass { public void test ( ) {     } } 
public final class SQLiteDebug {             public static class DbStats {       } } 
public abstract class TableRef {   public abstract String getName ( ) ;   public boolean isRoot ( ) {   return getName ( ) . isEmpty ( ) ;   }       } 
public class SortedQueryResultSet extends AbstractSet < Map . Entry > {     }   private class EmptyIterator implements Iterator {     public boolean hasNext ( ) {     } } 
public class FieldTripRequest extends GenericModel {   public List < FieldTripNote > notes ;     public String submitterNotes ;       } 
public final class PropertiesExpander             { public PropertiesExpander ( Properties properties ) {   if ( properties == null ) {     } } } 
public class Music extends BaseAudioEntity {     public void stop ( ) {   this . mMediaPlayer . stop ( ) ;   this . mMediaPlayer . seekTo ( 0 ) ;   }       } 
public class ScriptIntrinsicColorMatrix extends ScriptIntrinsic { public void test ( ) {   }                 } 
public abstract class AbstractChartView extends View implements Chart {     public void selectValue ( SelectedValue selectedValue ) {   chartRenderer . selectValue ( selectedValue ) ;   ViewCompat . postInvalidateOnAnimation ( this ) ;   }     } 
public abstract class Structure {         private int calculateSize ( boolean force ) {   return calculateSize ( force , false ) ;   }     } 
import io . airlift . configuration . Config ;   public class CompilerConfig   {   private boolean interpreterEnabled = true ;   private boolean useNewByteCodeGenerator = true ;   public boolean isInterpreterEnabled ( )   {     } } 
public class CharTableImpl implements CharTable {     }   private static class WeakCharEntryMap extends ReferenceMap {   public WeakCharEntryMap ( ) {   super ( ReferenceMap . WEAK , ReferenceMap . WEAK , true ) ;   }     } 
public final class JGroupsFilters { public void test ( ) { { { {   return true ;   }   } ;     }   }     } 
import groovy . text . SimpleTemplateEngine ;   import groovy . text . Template ;   import junit . framework . TestCase ;   import java . io . BufferedWriter ;   import java . io . IOException ;   import java . io . StringWriter ;   import java . io . Writer ;     
import android . content . Context ;   import android . content . ContextWrapper ;   import android . view . LayoutInflater ;   public class MortarContextWrapper extends ContextWrapper implements HasMortarScope {   private final MortarScope scope ;   private LayoutInflater inflater ;     } 
public final class Futures { public void test ( ) { { { {   }   }   }     }       } 
public class WordPress extends Application { public void test ( ) {   editor . putBoolean ( IS_SIGNED_OUT_PREFERENCE , true ) ;   editor . commit ( ) ;     wpDB . updateLastBlogId ( - 1 ) ;   currentBlog = null ;     } } 
import com . fasterxml . jackson . annotation . JsonProperty ;   public class RetryQueryRunnerConfig   {     private int numTries = 4 ;     private boolean returnPartialResults = false ;     } 
public class FirebirdDatabase extends AbstractDatabase {     public boolean supportsDDLInTransaction ( ) {   return true ;   }       } 
public class SubtasksTagListFragment extends TagViewFragment {     protected void refresh ( ) {   setUpTaskList ( ) ;   }     } 
import java . util . List ;   import java . util . Map ;   import java . util . UUID ;   import org . apache . commons . codec . binary . Base64 ;     import android . content . SharedPreferences ;   import android . util . Log ;     
public final class MenuItemImpl implements MenuItem {     public boolean expandActionView ( ) {   if ( hasCollapsibleActionView ( ) ) {   return false ;   }     } } 
public class BottomSheetLayout extends FrameLayout {   protected void onDetachedFromWindow ( ) {   super . onDetachedFromWindow ( ) ;   velocityTracker . clear ( ) ;   }       } 
public class JarFileUrlNestedJar implements Jar {     public InputStream getEntryInputStream ( ) throws IOException {   if ( jarInputStream == null ) {   createJarInputStream ( ) ;   }   return jarInputStream ;   }     } 
public class TransportStopsLayer extends OsmandMapLayer implements ContextMenuLa     { public boolean drawInScreenPixels ( ) { {   return false ;   }       } } 
class IdentityVirtualFilePointer implements VirtualFilePointer {     public VirtualFile getFile ( ) {   return myFile ;   }       } 
public class Shader {   public boolean getLocalMatrix ( Matrix localM ) {   if ( mLocalMatrix != null ) {   localM . set ( mLocalMatrix ) ;   return true ;   }   return false ;   }     } 
public class Node implements Writable {     public List children ( ) {   return this . children ( ) ;   }   public void addChild ( final Object child ) {     } } 
public abstract class AbstractSchedulerTests {     public void onError ( Throwable e ) {   completed . countDown ( ) ;   error . set ( e ) ;   }       } 
class ApplicationHttpRequest extends HttpServletRequestWrapper {       public String getPathTranslated ( ) {   return getServletContext ( ) . getRealPath ( getPathInfo ( ) ) ;   }     } 
public class NativeFormatPlugin extends FormatPlugin {     public void detectLanguageAndEncoding ( Book book ) {   detectLanguageAndEncodingNative ( book ) ;   book . save ( ) ;   }   public native void detectLanguageAndEncodingNative ( Book book ) ;     } 
abstract class BaseActivity extends Activity { public void test ( ) { {   onCurrentDirectoryChanged ( ANIM_NONE ) ;   onStackRestored ( mRestoredStack , mExternal ) ;     getDisplayState ( ) . restored = true ;   onCurrentDirectoryChanged ( ANIM_NONE ) ;   }   }     } 
public class BazelCppRuleClasses { public void test ( ) {   new String [ ] {   " cc_inc_library " ,   " cc_library " ,   } ;       } } 
public class PyFileElementType extends IStubFileElementType < PyFileStub > {     public int getStubVersion ( ) {   return 40 ;   }       } 
public class Circle implements Serializable , Shape {   public Vector3 getCenter ( ) { {   return new Vector3 ( x , y , 0 ) ;   }     } }
public class ListeningMultiSemaphore {     private boolean fairnessAllowsReordering ( ) {   return fairness == ResourceAllocationFairness . FAIR ;   }   }     
import org . mockito . exceptions . base . MockitoException ;   public class MockitoAnnotations { public void test ( ) {               } } 
import java . util . HashSet ;   import java . util . Hashtable ;   import java . util . Iterator ;   import java . util . List ;   import java . util . Map ;   import java . util . Set ;   import javax . naming . Context ;     
public class Select < T > implements Iterable { public void test ( ) {   return sql . toString ( ) ;   }   String getWhereClause ( ) {   return whereClause ;   }     } 
package processing . app . windows ;   import java . io . File ;   import java . io . UnsupportedEncodingException ;   import java . util . ArrayList ;   import processing . app . Base ;   import processing . app . Preferences ;     
public class SyncManager { public void test ( ) { { { {   Slog . v ( TAG , " Pushing back running sync due to a higher priority sync " ) ;   }   deferActiveSyncH ( asc ) ;   }   }   }     } 
import java . util . List ;           class RuleMatchesAsJsonSerializer {   private static final int API_VERSION = 1 ;     } 
package android . database . sqlite ;             public class DatabaseObjectNotClosedException extends RuntimeException   { public void test ( ) {     } } 
public class AppleTest extends AbstractBuildRule implements TestRule {   public ImmutableList < Step > getBuildSteps (   BuildContext context ,   BuildableContext buildableContext ) {   return null ;   }       } 
public class LabelPropertyRenderer < V > extends JLabel implements PropertyRenderer   { public LabelPropertyRenderer ( ) {   setOpaque ( true ) ;   }   public LabelPropertyRenderer ( String staticText ) {     } } 
public class ValueAnimator extends Animator { public void test ( ) {   mRunning = false ;   mStarted = false ;   mStartListenersCalled = false ;   }       } 
public class PJOGL extends PGL {     public void reshape ( GLAutoDrawable glDrawable , int x , int y , int w , int h ) {   getGL ( glDrawable ) ;   }   private void getGL ( GLAutoDrawable glDrawable ) {     } } 
public class WordPress extends Application { public void test ( ) {   EventBus . builder ( )   . logNoSubscriberMessages ( false )   . sendNoSubscriberEvent ( false )   . installDefaultEventBus ( ) ;   RestClientUtils . setUserAgent ( getUserAgent ( ) ) ;     } } 
public class CheckerTest   {   public BriefLogger ( OutputStream out )   {   super ( out ) ;   }   public void auditStarted ( AuditEvent evt ) { }   public void fileFinished ( AuditEvent evt ) { }     } 
public class CommonLVCS extends LocalVcs implements ProjectComponent , FileConten     { public synchronized void endAction ( LvcsActionImpl action ) {   checkOldLvcsEnabled ( ) ;   commitAllUnsavedDocuments ( ) ;   if ( LOG . isDebugEnabled ( ) ) {     } } } 
public class CDMAPhone extends PhoneBase { public void test ( ) {   CdmaCallTracker mCT ;   CdmaSMSDispatcher mSMS ;   CdmaServiceStateTracker mSST ;   RuimFileHandler mRuimFileHandler ;   RuimRecords mRuimRecords ;   RuimCard mRuimCard ;   ArrayList < CdmaMmiCode > mPendingMmis = new ArrayList < CdmaMmiCode > ( ) ;     } } 
public final class NioEventLoop extends SingleThreadEventLoop { public void test ( ) { {   logger . debug ( " Epoll - bug workaround enabled = " + EPOLL_BUG_WORKAROUND ) ;   }   }           } 
public abstract class DjangoManageTestTask extends PyExecutionFixtureTestTask { public void test ( ) {   task . setParameters ( parametersString . build ( ) ) ;   myProcessHandler = task . createProcess ( ) ;   myProcessHandler . addProcessListener ( createProcessListener ( ) ) ;     } } 
public class ViewTest {   public void testHasEmptyLayoutParams ( ) throws Exception {   DroidSugarAndroidTestRunner . addProxy ( View . class , FakeView . class ) ;   ViewGroup . LayoutParams layoutParams = new View ( null ) . getLayoutParams ( ) ;   assertThat ( layoutParams , notNullValue ( ) ) ;   }     } 
package org . wordpress . android . ui ;   import android . view . View ;   import android . content . Intent ;   abstract class MenuDrawerItem { public void test ( ) {       } } 
public class WikiSubscriptionLocalizedContentTest   extends BaseSubscriptionLocalizedContentTestCase {     public void setUp ( ) throws Exception {   super . setUp ( ) ;     } } 
final class DefaultPermissionGrantPolicy { public void test ( ) { {   grantRuntimePermissionsLPw ( wearHomePackage , PHONE_PERMISSIONS , true , userId ) ;   grantRuntimePermissionsLPw ( wearHomePackage , MICROPHONE_PERMISSIONS , false ,   userId ) ;   }   }     } 
public class HqlDomain {     public static class SimpleTypes {   long id ;   BigDecimal bigDecimal ;   Byte bbyte ;     } } 
public class PolishWordRepeatRule extends PolishRule {       public void reset ( ) {     }     } 
public class PeerEurekaNode { public void test ( ) {   cancelProcessor . shutdown ( ) ;   statusProcessor . shutdown ( ) ;   asgStatusProcessor . shutdown ( ) ;   }       } 
public class GitPushDialog extends DialogWrapper { public void test ( ) {   init ( ) ;   setOKButtonText ( " Push " ) ;   setTitle ( " Git Push " ) ;   }     } 
public class RemoteExportException extends PortalException {   public static final int NO_PERMISSIONS = 5 ;   public RemoteExportException ( int type ) {   _type = type ;   }     } 
public class MersenneRandom extends Random {       public double nextStandNormalDistrDouble ( ) {   return mersenne . nextGaussian ( ) ;   }     } 
public class BinaryDoubleExpressionHelper extends BinaryLongExpressionHelper {     protected ClassNode getNormalOpResultType ( ) {   return ClassHelper . long_TYPE ;   }       } 
public class CvsHistoryProvider implements VcsHistoryProvider {     public String getHelpId ( ) {   return " cvs . selectionHistory " ;   }       } 
import java . util . concurrent . ConcurrentHashMap ;               public class PresenceUpdateHandler extends BasicModule implements ChannelHandler { public void test ( ) {     } } 
public class TraversalRequirements { public void test ( ) { { {   return false ;   }   }   return e . getPermission ( ) . allows ( modes ) ;   }       } 
public class TitlePageIndicator extends View implements PageIndicator {   public void setFooterLineHeight ( float footerLineHeight ) {   mFooterLineHeight = footerLineHeight ;   invalidate ( ) ;   }     } 
public abstract class Conference implements IConferenceable {   private final List < Connection > mUnmodifiableConferenceableConnections =   Collections . unmodifiableList ( mConferenceableConnections ) ;   private PhoneAccountHandle mPhoneAccount ;   private AudioState mAudioState ;   private int mState = Connection . STATE_NEW ;   private DisconnectCause mDisconnectCause ;     } 
public class PortletServletRequest extends HttpServletRequestWrapper { public void test ( ) { { {   }   }     System . out . println ( name + " : " + retVal ) ;     return retVal ;   }     } 
public class AudioFormat { public void test ( ) {   switch ( audioFormat ) {   case ENCODING_PCM_8BIT :   return 1 ;   case ENCODING_PCM_16BIT :   case ENCODING_DEFAULT :   return 2 ;     } } } 
import java . util . Set ;     public class PointQuadTree < T extends PointQuadTree . Item > {   public static interface Item {   Point getPoint ( ) ;   }     } 
public abstract class HardwareRenderer {         private static final int PROFILE_MAX_FRAMES = 64 ;         } 
public class Tmp { public void test ( ) {         } } 
public class TachyonFile {   public void append ( byte b ) throws IOException {     mBuffer . put ( b ) ;   }     } 
package org . mockito ;   import org . mockito . internal . returnvalues . EmptyReturnValues ;       public class DefaultMockitoConfiguration implements IMockitoConfiguration {   public ReturnValues getReturnValues ( ) {     } } 
public class JarHell { public void test ( ) { { {   }   }   }     } 
public final class Settings {     public static final String CERT_PIN_UPDATE_METADATA_URL = " cert_pin_metadata_url " ;             } 
package a ;   public class A { public void test ( ) {   }     } 
import android . telephony . Rlog ;   public final class CellInfoLte extends CellInfo implements Parcelable {   private static final String LOG_TAG = " CellInfoLte " ;   private static final boolean DBG = true ;   private CellIdentityLte mCellIdentityLte ;   private CellSignalStrengthLte mCellSignalStrengthLte ;     } 
package org . mapdb ;   import com . sun . deploy . cache . CacheEntry ;     import java . lang . ref . ReferenceQueue ;   import java . lang . ref . SoftReference ;   import java . lang . ref . WeakReference ;     
public class LocalIndexesFragment extends OsmandExpandableListFragment { public void test ( ) { {   listAdapter . addLocalIndexInfo ( info ) ;   }   listAdapter . sortData ( ) ;   }   ActionBar actionBar = getDownloadActivity ( ) . getSupportActionBar ( ) ;       } 
public class Tmp { public interface Part {               } public String getSubmittedFileName ( ) ;     } 
public class Python2Target extends Target {     public String getVersion ( ) {   return " 4 . 5 " ;   }   public Set < String > getBadWords ( ) {     } } 
public class ConsoleConfigurable implements SearchableConfigurable , Configurable       { public String getDisplayName ( ) { {   return " Console Folding " ;   }       } } 
public class Graylog2Reporter extends ScheduledReporter {     public String buildShortMessage ( String name ) { {   return name ;   }   }     } 
import org . codehaus . groovy . runtime . InvokerInvocationException ;               public class GroovyMain { public void test ( ) {     } } 
public abstract class BuilderSupport extends GroovyObjectSupport {   protected Object getCurrent ( ) {   return current ;   }   }     
public class RequestSchemeAttribute implements ExchangeAttribute {     public String readAttribute ( final HttpServerExchange exchange ) {   return exchange . getRequestMethod ( ) . toString ( ) ;   }       } 
class SourceMapLineDecoder {     private static final String BASE64_MAP =   " ABCDEFGHIJKLMNOPQRSTUVWXYZ " +   " abcdefghijklmnopqrstuvwzyz " +   " 0123456789 + / " ;       } 
public class TerminateRemoteProcessDialog {     public boolean isToBeShown ( ) {   return myAlwaysUseDefault ? ! myDetachIsDefault : myDontTerminate ;   }       } 
public class ContextForcedUserPanel extends AbstractContextPropertiesPanel {     public User getElementAt ( int index ) {   log . info ( " Getting " + tableModel . getElement ( index ) ) ;   return tableModel . getElement ( index ) ;   }     } 
public class ManagedServlet implements Lifecycle {     public void release ( ) { { {   instance . destroy ( ) ;   }   } ;   }     } 
public class BlockFlowEvent extends BlockEvent {     public boolean equals ( BlockFlow flow ) {   return flow . flowDirection . equals ( flow ) ;   }       } 
public class TestContextConfigAnnotation extends TestCase { public void test ( ) { { {   if ( antFile . lastModified ( ) >= eclipseFile . lastModified ( ) ) {   return antFile ;   }   }   }   return eclipseFile ;   }     } 
public class PyDuplocatorTest extends PyTestCase {   public void testIgnoreStringLiteral ( ) throws Exception {   myDuplocatorSettings . DISTINGUISH_LITERALS = false ;   try {   doTest ( 2 ) ;   }   finally {   myDuplocatorSettings . DISTINGUISH_LITERALS = true ;     } } } 
public class Tmp { public interface JSONWebServiceActionMapping {   } public Object getActionObject ( ) ;   public String getContextPath ( ) ;   public String getMethod ( ) ;     } 
public class RaptorWorkerData implements Serializable { public void test ( ) {   continue ;   timetablesForPattern . add ( timetable ) ;       } } 
public class SlidingLayer extends FrameLayout {     public void setOpenOnTapEnabled ( boolean _openOnTapEnabled ) {   _openOnTapEnabled = _openOnTapEnabled ;   }     } 
final class PooledUnsafeDirectByteBuf extends PooledByteBuf < ByteBuffer > {     protected ByteBuffer newInternalNioBuffer ( ByteBuffer memory ) {   return memory ;   }       } 
public class PreferenceManager {   private OnPreferenceTreeClickListener mOnPreferenceTreeClickListener ;         public PreferenceManager ( Activity activity , int firstRequestCode ) {   mActivity = activity ;   mNextRequestCode = firstRequestCode ;     } } 
import java . util . Set ;       public class NodeTraversal {     private final AbstractCompiler compiler ;   private final Callback callback ;     } 
public class DeepLearningSpiralsTest extends TestUtil { public void test ( ) { { { { {   }   }   }   fr . delete ( ) ;   Scope . exit ( ) ;   }   }     } 
public class ByteDecoder extends Bytes { public void test ( ) {   switch ( type ) {   case NULL :   break ;   case BOOLEAN :     } } } 
public class NavBarPanel extends JPanel implements DataProvider , PopupOwner , Dis     { public void dispose ( ) { {   myDisposed = true ;   NavBarListener . unsubscribeFrom ( this ) ;   }     } } 
public abstract class ATransformable3D extends AFrameTask implements IGraphNodeM     { public void setScale ( Vector3 scale ) { {   mScale = scale ;   if ( mGraphNode != null ) mGraphNode . updateObject ( this ) ;   }     } } 
package com . zaxxer . hikari . metrics ;     public class MetricsTracker   {   private static final Context NO_CONTEXT = new Context ( ) ;   public static class Context   {     } } 
public final class Calendar {   public static final int EDITOR_ACCESS = 600 ;     public static final int OWNER_ACCESS = 700 ;   public static final int ROOT_ACCESS = 800 ;       } 
public final class DiskLruCache implements Closeable {         public long getMaxSize ( ) {   return maxSize ;   }     } 
public class EpisodesFragment extends SherlockFragment { public void test ( ) { { {   }   }   if ( handled ) {   adapter . notifyDataSetChanged ( ) ;   }   resetContextMenuSelection ( ) ;   return handled ;   }     } 
public abstract class RajawaliRenderer implements IRajawaliSurfaceRenderer {   final AFrameTask task = new AFrameTask ( ) {     protected void doTask ( ) {   mRenderTargets . add ( renderTarget ) ;   }   } ;     } 
public class MapReduceOutput { public void test ( ) {   }                 } 
public class CatchablePokemon { public void test ( ) {   try {   response = CatchPokemonResponse . parseFrom ( result ) ;   System . out . println ( response ) ;   } catch ( InvalidProtocolBufferException e ) {   throw new RemoteServerException ( e ) ;   }     } } 
public class EthernetDataTracker implements NetworkStateTracker {   public String getTcpBufferSizesPropName ( ) {   return " net . tcp . buffersize . wifi " ;   }   }     
public class LabeledScoredTreeReaderFactory implements TreeReaderFactory {   private final TreeNormalizer tm ;           public LabeledScoredTreeReaderFactory ( ) {   lf = CoreLabel . factory ( ) ;     } } 
public class Publication implements AutoCloseable     { public boolean hasBeenConnected ( )   { {   return positionLimit . getVolatile ( ) > 0 ;   }     } } 
public class AndroidPrebuiltAar extends AndroidLibrary implements HasAndroidReso     { public void addToCollector ( AndroidPackageableCollector collector ) { { {   collector . addNativeLibsDirectory ( getBuildTarget ( ) , nativeLibsDirectory ) ;   }   }     } } 
public class TileBlueprintLibrary extends TileBuildCraft implements IInventory {     public int getInventoryStackLimit ( ) {   return 64 ;   }       } 
public class BlogsIndexer extends BaseIndexer {   public static final String PORTLET_ID = PortletKeys . BLOGS ;   public BlogsIndexer ( ) {   setPermissionAware ( true ) ;   }     } 
public class PlaybackService extends Service { public void test ( ) { {   Log . w ( TAG , " Something went wrong . Shutting down . . . " ) ;   stopSelf ( ) ;   }   return Service . START_STICKY ;   }       } 
public class EditingTargetCodeExecution   { public void test ( ) { {   if ( ! docDisplay_ . moveSelectionToNextLine ( true ) )   docDisplay_ . moveSelectionToBlankLine ( ) ;   }   }     } 
public class ThrottleService extends IThrottleManager . Stub {   private void checkThrottleAndPostNotification ( long currentTotal ) {     if ( mPolicyThreshold == 0 ) {   return ;   }     } } 
public class TestModulePropertiesImpl extends TestModuleProperties implements Pe     { public void loadState ( TestModulePropertiesState state ) {     }   public static class TestModulePropertiesState {     } } 
public class SpanishXMLTreeReader implements TreeReader {   private static final String ATTR_ELLIPTIC = " elliptic " ;   private static final String EMPTY_LEAF = " - NONE - " ;   private static final String MISSING_PHRASAL = " DUMMYP " ;   private static final String MISSING_POS = " DUMMY " ;   private NodeList sentences ;   private int sentIdx ;     } 
public class PrivacyService { public void test ( ) {   if ( hook . isDangerous ( ) ) {   result . methodName = hook . getName ( ) ;   result . restricted = false ;   result . asked = false ;   setRestrictionInternal ( result ) ;   }   }     } 
import java . util . List ;     public abstract class ByteToMessageDecoder extends ChannelInboundHandlerAdapter {   protected ByteBuf cumulation ;   private boolean singleDecode ;   private boolean decodeWasNull ;     } 
public class RecoveryTests extends CrateIntegrationTest { public void test ( ) { { {   assertThat ( length , greaterThanOrEqualTo ( 1L ) ) ;   }   }   }     } 
public class VcsLogUiImpl implements VcsLogUi , Disposable {     public void dispose ( ) { {   getTable ( ) . removeAllHighlighters ( ) ;   }   }     } 
public class Table extends JTable { public void test ( ) {   add ( editorComp ) ;   editorComp . validate ( ) ;   setCellEditor ( editor ) ;   setEditingRow ( row ) ;   setEditingColumn ( column ) ;     } } 
public class Tmp { public interface PacketExtension {   } public String getNamespace ( ) ;                 } 
public class SerializableHasSerialVersionUIDFieldInspection   extends SerializableInspection {       public String getID ( ) {   return " serial " ;     } } 
public final class ContactsContract {   public static final int TYPE_WORK_MOBILE = 17 ;   public static final int TYPE_WORK_PAGER = 18 ;   public static final int TYPE_ASSISTANT = 19 ;         } 
import static org . elasticsearch . action . ValidateActions . addValidationError ;       public class ClearScrollRequest extends ActionRequest {   private List < String > scrollIds ;     } 
public final class Annotation implements Comparable < Annotation > { public void test ( ) {   boolean has_changes = false ;   for ( Map . Entry < String , Boolean > entry : changed . entrySet ( ) ) {   if ( entry . getValue ( ) ) {   System . out . println ( entry . getKey ( ) ) ;   has_changes = true ;   break ;   }     } } } 
public class SchematicDoor extends SchematicBlock {     public void rotateLeft ( IBuilderContext context ) {   meta = rotateMeta ( meta ) ;   upperMeta = rotateMeta ( upperMeta ) ;   }   private int rotateMeta ( int meta ) {     } } 
public class Drawer {     public Drawer withAccountHeader ( AccountHeader . Result accountHeader ) {   this . mAccountHeader = accountHeader ;   return this ;   }     } 
public class XPrivacy implements IXposedHookLoadPackage , IXposedHookZygoteInit { public void test ( ) {     hookAll ( XCamera . getInstances ( ) ) ;     hookAll ( XClipboardManager . getInstances ( null ) ) ;       hookAll ( XConnectivityManager . getInstances ( ) ) ;     } } 
public class FileDisplayActivity extends HookActivity     { public void onBrowsedDownTo ( OCFile directory ) {   cleanSecondFragment ( ) ;   updateActionBarTitle ( ) ;     startSyncFolderOperation ( directory , false ) ;     } } 
public final class From implements Sqlable { public void test ( ) {   if ( mLimit != null ) {   sql . append ( " LIMIT " ) ;   sql . append ( " " ) ;   }     } } 
public class Constants {   public static final long SCALE_ANIMATION_DURATION_FULL_DISTANCE = 800 ;   public static final int DISPLAY_PHOTO_SIZE = 800 ;   public static final String FACEBOOK_APP_ID = " 134669876670695 " ;     } 
public class MainService extends Service { public void test ( ) {   unregisterReceiver ( mPackageBroadcastReceiver ) ;   unregisterReceiver ( mDialogReceiver ) ;   unregisterReceiver ( mBroadcastReceiver ) ;   unregisterReceiver ( mPackageBroadcastReceiver ) ;   MainController . destroy ( ) ;   }     } 
public class Switch extends CompoundButton {     public void setChecked ( boolean checked ) {   super . setChecked ( checked ) ;   mThumbPosition = checked ? getThumbScrollRange ( ) : 0 ;   invalidate ( ) ;   }     } 
public class Tmp { public enum TreeType {     BIRCH ,             RED_MUSHROOM ,     } } 
public abstract class AbstractBasicTest {     public void onThrowable ( Throwable t ) { {   t . printStackTrace ( ) ;   fail ( " Unexpected exception : " + t . getMessage ( ) , t ) ;   }   }     } 
public class OsmBugsDbHelper extends SQLiteOpenHelper { public void test ( ) { { { {   } while ( query . moveToNext ( ) ) ;   }   query . close ( ) ;   }   return cachedOsmbugsPoints ;   }     } 
import android . content . pm . PackageInfo ;   import android . content . pm . PackageManager ;   import android . net . Uri ;   import android . support . v4 . app . NotificationCompat ;   import android . util . Log ;   public class PackageChange extends BroadcastReceiver {     } 
public class CalendarView extends FrameLayout {         private int mCurrentMonthDisplayed ;         } 
public class ApplicationInfo extends PackageItemInfo implements Parcelable { public void test ( ) {   manageSpaceActivityName = orig . manageSpaceActivityName ;   descriptionRes = orig . descriptionRes ;   uiOptions = orig . uiOptions ;   }     } 
public class ConsistencyCheck { public void test ( ) { { {   }   }   }     } 
public abstract class WindowOrientationListener { public void test ( ) {   if ( LOG ) {   Log . d ( TAG , " WindowOrientationListener enabled " ) ;   }   mSensorManager . registerListener ( mSensorEventListener , mSensor , mRate ) ;   mEnabled = true ;   }     } 
public class PythonDocumentationConfigurable implements SearchableConfigurable {     public String getHelpTopic ( ) {   return null ;   }       } 
public class AjaxStatus { public void test ( ) {                   } } 
import android . test . InstrumentationTestCase ;   import java . util . ArrayList ;   import java . util . List ;   import java . util . Set ;         
public class PGraphicsPDF extends PGraphicsJava2D {     public void save ( String filename ) {   nope ( " save " ) ;   }     } 
public final class AlluxioFuse {   private static final Logger LOG = LoggerFactory . getLogger ( Constants . LOGGER_TYPE ) ;   private static Configuration sConfiguration ;   private AlluxioFuse ( ) {   }     } 
public class UnderlinePageIndicator extends View implements PageIndicator {     public void setSelectedColor ( int selectedColor ) {   mPaint . setColor ( selectedColor & 0xFFFFFF ) ;   invalidate ( ) ;   }     } 
class FastScroller { public void test ( ) { { {   break ;   }   }   updateAppearance ( ) ;   }     } 
public class RandomAccessSparseVector extends AbstractVector {     private class AddToVector implements IntDoubleProcedure {   final Vector v ;   private AddToVector ( Vector v ) {     } } } 
public class Compile extends ConventionTask {   protected AntJavac antCompile = new AntJavac ( ) ;       protected ClasspathConverter classpathConverter = new ClasspathConverter ( ) ;   public Compile ( Project project , String name ) {     } } 
public final class ChannelPromiseAggregator implements ChannelFutureListener {   private final ChannelPromise aggregatePromise ;   private Set < ChannelPromise > pendingPromises ;             } 
public class FakeContext implements Context {   public Validation getValidation ( ) {   return validation ;   }   }     
public class SwipeFlingAdapterView extends BaseFlingAdapterView implements CardE     { public View getSelectedView ( ) { {   return topView . get ( ) ;   }     } } 
  package com . alibaba . druid . pool ;   import java . sql . SQLException ;   import java . sql . Wrapper ;   public class WrapperAdapter implements Wrapper { public void test ( ) {     } } 
public class UpgradeResourcePermissionTest extends UpgradeResourcePermission {     public void setUp ( ) throws Exception {   _company = CompanyTestUtil . addCompany ( ) ;   _user = UserTestUtil . addUser ( ) ;   }     } 
import antlr . LexerSharedInputState ;             public class UnicodeLexerSharedInputState extends LexerSharedInputState {   private final UnicodeEscapingReader escapingReader ;     } 
class Searcher { public void test ( ) { { {   logMatchesFound ( regex ) ;   return false ;   }   sleeper . sleep ( 1000 ) ;   }   }     } 
public class MessageList extends K9FragmentActivity implements MessageListFragme     { public void updateMenu ( ) { {   configureMenu ( mMenu ) ;   }       } } 
public class WXEnvironment {   public static final String SETTING_EXCLUDE_X86SUPPORT = " env_exclude_x86 " ;   public static final boolean SETTING_FORCE_VERTICAL_SCREEN = false ;           } 
public class DataStructures { public void test ( ) {   System . out . println ( " Removing a previously added node " + next ) ;   minHeap . remove ( next ) ;   System . out . println ( minHeap . toString ( ) ) ;   }   {     } } 
public class FieldIntroduceHandler extends IntroduceHandler {     protected String getHelpId ( ) {   return " refactoring . introduceField " ;   }       } 
public class TestJsonStringEncoder       { public void testQuoteLongCharSequenceAsString ( ) throws Exception   {   JsonStringEncoder encoder = new JsonStringEncoder ( ) ;     } } 
public final class Futures { public void test ( ) { { { {   }   }   }     }       } 
public final class CollapsePropertiesTest extends CompilerTestCase {     public CompilerPass getProcessor ( Compiler compiler ) {   System . err . println ( compiler . getCodingConvention ( ) ) ;   return new CollapseProperties ( compiler , true ) ;   }     } 
public class JsonCodeStyleSettingsProvider extends CodeStyleSettingsProvider {       public String getHelpTopic ( ) { { {   return null ;   }   } ;   }     } 
import java . io . Serializable ;     public class MySerialBean implements Serializable {   private int id ;   private String name ;     } 
public class MetricsSystem {   private MetricRegistry mMetricRegistry = new MetricRegistry ( ) ;   private MetricsConfig mMetricsConfig ;   private boolean mRunning = false ;   private Sink mMetricsServlet ;         } 
public class ClusterStateManager {   private static final class StateManagerExceptionHandler implements FutureUtil . ExceptionHandler {   private final ILogger logger ;   private Throwable error ;   private StateManagerExceptionHandler ( ILogger logger ) {     } } } 
public class Tmp { public interface PConstants {   static final int ARGB = 2 ;   static final int HSB = 3 ;   static final int ALPHA = 4 ;       } } 
public abstract class Pair < T1 , T2 >     { public T1 first ( )   { {   return first ( ) ;   }       } } 
public class HazelcastXaTest {         public void testRecovery ( ) throws Exception {   HazelcastInstance instance1 = Hazelcast . newHazelcastInstance ( ) ;   HazelcastInstance instance2 = Hazelcast . newHazelcastInstance ( ) ;     } } 
public class Tmp { public enum RegExpCapability {   OMIT_NUMBERS_IN_QUANTIFIERS ,   COMMENT_MODE ,   ALLOW_HEX_DIGIT_CLASS ,       ALLOW_EMPTY_CHARACTER_CLASS ,   ALLOW_HORIZONTAL_WHITESPACE_CLASS ,   UNICODE_CATEGORY_SHORTHAND ,     } } 
import java . util . List ;   import org . springframework . stereotype . Component ;     public class PeriodicGraphUpdater {   private UpdateTask updater ;     } 
public class SubtasksListFragment extends TaskListFragment {     protected void onTaskDelete ( Task task ) {   helper . onDeleteTask ( task ) ;   }     } 
public final class Realm implements Closeable { public void test ( ) { { {   handler . sendEmptyMessage ( REALM_CHANGED ) ;   }   }   sendNotifications ( ) ;   }       } 
public class NestedScrollView extends FrameLayout implements NestedScrollingPare     { public void onAttachedToWindow ( ) { {   mIsLaidOut = false ;   }     } } 
import java . util . * ;   public class MessagePool {   private static int MAX_POOL_SIZE_FOR_FATALS = 2 ;   private static MessagePool ourInstance ;     } 
public class SmackAndroid {   private SmackAndroid ( Context ctx ) {   mCtx = ctx ;   ConfigureProviderManager . configureProviderManager ( ) ;   InitStaticCode . initStaticCode ( ctx ) ;   maybeRegisterReceiver ( ) ;   }     } 
public final class NIOConverter { public void test ( ) { {   bytes = value . getBytes ( ) ;   }   buf . put ( bytes ) ;   return buf ;   }     } 
import org . codehaus . groovy . syntax . Types ;   import java . io . BufferedWriter ;   import java . io . IOException ;   import java . io . Writer ;   import java . net . MalformedURLException ;   import java . net . URL ;   import java . util . * ;     
public class BufferPool {   protected static BufferPool instance = null ;   protected BufferPoolAPI pool = null ;   private BufferPool ( BufferPoolAPI pool ) {     } } 
public class JSONPointer {     public JSONPointer ( List < String > refTokens ) {   this . refTokens = refTokens ;   }   private String unescape ( String token ) {     } } 
package redis . clients . jedis ;   import redis . clients . util . SafeEncoder ;   import java . nio . ByteBuffer ;   import java . util . * ;   public class BuilderFactory {     } 
public class RippleDrawable extends LayerDrawable { public void test ( ) {   if ( super . setDrawableByLayerId ( id , drawable ) ) {   if ( id == R . id . mask ) {   mMask = drawable ;   }   return true ;     } } } 
public class DefaultGlobalDisplay extends GlobalDisplay   { public void onError ( String message )   { {   showMessage ( GlobalDisplay . MSG_ERROR , errorCaption , message ) ;   }     } } 
public class MapTileLayer extends BaseMapLayer {     public void drawTileMap ( Canvas canvas , RotatedTileBox tileBox ) {   if ( map == null ) {   return ;   }     } } 
package org . bukkit . event . block ;   import org . bukkit . Block ;   import org . bukkit . ItemStack ;   import org . bukkit . Material ;   import org . bukkit . event . Event ;     
public class StringServletResponse extends HttpServletResponseWrapper {   public void setStatus ( int status ) {   _status = status ;   }   public void setString ( String string ) {     } } 
public class SkeletonControl extends AbstractControl implements Cloneable {     public void setSpatial ( Spatial spatial ) {   if ( spatial != null ) {   Node node = ( Node ) spatial ;   targets = findTargets ( node ) ;     } } } 
import org . springframework . mock . web . MockServletContext ;   import org . springframework . util . Assert ;   import java . io . IOException ;   import java . io . PrintStream ;   import java . io . PrintWriter ;   import java . util . HashMap ;   import java . util . Map ;     
public class AccountHeaderBuilder {       protected boolean mDividerBelowHeader = false ;         } 
import java . io . File ;   import java . util . * ;   import java . util . concurrent . ExecutionException ;   import hex . GLMTest2 ;   import hex . glm . GLM2 ;   import hex . glm . GLMParams ;   import water . * ;     
public class PhoneWindowManager implements WindowManagerPolicy {   PowerManager . WakeLock mBroadcastWakeLock ;   class SettingsObserver extends ContentObserver {   private ContentQueryMap mSettings ;     SettingsObserver ( Handler handler ) {   super ( handler ) ;   }     } } 
public class TrustAgentWrapper {     public void destroy ( ) {   mHandler . removeMessages ( MSG_RESTART_TIMEOUT ) ;   if ( ! mBound ) {     } } } 
public class Profile implements User {         public int getTimeZone ( ) {   return mTimeZone ;   }     } 
package com . wrapp . floatlabelededittext ;   import android . annotation . TargetApi ;   import android . content . Context ;   import android . content . res . ColorStateList ;     
import cpw . mods . fml . common . eventhandler . SubscribeEvent ;   import cpw . mods . fml . common . gameevent . PlayerEvent ;   import buildcraft . BuildCraftBuilders ;   import buildcraft . BuildCraftCore ;   import buildcraft . BuildCraftFactory ;   import buildcraft . BuildCraftSilicon ;     
public class ReformatCodeAction extends AnAction implements DumbAware { public void test ( ) { { {   new ReformatCodeProcessor ( project , dir , dialog . isIncludeSubdirectories ( ) ) . run ( ) ;   }   }   return ;   }   final TextRange range ;     } 
public class WifiConfiguration implements Parcelable {       public boolean isValid ( ) {   if ( SSID == null )   return false ;   if ( allowedKeyManagement == null )   return false ;     } } 
public class FragmentMain extends Fragment { public void test ( ) {   searchView . setOnQueryTextListener ( onQuerySearchView ) ;   menu . findItem ( R . id . menu_add ) . setVisible ( true ) ;     mSearchCheck = false ;   }     } 
public class NodeIndicesStats implements Streamable , Serializable , ToXContent {     public RefreshStats refresh ( ) {   return this . refresh ( ) ;   }   public RefreshStats getRefresh ( ) {     } } 
package serializers ;   import de . undercouch . bson4jackson . BsonFactory ;   import de . undercouch . bson4jackson . BsonGenerator ;   public class BsonJackson   { public void test ( ) {     } } 
public abstract class Context {           public static final String NETWORKMANAGEMENT_SERVICE = " network_management " ;     } 
public final class CameraManager {               public static abstract class AvailabilityCallback {     } } 
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 1 . 3 " ;   public static String getVersion ( ) {   return VERSION ;     } } 
package org . jivesoftware . smack ;   import java . util . LinkedList ;   import java . util . Iterator ;   import java . io . * ;   import org . jivesoftware . smack . packet . Packet ;     
public class IdeRootPane extends JRootPane implements UISettingsListener { public void test ( ) { { {   Disposer . dispose ( myStatusBar ) ;   }   removeToolbar ( ) ;   }   super . removeNotify ( ) ;   }     } 
import java . util . ResourceBundle ;             public class SentenceWhitespaceRule extends Rule { public void test ( ) {     } } 
public class SlicedMapImpl implements MutableSlicedMap {     public void clear ( ) {   map . clear ( ) ;   }       } 
import org . junit . Test ;   import org . mockitousage . IMethods ;   import org . mockitoutil . TestBase ;     public class ThreadsShareAMockTest extends TestBase {     } 
public final class Response {       public void setErrorException ( Exception ex ) {   errorException = ex ;   }     } 
public class TwitterSocialNetwork extends OAuthSocialNetwork { public void test ( ) {   mSharedPreferences . edit ( )   . remove ( SAVE_STATE_KEY_OAUTH_TOKEN )   . remove ( SAVE_STATE_KEY_OAUTH_SECRET )   . apply ( ) ;   mTwitter = null ;     } } 
public class ProjectSharingPreferencesPane extends ProjectPreferencesPane     { public boolean onApply ( RProjectOptions prefs )   { { {   return true ;   }   }     } } 
public class DSLPlatform {     public String getName ( ) {   return " json / dsl platform / minified " ;   }       } 
public final class LocalProperties implements Cloneable { public void test ( ) { {   }   return isTrivial ( ) ;   }     } 
public class HadoopDruidIndexerConfig   { public void setVersion ( DateTime version )   { {   this . version = version ;   }       } } 
public class Decoder extends DecoderBase { public void test ( ) {   int first = tmpbuf [ 0 ] ;   in_progress . set_flags ( first ) ;   next_step ( in_progress ,   message_ready ) ;     } } 
public abstract class SlidingActivity extends AppCompatActivity {     public void disableHeader ( ) {   scroller . disableHeader ( ) ;   }       } 
public class CoyoteOutputStream   { public void print ( String s )   throws IOException { {   ob . write ( s ) ;   }     } } 
public class DataDiff {     public boolean wasCompared ( ) { {   return true ;   }   }     } 
public final class DlvDebugProcess extends DebugProcessImpl < RemoteVmConnection >     { public void consume ( final DebuggerState o ) {   if ( o . exited ) {   getSession ( ) . stop ( ) ;   return ;   }     } } 
import java . net . SocketOptions ;     public class LocalSocket implements Closeable {   private LocalSocketImpl impl ;   private volatile boolean implCreated ;   private LocalSocketAddress localAddress ;   private boolean isBound ;     } 
public class PopupWindow {       private void invokePopup ( WindowManager . LayoutParams p ) {   mWindowManager . addView ( mPopupView , p ) ;   }     } 
public class FastArray implements Cloneable {     public String toString ( ) { {   return toList ( ) . toString ( ) ;   }   }     } 
public class PsiGotoRelatedItem extends GotoRelatedItem {     public PsiFile getContainingFile ( ) { {   return myElement . getContainingFile ( ) ;   }   }     } 
public abstract class NativeObject implements Cloneable {     public void dispose ( ) { {   if ( objectManager != null ) {   objectManager . markUnusedObject ( this ) ;   }   }   }     } 
public class IndexPrimaryShardNotAllocatedException extends IndexException {     public RestStatus status ( ) { {   return RestStatus . CONFLICT ;   }   }     } 
package net . simonvt . menudrawer . compat ;   import net . simonvt . menudrawer . BuildConfig ;     import android . app . Activity ;   import android . graphics . drawable . Drawable ;   import android . os . Build ;     
class NewPropertyAction extends AnAction {     public boolean checkInput ( final String inputString ) {   return true ;   }       } 
public class StickyListHeadersListView extends FrameLayout {       protected void onRestoreInstanceState ( Parcelable state ) {   super . onRestoreInstanceState ( BaseSavedState . EMPTY_STATE ) ;   mList . onRestoreInstanceState ( state ) ;   }     } 
public class MockitoConfiguration {     public void setReturnValues ( ReturnValues returnValues ) {   this . returnValues = returnValues ;   }     } 
public abstract class ATransformable3D {     public Quaternion getOrientation ( ) {   return new Quaternion ( mOrientation ) ;   }     } 
public class MappedRecordSet     { public Type getType ( int field )   { {   return delegate . getType ( field ) ;   }       } } 
public abstract class Animator implements Disposable {     public void suspend ( ) {   stopTicker ( ) ;   }     } 
package liquibase . structure . core ;   import liquibase . structure . AbstractDatabaseObject ;   import liquibase . structure . DatabaseObject ;   import sun . security . util . BigInt ;   import java . math . BigInteger ;     
public class AsmClassGenerator extends ClassGenerator {     public void visitBlockStatement ( BlockStatement block ) {   onLineNumber ( block , " visitBlockStatement " ) ;   visitStatement ( block ) ;   int mark = controller . getOperandStack ( ) . getStackLength ( ) ;     } } 
public final class LineageMasterTest { public void test ( ) {   }                 } 
public class AndroidSdkImpl extends AndroidSdk {     public int getPlatformToolsRevision ( ) {   return myPlatformToolsRevision ;   }   private static class MyTargetWrapper implements IAndroidTarget {     } } 
public class TelephonyManager {         public static final boolean EMERGENCY_ASSISTANCE_ENABLED = false ;         } 
public final class EmbeddedNeo implements NeoService   { public EmbeddedNeo ( String storeDir )   { {     }       } } 
public class DruidDataSource extends DruidAbstractDataSource   { public boolean isClosed ( ) { { { {   return this . closed ;   }   }   }     } } 
public class MockitoTest extends TestBase {   public void shouldValidateMockWhenCreatingInOrderObject ( ) { {   Mockito . inOrder ( " notMock " ) ;   }   }     } 
public class K9 extends Application     { public static int DEFAULT_VISIBLE_LIMIT = 25 ;   public static int MAX_SEND_ATTEMPTS = 5 ;         } 
class InterceptedInvocation implements Invocation , VerificationAwareInvocation {     public int hashCode ( ) {   return 1 ;   }     } 
public final class EmailIntentSenderFactory implements ReportSenderFactory {       public ReportSender create ( Context context , ACRAConfiguration config ) { {   return new EmailIntentSender ( context , config ) ;   }   }     } 
public class JBScrollPane extends JScrollPane {   public void setUI ( ScrollPaneUI ui ) {   super . setUI ( ui ) ;   updateViewportBorder ( ) ;   }       } 
class MockTaskManager implements TaskOperationProtocol {   public void recoverAll ( ChannelID sourceChannelID ) {   }   }     
public final class PowerHandler { public void test ( ) {                     } } 
public class SSLCertificateSocketFactory extends SSLSocketFactory {     public String [ ] getDefaultCipherSuites ( ) {   return getDelegate ( ) . getSupportedCipherSuites ( ) ;   }       } 
public class CompileStack implements Opcodes { public void test ( ) {   superBlockNamedLabels . clear ( ) ;   currentBlockNamedLabels . clear ( ) ;   namedLoopBreakLabel . clear ( ) ;   continueLabel = null ;   breakLabel = null ;   finallyLabel = null ;     } } 
import org . springframework . util . ReflectionUtils ;         class RuntimeTestWlalker {   private static final Field residualTestField ;     } 
public class InternalAprOutputBuffer extends AbstractOutputBuffer < Long > {             protected synchronized boolean flushBuffer ( boolean block )   throws IOException {     } } 
public class PipeTransportItems extends PipeTransport { public void test ( ) {   item . setSpeed ( packet . getSpeed ( ) ) ;   item . input = packet . getInputOrientation ( ) ;   item . output = packet . getOutputOrientation ( ) ;   item . color = packet . getColor ( ) ;     } } 
public class AutomaticRenamingDialog extends DialogWrapper { public void test ( ) { { {   for ( final int row : rows ) {   myShouldRename [ row ] = valueToBeSet ;   }   fireTableDataChanged ( ) ;   }   }   }     } 
public class CustomViewBehind extends ViewGroup {     public boolean menuOpenTouchAllowed ( View content , int currPage , float x ) {   if ( true )   return true ;   switch ( mTouchMode ) {   case SlidingMenu . TOUCHMODE_FULLSCREEN :   return true ;     } } } 
import java . util . List ;         public class ShortcutBadger {   private static final String LOG_TAG = ShortcutBadger . class . getSimpleName ( ) ;     } 
import javax . annotation . concurrent . ThreadSafe ;         public class LineageFileSystem extends BaseFileSystem {   private LineageContext mLineageContext ;       } 
public class DeskShareStream implements NewScreenListener {   private String outStreamName ;   private IScope scope ;   public static final int LARGER_DIMENSION = 1000 ;       } 
public class SchemaResolver implements EntityResolver {         public InputSource resolveEntity ( String publicId , String systemId )   throws SAXException {     } } 
public class JavaSourceProcessor extends BaseSourceProcessor { public void test ( ) { {   }   }   String newContent = checkJavaFieldTypes (   fileName , packagePath , className , content ) ;     } 
public class JavaStackFrame extends XStackFrame {       public Object getEqualityObject ( ) { {   return getStackFrameProxy ( ) . hashCode ( ) ;   }   }     } 
public class Geometry3D {     public void setBuffersCreated ( boolean created ) { {   mHaveCreatedBuffers = created ;   }   }     } 
import gnu . trove . map . hash . TLongObjectHashMap ;   public class GeoIntentActivity extends OsmandListActivity {   private static final String TAG = " GeoIntentActivity " ;   private ProgressDialog progressDlg ;   private LatLon location ;     } 
public class AprEndpoint extends AbstractEndpoint < Long > { public void test ( ) { {   }   removeFromPoller ( socket ) ;   destroySocket ( socket ) ;   socket = timeouts . check ( date ) ;   }     } 
public final class MessageList < T > implements Iterable < T > {     public void remove ( ) { { {   throw new UnsupportedOperationException ( " Read Only " ) ;   }   }   }     } 
public class NetworkCatalogTree extends NetworkTree {     public String getName ( ) {   return Item . Title . toString ( ) ;   }       } 
public class PyNonAsciiCharInspection extends PyInspection {     public void visitPyStringLiteralExpression ( PyStringLiteralExpression node ) { {   checkString ( node , node . getStringValue ( ) ) ;   }   }     } 
public abstract class DGLM { public void test ( ) {   _deviance = dev ;   _nullDeviance = nDev ;   _n = n ;   System . out . println ( " N = " + _n + " , rank = " + rank ) ;   _aic = aic + 2 * rank ;   }     } 
public class Note extends Syncable {         public JSONObject getDiffableValue ( ) {   return mNoteJSON ;   }     } 
public class SSLHostConfigCertificate {     }   private static enum StoreType {   KEYSTORE ,   PEM   }     
public class GracePeriodTest { public void test ( ) { {   sut . close ( ) ;   sut . join ( ) ;   }   }       } 
public class PolygonSpriteBatch implements Batch {     public boolean isDrawing ( ) { {   return false ;   }   }     } 
public class XmlNamespace extends RubyObject { public void test ( ) {   this . href = href ;   this . prefixString = prefixString ;   this . hrefString = hrefString ;   this . attr . setUserData ( CACHED_NODE , this , null ) ;   setInstanceVariable ( " " , xmlDocument ) ;   }     } 
public class PGraphics extends PImage implements PConstants { public void test ( ) {   vertex [ X ] = x ;   vertex [ Y ] = y ;   vertex [ EDGE ] = edge ? 1 : 0 ;     } } 
public class AsmClassGenerator extends ClassGenerator {     public void visitBlockStatement ( BlockStatement block ) {   onLineNumber ( block , " visitBlockStatement " ) ;   visitStatement ( block ) ;   int mark = controller . getOperandStack ( ) . getStackLength ( ) ;     } } 
public class TesterServletContext implements ServletContext {     public Object getAttribute ( String name ) {   throw new RuntimeException ( " Not implemented " ) ;   }       } 
public class PhotoManager {     public void cancelTask ( Object token ) {   backgroundHandler . removeCallbacksAndMessages ( token ) ;   }   public void acquireBitmap ( Bitmap b ) {     } } 
public class JSSESupport implements SSLSupport , SSLSessionManager {   private SSLSession session ;   JSSESupport ( SSLSession session ) {   this . session = session ;   }     } 
public class Mockito extends Matchers {         public static VerificationAfterDelay after ( int millis ) {   return new After ( millis , VerificationModeFactory . times ( 1 ) ) ;   }     } 
import java . text . SimpleDateFormat ;   import java . util . Date ;   import java . util . Locale ;             
public class UpdateConfigurable extends BaseConfigurable {     public String getHelpTopic ( ) {   return null ;   }   public JComponent createComponent ( ) {     } } 
public final class EmbeddedNeo implements NeoService   { public EmbeddedNeo ( String storeDir )   { {     }       } } 
public class ImmediateAuthenticationMechanismFactory implements AuthenticationMe     { public AuthenticationMechanism create ( String mechanismName , FormParserFactory formParserFactory , Map < String , String > properties ) { { {   return null ;   }   }     } } 
public class Http11Processor extends AbstractHttp11Processor < Socket > { public void test ( ) {     error = false ;   keepAlive = true ;   if ( maxKeepAliveRequests > 0 ) {   socketWrapper . decrementKeepAlive ( ) ;     } } } 
public class GoConfigurableProvider extends ConfigurableProvider {   public static class GoProjectSettingsConfigurable extends GoModuleAwareConfigurable {   } public GoProjectSettingsConfigurable ( Project project ) {   super ( project , " Project settings " , null ) ;   }       } 
public abstract class AbstractFindUsagesDialog extends DialogWrapper { public void test ( ) {   myProject = project ;   myFindUsagesOptions = findUsagesOptions ;   myToShowInNewTab = toShowInNewTab ;   myIsShowInNewTabEnabled = mustOpenInNewTab ;   myIsShowInNewTabVisible = ! isSingleFile ;   mySearchForTextOccurencesAvailable = searchForTextOccurencesAvailable ;   mySearchInLibrariesAvailable = searchInLibrariesAvailable ;     } } 
public class JSONException extends RuntimeException {         public JSONException ( String message , Throwable cause ) {   super ( message , cause ) ;   }     } 
public class ExtensionStdMenus extends ExtensionAdaptor {   private void initialize ( ) {   this . setName ( NAME ) ;   this . setOrder ( 37 ) ;   }       } 
public class GwtGraphics implements Graphics {     public boolean isContinuousRendering ( ) {   return false ;   }       } 
public class StringUtils { {     return new String ( randBuffer ) ;   }   }     
public class HgVcs extends AbstractVcs < CommittedChangeList > {       public CommittedChangesProvider getCommittedChangesProvider ( ) {   return commitedChangesProvider ;   }     } 
public abstract class SquidDatabase {         protected void setFastInsertEnabled ( boolean enabled ) {   fastInsertEnabled = enabled ;   }     } 
public class Tmp { public interface JsonProvider {   Object createMap ( ) ;   Iterable createArray ( ) ;   Object clone ( Object model ) ;     } } 
public class CordovaWebViewImpl implements CordovaWebView { public void test ( ) { { {   }   return true ;   }     return true ;   }     } 
package org . mongodb . impl ;   import org . mongodb . MongoClient ;   import org . mongodb . MongoClientOptions ;   import org . mongodb . MongoClientURI ;   import org . mongodb . ServerAddress ;     
public class WifiConfiguration implements Parcelable {     public static final String hiddenSSIDVarName = " scan_ssid " ;   public class EnterpriseField {   private String varName ;   private String value ;     } } 
public class BootstrapThumbnail extends FrameLayout   { public void setImage ( int drawable )   { {   this . placeholder . setBackgroundResource ( drawable ) ;   }       } } 
public final class AsyncHttpClientConfigDefaults {     public static boolean defaultAcceptAnyCertificate ( ) { {   return getBooleanValue ( ASYNC_CLIENT + " acceptAnyCertificate " , false ) ;   }   }     } 
public class NotificationBuilder extends NotificationCompat . Builder {     public NotificationCompat . Builder setNumber ( int number ) {   mNumber = number ;   return this ;   }     } 
public class PortletDisplay implements Serializable { public void test ( ) {   _namespace = StringPool . BLANK ;   _portletName = StringPool . BLANK ;   _portletSetup = null ;   _portletToolbar = null ;   _resourcePK = StringPool . BLANK ;   _restoreCurrentView = false ;   _rootPortletId = StringPool . BLANK ;     } } 
public class NotificationUsageStats {   private final SQLiteLog mSQLiteLog ;   private final Context mContext ;   private final Handler mHandler ;   private final Handler mHandler ;   private long mLastEmitTime ;   public NotificationUsageStats ( Context context ) {     } } 
public class HttpRequestTest extends ServerTestCase { public void test ( ) { {   int code = get ( url ) . code ( ) ;   assertEquals ( 200 , code ) ;   }     }     } 
public class VerificationModeImpl implements VerificationMode {   enum Verification { EXPLICIT , NO_MORE_WANTED ;   private final Integer wantedInvocationCount ;   private final Integer minInvocationCount ;   private final List < ? extends Object > mocksToBeVerifiedInOrder ;   private final Verification verification ;     } } 
public class ImageWallpaper extends WallpaperService {   private static final boolean DEBUG = false ;   static final boolean FIXED_SIZED_SURFACE = true ;   static final boolean USE_OPENGL = false ;   WallpaperManager mWallpaperManager ;     } 
public final class Gmail { public void test ( ) {   if ( unreadConversations == null ) {   return 0 ;   } else {   return unreadConversations ;   }   }     } 
public class SQLDemoActivity extends Activity {   private void addEvent ( String title ) {   SQLiteDatabase db = eventsData . getWritableDatabase ( ) ;   ContentValues values = new ContentValues ( ) ;   values . put ( EventDataSQLHelper . TIME , System . currentTimeMillis ( ) ) ;   values . put ( EventDataSQLHelper . TITLE , title ) ;     } } 
public class BuildCraftSilicon extends BuildCraftMod { public void test ( ) {   BuildCraftCore . mainConfiguration . save ( ) ;   laserBlock = new BlockLaser ( ) ;   CoreProxy . proxy . registerBlock ( laserBlock ) ;   assemblyTableBlock = new BlockLaserTable ( ) ;     } } 
public class KeyguardManager {     public boolean isKeyguardLocked ( ) {   try {   return mWM . isKeyguardSecure ( ) ;   } catch ( RemoteException ex ) {   return false ;   }     } } 
public class AsyncHttpClientConfig { public void test ( ) {   strict302Handling = prototype . isStrict302Handling ( ) ;   useRelativeURIsWithSSLProxies = prototype . isUseRelativeURIsWithSSLProxies ( ) ;   timeConverter = prototype . getTimeConverter ( ) ;   }       } 
final public class H2O { public void test ( ) {     new HeartBeatThread ( ) . start ( ) ;   startGAStartupReport ( ) ;   }       } 
public final class Cache {   public static synchronized void clear ( ) {   sEntities . evictAll ( ) ;   ;   Log . v ( " Cache cleared . " ) ;   }     } 
public final class FileSystemWorker extends AbstractWorker {       public void stop ( ) {   if ( mFilePersistenceService != null ) {   mFilePersistenceService . cancel ( true ) ;   }     } } 
public abstract class AbstractPythonRunConfiguration extends ModuleBasedConfigur   { public AbstractPythonRunConfiguration ( final String name , final RunConfigurationModule module , final ConfigurationFactory factory ) {   super ( name , module , factory ) ;   }   public List < Module > getValidModules ( ) {     } } 
public class BookCollection extends AbstractBookCollection { public void test ( ) {   final Book book = getBookByFile ( file ) ;   if ( book != null ) {   saveBook ( book ) ;   }   }     } 
public class SpringCli {     public String getUsageHelp ( ) {   return null ;   }       } 
public class Animation3D {   long timeInPause ;   boolean wasPaused = false ;   public void run ( ) {   if ( mIsPaused ) {   if ( ! wasPaused ) timeInPause = SystemClock . uptimeMillis ( ) ;   wasPaused = true ;     } } } 
public final class PreconditionMessage {   public static final String ERR_PUT_NULL_KEY = " Cannot put a null key " ;   public static final String ERR_PUT_NULL_VALUE = " Cannot put a null value " ;     private PreconditionMessage ( ) { }   }     
public class BitmapUtils implements BitmapGlobalConfigChangeCallBack {     public void stopTasks ( ) {   synchronized ( mPauseWorkLock ) {   mPauseWorkLock . notifyAll ( ) ;   }     } } 
public class LocalActivityManager { public void test ( ) {   if ( r != null ) {   win = performDestroy ( r , finish ) ;   if ( finish ) {   mActivities . remove ( r ) ;   }   }   return win ;     } } 
public class CommandLineArguments {     public boolean isLocal ( ) {   return true ;   }   public void setDebug ( boolean debug ) {     } } 
public class DefaultProjectProfileManager extends ProjectProfileManager {     public Map < String , Profile > getProfiles ( ) {   return myProfiles ;   }     } 
public class LayoutLocalServiceImpl extends LayoutLocalServiceBaseImpl { public void test ( ) {                 } } 
public class DragSortListView extends ListView { public void test ( ) { { {   divider . setBounds ( l , t , r , b ) ;   divider . draw ( canvas ) ;   Log . d ( " mobeta " , " drawing divider " ) ;   }   }   }     } 
public class SyncStorageEngine extends Handler { public void test ( ) { { {   syncs = new ArrayList < SyncInfo > ( ) ;   mCurrentSyncs . put ( userId , syncs ) ;   }   return new ArrayList < SyncInfo > ( syncs ) ;   }   }     } 
import java . util . List ;   import java . util . concurrent . ConcurrentHashMap ;   import java . util . concurrent . ConcurrentMap ;   import com . sun . tools . javac . resources . version ;   import org . bson . io . PoolOutputBuffer ;       
public class PortletDataContextImpl implements PortletDataContext { public void test ( ) {   _userIdStrategy = null ;   _startDate = startDate ;   _endDate = endDate ;   _xStream = new XStream ( ) ;   _zipReader = null ;   _zipWriter = zipWriter ;     } } 
public class RecyclerView extends ViewGroup { public void test ( ) {   if ( mEatRunOnAnimationRequest ) {   mReSchedulePostAnimationCallback = true ;   } else {   ViewCompat . postOnAnimation ( RecyclerView . this , this ) ;   }   }     } 
public class Runtime {   public World getWorld ( ) {   return world ;   }     public void setWorld ( World world ) {   this . world = world ;   }   }     
public class BlockedNumberContract {     public final long untilTimestampMillis ;   BlockSuppressalStatus ( boolean isSuppressed , long untilTimestampMillis ) {   this . isSuppressed = isSuppressed ;   this . untilTimestampMillis = untilTimestampMillis ;   }     } 
import org . jetbrains . annotations . Nullable ;             public class PyResolveUtil {   private PyResolveUtil ( ) {     } } 
public class ClientBootstrap extends Bootstrap { public void test ( ) { { {   }   } while ( future == null ) ;   pipeline . remove ( pipeline . get ( " connector " ) ) ;     return future ;   }     } 
public class FocusWatcher implements ContainerListener , FocusListener { public void test ( ) {   if ( getFocusedComponent ( ) == component ) {   setFocusedComponentImpl ( null , cause ) ;   }   }       } 
public class FileChecker extends BaseChecker { public void test ( ) {     if ( _rootDir != null ) {   paths . add ( _rootDir + " - " ) ;   }     } } 
public final class OperatorZipIterable < T1 , T2 , R > implements Operator < R , T1 > {     public void onError ( Throwable e ) {   if ( done ) {   return ;   }   done = true ;     } } 
public abstract class PullToRefreshBase < T extends View > extends LinearLayout {     }    
class SnackContainer extends FrameLayout {   public void clearSnacks ( boolean animate ) {   mSnacks . clear ( ) ;   if ( animate ) mHideRunnable . run ( ) ;   }     } 
public class TypedTableDefinition { public void test ( ) {   java . util . Date dateCol ;   double doubleCol ;   int intCol ;   long longCol ;   float floatCol ;   String stringCol ;   byte [ ] byteCol ;     } } 
public class StaticLayout extends Layout { public void test ( ) { { {   }   if ( mLineCount >= mMaximumVisibleLineCount ) {   break ;   }   }   }     } 
public class MediaRouteButton extends View { public void test ( ) { { { { {   }   }   }     setEnabled ( mRouter . isRouteAvailable ( mSelector ,   MediaRouter . AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE ) ) ;   }   }     } 
public class GitCheckinEnvironment implements CheckinEnvironment {     public boolean isRefreshAfterCommitNeeded ( ) {   return false ;   }       } 
public class SearchView extends LinearLayout implements CollapsibleActionView {       public void onDetachedFromWindow ( ) {   removeCallbacks ( mUpdateDrawableStateRunnable ) ;   super . onDetachedFromWindow ( ) ;   }     } 
import org . geometerplus . zlibrary . core . util . ZLNetworkUtil ;   import org . geometerplus . fbreader . network . atom . ATOMLink ;   class CatalogInfoReader implements OPDSFeedReader {     public boolean FeedStarted ;   public String Icon ;   public String Title ;     } 
public class SweetAlertDialog extends Dialog implements View . OnClickListener {     protected void onStart ( ) {   mDialogView . startAnimation ( mModalInAnim ) ;   playAnimation ( ) ;   }     } 
public class XMLChangeLogSAXParser implements ChangeLogParser {     public static String getSchemaVersion ( ) {   return " 3 . 1 " ;   }       } 
import com . googlecode . totallylazy . Option ;   import com . googlecode . totallylazy . annotations . multimethod ;   import com . googlecode . totallylazy . functions . Reducer ;   import javarepl . expressions . * ;   import javarepl . expressions . Value ;   import javax . tools . DiagnosticCollector ;     
class LogbackModule extends Module {     public String getModuleName ( ) {   return " log4j " ;   }       } 
public class IntIntMap { public void test ( ) {   if ( index < lastIndex ) {   keyTable [ index ] = keyTable [ lastIndex ] ;   valueTable [ index ] = valueTable [ lastIndex ] ;   valueTable [ lastIndex ] = 0 ;   }   }     } 
public class PlayerProfile { public void test ( ) {                 } } 
public class ForegroundLinearLayout extends LinearLayoutCompat {   boolean mForegroundBoundsChanged = false ;   public ForegroundLinearLayout ( Context context ) {   super ( context ) ;   }   public ForegroundLinearLayout ( Context context , AttributeSet attrs ) {     } } 
public class LowLevelSearchUtil { public void test ( ) { { {   }   }   if ( ! processor . execute ( run , start ) ) {   processor . execute ( run , start ) ;   return false ;   }   }     } 
abstract class Node implements TagConstants { public void test ( ) {   this . el = null ;   this . dynamic = dyn ;   this . namedAttribute = true ;   this . tai = null ;   }       } 
import java . util . concurrent . TimeUnit ;   public final class DefaultStepRunner implements StepRunner , Closeable {   private final long SHUTDOWN_TIMEOUT_SECONDS = 15 ;   private final ExecutionContext context ;   private final ListeningExecutorService listeningExecutorService ;     } 
public class SecureNio2Channel extends Nio2Channel { public void test ( ) {   handshakeComplete = false ;   closed = false ;   closing = false ;   }       } 
public class BlobStoreAPIWordCountTopology {     public static class FilterWords extends BaseBasicBolt {   String key = " key " ;   String fileName = " blacklist . txt " ;     } public void execute ( Tuple tuple , BasicOutputCollector collector ) {     } } 
public class Log { public void test ( ) {     Handler jdkLogHandler = new JiveLogHandler ( ) ;   java . util . logging . Logger . getLogger ( " " ) . addHandler ( jdkLogHandler ) ;   }     } 
abstract class AbstractDelayedEntry < K > {   private final long storeTime ;   private final int partitionId ;   protected AbstractDelayedEntry ( K key , long storeTime , int partitionId ) {     } } 
public class Cache {   public void clear ( ) {   resourceCache . clear ( ) ;   }   public long getSize ( ) {     } } 
public abstract class BaseTest {     public static void afterClass ( ) throws IOException , InterruptedException {   if ( ! RedissonRuntimeEnvironment . isTravis ) {   RedisRunner . startDefaultRedisServerInstance ( ) ;   defaultRedisson . shutdown ( ) ;   }   }     } 
public class PhoneStateListener {               public void onSignalStrengthChanged ( int asu ) {       } } 
public class PythonLibraryDescription implements Description < Arg > {   public static class Arg implements ConstructorArg {   } public ImmutableSortedSet < SourcePath > srcs ;   public Optional < ImmutableSortedSet < BuildRule > > deps ;   }       
public class GradientDrawable extends Drawable {       public void setColorFilter ( ColorFilter cf ) {   if ( cf != mColorFilter ) {   mColorFilter = cf ;     } } } 
class NioDatagramChannel extends AbstractChannel     { public boolean isConnected ( ) { {   return datagramChannel . socket ( ) . isConnected ( ) ;   }       } } 
public class PostfixTemplatesConfigurable implements SearchableConfigurable , Edi       { public String getHelpTopic ( ) { {   return null ;   }       } } 
public final class ACRAConstants {   public static final boolean DEFAULT_REPORT_TO_ANDROID_FRAMEWORK = false ;   public static final int DEFAULT_SOCKET_TIMEOUT = 8000 ;   public static final int DEFAULT_CONNECTION_TIMEOUT = 5000 ;     } 
public class ZipSplitter {   public static enum DexSplitStrategy {   MAXIMIZE_PRIMARY_DEX_SIZE ,   MINIMIZE_PRIMARY_DEX_SIZE ;   }   private final Set < File > inFiles ;     } 
public final class Terasology {     public long getTimeInMs ( ) {     return _timer . getTimeInMs ( ) ;   }     } 
public class ProgressBar extends View { public void test ( ) { {   if ( mProgress > max ) {   mProgress = max ;   }   }   }     } 
public class StorageDumper { public void test ( ) {   final PrintStream p = new PrintStream ( outputPath ) ;   mappings . toStream ( p ) ;   p . close ( ) ;   }     } 
package org . apache . tomcat ;   import java . io . InputStream ;   import java . util . Properties ;       public class Apr {   private static String aprInfo = null ;     } 
package rajawali . wallpaper ;   import javax . microedition . khronos . egl . EGL10 ;   import javax . microedition . khronos . egl . EGLConfig ;   import javax . microedition . khronos . egl . EGLContext ;   import javax . microedition . khronos . egl . EGLDisplay ;   import rajawali . renderer . RajawaliRenderer ;     
public class ShadowBitmap {       public Matrix getCreateFromMatrix ( ) {   return createdFromMatrix ;   }     } 
public class LayoutExporter { public void test ( ) {   portletDataContext . setMissingReferencesElement (   missingReferencesElement ) ;   portletDataContext . addDeletionSystemEventStagedModelTypes (   new StagedModelType ( Layout . class ) ) ;     } } 
public class AccelListener extends Plugin implements SensorEventListener { public void test ( ) {   if ( this . status == AccelListener . STOPPED ) {   return ;   }   Log . d ( " ACCEL " , " accuracy is now " + accuracy ) ;   this . accuracy = accuracy ;   }     } 
public class AsyncTaskTest {   public void setUp ( ) throws Exception {   transcript = new Transcript ( ) ;   RobolectricTestRunner . logMissingInvokedShadowMethods ( ) ;   }       } 
public abstract class SocketWrapperBase < E > {     public boolean isReadyForWrite ( ) {   return ! hasDataToWrite ( ) ;   }     } 
public class ExtensionFunctionsTest extends CodegenTestCase {     public void testKt475 ( ) throws Exception { {   blackBoxFile ( " regressions / kt475 . jet " ) ;   }   }     } 
import voldemort . utils . Utils ;     public class ClientConfig {   private volatile int maxConnectionsPerNode = 50 ;   private volatile int maxTotalConnections = 500 ;   private volatile int maxThreads = 5 ;   private volatile int maxQueuedRequests = 50 ;     } 
public class Tmp { public interface PsiElement extends UserDataHolder , Iconable {         PsiFile getContainingFile ( ) ;         } } 
public class GitPushRebaseProcess extends GitBaseRebaseProcess {   protected void cleanupHandler ( VirtualFile root , GitLineHandler h ) {   if ( myRebaseEditorNo != null ) {   myRebaseEditorService . unregisterHandler ( myRebaseEditorNo ) ;   }   }     } 
class XMLSerializer extends AbstractSerializer { public void test ( ) { {   myBook . addUidWithNoCheck ( uid ) ;   }   myBook . setSeriesInfoWithNoCheck ( string ( mySeriesTitle ) , string ( mySeriesIndex ) ) ;   myBook . HasBookmark = myHasBookmark ;   }     } 
public final class CursorToBulkCursorAdaptor extends BulkCursorNative   { public void close ( ) {   maybeUnregisterObserverProxy ( ) ;   mCursor . deactivate ( ) ;     }   public int requery ( IContentObserver observer , CursorWindow window ) {     } } 
public class ViewPager extends ViewGroup { public void test ( ) { { {   }   completeScroll ( false ) ;   scrollTo ( destX , 0 ) ;   }   }     } 
public class CompletionPanel {   private String subWord ;           private int insertionPosition ;     } 
public abstract class Config {     public static final List < String > LIB_FILES_WITH_CODE = Arrays . asList (   " / core / javautilCode . kt "   ) ;     } 
public class Recurrence implements Serializable { public void test ( ) { {   return ( - position == negativeCandidatePosition ) ;   }       } }
public class PropertyAttributeParserTest   { public void test ( ) {   try   {   parseAsValueModelAttribute ( illegalStaticResourceAttributeValue . value ) ;   fail ( " Expect an exception thrown " ) ;   } catch ( MalformedAttributeException e )   {     } } } 
public class FakeAlertDialog extends FakeDialog {   private AlertDialog realDialog ;   private boolean isMultiItem ;   private DialogInterface . OnMultiChoiceClickListener multiChoiceClickListener ;   private boolean [ ] checkedItems ;   public FakeAlertDialog ( AlertDialog dialog ) {   super ( dialog ) ;     } } 
public class CompilerTest extends GroovyTestCase { public void test ( ) {   dir . mkdirs ( ) ;   CompilerConfiguration config = new CompilerConfiguration ( ) ;   config . setDebug ( dumpClass ) ;   compiler = new Compiler ( config ) ;     } } 
public class PGraphicsOpenGL extends PGraphics {   public void lights ( ) {   enableLighting ( ) ;     int colorModeSaved = colorMode ;   colorMode = RGB ;     } } 
public class GpsLocationProvider implements LocationProviderInterface {   private GpsStatusListenerHelper mListenerHelper = new GpsStatusListenerHelper ( ) {     protected boolean isSupported ( ) {   return native_is_measurement_supported ( ) ;   }   } ;     } 
public class BookmarkItem implements ItemWrapper {     public void execute ( Project project , JBPopup popup ) {   myBookmark . navigate ( ) ;   }     } 
public class SSTableReader extends SSTable implements Comparable < SSTableReader >   { public void test ( ) { {   throw new IOError ( e ) ;   }   phantomReference . deleteOnCleanup ( ) ;   }     } 
public class ByteBufferBackedInputStream extends InputStream { public void test ( ) {   if ( ! buffer . hasRemaining ( ) )   return - 1 ;   return buffer . get ( ) ;   }       } 
public class SelectWordUtil { public void test ( ) { {   }   element = firstChild ;   }     } 
public class AbsSpinnerTest {     public void setUp ( ) throws Exception {   TestUtil . addAllProxies ( ) ;     adapterView = new Gallery ( new Activity ( ) ) ;   }     } 
public abstract class TestBase     { public void tearDown ( ) { { {   mongo . close ( ) ;   dropDB ( ) ;   }   }     } } 
public class JavaRegExpHost implements RegExpLanguageHost {     public boolean supportsPossessiveQuantifiers ( ) {   return false ;   }       } 
import java . util . Vector ;     public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {   private static final int MIN_DIMENSION_TO_RECUR = 30 ;   private final Reader delegate ;     } 
import android . database . Cursor ;   import android . database . MatrixCursor ;   import android . net . Uri ;   import android . os . Binder ;   import android . os . DeadObjectException ;   import android . text . TextUtils ;   import android . util . Log ;     
public class SortedQueryResultSet extends AbstractSet < Map . Entry > {     }   private class EmptyIterator implements Iterator {     public boolean hasNext ( ) {     } } 
public abstract class HardwareRenderer { public void test ( ) { {   if ( ! createSurface ( holder ) ) {   return ;   }   setEnabled ( true ) ;   }   }     } 
public final class Constants {         public static final boolean DEBUG = true ;       } 
public class PropertiesComponent extends DefaultComponent {     public PropertiesComponent ( boolean isDefaultCreated ) {   this . isDefaultCreated = isDefaultCreated ;   }     } 
import hex . rf . RFModel ;   import java . util . Arrays ;   import water . * ;   import water . fvec . Frame ;   import com . google . gson . JsonArray ;   import com . google . gson . JsonPrimitive ;     
public abstract class BaseAsyncDestination extends BaseDestination {     public void close ( boolean force ) {   }   public DestinationStatistics getDestinationStatistics ( ) {     } } 
public class Tmp { public interface Rule {   boolean template ( ) ;   RuleKey templateKey ( ) ;       } } 
public abstract class CommonJobs   { public void test ( ) {   tx = db . beginTx ( ) ;   Node node = db . createNode ( ) ;   System . out . println ( Thread . currentThread ( ) + " created node " + node ) ;   return null ;   }     } 
public abstract class RequestBuilderBase < T extends RequestBuilderBase < T > > { public void test ( ) {   request . byteData = null ;   request . stringData = null ;   request . streamData = null ;   request . length = - 1 ;   }     } 
public class BeaconManager {     protected BeaconManager ( Context context ) {   mContext = context ;   if ( ! sManifestCheckingDisabled ) {   verifyServiceDeclaration ( ) ;   }     } } 
public class RequestBuilders extends RequestQueries {   protected final JsonObject _response ;   protected final Request _req ;   protected boolean _strictJsonCompliance = false ;         } 
public class ViewFlow extends AdapterView < Adapter > {     public void onGlobalLayout ( ) { {   setSelection ( mCurrentAdapterIndex ) ;   getViewTreeObserver ( ) . removeGlobalOnLayoutListener ( orientationChangeListener ) ;   }   } ;     } 
public class PSurfaceAWT extends PSurfaceNone { public void test ( ) {     Component canvas ;   PGraphics graphics ;   int sketchWidth ;   int sketchHeight ;     } } 
public final class CameraManager {               public static abstract class AvailabilityCallback {     } } 
public class LocationManager { public void test ( ) {   }                 } 
public class EdgeDataImpl implements EdgeData , DynamicData {     public float getRadius ( ) {   throw new UnsupportedOperationException ( " Not supported yet . " ) ;   }   public float getSize ( ) {     } } 
public class SetHeaderHandler implements HttpHandler {     public class Builder implements HandlerBuilder {     } public String name ( ) {   return " header " ;     } } 
public class PsiTypeElementImpl extends CompositePsiElement implements PsiTypeEl     { public PsiAnnotation addAnnotation ( String qualifiedName ) { { {   throw new UnsupportedOperationException ( ) ;   }   }     } } 
public class GetFileContentOperation extends LocalPathIndifferentOperation {     public boolean fileNotFound ( ) {   getFileBytes ( ) ;   return myState == FILE_NOT_FOUND ;   }     } 
import static org . junit . Assert . fail ;   import com . google . common . collect . Sets ;   import java . util . Set ;   import org . junit . Test ;   public class ClassResolverTest   {       } 
import javaslang . Tuples . Tuple2 ;         public final class Strings { public void test ( ) {       } } 
public class BytesInputStream extends InputStream {   public void reset ( ) {   pos = mark ;   }   }     
public class ReplicatedMapTest extends ReplicatedMapAbstractTest { public void test ( ) { { {   return o1 == o2 ? 0 : o1 > o2 ? - 1 : 1 ;   }   }     }     } 
public class CodeItem extends Item < CodeItem > { public void test ( ) {   return ;   }     final SparseIntArray originalOffsetsByNewOffset = new SparseIntArray ( ) ;   final SparseIntArray newOffsetsByOriginalOffset = new SparseIntArray ( ) ;     } 
public class GroovyTemplatesProvider implements DefaultLiveTemplatesProvider {     public String [ ] getHiddenLiveTemplateFiles ( ) { {   return new String [ 0 ] ;   }   }     } 
public class TileAutoWorkbench extends TileEntity implements ISpecialInventory {       public int getSizeInventory ( ) {     } } 
public class ColorPicker extends View { public void test ( ) { {   invalidate ( ) ;   break ;   }   return true ;   }     } 
public class SpriteBatch implements Batch {   public boolean isBlendingEnabled ( ) {   return ! blendingDisabled ;   }   }     
public class FieldLookup { public void test ( ) {   value = null ;   valueLoaded = false ;   values . clear ( ) ;   valuesLoaded = false ;   doc = null ;   }     } 
public abstract class AbstractFailureDetector implements FailureDetector { public void test ( ) {   NodeStatus nodeStatus = getNodeStatus ( node ) ;   synchronized ( nodeStatus ) {   if ( ! isAvailable ( node ) )   nodeStatus . wait ( ) ;   }   }     } 
public abstract class SessionPage extends WebPage { public void test ( ) { { { {   }   }   session . setUser ( user ) ;   return ;   }   }     } 
public final class Cache {       public static synchronized SQLiteDatabase openDatabase ( ) {   return sDatabaseHelper . getWritableDatabase ( ) ;     } } 
public final class LocalTachyonCluster { public void test ( ) {   if ( mUfsCluster != null ) {   mUfsCluster . cleanup ( ) ;   }   System . clearProperty ( " tachyon . underfs . address " ) ;   }     } 
public class ShadowView {       public void invalidate ( ) {   wasInvalidated = true ;   }     } 
public final class MediaBrowserCompat {         public static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } } 
package buildcraft . api . recipes ;   import java . util . LinkedList ;   import net . minecraft . item . ItemStack ;   public class AssemblyRecipe {     } 
public class DeepLearningGradientCheck extends TestUtil {   public static void stall ( ) { stall_till_cloudsize ( 1 ) ; }     public void cancar ( ) {   Frame tfr = null ;   DeepLearningModel dl = null ;     } } 
public class ManagedServlet implements Lifecycle {     public void release ( ) { { {     }   } ;   }     } 
public class CompileStack implements Opcodes { public void test ( ) {   superBlockNamedLabels . clear ( ) ;   currentBlockNamedLabels . clear ( ) ;   namedLoopBreakLabel . clear ( ) ;   continueLabel = null ;   breakLabel = null ;   finallyLabel = null ;     } } 
public class Tmp { public interface ServletContext {   } public ServletContext getContext ( String uripath ) ;           } 
public final class DataIO {         public static final class HeartbeatFileLock {       } } 
package com . pokegoapi . util ;     public class Constant {   }     
public class OracleStandardTest extends AbstractHibernateTest {     public void JoinEmbeddable ( ) { {     }   }     } 
package tachyon . master . block ;     public class BlockId {   private static final int CONTAINER_ID_BITS = 40 ;     } 
public class NearCacheContext {   private NearCacheManager nearCacheManager ;   private SerializationService serializationService ;   private NearCacheExecutor nearCacheExecutor ;   private Object nullPlaceHolder ;   public NearCacheContext ( ) {     } } 
public class PGraphicsOpenGL2 extends PGraphics { public void test ( ) {   if ( raw != null ) {     }   faceCount = 0 ;   vertexCount = 0 ;   triangleCount = 0 ;   }     } 
public class TestTextureArrayCompressed extends SimpleApplication     { public static void main ( String [ ] args )   { {   TestTextureArray app = new TestTextureArray ( ) ;   app . start ( ) ;   }     } } 
class DayView extends CheckedTextView {     public void setSelectionDrawable ( Drawable selectionDrawable ) {   this . selectionDrawable = selectionDrawable ;   invalidate ( ) ;   }       } 
public final class Settings {       public static final String VENDING_PENDING_DOWNLOAD_RESEND_FREQUENCY_MS =   " vending_pending_download_resend_frequency_ms " ;         } 
public class Event < T > {     private int id ;   private Type type ;   private long timestamp ;   private T payload ;     } 
public class EditGroupAction extends PortletAction { public void test ( ) {   String friendlyURL = null ;   boolean active = false ;   boolean manualMembership = true ;   int membershipRestriction =   GroupConstants . DEFAULT_MEMBERSHIP_RESTRICTION ;     } } 
public class VcsManagerConfigurable extends SearchableConfigurable . Parent . Abstra     { public String getHelpTopic ( ) { { { {   return null ;   }   } ;   }     } } 
package de . danoeh . antennapod ;   public final class AppConfig {   public final static boolean DEBUG = true ;   }     
public class CustomizationConfigurable extends BaseConfigurable implements Appli     { public String getHelpTopic ( ) { {   return null ;   }     } } 
public class PlaygroundTest extends TestBase { public void test ( ) {           }     } 
public class SeekableViewsForTest { public void test ( ) {   if ( is_integer ) {   current_data . reset ( generateTimestamp ( ) , current ) ;   } else {   current_data . reset ( generateTimestamp ( ) , current ) ;   }   }     } 
public class FileInStreamIntegrationTest {                 public void seekExceptionTest1 ( ) throws IOException , TachyonException {     } } 
public class AsmClassGenerator extends ClassGenerator { public void test ( ) {   Variable variable = compileStack . getVariable ( variableName , false ) ;   VariableScope scope = compileStack . getScope ( ) ;   if ( variable == null ) {   processClassVariable ( variableName ) ;   } else {     } } } 
public class RecipientListExchangePropertyTest extends ContextTestSupport {     private static class MyStuff {   private String name ;     } }  
public class PhoneWindowManager implements WindowManagerPolicy { public void test ( ) { {   intent = mHomeIntent ;   }   startActivityAsUser ( mHomeIntent , UserHandle . CURRENT ) ;   }       } 
public abstract class SshCommand extends BaseCommand { {     }   protected abstract void run ( ) throws UnloggedFailure , Failure , Exception ;   }     
public class OperationsFacade     { public void unregisterExecutingQuery ( ExecutingQuery executingQuery )   { {   statement . assertOpen ( ) ;   queryRegistrationOperations ( ) . unregisterExecutingQuery ( statement , executingQuery ) ;   }     } } 
package tachyon . command ;   import java . net . InetSocketAddress ;   import tachyon . Constants ;   import tachyon . conf . MasterConf ;   import tachyon . thrift . InvalidPathException ;       
public class DefaultDBCallback extends BasicBSONCallback implements DBCallback { public void test ( ) {   }   DBObject dbget ( ) {   DBObject o = ( DBObject ) get ( ) ;   return o ;   }       } 
public class GoogleJavaScriptMinifier implements JavaScriptMinifier { public void test ( ) {   setCompileOptions ( compilerOptions ) ;   compiler . compile (   SourceFile . fromCode ( " extern " , StringPool . BLANK ) , sourceFile ,   compilerOptions ) ;     } } 
public abstract class Connection extends Conferenceable {       public final AudioState getAudioState ( ) {   return new AudioState ( mCallAudioState ) ;   }     } 
public class HealthMonitor extends Thread {     }   private final class GcMetrics {   final long minorCount ;   final long minorTime ;   final long majorCount ;     } 
public class FolderList extends K9ListActivity implements OnNavigationListener { public void test ( ) { {   return ;   }   mUnreadMessageCount = stats . unreadMessageCount ;   super . accountStatusChanged ( account , stats ) ;   }       } 
public class RowDataResolver extends AbstractRowResolver   { public Row getData ( )   { {   return replies . peek ( ) . payload . row ( ) ;   }     } } 
public class TransportNetworkCache { public void test ( ) { { {   cacheLocation . delete ( ) ;   }   return currentNetwork ;   }   }     } 
public class JavaTestDocsGenerator extends AsciiDocGenerator   { public JavaTestDocsGenerator ( String title )   { {   super ( " docs " , title ) ;   }       } } 
package android . renderscript ;         public class FieldPacker {   public FieldPacker ( int len ) {   mPos = 0 ;     } } 
public class BadgeActivity extends AppCompatActivity { public void test ( ) { {   BottomBarTab nearby = bottomBar . getTabWithId ( R . id . tab_nearby ) ;   nearby . setBadgeCount ( 5 ) ;   nearby . removeBadge ( ) ;   }   }     } 
package tachyon ;     public class Version {     public static final String VERSION = " 0 . 2 SNAPSHOT " ;   }     
public class Exif { public void test ( ) { { {   }   }   Log . i ( TAG , " Orientation not found " ) ;   return 0 ;   }     } 
public class RedirectConfig {           public RedirectConfig and ( ) {   return this ;     } } 
public class ExternalJavacIntegrationTest {     public void whenBuckdUsesExternalJavacThenClientEnvironmentUsed ( ) throws IOException {   final ProjectWorkspace workspace = TestDataHelper . createProjectWorkspaceForScenario (   this , " external_javac " , tmp ) ;   workspace . setUp ( ) ;     } } 
public class TitanFactory {   private Builder ( ) {   super ( GraphDatabaseConfiguration . buildConfiguration ( ) ) ;   }       } 
public class MapConfig implements DataSerializable {   private MapStoreConfig mapStoreConfig = null ;   private NearCacheConfig nearCacheConfig = null ;   private boolean readBackupData = false ;     } 
import org . json . JSONArray ;   import org . json . JSONException ;   import android . app . Activity ;   import android . content . ContentResolver ;   import android . content . ContentValues ;   import android . content . Intent ;   import android . database . Cursor ;     
public class RareLogger extends Logger { public void test ( ) {   if ( fairSynch ) {   synchronized ( lock ) {   super . put ( key , value ) ;   }   }   super . put ( key , value ) ;     } } 
public final class DlvDebugProcess extends DebugProcessImpl < RemoteVmConnection >     { public void stop ( ) {     }   private static class DlvSuspendContext extends XSuspendContext {     } } 
import java . nio . ByteBuffer ;   import javax . websocket . SendHandler ;   public class MessagePart {   private final byte opCode ;   private final ByteBuffer payload ;   private final boolean last ;     } 
public class EditSession { public void test ( ) { { {   if ( setBlock ( pt , grass ) ) {   }   }   }   }     } 
public class PackageParser { public void test ( ) {   if ( sa . getBoolean (   com . android . internal . R . styleable . AndroidManifestApplication_testOnly ,   true ) ) {   ai . flags |= ApplicationInfo . FLAG_TEST_ONLY ;   }     } } 
public class SnacktoryWebViewRenderer extends WebViewRenderer { public void test ( ) { {   }   mGetPageAsTextTask = new GetPageAsTextTask ( ) ;   mGetPageAsTextTask . execute ( getUrl ( ) . toString ( ) ) ;   }       } 
final class HttpRequestBuilder { public void test ( ) { {   }   HttpUriRequest request = requestLine . getHttpMethod ( ) . createFrom ( this ) ;   if ( logger . isLoggable ( Level . FINE ) ) logger . fine ( " Request params : " + getParamList ( true ) ) ;   return request ;   }     } 
class DrawableCache extends ThemedResourceCache < Drawable . ConstantState > {     public boolean shouldInvalidateEntry ( Drawable . ConstantState entry , int configChanges ) { {   return false ;   }   }     } 
public abstract class RectangularShape extends Shape implements IAreaShape {     protected boolean isCulled ( final Camera pCamera ) {   return false ;   }       } 
class BaseRegion implements Region {     public int getTimeout ( ) { {   return Timestamper . ONE_MS * 60000 ;   }   }     } 
class GitSmartOperationDialog extends DialogWrapper {   private class ForceCheckoutAction extends AbstractAction {   ForceCheckoutAction ( String operationTitle ) {   super ( " Force " + capitalize ( operationTitle ) ) ;   }       } } 
public class TestShellActivity extends Activity implements LayoutTestController     { public void clearCache ( ) { {   mWebView . clearCache ( true ) ;   }       } } 
public class LocalSearch implements SearchSpecification {       public String getName ( ) {   return mName ;   }       } 
public class PyIntroduceVariableHandler extends IntroduceHandler {     protected String getHelpId ( ) {   return " refactoring . introduceVariable " ;   }   }     
public class Tmp { public enum SASLError {   invalid_authzid ,   invalid_mechanism ,   malformed_request ,   not_authorized ,   temporary_auth_failure ;     } } 
public abstract class BaseUpgradePortletId extends UpgradeProcess { public void test ( ) {   typeSettingsProperties . setProperty (   newStagingPortletId , stagingPortletSetting ) ;   return typeSettingsProperties . toString ( ) ;   }     } 
public class MarkupTemplateEngine extends TemplateEngine {     }   static class TemplateResource {   private final String baseName ;   private final String locale ;   private final String extension ;     } 
import static org . junit . Assert . * ;   public class ErrorReportingTest extends BaseTest   {   public static class InvalidAwaitCall   {   public void invalidAwaitCall ( Task task )   {     } } } 
public class Compiler extends AbstractCompiler implements ErrorHandler {     private void processNewScript ( JsAst ast , Node originalRoot ) {   Node js = ast . getAstRoot ( this ) ;   Preconditions . checkNotNull ( js ) ;     } } 
public class Container extends AbsLayoutContainer {   private EdgeEffect mLeftEdge , mRightEdge , mTopEdge , mBottomEdge ;   private float pullPastSlack = 50f ;         } 
public class PGraphics extends PImage implements PConstants {     public void blendMode ( int mode ) {   this . blendMode = mode ;   new Exception ( " setting blend mode to " + mode ) . printStackTrace ( ) ;   blendModeImpl ( ) ;   }     } 
public abstract class MultilanguageCodeStyleAbstractPanel extends CodeStyleAbstr   { public void setLanguageSelector ( LanguageSelector langSelector ) {   myLanguageSelector = langSelector ;   }   public void setPanelLanguage ( Language language ) {     } } 
import javax . crypto . Mac ;           public final class FingerprintManagerCompatApi23 { public void test ( ) {     } } 
public class AccessibilityNodeInfo implements Parcelable {       public boolean refresh ( ) {   return refresh ( false ) ;   }       } 
public final class RuntimeConstants {   public static final String ALLUXIO_JAR =   " target / alluxio - " + VERSION + " - jar - with - dependencies . jar " ;   }     
import java . util . Optional ;   public class TSVSentenceIterator implements Iterator < Sentence > {     enum SentenceField {   ID ,   DEPENDENCIES_STANFORD ,   DEPENDENCIES_EXTRAS ,     } } 
public class CompilerOptions implements Serializable , Cloneable {             public void setLanguageIn ( LanguageMode languageIn ) {   this . languageIn = languageIn ;     } } 
import java . util . * ;         public class DBMaker < DBMakerT extends DBMaker > {   protected final String TRUE = " true " ;     } 
public class DomModelTreeView extends Wrapper implements DataProvider {     public void dispose ( ) {   myDomManager . removeDomEventListener ( myDomEventListener ) ;   }     } 
public class CameraView extends ViewGroup implements AutoFocusCallback { public void test ( ) { {   }   removeView ( previewStrategy . getWidget ( ) ) ;     onOrientationChange . disable ( ) ;     lastPictureOrientation = - 1 ;   }     } 
public class PrestoConnection   { public int getTransactionIsolation ( )   throws SQLException   { {   throw new UnsupportedOperationException ( " getTransactionIsolation " ) ;   }       } } 
public class ExcelImporter extends TabularImportingParserBase {     public List < Object > getNextRowOfCells ( ) throws IOException {   if ( nextRow >= lastRow ) {   return null ;   }     } } 
public class CoreProxy {     public static void setField804 ( EntityItem item , float value ) {   item . field_804_d = value ;   }   public static File getPropertyFile ( ) {     } } 
public abstract class BaseNetworkStateTracker implements NetworkStateTracker {       public boolean setRadio ( boolean turnOn ) {     return true ;     } } 
abstract class CommunicationProtocol   { public void test ( ) { { {   dest . writeBytes ( bytes ) ;   }   }   }     } 
public class ClassNode extends AnnotatedNode implements Opcodes {     public void setModifiers ( int modifiers ) {   this . modifiers = modifiers ;   }   public List < PropertyNode > getProperties ( ) {     } } 
public class SingleFilePageSwapperFactory implements PageSwapperFactory     { public String implementationName ( )   { {   return " striped " ;   }       } } 
package org . apache . lucene . index ;           public class IndexWriterAccessor   { public void test ( ) {     } } 
public class ShellSpout implements ISpout { public void test ( ) {   LOG . error ( " Halting process : ShellSpout died . " , exception ) ;   _collector . reportError ( exception ) ;   System . exit ( 11 ) ;   }     } 
public class CorruptSSTableException extends RuntimeException   { public CorruptSSTableException ( Exception cause , File path )   { {   super ( cause ) ;   this . path = path ;   }     } } 
public final class DiskLruCache implements Closeable {       public boolean isClosed ( ) {   return journalWriter == null ;   }     } 
public class OtrChatManager implements OtrEngineListener , OtrSmEngineHost { public void test ( ) {   mSessions = new Hashtable < String , SessionID > ( ) ;   mOtrSms = new Hashtable < SessionID , OtrSm > ( ) ;   }     } 
public class ServletException extends Exception {       public ServletException ( Throwable rootCause ) {   this ( rootCause . getLocalizedMessage ( ) , rootCause ) ;   }       } 
public class PartitionManager {     public void close ( ) {   _connections . unregister ( _partition . host , _partition . partition ) ;   }     } 
public class SimpleCredentialsDialog extends DialogWrapper implements DocumentLi     { public JComponent getPreferredFocusedComponent ( ) {   return myUserNameText ;   }   public boolean shouldCloseOnCross ( ) {     } } 
public final class SslHandshakeCompletionEvent {   private final Throwable cause ;   SslHandshakeCompletionEvent ( Throwable cause ) {   this . cause = cause ;   }     } 
public class FunType extends Type { public void test ( ) { { {   }   }   typeStack . pop ( type1 , type2 ) ;   return true ;   }     } 
public class HighlightUsagesHandler extends HighlightHandlerBase { public void test ( ) { {   }   final EditorSearchComponent header = new EditorSearchComponent ( editor , project ) ;   editor . setHeaderComponent ( header ) ;   }     } 
public class IconMenuTag extends BaseBodyTagSupport implements BodyTag { public void test ( ) {   _localizeMessage = true ;   _maxDisplayItems = _DEFAULT_MAX_DISPLAY_ITEMS ;   _message = " actions " ;   _select = false ;   _showArrow = true ;   _showExpanded = false ;     } } 
public class RNNOptions implements Serializable {     public int numClasses = 5 ;   public boolean lowercaseWordVectors = true ;   public boolean useTensors = true ;     } 
public class Scroller {       public final void setFriction ( float friction ) {   computeDeceleration ( friction ) ;   }   private float computeDeceleration ( float friction ) {     } } 
public class CometConnectionManagerValve   { public void sessionCreated ( HttpSessionEvent se ) { {   }     } } 
class Waiter { public void test ( ) { {   sleeper . sleep ( ) ;   }   return null ;   }       } 
public class AssetPublisherImpl implements AssetPublisher { public void test ( ) {   assetEntryQuery . setAllCategoryIds ( allAssetCategoryIds ) ;   if ( overrideAllAssetCategoryIds != null ) {   allAssetTagNames = overrideAllAssetTagNames ;   }     } } 
public class RemoteServerConfiguration implements Cacheable , Externalizable {   private int remotePort ;   public RemoteServerConfiguration ( String domain ) {   this . domain = domain ;   }     } 
public class NioEndpoint extends AbstractEndpoint < NioChannel > { public void test ( ) {   fillReadBuffer ( false ) ;     boolean isReady = socketBufferHandler . getReadBuffer ( ) . position ( ) > 0 ;   return isReady ;   }     } 
public class XUtilHook extends XHook {     public String getClassName ( ) {   return " biz . bokhorst . xprivacy . Util " ;   }       } 
public class MarkupBuilder extends BuilderSupport {         public Object getMkp ( ) {   return new MarkupBuilderHelper ( this ) ;   }     } 
package org . apache . cordova . facebook ;   import java . util . ArrayList ;   import java . util . Arrays ;   import java . util . Date ;     
public class Color { public void test ( ) {   this . mRed = pRed ;   this . mGreen = pGreen ;   this . mBlue = pBlue ;   this . pack ( ) ;   return true ;     } } 
public class Main {   public static void main ( String [ ] args ) { {   if ( args . length < 1 ) ;   throw new IllegalArgumentException ( " Missing required argument " ) ;   }   }     } 
class InjectorImpl implements Injector { public void test ( ) {     if ( providedBinding == null ) {   handleMissingBinding ( this , key ) ;   return invalidBinding ( key ) ;   }     } } 
public final class Constants {         public static final boolean DEBUG = true ;         } 
public class Cookie implements Cloneable , Serializable { public void test ( ) {   try {   return super . clone ( ) ;   } catch ( CloneNotSupportedException e ) {   throw new RuntimeException ( e . getMessage ( ) ) ;   }   }     } 
public class UserGroupsAdminPortletDataHandler extends BasePortletDataHandler {   public static final String NAMESPACE = " user_groups_admin " ;   public UserGroupsAdminPortletDataHandler ( ) {   super ( ) ;     setDataLevel ( DataLevel . PORTAL ) ;   }     } 
public class FolderList extends K9ListActivity { public void test ( ) {   if ( initialFolder != null ) {   intent . putExtra ( EXTRA_INITIAL_FOLDER , initialFolder ) ;   }   return intent ;   }     } 
public class Vector {   public int getAt ( int index ) {   return elements [ index ] ;   }   }     
public class APCleanupAlgorithm implements EpisodeCleanupAlgorithm < Integer > {     public Integer getDefaultCleanupParameter ( Context context ) {   return 0 ;   }       } 
public class AudioRecord       { public int getRecordingState ( ) { {   return mRecordingState ;   }       } } 
public class AQUtility {     public static File getCacheFile ( File dir , String url ) {   String name = getCacheFileName ( url ) ;   File file = makeCacheFile ( dir , name ) ;   return file ;     } } 
public class TextView extends View implements ViewTreeObserver . OnPreDrawListener     { public boolean dispatchPopulateAccessibilityEvent ( AccessibilityEvent event ) {   final boolean isPassword = isPasswordInputType ( mInputType ) ;   if ( ! isPassword ) {     } } } 
public class GestureDetector { public void test ( ) {   mVelocityTracker = null ;   mIsDoubleTapping = false ;   mStillDown = false ;   if ( mInLongPress ) {   mInLongPress = false ;   }     } } 
public class DocumentWindowImpl extends UserDataHolderBase implements Disposable     { public void moveText ( int srcStart , int srcEnd , int dstOffset ) { {     throw new UnsupportedOperationException ( ) ;   }     } } 
public class MocoServer { public void test ( ) {   if ( bossGroup != null ) {   bossGroup . shutdownGracefully ( ) ;   workerGroup = null ;   }     } } 
public class Validator { public void test ( ) {                 } } 
import java . util . List ;         public final class DayViewFacade {   private boolean isDecorated ;     } 
import android . util . Log ;   import java . net . InetSocketAddress ;   import java . net . ProxySelector ;   import java . net . URI ;   import java . util . regex . Matcher ;   import java . util . regex . Pattern ;     
public class BitmapDrawable extends Drawable { public void test ( ) { { {   mTargetDensity = state . mTargetDensity ;   }   updateTintFilter ( mTintFilter , state . mTint , state . mTintMode ) ;   computeBitmapSize ( ) ;   }   }     } 
public class XmppConnection implements Runnable {   public void resetEverything ( ) {   resetStreamId ( ) ;   clearIqCallbacks ( ) ;   synchronized ( this . disco ) {   disco . clear ( ) ;   }     } } 
import java . util . Comparator ;               class PeepholeMinimizeConditions   extends AbstractPeepholeOptimization { public void test ( ) {     } } 
public class Tmp { public enum UniformBinding {   WorldViewProjectionMatrix ,                 } } 
public class StringPair {   public String getTarget ( ) {   return targetString ;   }   }     
public class Snackbar extends SnackbarLayout {     protected void onDetachedFromWindow ( ) {   super . onDetachedFromWindow ( ) ;   if ( mDismissRunnable != null ) {   removeCallbacks ( mDismissRunnable ) ;   }     } } 
public class DB2Database extends AbstractJdbcDatabase {   public String getDefaultCatalogName ( ) {   if ( defaultCatalogName != null ) {   return defaultSchemaName ;   }   if ( defaultSchemaName != null ) {     } } } 
public class RajawaliRenderer implements GLSurfaceView . Renderer , INode {     protected void destroyScene ( ) {   for ( BaseObject3D child : mChildren ) {   child . destroy ( ) ;   }     } } 
public class UriUtils { public void test ( ) { { {   }   }   return displayName ;   }     } 
static abstract class HostExpr implements Expr {     private static Class maybeClass ( Object form , boolean stringOk ) throws Exception {   Class c = null ;   if ( form instanceof Symbol )   {     } } } 
public class FloatingActionButton extends ImageButton { public void test ( ) {   if ( mSettledScrollY != scrollY ) {   mSettledScrollY = scrollY ;   removeMessages ( 0 ) ;     sendEmptyMessage ( 0 ) ;   }   }     } 
public class PImage implements PConstants , Cloneable { public void test ( ) {   modified = true ;   mx1 = 0 ;   my1 = 0 ;   mx2 = width-1 ;   my2 = height-1 ;   }     } 
public class DefaultResultSetHandler implements ResultSetHandler { public void test ( ) { { { { {   }   }   }   }   autoMappingsCache . put ( mapKey , autoMapping ) ;   return autoMapping ;   }     } 
package org . codehaus . groovy . reflection ;   import com . sun . jmx . snmp . internal . SnmpDecryptedPdu ;     import java . util . AbstractList ;   import java . util . Collection ;   import java . util . Iterator ;     
public class TxEngine extends EngineWrapper {     protected boolean uncommitedData = false ;   protected final boolean fullTx ;     } 
class ListRemoteViewsFactory implements RemoteViewsService . RemoteViewsFactory {   public ListRemoteViewsFactory ( Context applicationContext , Intent intent ) {   Log . d ( TAG , " ListRemoteViewsFactory instantiated " ) ;   m_app = ( TodoApplication ) applicationContext ;   }       } 
public class ZFrame {       protected ZFrame ( ) {     }       } 
public class WifiConfiguration implements Parcelable {       public boolean isValid ( ) {   if ( SSID == null )   return false ;   if ( allowedKeyManagement == null )   return false ;     } } 
public class TitleParserTest extends DatabaseTestCase {     private void insertTitleAddTask ( String title , Task task , TaskService taskService ) {   task . setValue ( Task . TITLE , title ) ;   taskService . quickAdd ( task ) ;   }     } 
import com . siyeh . ipp . base . PsiElementPredicate ;         public class NestedTryStatementsPredicate implements PsiElementPredicate {     public boolean satisfiedBy ( PsiElement element ) {     } } 
public class TemplateManagerUtil { public void test ( ) { {   registry . ungetService ( serviceReference ) ;   _templateManagers . remove ( templateManager . getName ( ) ) ;   }   }     } 
public class RoundRobinConnectionPoolImplTest extends BaseConnectionPoolTest {       public void testAddingNewHost ( ) {   CountingConnectionPoolMonitor monitor = new CountingConnectionPoolMonitor ( ) ;     } } 
public class Log4JUtil { public void test ( ) {   return ;   }     DOMConfigurator domConfigurator = new DOMConfigurator ( ) ;     } 
public class ComponentAttributeSourceImpl implements ComponentAttributeSource {     public String getParentReferenceAttributeName ( ) {   return null ;   }     } 
public class SuggestionAutoCompleteText extends MultiAutoCompleteTextView { public void test ( ) { { {   }   }   return super . dispatchKeyEvent ( event ) ;   }       } 
public class ViewOverlay {   public void clear ( ) {   removeAllViews ( ) ;   mDrawables . clear ( ) ;   }   boolean isEmpty ( ) {     } } 
public class PApplet implements PConstants { public void test ( ) {   }             } 
public class IsolatedContext extends ContextWrapper {       public void sendBroadcast ( Intent intent ) {   mBroadcastIntents . add ( intent ) ;   }     } 
import java . util . ArrayList ;   import java . util . concurrent . * ;   import jsr166y . CountedCompleter ;   import water . DException . DistributedException ;   import water . util . Log ;     
public class GeneralRouter implements VehicleRouter {     public long [ ] getImpassableRoadIds ( ) {   return impassableRoads . toArray ( ) ;   }     } 
public class SimpleHostConnectionPoolTest { public void test ( ) {   config . setMaxConnsPerHost ( 2 ) ;   config . setInitConnsPerHost ( 1 ) ;   config . setConnectTimeout ( 200 ) ;   return config ;   }     } 
import javax . inject . Inject ;   import dagger . ObjectGraph ;   class CoffeeApp implements Runnable {   CoffeeMaker coffeeMaker ;    public void run ( ) {     } } 
public class HeadlessWorldRenderer implements WorldRenderer {     public void dispose ( ) {     }     } 
public class SerializationUtils { public void test ( ) { { {   QueryMessage query = new QueryMessage ( versions ) ;   return query ;     throw new IOException ( " Uknown message type . " ) ;   }   }   }     } 
public final class AnimChannel { public void test ( ) {   time = 0 ;   speed = 1f ;   loopMode = LoopMode . Loop ;   System . out . println ( " Setting notified false " ) ;   notified = false ;   }     } 
public class TestJsonPointer   extends BaseMapTest   {     }    
public class FeedItemDialog extends Dialog { public void test ( ) { { {   return ;   }   actionButtonCallback . onActionButtonPressed ( item ) ;   }   }     } 
public abstract class TileMachine extends TileBuildCraft implements IMachine , IP     { public int powerRequest ( ) {   if ( isActive ( ) ) {   return getPowerProvider ( ) . getActivationEnergy ( ) ;   } else {   return 0 ;   }     } } 
public class DefaultLayoutAnimator extends LayoutAnimator {   public int oldCellsRemovalAnimationStartDelay = 0 ;   public int cellPositionTransitionAnimationDuration = 2500 ;         } 
public class AjpNioProtocol extends AbstractAjpProtocol {     public void release ( SocketWrapper < NioChannel > socket ,   AjpNioProcessor processor , boolean isSocketClosing ) {   connections . remove ( socket ) ;   processor . recycle ( isSocketClosing ) ;   recycledProcessors . offer ( processor ) ;   }     } 
public abstract class AbstractGrailsPluginManager implements GrailsPluginManager       { public boolean isShutdown ( ) { {   return shutdown ;   }     } } 
public class TaskAdapter extends CursorAdapter implements Filterable { public void test ( ) {     addListeners ( view ) ;     bindView ( view , context , cursor ) ;     return view ;   }     } 
public final class TvContract {         public static final String COLUMN_PACKAGE_NAME = " package_name " ;   }       
public class IntSet {     }   static private class IntSetIterator {   static final int INDEX_ILLEGAL = - 2 ;   static final int INDEX_ZERO = - 1 ;     }  
public class SpanishXMLTreeReader implements TreeReader {   private static final String ATTR_ELLIPTIC = " elliptic " ;   private static final String EMPTY_LEAF = " - NONE - " ;   private static final String MISSING_PHRASAL = " DUMMYP " ;   private static final String MISSING_POS = " DUMMY " ;   private NodeList sentences ;   private int sentIdx ;     } 
public class RNNOptions implements Serializable {     public int numClasses = 5 ;   public boolean lowercaseWordVectors = true ;   public boolean useTensors = true ;     } 
public class JIoEndpoint {     public int getCurrentThreadsBusy ( ) {   return curThreads.workers . size ( ) ;   }     } 
public class AppleBundle extends AbstractBuildRule {         public ImmutableList < Step > getBuildSteps (   BuildContext context ,   BuildableContext buildableContext ) { {   return null ;   }   }     } 
package org . apache . coyote . http11 ;   import org . junit . Assert ;   import org . junit . Ignore ;   import org . junit . Test ;   import org . apache . catalina . Context ;     
public class ServiceBuilder     { public ServiceBuilder scope ( String scope )   { {   this . scope = scope ;   return this ;   }     } } 
public class VcsHistoryProviderBackgroundableProxy { public void test ( ) {   if ( session != null ) {   partner . reportCreatedEmptySession ( session ) ;   partner . finished ( ) ;   partner . forceRefresh ( ) ;   return ;   }   }     } 
public class AaptStep extends ShellStep {     public String getShortName ( ) { {   return String . format ( " aapt_package " ) ;   }   }     } 
public class CompilerOptions {     public void setInstrumentationTemplateFile ( String filename ) {   this . instrumentationTemplateFile = filename ;   }   public void setRecordFunctionInformation ( boolean recordFunctionInformation ) {     } } 
public class LuceneUtil {     public static void write ( IndexWriter writer ) throws IOException {     writer . close ( ) ;   }     } 
public final class CalendarContract {         public static final String DEFAULT_SORT_ORDER = " displayName " ;         } 
public class EditNotesControlSet extends PopupControlSet {     protected void refreshDisplayView ( ) {   notesPreview . setText ( editText . getText ( ) ) ;   linkifyDisplayView ( ) ;   }     } 
public class HomeActivity extends AppCompatActivity implements View . OnClickListe     { public void onTabUnselected ( int position ) { {     }       } } 
package org . apache . catalina . realm ;   import java . io . IOException ;   import java . lang . reflect . InvocationTargetException ;   import java . net . URI ;   import java . net . URISyntaxException ;   import java . security . KeyManagementException ;     
public class IndicatorLayout extends FrameLayout implements AnimationListener {     public void show ( ) {   startAnimation ( mInAnim ) ;   }     } 
public class Base { public void test ( ) { { { {   }   }   }   return found ;   }     } 
public class CoreProxy {     public static void setField804 ( EntityItem item , float value ) {   item . hoverStart = value ;   }   public static File getPropertyFile ( ) {     } } 
public class MetadataTest extends BaseDataTest {     public void setup ( ) throws Exception {   dataSource = createUnpooledDataSource ( BaseDataTest . BLOG_PROPERTIES ) ;   }       } 
public class NotificationsTable { public void test ( ) {   getDb ( ) . delete ( NOTIFICATIONS_TABLE , null , null ) ;   }             } 
public abstract class DockerSupport {   public static DockerSupport getInstance ( ) {   return ServiceManager . getService ( DockerSupport . class ) ;   }   }     
public class ChromeSettings extends BrowserSpecificSettings {   private int myRemoteShellPort = DEFAULT_REMOTE_SHELL_PORT ;   public ChromeSettings ( ) {     }       } 
public class PrincipalGroupCallback { public void test ( ) { {   return callerPrincipalCallback . getSubject ( ) ;   }   if ( groupPrincipalCallback != null ) {   return callerPrincipalCallback . getSubject ( ) ;   }   return null ;   }     } 
public class SecurityCheckInjectableTest {     public void   calling_login_should_return_user_if_user_present_in_http_session ( ) {   User userInSession = new User ( ) ;   HttpSession session = mock ( HttpSession . class ) ;     } }  
public class HeadlessMaterial extends BaseMaterial {     public void reload ( MaterialData newData ) {   this . data = data ;   }       } 
public class ErrorBar extends JPanel {     protected void done ( ) {   int bigCount = 0 ;   int totalLines = 0 ;   int currentTab = 0 ;   for ( SketchCode sc : editor . getSketch ( ) . getCode ( ) ) {     } } } 
public class IndexLookupSourceSupplier     { public void destroy ( )   { { {   throw new UnsupportedOperationException ( ) ;   }   }     } } 
public class ExpandableNotificationRow extends ActivatableNotificationView { public void test ( ) {   mMaxExpandHeight = 0 ;   mWasReset = true ;   onHeightReset ( ) ;   }       } 
class CopyFilesOrDirectoriesDialog extends DialogWrapper {     public JComponent getPreferredFocusedComponent ( ) {   return myNewNameField ;   }   protected JComponent createCenterPanel ( ) {     } } 
public class WifiP2pService extends IWifiP2pManager . Stub {     public void exit ( ) {   sendP2pStateChangedBroadcast ( false ) ;   mNetworkInfo . setIsAvailable ( false ) ;   }     } 
public final class Internal {       public static boolean inMilliseconds ( final byte [ ] qualifier ,   final byte offset ) {   return inMilliseconds ( qualifier [ offset ] ) ;   }     } 
public abstract class MasterBase implements Master {   protected boolean isLeaderMode ( ) {   return mIsLeader ;   }     protected boolean isStandbyMode ( ) {   return ! mIsLeader ;   }     } 
public final class IndexUtils { public void test ( ) {   indexMetaChangeTsk . setWork ( indexMetaChange ) ;   rootTask . addDependentTask ( indexMetaChangeTsk ) ;   return rootTask ;   }     } 
public class WordPress extends Application {   public synchronized static void updateCurrentBlogStats ( ) {     Blog currentBlog = WordPress . getCurrentBlog ( ) ;   if ( currentBlog != null ) {   String blogID = null ;     } } } 
public class RoutedStore implements Store < ByteArray , byte [ ] > {     }   private class GetAllResult {   final GetAllCallable callable ;   final Map < ByteArray , List < Versioned < byte [ ] > > > retrieved ;     } 
public abstract class TransactionBlock extends Transaction {   public void setClient ( Client client ) {   super . setClient ( client ) ;   }     public String discard ( ) {   return super . discard ( ) ;   }   }     
public class PGL { public void test ( ) {   fboLayerCreated = false ;   fboLayerInUse = false ;   firstFrame = false ;   }     } 
public class PySignatureCacheManagerImpl extends PySignatureCacheManager { public void test ( ) {   try {   data = CALL_SIGNATURES_ATTRIBUTE . readAttributeBytes ( file ) ;   }   catch ( IOException e ) {   data = null ;   }     } } 
public class MapActivity extends AccessibleActivity implements IMapLocationListe     { public Location getLastKnownLocation ( ) { {   return mapLayers . getLocationLayer ( ) . getLastKnownLocation ( ) ;   }     } } 
public class SlidingUpPanelLayout extends ViewGroup {     public void setCoveredFadeColor ( int color ) {   mCoveredFadeColor = color ;   invalidate ( ) ;   }       } 
public class MacMainFrameDecorator extends IdeFrameDecorator implements UISettin   { public void windowEnteredFullScreen ( AppEvent . FullScreenEvent event ) { {   if ( ! ORACLE_BUG_ID_8003173 ) {   enterFullscreen ( ) ;   }   }     } } 
  package javaslang . collection ;   import javaslang . Function2 ;   import javaslang . Lazy ;   import javaslang . Tuple ;   import javaslang . Tuple2 ;   import javaslang . control . None ;   import javaslang . control . Option ;     
public class IWindowManagerImpl implements IWindowManager {       public void lockNow ( Bundle options ) {     }     } 
public class ContextThemeWrapperPlus extends ContextThemeWrapper implements Supe   { public ContextThemeWrapperPlus ( Context base , int themeres ) { {   super ( base , themeres ) ;   }       } } 
public class TermSession {   public void reset ( ) {   mEmulator . reset ( ) ;   }       } 
final class YUVMonochromeBitmapSource extends BaseMonochromeBitmapSource {             } 
public class GitCheckoutProvider extends CheckoutProviderEx {     public void doCheckout ( Project project ,   Listener listener ) { {     }   }     } 
public class CalendarPickerView extends ListView { public void test ( ) {   a . recycle ( ) ;   adapter = new MonthAdapter ( ) ;   setBackgroundColor ( bg ) ;   setCacheColorHint ( bg ) ;   locale = Locale . getDefault ( ) ;     } } 
public class CachedClass {             public CachedClass getCachedClass ( ) {   return this ;     } } 
public class KeyButtonView extends ImageView { public void test ( ) { { { {     performLongClick ( ) ;   }   setPressed ( false ) ;   }   }   } ;     } 
class BrowserFrame extends Handler { public void test ( ) {   if ( sConfigCallback == null ) {   sConfigCallback = new ConfigCallback (   ( WindowManager ) context . getSystemService (   Context . WINDOW_SERVICE ) ) ;   ViewRoot . addConfigCallback ( sConfigCallback ) ;   }     } } 
public class ClosureCodegen extends MemberCodegen < JetElement > {     protected void done ( ) {   AsmUtil . writeOuterClassAndEnclosingMethod ( classDescriptor , funDescriptor , typeMapper , v ) ;   v . done ( ) ;   super . done ( ) ;   }     } 
public class ViewDragHelper { public void test ( ) {   }   void setDragState ( int state ) {   if ( mDragState != state ) {   mDragState = state ;   mCallback . onViewDragStateChanged ( state ) ;     } } } 
public class Tmp { public enum Material {   GHAST_TEAR ( 370 ) ,   GOLD_NUGGET ( 371 ) ,   NETHER_STALK ( 372 ) ,   POTION ( 373 ) ,   GLASS_BOTTLE ( 374 ) ,   SPIDER_EYE ( 375 ) ,   FERMENTED_SPIDER_EYE ( 376 ) ,     } } 
public class RtspRequestDecoder extends HttpMessageDecoder {   protected boolean isDecodingRequest ( ) {   return true ;   }     }     
public class BeanInvocationThrowsExceptionTest extends ContextTestSupport { public void test ( ) { { { {   }   }   }     }     } 
public class Views {     public static class UnableToInjectException extends RuntimeException {   UnableToInjectException ( String message , Throwable cause ) {   super ( message , cause ) ;   }     } } 
public class StartLocalClient   { public void test ( ) { {   System . err . println ( " Can ' t start client with local neo service : " +   e ) ;   }   }     } 
import morfologik . stemming . WordData ;   import org . languagetool . AnalyzedToken ;   import org . languagetool . JLanguageTool ;   import org . languagetool . tools . Tools ;   public class BaseSynthesizer implements Synthesizer {     } 
public class UsageViewContext {     public VirtualFile [ ] getFiles ( ) {   return VirtualFile . EMPTY_ARRAY ;   }   public String getName ( ) {     } } 
public final class OperationMerge {     public void unsubscribe ( ) {   System . out . println ( " unsubscribe from merge " ) ;   unsubscribed = true ;   }     } 
public class LayoutModelImpl implements LayoutModel {   protected void setSelectedLayout ( Layout selectedLayout ) {   Layout oldValue = this . selectedLayout ;   this . selectedLayout = selectedLayout ;   if ( oldValue != null ) {   saveProperties ( oldValue ) ;   }     } } 
public class rrclient { public void test ( ) { {   System . out . println ( " Received reply " + request_nbr + " [ " + reply + " ] " ) ;   }     requester . close ( ) ;   context . term ( ) ;   }     } 
public class ToolbarActionBar extends ActionBar { public void test ( ) {   mToolbar = toolbar ;   mDecorToolbar = new ToolbarWidgetWrapper ( toolbar ) ;   mWindowCallback = windowCallback ;   toolbar . setOnMenuItemClickListener ( mMenuClicker ) ;   mDecorToolbar . setWindowTitle ( title ) ;   }     } 
public class Scheduler {   private long currentTime = 0 ;   private boolean paused = false ;   public void pause ( ) {   paused = true ;     } } 
import play . mvc . Result ;   import views . helpers . Permissions ;   import views . html . system . users . edit ;   import views . html . system . users . new_user ;   import views . html . system . users . show ;   import javax . annotation . Nullable ;   import javax . inject . Inject ;     
import water . nbhm . NonBlockingHashMap ;     public final class Enum extends Iced {   public static final int MAX_ENUM_SIZE = 11000 ;   volatile NonBlockingHashMap < ValueString , Integer > _map ;     } 
public class StatsActivity extends WPActionBarActivity { public void test ( ) {   loadStatsFragments ( ) ;   setTitle ( R . string . stats ) ;   }       } 
public final class ScriptIntrinsicLUT extends ScriptIntrinsic { public void test ( ) { {   mCache [ ct + 512 ] = ( byte ) ct ;   mCache [ ct + 768 ] = ( byte ) ct ;   }   bindAllocation ( mTables , 0 ) ;   }       } 
public class ElasticSearchConnection implements Connection {     public void close ( ) throws SQLException {   client . close ( ) ;   }       } 
public class GetPatternsFromDataMultiClass implements Serializable { public void test ( ) { { {   IOUtils . writeObjectToFile ( splitSents , newf ) ;   Data . sentsFiles . add ( newf ) ;   splitSents . clear ( ) ;   }   }   }     } 
public class NoSpamLoggerTest     { public void testLoggedResult ( ) throws Exception   {   NoSpamLogger . log ( mock , Level . INFO , 5 , TimeUnit . NANOSECONDS , statement , param ) ;   checkMock ( Level . INFO ) ;     } } 
public class SybaseDialect extends AbstractTransactSQLDialect {   public int getInExpressionCountLimit ( ) {   return PARAM_LIST_SIZE_LIMIT ;   }   }     
public class FileColorsConfigurable implements Configurable , NonDefaultProjectCo     { public String getHelpTopic ( ) {   return null ;   }   public JComponent createComponent ( ) {     } } 
public class Set < ModelClass extends Model > implements WhereBase < ModelClass > , Que     { public void queryClose ( ) { { {   }   }     } } 
public class ASTWrapperPsiElement extends ElementBase implements PsiElement , Nav     { public boolean canNavigate ( ) {   return true ;   }   public boolean canNavigateToSource ( ) {     } } 
public class Term extends Activity implements UpdateCallback {   private boolean mStopServiceOnFinish = false ;   private Intent TSIntent ;   private Intent mLastNewIntent ;   public static final int REQUEST_CHOOSE_WINDOW = 1 ;   public static final String EXTRA_WINDOW_ID = " jackpal . androidterm . window_id " ;     } 
public class RegTestParams extends TestNet2Params { public void test ( ) {   port = 18444 ;   acceptableAddressCodes = new int [ ] { 0 } ;   addressHeader = 0 ;   }       } 
class IonDrawable extends LayerDrawable { public void test ( ) {   try {   gifDecoder . nextFrame ( ) ;   }   catch ( Exception e ) {   exception = e ;   }     } } 
public class Config   { public volatile Long request_timeout_in_ms = new Long ( 10000 ) ;   public Long read_request_timeout_in_ms = new Long ( 10000 ) ;   public Long range_request_timeout_in_ms = new Long ( 10000 ) ;     } 
public class CordovaWebView extends WebView {     private Context mCtx ;   private CordovaWebViewClient viewClient ;   private CordovaChromeClient chromeClient ;       } 
public class Particle extends BaseObject3D { public void test ( ) { { {   throw new RuntimeException ( " You need to set a particle material first . " ) ;   }   mParticleShader . setCamera ( camera ) ;   mParticleShader . setPointSize ( mPointSize ) ;   }   }     } 
public abstract class Editor extends JFrame implements RunnerListener { public void test ( ) { {   sketchMenu . add ( item ) ;   menuList . add ( item ) ;   }     }       } 
public class IndexAccessorImpl implements IndexAccessor { public void test ( ) {   try {   _indexSearcherManager . close ( ) ;   _indexWriter . close ( ) ;   _directory . close ( ) ;   }   catch ( Exception e ) {     } } } 
public class CalendarPickerView extends ListView { public void test ( ) {   if ( wasSelected ) {   dateListener . onDateSelected ( clickedDate ) ;   } else if ( ! wasSelected ) {   dateListener . onDateUnselected ( clickedDate ) ;   }   }     } 
public class SocialConfigurationUtil { public void test ( ) {   if ( participationValueElement != null ) {   increment = GetterUtil . getInteger (   participationValueElement . getText ( ) ) ;     }   activityCounterDefinition . setIncrement ( increment ) ;     } } 
package com . mongodb ;       public class MongoInterruptedException extends MongoException {   public MongoInterruptedException ( final InterruptedException e ) {   super ( " A driver operation has been interrupted " , e ) ;   }     } 
class Http2Parser {   private void readUnknownFrame ( int streamId , FrameType frameType , int flags , int payloadSize )   throws IOException {   output . swallow ( streamId , frameType , flags , payloadSize ) ;   swallow ( payloadSize ) ;   }     } 
public abstract class BaseSubscriptionLocalizedContentTestCase         { public void tearDown ( ) throws Exception { {   super . tearDown ( ) ;     LocaleThreadLocal . setDefaultLocale ( defaultLocale ) ;   }     } } 
import javax . annotation . Nullable ;     public class UniqueIndexViolationException extends UserException {     private final String index ;       } 
public class VersionCheckThread extends Periodical {     public int getInitialDelaySeconds ( ) {   return 0 ;   }       } 
public class WebView extends AbsoluteLayout       { public static synchronized PluginList getPluginList ( ) { {   return null ;   }       } } 
public class DummyProxySession implements Session {   public void setValid ( boolean isValid ) {     }   }     
public class DevicePolicyManagerService extends IDevicePolicyManager . Stub { public void test ( ) { { { { {   }   }   }   return null ;   }   }     } 
public class AndroidSafeDeleteProcessorDelegate implements SafeDeleteProcessorDe     { public UsageInfo [ ] preprocessUsages ( Project project , UsageInfo [ ] usages ) { {   return getBaseHandler ( ) . preprocessUsages ( project , usages ) ;   }       } } 
public class PlaygroundTest extends TestBase { public void test ( ) {   static class Foo {   int doSomeThing ( ) {   System . out . println ( getStuff ( ) ) ;   return 0 ;   }     } } } 
public abstract class VirtualFile extends UserDataHolderBase implements Modifica       { public String getCanonicalPath ( ) { {   return null ;   }       } } 
public class PSurfaceJOGL implements PSurface { public void test ( ) {   KeyEvent tke = new KeyEvent ( nativeEvent , nativeEvent . getWhen ( ) ,   KeyEvent . TYPE , peModifiers ,   keyChar ,   keyCode ,   nativeEvent . isAutoRepeat ( ) ) ;   sketch . postEvent ( tke ) ;     } } 
public class NotificationStackScrollLayout extends ViewGroup     { public void onChildAnimationFinished ( ) { {   applyCurrentState ( ) ;   mAnimationEvents . clear ( ) ;   }     } } 
public class WsRemoteEndpoint implements RemoteEndpoint { public void test ( ) { {   }   sendMessage ( Constants . OPCODE_TEXT , textToByte , first , isLast ) ;   if ( ! isLast ) {   isText = Boolean . FALSE ;   }   }     } 
public class CacheOffHeap { public void test ( ) { {   }     cache . close ( ) ;   }     } 
public class KeyguardUpdateMonitor {   private int mFailedAttempts = 0 ;   private int mFailedBiometricUnlockAttempts = 0 ;   private static final int FAILED_BIOMETRIC_UNLOCK_ATTEMPTS_BEFORE_BACKUP = 15 ;   private boolean mClockVisible ;     } 
final class TaglibRule extends Rule {   final class TaglibUriRule extends Rule {     private boolean duplicateUri ;   public TaglibUriRule ( ) {     } } } 
public final class RxJavaHooks {             public static void lockdown ( ) {   lockdown = true ;     } } 
public class Tmp { public AFn ( IPersistentMap meta ) {   } public AFn ( ) {   }   public Object call ( ) throws Exception {   return invoke ( ) ;     } } 
public class IOUtils { public void test ( ) {   for ( int i = 0 ; i < rtn . length ; + + i ) {   rtn [ i ] = linesReversed . get ( rtn . length - i - 1 ) ;   }   return rtn ;   }     } 
public abstract class AbstractProcessor < S > implements ActionHook , Processor < S > {     public String getClientCertProvider ( ) {   return clientCertProvider ;   }     } 
import org . languagetool . Experimental ;           public class PatternTokenBuilder {   private PatternToken token ;     } 
public class CommitLogStressTest     { public void testRandomSize ( ) throws Exception   { {   randomSize = false ;   discardedRun = false ;   testAllLogConfigs ( ) ;   }     } } 
class ZoomManager {   private int mInitialScrollY ;   private long mZoomStart ;   private static final int ZOOM_ANIMATION_LENGTH = 500 ;     private boolean mSupportMultiTouch ;     } 
import java . util . * ;   import javax . swing . * ;   import com . sun . jna . Library ;   import com . sun . jna . Native ;     import processing . app . debug . Compiler ;   import processing . core . * ;     
public class GPUImage {     protected void onPostExecute ( Bitmap bitmap ) {   super . onPostExecute ( bitmap ) ;   mGPUImage . setImage ( bitmap ) ;   }     } 
public class NetworkManager { public void test ( ) {   String type = " " ;   if ( info != null )   {   info . getTypeName ( ) ;   return type . equals ( " WIFI " ) ;   }   return false ;     } } 
public final class HikariPool implements HikariPoolMBean   { public void test ( ) {   if ( ! connectionProxy . isBrokenConnection ( ) )   {   logPoolState ( " Release connection " ) ;   connectionProxy . markLastAccess ( ) ;   idleConnectionCount . incrementAndGet ( ) ;     } } } 
  package org . opensolaris . opengrok . analysis ;   import java . io . BufferedReader ;   import java . io . FileReader ;   import java . io . FilterReader ;   import java . io . Reader ;   import java . util . HashMap ;     
public class ExecutionDelayTest extends HazelcastTestSupport {   public static class Task implements Callable , Serializable {   private String uuid ;     } public Task ( ) {   }     } 
public class CustomerDaoImplTest {     public void getNonExistinCustomerById ( ) {   final int nonExistingId = 999 ;   assertNull ( impl . getCustomerById ( nonExistingId ) ) ;   }     } 
public class TachyonMaster {             public void stop ( ) throws Exception {   if ( mIsServing ) {     } } } 
public class EthernetDataTracker implements NetworkStateTracker {       public String getTcpBufferSizesPropName ( ) {   return " net . tcp . buffersize . wifi " ;   }   public void setDependencyMet ( boolean met ) {     } } 
abstract class AbstractTFS extends FileSystem {   public TachyonFS getTachyonFS ( ) {   return mTFS ;   }   public URI getUri ( ) {   return mUri ;   }     } 
package com . facebook ;   final class FacebookSdkVersion {   public static final String BUILD = " 3 . 0 " ;   public static final String MIGRATION_BUNDLE = " fbsdk : 20121026 " ;   }     
public class SimpleWebViewFragment extends Fragment implements OnClickListener {     public void onDetach ( ) { {   super . onDetach ( ) ;   mWebview . destroy ( ) ;   }   }     } 
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 3 . 1 " ;   }   public static String getSignature ( ) {     } } 
public class TextIconGenerator { public void test ( ) {   switch ( style ) {   case STYLE_DEFAULT :   case STYLE_WHITE :   return R . drawable . bubble_white ;   case STYLE_RED :   case STYLE_BLUE :   case STYLE_GREEN :     } } } 
import java . util . List ;           public class TelecomManager { public void test ( ) {     } } 
final class AdvancedLeakAwareByteBuf extends WrappedByteBuf {     public int forEachByteDesc ( ByteProcessor processor ) {   recordLeakNonRefCountingOperation ( ) ;   recordLeakNonRefCountingOperation ( ) ;   return super . forEachByteDesc ( processor ) ;   }     } 
import edu . stanford . nlp . util . StringUtils ;   public class RNNOptions implements Serializable { public void test ( ) {           } } 
import java . io . OutputStream ;     public class StringOutputStream extends OutputStream {   StringBuilder mBuf ;     public void write ( int data ) throws IOException {     } } 
public class MenuDrawer extends ViewGroup {         private static final int MAX_DRAG_BEZEL_DP = 16 ;         } 
public class DeepLearning extends Job . ValidatedJob { public void test ( ) {   score_validation_samples = cp . score_validation_samples ;   shuffle_training_data = cp . shuffle_training_data ;   force_load_balance = cp . force_load_balance ;   state = JobState . RUNNING ;   return ;   }     } 
public abstract class DBCollection {       protected List < DBObject > getHintFields ( ) {   return Collections . unmodifiableList ( _hintFields ) ;   }       } 
public class BasketTree extends NetworkTree implements ZLAndroidTree {   public NetworkLibraryItem getHoldedItem ( ) {   return null ;   }   }     
public class ConstructorCallExpression extends Expression {   public boolean isUsingAnonymousInnerClass ( ) {   return usesAnonymousInnerClass ;   }       public boolean isUsingAnnonymousInnerClass ( ) {   return isUsingAnonymousInnerClass ( ) ;   }   }     
public class HystrixTimerTest {   public void setUp ( ) {   HystrixTimer timer = HystrixTimer . getInstance ( ) ;   HystrixTimer . reset ( ) ;   }       } 
public final class FloatingToolbar { public void test ( ) {   super ( Preconditions . checkNotNull ( popup ) . mContext ) ;   this . mPopup = popup ;   setScrollBarDefaultDelayBeforeFade ( ViewConfiguration . getScrollDefaultDelay ( ) * 3 ) ;   }       } 
public final class ContactsContract { public void test ( ) { {   intent . putExtra ( EXTRA_TARGET_RECT , target ) ;   intent . putExtra ( EXTRA_MODE , mode ) ;   intent . putExtra ( EXTRA_EXCLUDE_MIMES , excludeMimes ) ;   context . startActivity ( intent ) ;   }   }     } 
import gherkin . formatter . Formatter ;   import gherkin . formatter . Reporter ;   import gherkin . formatter . model . Result ;         public class JUnitReporterTest   {     } 
public class ErrorReporter implements Thread . UncaughtExceptionHandler { public void test ( ) {     reportBuilder ( )   . message ( " Uncaught exception " )   . exception ( e )   . endsApplication ( )   . send ( ) ;     } } 
import java . util . Iterator ;   import java . util . Map ;   import java . io . Serializable ;   final public class PersistentStructMap extends APersistentMap {   } public static class Def implements Serializable {   final ISeq keys ;     } 
public class ViewConfiguration {                 public static long getGlobalActionKeyTimeout ( ) {     } } 
public class FileOperationsHelper {     public void toggleKeepInSync ( OCFile file , boolean isFavorite ) {   Log_OC . e ( TAG , " KeepInSync " ) ;   file . setKeepInSync ( isFavorite ) ;   mFileActivity . getStorageManager ( ) . saveFile ( file ) ;     } } 
public class RouteProvider { public void test ( ) { { { { {   }   }   pt . desc = pt . name ;     }   }   return gpx ;   }     } 
public class DrawHandler extends Handler {     public void quit ( ) {   removeCallbacksAndMessages ( null ) ;   sendEmptyMessage ( QUIT ) ;   }     } 
final class BasicOperationService implements InternalOperationService {     public int getRemoteOperationsCount ( ) {     return 0 ;   }       } 
public class VoiceInteractionService extends Service { public void test ( ) {   if ( curComp == null ) {   return false ;   }   return curComp . equals ( cur ) ;   }       } 
public abstract class JspManager {     public abstract XmlNSDescriptor getActionsLibrary ( final PsiFile context ) ;   }     
public abstract class AbstractService implements VoldemortService {   private static final Logger logger = Logger . getLogger ( VoldemortService . class ) ;   private AtomicBoolean isStarted ;   private final String name ;   public AbstractService ( String name ) {     } } 
public class Bootstrap extends AbstractBootstrap < Bootstrap , Channel > {   private Bootstrap ( Bootstrap bootstrap ) {   super ( bootstrap ) ;   remoteAddress = bootstrap . remoteAddress ;   }     } 
public class Frequency extends Entity { public void test ( ) {   writeTimeField ( f . end_time ) ;   writeIntField ( f . headway_secs ) ;   writeIntField ( f . exact_times ) ;   }       } 
public class WifiScanner { public void test ( ) {   validateChannel ( ) ;   HotlistSettings settings = new HotlistSettings ( ) ;   settings . bssidInfos = bssidInfos ;   sAsyncChannel . sendMessage ( CMD_SET_HOTLIST , 0 , putListener ( listener ) , settings ) ;   }     } 
public class Tmp { public enum ChatColor {         BLACK ( ' 0 ' , 0x01 ) ,           } } 
public final class Response { public void test ( ) {   synchronized ( fireListenerLock ) {   if ( fireListener ) {     return true ;   }   action ( ActionCode . NB_WRITE_INTEREST , isReady ) ;   fireListener = ! isReady . get ( ) ;     } } } 
public class WsHttpUpgradeHandler implements HttpUpgradeHandler {   private String subProtocol ;   private Map < String , String > pathParameters ;   private boolean secure ;   WebConnection connection ;   private WsSession wsSession ;     } 
public class WebView extends AbsoluteLayout               { public int getVisibleTitleHeight ( ) {       } } 
public class UpgradeServletOutputStream extends ServletOutputStream { public void test ( ) { {   return ;   }   closed = true ;   flushInternal ( true , true ) ;   }     } 
public abstract class MenuDrawer extends ViewGroup { public void test ( ) {   switch ( action ) {   case MotionEvent . ACTION_DOWN : {   mLastMotionX = mInitialMotionX = ev . getX ( ) ;   final boolean allowDrag = onDownAllowDrag ( ev ) ;   if ( allowDrag ) {     } } } } } 
public class AccessibilityNodeInfo implements Parcelable {       public boolean refresh ( ) {   return refresh ( false ) ;   }       } 
public class AstridActivity extends FragmentActivity     { public void onBackPressed ( ) { {   super . onBackPressed ( ) ;   }     } } 
public abstract class TextToSpeechService extends Service {   private boolean mFirstIdle = true ;   public SynthThread ( ) {   super ( SYNTH_THREAD_NAME , android . os . Process . THREAD_PRIORITY_AUDIO ) ;   }       } 
public class Tmp { public interface FreeFlowEventListener {   } public void layoutComplete ( ) ;   public void layoutComputed ( ) ;         public void dataChanged ( ) ;       } 
public class HorizontalChangeHandler extends AnimatorChangeHandler {     protected void resetFromView ( View from ) {   from . setTranslationY ( 0 ) ;   }   }     
public final class AudioAttributes implements Parcelable { public void test ( ) { {     Log . e ( TAG , " Invalid stream type " + streamType + " for AudioAttributes " ) ;   }   return this ;   }     } 
public class TextureView extends View {     public void setLayerType ( int layerType , Paint paint ) {   if ( paint != mLayerPaint ) {   mLayerPaint = paint ;   invalidate ( ) ;   }   }     } 
public class MessagingListener {   public void folderStatusChanged ( Account account , String folderName , int unreadMessageCount ) { }   public void folderStatusChanged ( Account account , String folderName ) { }     public void systemStatusChanged ( ) { }     } 
import java . util . List ;   public class ChooseIdentity extends K9ListActivity {   Account mAccount ;   String mUID ;   ArrayAdapter < String > adapter ;   public static final String EXTRA_ACCOUNT = " com . fsck . k9 . ChooseIdentity_account " ;     } 
public class AudioHandler extends Plugin { public void test ( ) { {   return false ;   }   AudioPlayer audio = this . players . get ( id ) ;   audio . destroy ( ) ;   return true ;   }     } 
public class GitLogUI implements Disposable { public void test ( ) { { { {   }   myBranchSelectorAction . setSymbolicRefs ( myRecalculatedCommon ) ;   }   } ;   }     } 
public class TestWebSocket extends TomcatBaseTest {   private static final long serialVersionUID = 1L ;     protected StreamHandler createWebSocketInbound ( String subProtocol ,   HttpServletRequest request ) {   return new Bug53339WsInbound ( ) ;   }     } 
public class AtmosphereFramework { public void test ( ) {   interceptors . clear ( ) ;   broadcasterFactory = null ;   annotationFound = false ;   return this ;   }     } 
public class IWindowManagerImpl implements IWindowManager {     public void requestAppKeyboardShortcuts ( IResultReceiver receiver ) throws RemoteException {   }   }     
import org . mockito . internal . junit . JUnitRule ;         public class MockitoJUnitRule implements MethodRule , MockitoRule {     private final JUnitRule jUnitRule ;     } 
public class PreviewParseWriter extends Iced implements ParseWriter { public void test ( ) { { {   }     types [ i ] = Vec . T_BAD ;   }   return types ;   }     } 
public class ChatEventStream extends EventStream {     public String getApplication ( ) {   return " fitcDemo " ;   }   public void connectionOpened ( RTMPConnection conn , RTMP state ) {     } } 
public class EthernetDataTracker implements NetworkStateTracker {   public String getTcpBufferSizesPropName ( ) {   return " net . tcp . buffersize . wifi " ;   }   }     
public class AbstractAggregationTest   { public static void startup ( ) { {   HAZELCAST_INSTANCE = Hazelcast . newHazelcastInstance ( ) ;   Hazelcast . newHazelcastInstance ( ) ;   Hazelcast . newHazelcastInstance ( ) ;   }       } } 
public class SomeRunnableTask implements Runnable , Serializable , ApplicationCont   { public void setApplicationContext ( final ApplicationContext applicationContext ) throws BeansException { { {   context = applicationContext ;   }   }     } } 
public abstract class CreateStreamRequest {   public abstract String contentPack ( ) ;       public abstract Stream . MatchingType matchingType ( ) ;       } 
public class SlidingUpPanelLayout extends ViewGroup {               protected void onFinishInflate ( ) {     } } 
public class HighlightBuilder implements ToXContent {   int numOfFragments = - 1 ;   Boolean requireFieldMatch ;   private Field ( String name ) {   this . name = name ;   }     } 
public class Tmp { public static void main ( String [ ] args ) throws Exception { { { {   {   e . printStackTrace ( err ) ;   }   }   }   }     } } 
import java . util . regex . Pattern ;             public class DefaultGroovyMethods extends DefaultGroovyMethodsSupport { public void test ( ) {     } } 
public class GroupServiceTest { public void test ( ) {   testGroup (   user , group , null , null , true , false , false , false , true , true ,   true ) ;         }       } 
public class Tmp { public enum Material {   SUGAR ( 353 ) ,   CAKE ( 354 , 1 ) ,   BED ( 355 ) ,   DIODE ( 100 ) ,   GOLD_RECORD ( 2256 , 1 ) ,   GREEN_RECORD ( 2257 , 1 ) ;     } } 
public abstract class Transition implements Cloneable {     public Transition removeTarget ( int targetId ) {   if ( targetId > 0 ) {   mTargetIds . remove ( targetId ) ;   }   return this ;   }     } 
public class NoSpamLoggerTest     { public void testLoggedResult ( ) throws Exception   {   NoSpamLogger . log ( mock , Level . INFO , 5 , TimeUnit . NANOSECONDS , statement , param ) ;   checkMock ( Level . INFO ) ;     } } 
public class ByteBufferSend implements Send {     public boolean complete ( ) {   return remaining > 0 ;   }       } 
public abstract class DurationType implements Serializable {   private static final class MillisType extends DurationType {   static final long serialVersionUID = - 4314867016852780422L ;   public boolean isPrecise ( ) {   return true ;   }     } } 
public class BuildAndDecodeTest {     public static void afterClass ( ) throws BrutException {     }       } 
public class Matrix2f {       public Matrix2f ( float [ ] dataArray ) {   mMat = new float [ 2 ] ;   System . arraycopy ( dataArray , 0 , mMat , 0 , mMat . length ) ;   }     } 
public abstract class DebuggerTestCase extends ExecutionWithDebuggerToolsTestCas       { public ConfigurationType getType ( ) { {   return null ;   }       } } 
public class CallSessionImpl   { public void test ( ) {   Player player = ( Player ) playersIter . next ( ) ;   player . stop ( ) ;   playersIter . remove ( ) ;   }     } 
import org . junit . Assert ;   import org . junit . Before ;   import org . junit . Test ;   import tachyon . master . IndexedSet ;     public class IndexedSetTest {   private static class Pair {   private int mInt ;     } } 
public class RajawaliRenderer implements GLSurfaceView . Renderer , INode {   public void setCamera ( Camera mCamera ) {   this . mCamera = mCamera ;   }   public Camera getCamera ( ) {     } } 
public class Tmp { public interface CordovaWebView {   void setNetworkAvailable ( boolean online ) ;     Context getContext ( ) ;   void loadUrl ( String url ) ;     } } 
public class DBMaker {         public DBMaker asyncThreadDeamonEnable ( ) {   this . _asyncThreadDeamon = true ;   return this ;   }     } 
public class EditGroupAction extends PortletAction { public void test ( ) {   String friendlyURL = null ;   boolean active = false ;   boolean manualMembership = true ;     int membershipRestriction =   GroupConstants . DEFAULT_MEMBERSHIP_RESTRICTION ;     } } 
public class MasterClient extends CommunicationProtocol implements Master , Chann   { public void test ( ) { {   msgLog . logMessage ( " MasterClient shutdown " , true ) ;   channelPool . close ( true ) ;   }   }     } 
public final class Futures { public void test ( ) { { { {   }   }   }   }       } 
package com . mongodb ;   import com . mongodb . util . TestCase ;   import org . testng . Assert ;   import org . testng . annotations . Test ;   import java . net . UnknownHostException ;     
public class Tmp { public interface PConstants {   static final int ENABLE_STROKE_PURE = 9 ;   static final int DISABLE_STROKE_PURE = - 9 ;   static final int ENABLE_RETINA_PIXELS = 10 ;   static final int DISABLE_RETINA_PIXELS = 10 ;     static final int HINT_COUNT = 11 ;       } } 
public class ExtractEditLayout extends LinearLayout { public void test ( ) {   mCallback . onDestroyActionMode ( this ) ;   mCallback = null ;   mExtractActionButton . setVisibility ( VISIBLE ) ;   mEditButton . setVisibility ( INVISIBLE ) ;     } } 
public final class Util {         public static int getSize ( Bitmap bitmap ) {   return getBitmapByteSize ( bitmap ) ;   }     } 
public class ShutdownTest     { public void testShutdown4 ( ) throws SQLException   {   int threadCountStart = threadCount ( ) ;     StubConnection . slowCreate = true ;   HikariConfig config = new HikariConfig ( ) ;     } } 
public abstract class BaseButtonBehavior {   private boolean myPressedByMouse ;   private boolean mySelected ;   private TimedDeadzone myMouseDeadzone ;   private int myActionTrigger ;     } 
public class Instruction3rmi extends Instruction implements RegisterRangeInstruc     { public Format getFormat ( ) {   return Format . Format3rms ;   }   public int getRegCount ( ) {     } } 
public final class CookieManager {   public void setCookie ( String url , String value ) {   if ( JniUtil . useChromiumHttpStack ( ) ) {   setCookie ( url , value , false ) ;   }   WebAddress uri ;     } } 
public class ConversationFragment extends Fragment {     public void onBackendConnected ( ) {   this . conversation = activity . getSelectedConversation ( ) ;   if ( this . conversation == null ) {   return ;     } } } 
public final class ReplayOutputChannelContext extends AbstractOutputChannelConte     { public boolean isInputChannel ( ) { {   return true ;   }       } } 
public abstract class AbstractType     { public final int hashCode ( )   { { {   return getClass ( ) . hashCode ( ) ;   }   }     } } 
public class NonBooleanMethodNameMayNotStartWithQuestionInspection     { public void readSettings ( Element element ) throws InvalidDataException { {   System . out . println ( " read settings " ) ;   super . readSettings ( element ) ;   parseQuestionString ( ) ;   }     } } 
public class Sprite extends TextureRegion {       public Sprite ( ) {   }       } 
public class ParticleSystem extends Entity {   public void reset ( ) {   super . reset ( ) ;   this . mParticlesAlive = 0 ;   }     } 
package com . lmax . disruptor ;       public class EventPoller < T >   {   private final DataProvider < T > dataProvider ;     } 
public class FastArray implements Cloneable {     public String toString ( ) { {   return toList ( ) . toString ( ) ;   }   }     } 
public class ProjectSourceControlPreferencesPane extends ProjectPreferencesPane     { public String getName ( )   { {   return " Source Control " ;   }       } } 
public class AstridNewSyncMigrationTest extends NewSyncTestCase {   public void testAstridSyncMigration ( ) {   setupOldDatabase ( ) ;   Preferences . clear ( AstridNewSyncMigrator . PREF_SYNC_MIGRATION ) ;   new AstridNewSyncMigrator ( ) . performMigration ( ) ;   assertAllModelsHaveUUID ( ) ;   assertAllTagsHaveTagData ( ) ;     } } 
public class TvView extends ViewGroup { public void test ( ) {   if ( this != mSessionCallback ) {   return ;   }   mSessionCallback = null ;   mSession = null ;   if ( mListener != null ) {     } } } 
public class GCalControlSet extends PopupControlSet { public void test ( ) {   DependencyInjectionService . getInstance ( ) . inject ( this ) ;   this . title = title ;   calendars = Calendars . getCalendars ( ) ;   }       } 
public class PortletKeys {   public static final String ITEM_SELECTOR =   " com_liferay_item_selector_web_portlet_ItemSelectorPortlet " ;   public static final String JOURNAL =   " com_liferay_journal_web_portlet_JournalPortlet " ;     public static final String LAYOUTS_ADMIN =   " com_liferay_layout_admin_web_portlet_LayoutAdminPortlet " ;     } 
public class HighLevelFilter extends Filter { public void test ( ) { {   if ( loggingEvent . getMarker ( ) == Logging . LIFECYCLE ) {   return FilterReply . ACCEPT ;   } else {   return FilterReply . DENY ;   }   }   }     } 
public class AsyncStateMachine {     public void recycle ( ) {   asyncCtxt = null ;   state = AsyncState . DISPATCHED ;   }     } 
abstract class Platform { public void test ( ) {   try {   Class . forName ( " rx . Observable " ) ;   return true ;   } catch ( ClassNotFoundException e ) {   }   return false ;   }     } 
public class YUICompressor { public void test ( ) {   if ( inputFilename . equals ( " - " ) ) {   in = new InputStreamReader ( System . in , charset ) ;   } else {     } } } 
public class Files { public void test ( ) {     class Native {   static {   System . loadLibrary ( " retrofit " ) ;   }   static native void sync ( String path ) ;     } } } 
public class MessageListFragment extends SherlockFragment implements OnItemClick     { public void onLoaderReset ( Loader < Cursor > loader ) { {   mSelected = null ;   mAdapter . swapCursor ( null ) ;   }     } } 
public class PApplet extends Applet       { public boolean saveJSONArray ( JSONArray json , String filename ) { {   return saveJSONArray ( json , filename ) ;   }     } } 
public final class CdmaCallTracker extends CallTracker { public void test ( ) {   if ( ar . exception == null ) {     pendingMO . onConnectedInOrOut ( ) ;   }   break ;     } } 
public class WordPress extends Application { public void test ( ) {   editor . remove ( WordPress . ACCESS_TOKEN_PREFERENCE ) ;   editor . commit ( ) ;   if ( wpDB != null ) {   wpDB . deleteAllAccounts ( ) ;   wpDB . updateLastBlogId ( - 1 ) ;   wpDB . deleteDatabase ( this ) ;   }     } } 
public final class Phases { public void test ( ) {   this . persistenceManager = persistenceManager ;   this . sensorContext = sensorContext ;   this . index = index ;   }       } 
import org . mockito . internal . matchers . Equals ;   public class Invocation implements PrintableInvocation {   private static final int MAX_LINE_LENGTH = 35 ;   private static final String TAB = " " ;   private final int sequenceNumber ;   private final Object mock ;   private final Method method ;     } 
public class SnackBar {     public SnackBar show ( int message , short duration ) {   show ( message , duration ) ;   return this ;   }     } 
public class StreamStateMachine {     public synchronized void receivedPushPromis ( ) {   stateChange ( State . IDLE , State . RESERVED_REMOTE ) ;   }     } 
class BazaarHistoryParser implements HistoryParser , Executor . StreamHandler { public void test ( ) { {   entries . add ( entry ) ;   }   history . setHistoryEntries ( entries ) ;   }     } 
public final class MenuItemImpl implements MenuItem {     public boolean expandActionView ( ) {   if ( hasCollapsibleActionView ( ) ) {   return false ;   }     } } 
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 3 . 3 " ;   }   public static String getSignature ( ) {     } } 
