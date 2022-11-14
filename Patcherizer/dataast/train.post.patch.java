public abstract class Connection {     public static String stateToString ( int state ) {   switch ( state ) {   case State . INITIALIZING :   return " INITIALIZING " ;   case State . NEW :   return " NEW " ;   case State . RINGING :     } } }  
public class NotificationStackScrollLayout extends ViewGroup     { public void onChildAnimationFinished ( ) { {   updateChildren ( ) ;   mAnimationEvents . clear ( ) ;   }     } }  
public abstract class PoolingHttpDestination < C extends Connection > extends HttpD   { public void close ( )   { {   super . close ( ) ;   connectionPool . close ( ) ;   }     } }  
public class CounterLatch {   private final Sync sync ;   private final AtomicLong count ;   private volatile long signal ;   private volatile boolean released = false ;       }  
  package groovy . util ;   import groovy . lang . GroovyObjectSupport ;   import groovy . lang . Writable ;   import org . codehaus . groovy . runtime . DefaultGroovyMethods ;      
public class PyCodeStyleSettingsProvider extends CodeStyleSettingsProvider {     public String getHelpTopic ( ) { { {   return " reference . settingsdialog . codestyle . python " ;   }   } ;   }     }  
public class UpgradeSocial extends UpgradeProcess { public void test ( ) { { {   continue ;   }   keys . add ( key ) ;     return modifiedDate ;   }   }     }  
public class LightweightHint extends UserDataHolderBase implements Hint {     public boolean vetoesHiding ( ) {   return false ;   }     }  
public class Tmp { public interface ModelBuilder < T > extends LongRunningOperation {           ModelBuilder < T > withCancellationToken ( CancellationToken cancellationToken ) ;       } }  
import java . util . ArrayList ;   import java . util . List ;   public class KafkaConfig implements Serializable {   } public static interface BrokerHosts extends Serializable {   }      
public class ShowcaseView extends RelativeLayout     { public static class Builder {   private final ShowcaseView showcaseView ;   private final Activity activity ;   private ViewGroup parent ;     } }  
public class EntryEvent extends EventObject {   public int getEventType ( ) {   return eventType ;   }     public String getName ( ) {   return name ;   }     public String toString ( ) {     } }  
public class DeletionRetentionStrategy extends AbstractIndexCountBasedRetentionS     { public Class < ? > configurationClass ( ) { { {   return DeletionRetentionStrategyConfig . class ;   }   }     } }  
public class Tmp { public interface CommandSender {   } public boolean isPlayer ( ) ;                 }  
public class Tmp { public interface IdeaPlugin extends DomElement {     List < GenericDomValue < String > > getChangeNotess ( ) ;   GenericDomValue < String > addChangeNotes ( ) ;     } }  
class IonDrawable extends Drawable { public void test ( ) { {   imageView . setImageDrawable ( drawable ) ;   IonBitmapRequestBuilder . doAnimation ( imageView , inAnimation , inAnimationResource ) ;   imageViewFuture . setComplete ( e , imageView ) ;   }   }     }  
import static java . lang . String . format ;     public final class ValidationUtil {   private ValidationUtil ( ) { }             }  
public class ViewConfiguration {         private static final int OVERSCROLL_DISTANCE = 0 ;         }  
public class CompilationChecker {     public boolean ignoreOptionalProblems ( ) { {   return false ;   }   }     }  
package water ;   import java . lang . management . ManagementFactory ;   import javax . management . * ;   import water . util . LinuxProcFileReader ;   import water . util . Log ;   import water . init . * ;      
public class RoundedAvatarDrawable extends Drawable {   private final int mBitmapHeight ;   private Paint mPaintBorder ;   private int mBorderWidth = 4 ;   public RoundedAvatarDrawable ( Bitmap bitmap ) {   mBitmap = bitmap ;     } }  
public class EntityLaser extends Entity {   public String getTexture ( ) {   return texture ;   }     public int getBrightnessForRender ( float par1 )   {   return 210 ;   }   }      
public class AssociationsTest {         public void checkAdd ( PsiElement element ) throws IncorrectOperationException {   }   public class AssociationsTest {   }       public void checkDelete ( ) throws IncorrectOperationException {   }     }  
public abstract class Rule {           public int getFalsePositives ( ) {   return - 1 ;     } }  
package org . mongodb . util ;     public class FieldHelpers {   public static boolean asBoolean ( Object fieldValue ) {     } }  
public class AsyncTwitterTest extends TestCase implements TwitterListener {   private synchronized void waitForResponse ( ) {   try {   this . wait ( 30000 ) ;   } catch ( InterruptedException e ) {   e . printStackTrace ( ) ;   }     } }  
public abstract class CloseableResource < T > implements Closeable {           public abstract void close ( ) ;   }      
public final class ShortcutUtils { public void test ( ) { { { {   }   } ;     AndroidUtils . executeOnPool ( shortCutTask ) ;   }   }     }  
public class SearchContainerTag < R > extends ParamAndPropertyAncestorTagImpl { public void test ( ) {   _rowChecker = null ;   _searchContainer = null ;   _searchTerms = null ;   _total = 0 ;   _totalVar = SearchContainer . DEFAULT_TOTAL_VAR ;   _var = SearchContainer . DEFAULT_VAR ;     } }  
public class TridentTopologyBuilder { public void test ( ) { { {   bd . allGrouping ( masterCoordinator ( batchGroup ) , MasterBatchCoordinator . COMMIT_STREAM_ID ) ;   }   for ( Map m : c . componentConfs ) {   bd . addConfigurations ( m ) ;   }   }   }     }  
public class AsyncHttpClient { public void test ( ) {   ConnManagerParams . setMaxTotalConnections ( httpParams , DEFAULT_MAX_CONNECTIONS ) ;   HttpConnectionParams . setSoTimeout ( httpParams , socketTimeout ) ;   HttpConnectionParams . setConnectionTimeout ( httpParams , socketTimout ) ;   HttpConnectionParams . setTcpNoDelay ( httpParams , true ) ;   HttpConnectionParams . setSocketBufferSize ( httpParams , DEFAULT_SOCKET_BUFFER_SIZE ) ;     } }  
public class EnterpriseServerBuilder extends ServerBuilder     { public void stop ( )   { { {   super . stop ( ) ;   configFile . delete ( ) ;   }   } ;     } }  
public final class ResourceLeakDetector < T > {         public static boolean isEnabled ( ) {   return ! disabled ;   }     }  
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 2 . 2 " ;   public static String getVersion ( ) {   return VERSION ;     } }  
public class AudioManager { public void test ( ) {   }                 }  
public class Tmp { public interface Property {   Boolean getReadOnly ( ) ;   void setReadOnly ( Boolean readOnly ) ;   Integer getPosition ( ) ;     } }  
public final class CheckForInOverArray     { public void hotSwapScript ( Node scriptRoot , Node originalRoot ) { { {   NodeTraversal . traverseEs6 ( compiler , scriptRoot , this ) ;   }   }     } }  
public class ConfigureDelegate extends GroovyObjectSupport { public void test ( ) { {     }     return delegate . getProperty ( name ) ;   }     }  
public class ActionUtil { public void test ( ) { { {   presentation . putClientProperty ( WAS_ENABLED_BEFORE_DUMB , enabledBeforeUpdate ) ;   }   presentation . setEnabled ( false ) ;   }   }     }  
import com . intellij . openapi . fileTypes . SyntaxHighlighter ;   import org . jetbrains . annotations . NotNull ;   public class JetSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {       protected SyntaxHighlighter createHighlighter ( ) {   return new JetHighlighter ( ) ;     } }  
public class PipePowerWood extends Pipe implements IPowerReceptor {     public void setPowerProvider ( IPowerProvider provider ) {   powerProvider = provider ;   }       }  
public class HdfsFileInputStreamIntegrationTest {   public void inMemSeekTest ( ) throws IOException {   seekTest ( mInMemInputStream ) ;   }     }     
public class RegTestParams extends TestNet2Params { public void test ( ) {   super ( ) ;   interval = 10000 ;   proofOfWorkLimit = PROOF_OF_WORK_LIMIT ;   subsidyDecreaseBlockCount = 150 ;   port = 18444 ;   }     }  
public class EmailLens extends Lens { public void test ( ) {   if ( ! attachments . isEmpty ( ) ) {   intent . putParcelableArrayListExtra ( Intent . EXTRA_STREAM , attachments ) ;   intent . addFlags ( Intent . FLAG_GRANT_READ_URI_PERMISSION ) ;   }   return intent ;     } }  
import java . util . * ;         public class DBMaker < DBMakerT extends DBMaker > {   protected final String TRUE = " true " ;     } 
public abstract class Editor extends JFrame implements RunnerListener {     public void actionPerformed ( ActionEvent e ) {   handleCut ( ) ;   }     }  
public class SharedLibraryTest {     public static void afterClass ( ) throws BrutException {   OS . rmdir ( sTmpDir ) ;   }       }  
public class DexBuffer { public void test ( ) { {   }   sb . append ( " ) " ) ;   sb . append ( returnType ) ;   return sb . toString ( ) ;   }     }  
public class JavaxJsonTreeGlassfish extends JavaxJsonTree {     public String getName ( ) {   return " json / javax - tree / glassfish " ;   }   public static void register ( TestGroups groups ) {     } }  
public class DisUnityProcessor implements Runnable , FileVisitor < Path > { public void test ( ) {   if ( ! Files . exists ( outputDir ) ) {   Files . createDirectory ( outputDir ) ;   }     action . setOutputDir ( outputDir ) ;   }   AssetBundle ab = new AssetBundle ( ) ;     }  
import java . util . Map ;   public class AWSClient {   private String endpoint ;   private final AwsConfig awsConfig ;     }  
public class DLFileEntryAssetRenderer     { public String getSummary ( Locale locale ) { {   return _fileEntry . getDescription ( ) ;   }       } }  
public class Context           { public static final int FEATURE_PARENT_PROTO_PROPRTIES = 5 ;       }  
public class Media implements java . io . Serializable {   public Player player ;   public String copyright ;   public Media ( ) { }     }  
import org . ejml . simple . SimpleMatrix ;       public class SimpleTensor implements Serializable {   private final SimpleMatrix [ ] slices ;   final int numRows ;   final int numCols ;     }  
public class YahooAccountRegistration {   private String password ;   private boolean rememberPassword = true ;         }  
public final class WebViewCore {     public boolean dispatchWebKitEvent ( MotionEvent event , int eventType , int flags ) {   if ( mNativeClass == 0 ) {   return false ;   }   switch ( eventType ) {   case WebViewInputDispatcher . EVENT_TYPE_CLICK :   return nativeMouseClick ( mNativeClass ) ;     } } }  
public class CalendarCellView extends TextView {   public void setHighlighted ( boolean highlighted ) {   isHighlighted = highlighted ;   refreshDrawableState ( ) ;   }   protected int [ ] onCreateDrawableState ( int extraSpace ) {     } }  
public class CommandLine { public void test ( ) { {   if ( cll . handleFile ( file ) ) {   found = true ;   args [ i ] = null ;   }   }   }     }  
public class SubsamplingScaleImageView extends View {       private void reset ( boolean newImage ) {   scale = 0f ;   scaleStart = 0f ;   vTranslate = null ;     } }  
import android . view . animation . Interpolator ;   import android . widget . FrameLayout ;   import android . widget . Scroller ;   public class SlidingLayer extends FrameLayout {       }  
public class TestStateStorage implements Disposable { public void test ( ) {   if ( myMap == null ) return ;   try {   myMap . close ( ) ;   myMap = null ;   }   catch ( IOException e ) {   LOG . error ( e ) ;     } } }  
public class RenderScriptGL extends RenderScript { public void test ( ) { {   }   mMessageThread = new MessageThread ( this ) ;   mMessageThread . start ( ) ;   mGCThread = new GCThread ( this ) ;   mGCThread . start ( ) ;     }       }  
public class GridLabelRenderer {       public int getLabelVerticalSecondScaleWidth ( ) {   return mLabelVerticalSecondScaleWidth == null ? 0 : mLabelVerticalSecondScaleWidth ;   }       }  
public class ContributionTab {         private void createComponents ( ) {   Container pane = panel ;     } }  
public class DeleteTest extends SchemaLoader   { public static void tearDown ( ) throws Exception   { {   cluster . close ( ) ;   }       } }  
public class JournalIntegrationTest { public void test ( ) { {   }   fsMaster . stop ( ) ;   }           }  
public abstract class Logger { public void test ( ) { {   error ( resultMessage , new Throwable ( ) ) ;   }     return value ;   }     }  
public class HgProjectConfigurable implements SearchableConfigurable {     public String getHelpTopic ( ) {   return " project . propVCSSupport . VCSs . Mercurial " ;   }   public JComponent createComponent ( ) {     } }  
public final class TvContract {         public static final String PARAM_BROWSABLE_ONLY = " browsable_only " ;         }  
public class IWindowManagerImpl implements IWindowManager {     public void overridePendingAppTransitionMultiThumb ( AppTransitionAnimationSpec [ ] specs ,   IRemoteCallback callback0 , IRemoteCallback callback1 , boolean scaleUp ) {     }     }  
public class MyAccountPageTest {     public static void setUp ( ) {   orchestrator . resetData ( ) ;   adminWsClient = newAdminWsClient ( orchestrator ) ;   }     }  
public class Tmp { public enum TextureFormat {   DXT1 ,   UNUSED11 ,   DXT5 ,   RGBA4444 ,   UNUSED14 ,   UNUSED15 ,   UNUSED16 ,     } }  
public class SQLiteAssetHelper extends SQLiteOpenHelper {       public void setForcedUpgradeVersion ( int version ) {   setForcedUpgrade ( version ) ;   }       }  
public final class SpongeGame implements Game {       public String getAPIVersion ( ) {   return apiVersion != null ? apiVersion : " UNKNOWN " ;   }     }  
public class OkHttpClientHttpRequestFactoryTests extends AbstractHttpRequestFact       { public void httpMethods ( ) throws Exception { {   super . httpMethods ( ) ;   assertHttpMethod ( " patch " , HttpMethod . PATCH ) ;   }     } }  
public class SpellCheckerSession {   private static String taskToString ( int task ) {   switch ( task ) {   case TASK_CANCEL :   return " TASK_CANCEL " ;   case TASK_GET_SUGGESTIONS_MULTIPLE :   return " TASK_GET_SUGGESTIONS_MULTIPLE " ;   case TASK_CLOSE :     } } }  
public class PyExceptionBreakpointProperties extends ExceptionBreakpointProperti   { public PyExceptionBreakpointProperties ( final String exception ) { {   myException = exception ;   myNotifyOnTerminate = true ;   myIgnoreLibraries = false ;   }       } }  
public class ODistributedThreadLocal extends ThreadLocal < Boolean > {   public static ODistributedThreadLocal INSTANCE = new ODistributedThreadLocal ( ) ;   public boolean distributedExecution = false ;   public String distributedRequestSource = null ;   }      
import java . util . List ;         public final class Undertow {   private final int bufferSize ;   private final int buffersPerRegion ;     }  
public class DeleteMountPointEntry implements JournalEntry {     public JournalEntryType getType ( ) {   return JournalEntryType . DELETE_MOUNTPOINT ;   }       }  
public class ServerRestInterfaceRealm extends AuthorizingRealm { public void test ( ) {   setAuthenticationTokenClass ( SessionIdAuthenticationToken . class ) ;     setCredentialsMatcher ( new AllowAllCredentialsMatcher ( ) ) ;   setCachingEnabled ( false ) ;   }       }  
  package com . phonegap ;   import java . io . FileOutputStream ;   import java . io . IOException ;   import java . io . InputStream ;      
abstract public class ContentProviderStoreBase < T , U > {     abstract protected U getIdFor ( T item ) ;   abstract public Uri getContentUri ( ) ;   }      
public class TvView extends SurfaceView { public void test ( ) {   if ( mSession != null ) {   release ( ) ;   }   mSessionCallback = null ;   }       }  
public class PortalImpl implements Portal { public void test ( ) { { {   }   }   if ( portletId . equals ( PortletKeys . LAYOUTS_ADMIN ) ) {   return true ;   }     return false ;   }     }  
public class Tmp { public interface Channel {             } public void setName ( String name ) ;     }  
public class TupleInfo   { public enum Type   {   FIXED_INT_64 ( SIZE_OF_LONG ) ,   VARIABLE_BINARY ( - 1 ) ,   DOUBLE ( SIZE_OF_DOUBLE ) ;   private final int size ;     } }  
public class MetaContactImpl   { public void test ( ) {   synchronized ( parentGroupModLock )   {   this . totalStatus = 0 ;         } } }  
public class ConfigurationBundle {     private Set < Dashboard > dashboards = Collections . emptySet ( ) ;     private Set < GrokPattern > grokPatterns = Collections . emptySet ( ) ;   public String getId ( ) {     } }  
public class ItemWrench extends ItemBuildCraft implements IToolWrench {   public ItemWrench ( int i ) {   super ( i ) ;   setFull3D ( ) ;   }       }  
public class PyCodeStyleSettingsProvider extends CodeStyleSettingsProvider {   public String getConfigurableDisplayName ( ) {   return " Python " ;   }       public boolean hasSettingsPage ( ) {   return false ;   }   }      
public class PortletRequestDispatcherImplTest {       public String getPortletName ( ) {   return StringPool . BLANK ;   }       public URLEncoder getURLEncoderInstance ( ) {   return null ;   }     }  
public class AndroidSdkImpl extends AndroidSdk {     public int getPlatformToolsRevision ( ) {   return myPlatformToolsRevision ;   }   private static class MyTargetWrapper implements IAndroidTarget {     } }  
final class BasicInvocationFuture < E > implements InternalCompletableFuture < E > { public void test ( ) { { { {   wait ( currentTimeoutMs ) ;   currentTimeoutMs = pollTimeoutMs - ( Clock . currentTimeMillis ( ) - waitStart ) ;   }   }   }   }     }  
public class DependencyParseAnnotator extends SentenceAnnotator {     public Set < Requirement > requirementsSatisfied ( ) {   return Collections . singleton ( DEPENDENCY_REQUIREMENT ) ;   }   public static String signature ( String annotatorName , Properties props ) {     } }  
public abstract class SplitWordsMacro extends MacroBase {       protected String convertCase ( String word ) {   return word ;   }   }      
public class SingleInspectionProfilePanel extends JPanel {     protected void onScopeAdded ( ) {   myTreeTable . updateUI ( ) ;   updateOptionsAndDescriptionPanel ( ) ;   }     }  
public class TourViewActivity extends SherlockFragmentActivity { public void test ( ) {   try {   dlg . dismiss ( ) ;   } catch ( Exception ex ) {   ex . printStackTrace ( ) ;   }   startTourView ( ) ;   } ;     }  
public class CompressionServletResponseWrapper               { public void setCompressionThreshold ( int threshold ) {   if ( debug > 1 ) {     } } }  
public class BytesType extends AbstractType   { public String getString ( byte [ ] bytes )   { { {   return FBUtilities . bytesToHex ( bytes ) ;   }   }     } }  
public class NioEndpoint extends AbstractEndpoint < NioChannel > { public void test ( ) { { {   }   }   writeLatch = null ;   }     }  
public class Activity extends ContextThemeWrapper       { public boolean popBackStack ( ) { {   return popBackStack ( null , 0 ) ;   }       } }  
public class ChatRoomMemberIrcImpl     { public Contact getContact ( )   { {       return null ;   }     } }  
public class ViewPager extends ViewGroup { public void test ( ) { { { {   }   }   setCurrentItemInternal ( newCurrItem , false , true ) ;   requestLayout ( ) ;   }   }     }  
package javax . el ;           public class ELClass { public void test ( ) {     } }  
public class GsdEnterAlwaysCollapsedParallaxFragment extends BaseFeatureFragment     { public int getContentLayout ( ) { {   return R . layout . fragment_gsd_enter_always_collapsed_parallax ;   }       } }  
public class ClassGen {     public ClassGen getParentGen ( ) {   return parentGen == null ? this : parentGen ;   }   public AnnotationGen getAnnotationGen ( ) {     } }  
public class ViewPagerActions {     public String getDescription ( ) {   return " ViewPager move to a specific page " ;   }       }  
public class BufferedTokenStream < T extends Token > implements TokenStream {     public void reset ( ) {   seek ( 0 ) ;   }       }  
public final class Path_Delegate {     private static void native_destroyMeasure ( long nPathMeasure ) {     }       }  
public final class ClientContext {   private static TachyonConf sTachyonConf ;   private static InetSocketAddress sMasterAddress ;   private static ClientMetrics sClientMetrics ;   private static boolean sInitialized ;   static {     } }  
public class WikiPageTrashHandlerTest extends BaseTrashHandlerTestCase {       public void testAddPageWithSameTitleAsImplicitlyDeletedPageVersion ( )   throws Exception {     } }  
public class Sketch { public void test ( ) {   current = code [ which ] ;   currentIndex = which ;   current . visited = System . currentTimeMillis ( ) ;     editor . setCode ( current ) ;     editor . header . repaint ( ) ;     } }  
public class UserLocalServiceImpl extends UserLocalServiceBaseImpl { public void test ( ) {   User user = userPersistence . findByPrimaryKey ( userId ) ;   user . setModifiedDate ( modifiedDate ) ;     userPersistence . update ( user ) ;   return user ;     } }  
public final class ScreenMagnifier extends IMagnificationCallbacks . Stub   { public MagnifiedContentInteractonStateHandler ( Context context ) { {   mScaleGestureDetector = new ScaleGestureDetector ( context , this ) ;   mScaleGestureDetector . setQuickScaleEnabled ( false ) ;   mGestureDetector = new GestureDetector ( context , this ) ;   }     } }  
public class BackgroundTaskQueuingMessageListener extends BaseMessageListener { public void test ( ) {   _backgroundTaskLocalService . fetchFirstBackgroundTask (   taskExecutorClassName , BackgroundTaskConstants . STATUS_QUEUED ) ;   if ( backgroundTask == null ) {   return ;   }     } } 
public class BackupImapStore extends ImapStore { public void test ( ) { {   Collections . addAll ( messages , msgs ) ;   }   Collections . reverse ( messages ) ;     return messages ;   }     }  
public final class Timber {   ;   private Timber ( ) {   throw new AssertionError ( " No instances . " ) ;   }       }  
public class JavaScriptTarget extends Target {     public String getVersion ( ) {   return " 4 . 5 . 1 " ;   }   public Set < String > getBadWords ( ) {     } }  
public class OsmEditingPlugin extends OsmandPlugin {       public Class < ? extends Activity > getSettingsActivity ( ) {   return SettingsOsmEditingActivity . class ;   }     }  
import java . nio . ByteBuffer ;       public final class Murmur3 {   private static final int seed = 0 ;   private static final int C1 = 0xcc9e2d51 ;   private static final int C2 = 0x1b873593 ;     } 
public class Tmp { public interface WorkflowedModel {   } public boolean isExpired ( ) ;   public boolean isInTrash ( ) ;     public boolean isPending ( ) ;   public void setStatus ( int status ) ;     }  
public class SQLiteDatabase extends SQLiteClosable {   private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100 ;   private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000 ;   private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000 ;   private long mLastLockMessageTime = 0L ;     }  
public class MarkupTemplateEngine extends TemplateEngine {     }   public static class TemplateResource {   private final String baseName ;   private final String locale ;   private final String extension ;     } 
public class FileTransferProxy extends BasicModule     { public boolean hasInfo ( String name , String node , JID senderJID ) { {   return true ;   }     } }  
public class SiteSettingsFragment extends PreferenceFragment     { public void onDismiss ( DialogInterface dialog ) { {   mSiteSettings . saveSettings ( ) ;   mEditingList = null ;   }     } }  
import android . util . FloatMath ;         public class Number3D {  public float x ;   public float y ;   public float z ; }       
public class DBMaker {    public DBMaker asyncThreadDaemonEnable ( ) {   this . _asyncThreadDaemon = true ;   return this ;   }          } 
public class Tmp { public interface DruidAbstractDataSourceMBean {   long getCreateErrorCount ( ) ;   int getMaxActive ( ) ;     void setMaxActive ( int maxActive ) ;   long getTimeBetweenConnectErrorMillis ( ) ;     } }  
public abstract class AbstractActiveService {   public void activate ( ) {   shutdown = false ;   start ( ) ;   }     }  
public class Capture extends PImage implements PConstants { public void test ( ) {   capturing = true ;   pipeline . play ( ) ;   if ( init ) {   checkResIsValid ( ) ;     } } }  
public class PyUtil {     public static boolean isPackage ( PsiFile file ) {   return PyNames . INIT_DOT_PY . equals ( file . getName ( ) ) ;   }       }  
abstract public class TreeImportingParserBase implements ImportingParser { public void test ( ) { { {   }   }   rootColumnGroup . tabulate ( ) ;   XmlImportUtilities . createColumnsFromImport ( project , rootColumnGroup ) ;   project . columnModel . update ( ) ;   }     }  
public class DrawHandler extends Handler {     public void quit ( ) {   sendEmptyMessage ( QUIT ) ;   }     }  
public final class DrawMessage {   public void setLastInChain ( boolean lastInChain ) {   this . lastInChain = lastInChain ;   }     }  
public class Camera {       public List < Area > getMeteringAreas ( ) {   return splitArea ( get ( KEY_METERING_AREAS ) ) ;   }       }  
public class MetaDataSerializer extends EntitySerializer {   private final String beanSuffix ;     private final String beanPackageName ;   private final NamingStrategy namingStrategy ;     }  
public class PApplet extends Applet  { public String dataPath ( String where ) { return path + File . separator + " data " + File . separator + where ;   } } 
public class SiteMembershipsControlPanelEntry extends BaseControlPanelEntry { public void test ( ) { {   return true ;   }   if ( ! group . isManualMembership ( ) ) {   return true ;   }     return false ;   }     }  
public class ViewPager extends ViewGroup {   protected void onAttachedToWindow ( ) {   super . onAttachedToWindow ( ) ;   mFirstLayout = true ;   }       }  
public class PGraphicsAndroid3D extends PGraphics {   public void resetMatrix ( ) {   modelview . reset ( ) ;   modelviewInv . reset ( ) ;   projmodelview . set ( projection ) ;   }     }  
public class ConsoleLogOutputStream extends PrintStream {     public void println ( Object x ) {   logMessage ( String . valueOf ( x ) ) ;   printStream . println ( x ) ;   }     }  
public class Tree extends JTree implements ComponentWithEmptyText , ComponentWith   { public void holdSelection ( ) {   myHeldSelection = getSelectionPaths ( ) ;   }   public void unholdSelection ( ) {     } }  
public abstract class AbstractInternalLogger implements InternalLogger , Serializ     { public void info ( Throwable t ) { {   info ( EXCEPTION_MESSAGE , t ) ;   }       } }  
public class SupportFragment extends Fragment implements ISupportFragment {     public void onActivityCreated ( Bundle savedInstanceState ) {   super . onActivityCreated ( savedInstanceState ) ;   mIsFirstVisible = true ;   View view = getView ( ) ;   initFragmentBackground ( view ) ;     } }  
public final class Bitmap implements Parcelable {     protected void finalize ( ) throws Throwable {   try {   mRecycled = true ;   nativeDestructor ( mNativeBitmap ) ;   } finally {   super . finalize ( ) ;     } } }  
public class FileInStreamTest implements Tester < FileInStream > {     public void after ( ) {   ClientContext . reset ( ) ;   }       }  
public class DirectServletRegistry { public void test ( ) { { {   if ( _log . isDebugEnabled ( ) ) {   _log . debug ( " Reload dependent " + dependant ) ;   }     break ;   }   }   }     }  
public class PGL {     protected class PGLListener implements GLEventListener {   public PGLListener ( ) { }       public void display ( GLAutoDrawable glDrawable ) {   drawable = glDrawable ;     } } }  
public class DroidGap extends Activity { public void test ( ) {   appView . setWebChromeClient ( new GapClient ( this ) ) ;   appView . setInitialScale ( 100 ) ;   appView . setVerticalScrollBarEnabled ( false ) ;   WebSettings settings = appView . getSettings ( ) ;   settings . setJavaScriptEnabled ( true ) ;     } }  
public class KeyguardTransportControlView extends FrameLayout { public void test ( ) {   mAudioManager . unregisterRemoteController ( mRemoteController ) ;   KeyguardUpdateMonitor . getInstance ( mContext ) . removeCallback ( mUpdateMonitor ) ;   mUserSeeking = false ;   removeCallbacks ( mUpdateSeekBars ) ;   }   void setBadgeIcon ( Drawable bmp ) {     } }  
final class DexterInstance {   private final AtomicBoolean rationaleAccepted ;   private Activity activity ;   private MultiplePermissionsListener listener ;     DexterInstance ( Context context , AndroidPermissionService androidPermissionService ,   IntentProvider intentProvider ) {   this . context = context ;     } }  
public class PyConsoleStackFrameConnector implements XStackFrameAwareSession {     public void reportError ( String message ) {   throw new UnsupportedOperationException ( ) ;   }       }  
public class SourceCodeTraversal extends TraversalHelper { public void test ( ) { { { {   break ;   }   }   acceptSiblings ( currentNode , followSiblings ) ;   }   }     }  
public final class WorkerClient extends ClientBase { public void test ( ) {   mIsLocal = isLocal ;   mClientMetrics = Preconditions . checkNotNull ( clientMetrics ) ;   mHeartbeatExecutor = new WorkerClientHeartbeatExecutor ( this ) ;   }       }  
package com . ning . billing . analytics ;   import java . util . List ;   import org . joda . time . DateTime ;   import org . slf4j . Logger ;      
public class JetFileType extends LanguageFileType {     public String getName ( ) {   return " Kotlin " ;   }       }  
public class PrettyJSON extends JSONStringer { public void test ( ) { { {   }   }   return w . toString ( ) ;   }     }  
public class StandardServerSF extends StoreFactoryBase { public void test ( ) {   }                 }  
public class Request implements HttpServletRequest { public void test ( ) {   cookiesConverted = true ;   if ( getContext ( ) == null ) {   return ;   }     parseCookies ( ) ;   ServerCookies serverCookies = coyoteRequest . getCookies ( ) ;     } }  
public class BlockWorkerTest {             public void hasBlockMetaTest ( ) {     } }  
  package storm . kafka ;   public class TopicOffsetOutOfRangeException extends RuntimeException {  public TopicOffsetOutOfRangeException ( String message ) {   super ( message ) ;     }  } 
import java . util . regex . Matcher ;   import java . util . regex . Pattern ;   import javax . annotation . concurrent . NotThreadSafe ;          
public class Splash extends JDialog implements StartupProgress {   protected void paintComponent ( Graphics g ) {   super . paintComponent ( g ) ;   mySplashIsVisible = true ;   myProgressLastPosition = 0 ;   paintProgress ( g ) ;   }   } ;      
public abstract class BasketItem extends NetworkCatalogItem { public String getStringId ( ) { return " : " + Link . getSiteName ( ) ; }  public final void add ( NetworkBookItem book ) { } } 
public class StreamRule {     public String getValue ( ) {   return ( type == 5 ? " " : value ) ;   }   public int getType ( ) {     } }  
public class Options implements Serializable {     public TestOptions newTestOptions ( ) {   return new TestOptions ( ) ;   }     }  
public class ScanResult implements Parcelable {   public int frequency ;             public long timestamp ;     }  
class ActionBarActivityDelegateICS extends ActionBarActivityDelegate { public void test ( ) {   if ( frameworkMode != null ) {   wrappedMode = new ActionModeWrapper ( context ,   frameworkMode ) ;   wrappedCallback . setLastStartedActionMode ( wrappedMode ) ;   }     } }  
public class WordPress extends Application {   public synchronized static void updateCurrentBlogStats ( ) {   Blog currentBlog = WordPress . getCurrentBlog ( ) ;   if ( currentBlog != null ) {   String blogID = null ;     } } }  
public class CountriesFragment extends ListFragment {     public void onSaveInstanceState ( Bundle state ) {   super . onSaveInstanceState ( state ) ;     state . putInt ( STATE_CHECKED ,   getListView ( ) . getCheckedItemPosition ( ) ) ;   }     }  
public abstract class Context {           public static final String NETWORK_SCORE_SERVICE = " network_score " ;       }  
import org . apache . juli . logging . LogFactory ;             public final class JspRuntimeContext { public void test ( ) {     } }  
public class ProfilerType extends EditableFileType   { public String getDefaultExtension ( )   { { {   return " . Rprof " ;   }   }     } }  
import java . util . Iterator ;               public class XML { public void test ( ) {     } }  
public class FriendlyURLServlet extends HttpServlet { public void test ( ) {   Layout layout = layoutFriendlyURLComposite . getLayout ( ) ;   request . setAttribute ( WebKeys . LAYOUT , layout ) ;     String layoutFriendlyURLCompositeFriendlyURL =   layoutFriendlyURLComposite . getFriendlyURL ( ) ;     } }  
public class IQVersionHandler extends IQHandler implements ServerFeaturesProvide   { public void initialize ( XMPPServer server ) {   super . initialize ( server ) ;   }   public IQHandlerInfo getInfo ( ) {     } }  
public class PermissionsResolverManager implements PermissionsResolver {   public void load ( ) {   findResolver ( ) ;   }   public boolean hasPermission ( String name , String permission ) {     } }  
public class VetControllerTests {     private VetController vetController ;   private MockMvc mockMvc ;     }  
public abstract class AdapterView < T extends Adapter > extends ViewGroup { public void test ( ) { {  } event . setItemCount ( getCount ( ) ) ;  event . setCurrentItemIndex ( getSelectedItemPosition ( ) ) ; event . setFromIndex ( mFirstPosition ) ;  event . setToIndex ( mFirstPosition + getChildCount ( ) ) ; }   } public class LayoutManager extends RecyclerView . LayoutManager { public void test ( ) { {   return ;   }   mRequestPosition = position ;   requestLayout ( ) ;   }     }  
public class LayoutManager extends RecyclerView . LayoutManager { public void test ( ) { { return ;  } mRequestPosition = position ; requestLayout ( ) ;  }  } 
public class Verifier implements GroovyClassVisitor , Opcodes { public void test ( ) {   ConstructorNode dummy = new ConstructorNode ( 0 , null ) ;   addInitialization ( node , dummy ) ;   node . visitContents ( this ) ;   classNode . setNodeMetaData ( ClassNodeSkip . class , true ) ;   return ;   }     }  
public class YUICompressor { public void test ( ) {   JavaScriptToken token ;   ScriptOrFnScope currentScope ;   token = getToken ( - 1 ) ;   assert token . getType ( ) == Token . CATCH ;   token = consumeToken ( ) ;   assert token . getType ( ) == Token . LP ;     } }  
public class TestBeanNameELResolver {       private BeanNameELResolver createBeanNameELResolver ( ) {   return createBeanNameELResolver ( true ) ;   }   private BeanNameELResolver createBeanNameELResolver ( boolean allowCreate ) {     } }  
public class IconicsImageView extends ImageView { public void test ( ) { {     setImageDrawable ( mIcon ) ;   setScaleType ( ScaleType . CENTER_INSIDE ) ;   }   }     }  
public class IpReachabilityMonitor {     private final class NetlinkSocketObserver implements Runnable {   private NetlinkSocket mSocket ;       } }  
public class FileBody implements AsyncHttpRequestBody < File > {     public boolean readFullyOnRequest ( ) {   throw new AssertionError ( " not implemented " ) ;   }       }  
public class NativeLibraryHelper {     public static boolean removeNativeBinariesLI ( String nativeLibraryPath ) {   if ( nativeLibraryPath == null ) return false ;   return removeNativeBinariesFromDirLI ( new File ( nativeLibraryPath ) ) ;   }     }  
public class Config   { public Integer rpc_recv_buff_size_in_bytes ;   public Boolean start_native_transport = false ;   public Integer native_transport_port = 9042 ;   public Integer native_transport_min_threads = 16 ;   public Integer native_transport_max_threads = 128 ;     }  
public class ClientConfig {   private volatile long failureDetectorThresholdInterval = FailureDetectorConfig . DEFAULT_THRESHOLD_INTERVAL ;   private volatile long failureDetectorAsyncRecoveryInterval = FailureDetectorConfig . DEFAULT_ASYNC_RECOVERY_INTERVAL ;   private volatile int maxBootstrapRetries = 2 ;   public ClientConfig ( ) { }     }  
public class MutableDateTime extends AbstractDateTime               { public DateTimeField getRoundingField ( ) {   return iRoundingField ;     } }  
final class MoveJob extends CopyJob {     public Notification getProgressNotification ( ) {   return getProgressNotification ( R . string . copy_remaining ) ;   }       }  
public class Vpn extends INetworkManagementEventObserver . Stub { public void test ( ) {   config . packageName = mPackageName ;   config . interfaceName = mInterfaceName ;   showNotification ( config , label , bitmap ) ;   return descriptor ;   }     }  
public class Tmp { public interface ResolvableDependencies {               ResolutionResult getResolutionResult ( ) ;     } }  
public class UnifiedDiffViewer extends ListenerDiffViewerBase { public void test ( ) { {   myStatusPanel . update ( ) ;   myPanel . setGoodContent ( ) ;     myEditor . getGutterComponentEx ( ) . revalidateMarkup ( ) ;   } ;   }     }  
public class JavaMethodsConflictResolver implements PsiConflictResolver { public void test ( ) { {   if ( method . isVarArgs ( ) ) return ;   if ( method . getParameterList ( ) . getParametersCount ( ) == argumentsCount ) {   parametersNumberMatch = true ;   }   }   }     }  
public abstract class RxRatpack {   private final ExecControl execControl ;   public ExecutionBackedSubscriber ( ExecControl execControl , Subscriber < ? super T > subscriber ) {   super ( subscriber ) ;   this . execControl = execControl ;   this . subscriber = subscriber ;   }     }  
public final class WebAttributes {       public static final String AUTHENTICATION_EXCEPTION = " SPRING_SECURITY_LAST_EXCEPTION " ;   }      
public class Tmp { public interface IIdentifyable < T > {                 } }  
public final class SharedPreferencesEx implements SharedPreferences {   private long mFileSize ;   private static int cTryMaxCount = 10 ;   private static int cTryWaitMs = 50 ;   public SharedPreferencesEx ( File prefFile ) {   mFile = prefFile ;     } }  
public class PostsActivity extends WPActionBarActivity implements OnPostSelected     { public void onRefresh ( boolean start ) {   if ( start ) {   attemptToSelectPost ( ) ;   startAnimatingRefreshButton ( refreshMenuItem ) ;   isRefreshing = true ;   } else {     } } }  
public class Tmp { public interface Wrapper extends Container {             } public boolean isAsyncSupported ( ) ;     }  
public class GroovyClassLoader extends ClassLoader {   public GroovyClassLoader ( ) {   }   public GroovyClassLoader ( ClassLoader loader ) {   super ( loader ) ;   }             }  
public class Printer {   private String indent = " " ;   private final StringBuilder out ;   public Printer ( StringBuilder out ) {   this . out = out ;   }     } 
public class AccountActivity extends ThemeableActivity { public void test ( ) {   mUseTor . setChecked ( settings . getUseTor ( ) ) ;     settings . close ( ) ;   cursor . close ( ) ;     } }  
import java . io . File ;   public class GroovycTask   extends CompileTaskSupport   {   protected boolean force ;   public void setForce ( final boolean flag ) {   this . force = flag ;     } }  
package android . app . admin ;   import android . annotation . SdkConstant ;   import android . annotation . SdkConstant . SdkConstantType ;   import android . annotation . SystemApi ;   import android . app . Activity ;   import android . content . AbstractRestrictionsProvider ;   import android . content . ComponentName ;      
public class MacroFactory {     public static void register ( Macro macro ) { {   if ( myMacroTable == null ) init ( ) ;   myMacroTable . put ( macro . getName ( ) , macro ) ;   }   }     }  
public class OsMoThread {     public void reconnect ( ) { {   sessionInfo = null ;   reconnect = true ;   }   }     }  
public class MaterialRippleLayout extends FrameLayout {     public RippleBuilder rippleInAdapter ( boolean inAdapter ) {   this . rippleSearchAdapter = inAdapter ;   return this ;   }     }  
public class AttributeEqualBuilder implements CategoryBuilder {     public boolean init ( Graph graph ) {   values = new ArrayList < Object > ( ) ;   return true ;   }     }  
package com . interview . tree ;   import java . util . Optional ;   import java . util . concurrent . atomic . AtomicInteger ;   import java . util . concurrent . atomic . AtomicReference ;      
import java . util . List ;               public class BasicSemanticChecks extends GrammarTreeVisitor { public void test ( ) {       } }  
public class CalendarPickerView extends ListView {     interface OnDateSelectedListener {   void onDateSelected ( Date date ) ;   }   }      
public final class FacebookSdk { public void test ( ) { {   throw new FacebookException ( CALLBACK_OFFSET_NEGATIVE ) ;   }   FacebookSdk . callbackRequestCodeOffset = callbackRequestCodeOffset ;   sdkInitialize ( applicationContext , callback ) ;   }       }  
package com . SecUpwN . AIMSICD . service ;   import android . content . Intent ;   import android . content . SharedPreferences ;   import android . location . Location ;      
public class JspC extends Task implements Options {               public void execute ( ) {     } }  
public class ReaderWebView extends WebView { public void test ( ) {   mCustomView = null ;   mCustomViewCallback = null ;   }   boolean isCustomViewShowing ( ) {     } }  
public class AnswerHelper { public void test ( ) { { { {   return false ;   }   }   return checkedItems . size ( ) == answerIds . length ;   }   }     }  
public class TestStandardSessionIdGenerator {    public void testValidateWithJvmRouteWithPeriod ( ) {   Assert . assertTrue ( generator . validateSessionId ( VALID + " . g . h . i " ) ) ;   }   }       
class KeyguardStatusViewManager implements SecurityMessageDisplay { public void test ( ) { {   mHandler . removeCallbacks ( mClearSecurityMessageRunnable ) ;   mHandler . postDelayed ( mClearSecurityMessageRunnable , SECURITY_MESSAGE_DURATION ) ;   }   mSecurityMessage . announceForAccessibility ( mSecurityMessage . getText ( ) ) ;   }       }  
public final class AnimChannel { public void test ( ) { { {   }   }   animation = null ;     notified = false ;   }     }  
public class ChildBrowser extends Plugin {     private void closeDialog ( ) {   if ( dialog != null ) {   this . webview . stopLoading ( ) ;   dialog . dismiss ( ) ;   }   }     }  
public abstract class BaseOutputWriter implements OutputWriter { public void test ( ) { { {   result = ( Boolean ) foo ;   }   }   return result != null ? result : false ;   }       }  
class KeyguardStatusViewManager implements SecurityMessageDisplay { public void test ( ) { {   mHandler . removeCallbacks ( mClearSecurityMessageRunnable ) ;   mHandler . postDelayed ( mClearSecurityMessageRunnable , SECURITY_MESSAGE_DURATION ) ;   }   mSecurityMessage . announceForAccessibility ( mSecurityMessage . getText ( ) ) ;   }       }  
public class CallSipImpl     { public Iterator getCallParticipants ( )   { {   return new LinkedList ( callParticipants ) . iterator ( ) ;   }       } }  
package com . mongodb ;     public class WriteResult {   private final WriteConcern writeConcern ;   private final int n ;   private final boolean updateOfExisting ;   private final Object upsertedId ;     }  
public class BulletPhysics implements PhysicsEngine {   public void dispose ( ) {   discreteDynamicsWorld . destroy ( ) ;   wrapper . dispose ( ) ;   liquidWrapper . dispose ( ) ;   }       }  
public class WebView extends AbsoluteLayout       { public static void freeMemoryForTests ( ) { {   getFactory ( ) . getStatics ( ) . freeMemoryForTests ( ) ;   }     } }  
package com . fsck . k9 . activity ;   import java . util . ArrayList ;   import java . util . List ;   import android . os . AsyncTask ;      
public abstract class SimpleHttpClient {   private String responseBody ;   private List < String > bodyUriElements = null ;   public void setPort ( int thePort ) {   port = thePort ;   }     }
package greendroid . image ;   import greendroid . util . Config ;   import greendroid . util . GDUtils ;   import java . io . InputStream ;   import java . net . URL ;   import java . util . concurrent . ExecutorService ;      
package com . activeandroid ;   class Params {   public static final String VERSION = " 2 . 0 . 0 " ;   public static final boolean IS_TRIAL = false ;   public static final boolean LOGGING_ENABLED = true ;     }  
public class OsmandMapTileView implements IMapDownloaderCallback { public void test ( ) {   if ( contextMenuLayer != null ) {   contextMenuLayer . onTouchEvent ( event , getCurrentRotatedTileBox ( ) ) ;   }   gestureDetector . onTouchEvent ( event ) ;   return true ;   }     }  
public class VoiceRouter { public void test ( ) { { {   lastTimeMakeUTwpAnnounced = System . currentTimeMillis ( ) ;   }   }   currentStatus = STATUS_UNKNOWN ;   return ;   }     }  
public class XCameraDevice2 extends XHook {     public String getClassName ( ) {   return " android . hardware . camera2 . impl . CameraDeviceImpl " ;   }       }  
public class QueryableIndexSegment implements Segment   {   private final QueryableIndex index ;   private final String identifier ;   public QueryableIndexSegment ( final String segmentIdentifier , QueryableIndex index )   {     } }  
class SnackContainer extends FrameLayout {   public void clearSnacks ( boolean animate ) {   mSnacks . clear ( ) ;   removeCallbacks ( mHideRunnable ) ;   if ( animate ) mHideRunnable . run ( ) ;   }     }  
import hex . rf . DRF . DRFFuture ;   import hex . rf . Tree . StatType ;   import org . junit . Test ;   import water . * ;   import water . parser . ParseDataset ;   public class DatasetCornerCasesTest extends TestUtil {     }  
package hex . deeplearning ;   import hex . FrameSplitter ;   import water . TestUtil ;   import org . junit . Assert ;      
package buildcraft . api . recipes ;   import java . util . LinkedList ;   import net . minecraft . item . ItemStack ;   public class AssemblyRecipe {     }  
public abstract class BufferedBlockInStream extends BlockInStream { public void test ( ) {   mBuffer = allocateBuffer ( ) ;   mBufferIsValid = false ;   mClosed = false ;   mBlockIsRead = false ;   }       }  
public class FrenchTagger extends BaseTagger {   public FrenchTagger ( ) { {   super ( ) ;   setLocale ( Locale . FRENCH ) ;   dontTagLowercaseWithUppercase ( ) ;   }   }     }  
public class SearchView extends LinearLayout implements CollapsibleActionView {       public void onActionViewExpanded ( ) {   if ( mExpandedInActionView ) return ;     mExpandedInActionView = true ;   mCollapsedImeOptions = mQueryTextView . getImeOptions ( ) ;   mQueryTextView . setImeOptions ( mCollapsedImeOptions | EditorInfo . IME_FLAG_NO_FULLSCREEN ) ;     } }  
public class ConfigurationImpl     { public void clearCache ( ) { {   _values . clear ( ) ;     _properties = null ;   }       } }  
public class TitlePageIndicator extends View implements PageIndicator {   public void setFooterColor ( int footerColor ) {   mPaintFooterLine . setColor ( footerColor ) ;   mPaintFooterIndicator . setColor ( footerColor ) ;   invalidate ( ) ;   }     }  
public interface Graph {   public final static class Initializer {   public static Graph init ( ) { {   return DaggerGraph . builder ( )   . build ( ) ;   }   }     } }  
public class SASLDigestMD5Mechanism extends SASLMechanism {     protected String getName ( ) {   return " DIGEST - MD5 " ;   }   }      
public class PrivacyService extends IPrivacyService . Stub { public void test ( ) {   synchronized ( mRestrictionCache ) {   mRestrictionCache . clear ( ) ;   }   synchronized ( mAskedOnceCache ) {   mAskedOnceCache . clear ( ) ;   }   synchronized ( mSettingCache ) {   mSettingCache . clear ( ) ;   }     } }  
public final class AudioTrack {     public void run ( ) {   try {   toRelease . flush ( ) ;   toRelease . release ( ) ;   } finally {   releasingConditionVariable . open ( ) ;     } } }  
public class DiscoveryNode implements Writeable < DiscoveryNode > , ToXContent { public void test ( ) { { {   roles . add ( role ) ;   }   }   return Collections . unmodifiableSet ( roles ) ;   }       }  
public class TimeoutTest extends TestBase { public void test ( ) {   try {   t . verify ( data ) ;   fail ( ) ;   } catch ( MockitoAssertionError e ) { } ;   verify ( mode , times ( 5 ) ) . verify ( data ) ;     } }  
public class HgVFSListener extends VcsVFSListener {     protected VcsDeleteType needConfirmDeletion ( final VirtualFile file ) {   return ChangeListManagerImpl . getInstanceImpl ( myProject ) . getUnversionedFiles ( ) . contains ( file )   ? VcsDeleteType . IGNORE   : VcsDeleteType . CONFIRM ;   }     }  
public class AsyncHttpClientConfig {       public boolean hasResponseFilters ( ) {   return ! responseFilters . isEmpty ( ) ;   }       }  
public class BuildRuleSuccess {   private final Type type ;   private static enum Property {   SHOULD_UPLOAD_RESULTING_ARTIFACT ,   SHOULD_WRITE_RECORDED_METADATA_TO_DISK ,   }     }  
abstract class CommunicationProtocol   { public void test ( ) { { {   dest . writeBytes ( bytes ) ;   }   channel . close ( ) ;   }   }     }  
public class PGraphicsOpenGL extends PGraphics3D { public void test ( ) { {     canvas . setSize ( width , height ) ;   }   canvas . requestFocus ( ) ;   defaultsInited = false ;   }     }  
public class HeaderOrderTestCase { public void test ( ) {   if ( Modifier . isTransient ( field . getModifiers ( ) ) ) {   continue ;   }     Object value = field . get ( null ) ;   if ( ! ( value instanceof HttpString ) ) {   continue ;     } } }  
public class PGraphicsOpenGL extends PGraphics3D {     protected class ImageCache {   int tindex = - 1 ;   int tpixels [ ] ;   IntBuffer tbuffer ;     } } 
public class SSLHostConfigCertificate { {     }   private static enum StoreType {   KEYSTORE ,   PEM   }   }      
public class FileCopierUnitTest {     public void setUp ( ) throws Exception {   fileCopier = new FileCopier ( ) ;   tempFolder . create ( ) ;   }       }  
public class CompilerTest extends GroovyTestCase { public void test ( ) {   dir . mkdirs ( ) ;   CompilerConfiguration config = new CompilerConfiguration ( ) ;   config . setTargetDirectory ( dir ) ;   config . setDebug ( dumpClass ) ;   compiler = new Compiler ( config ) ;     } }  
public class ForgeInternalHandler   { public void test ( ) { { {   entity . setDead ( ) ;   event . setCanceled ( true ) ;   event . world . spawnEntityInWorld ( newEntity ) ;   }   }   }     }  
public class ActionBarView extends AbsActionBarView implements DecorToolbar { public void test ( ) {   mNavItemSelectedListener = l ;   if ( mSpinner != null ) {   mSpinner . setAdapter ( adapter ) ;   mSpinner . setOnItemSelectedListener ( l ) ;   }   }     }  
public class PropertyAttributeParserTest   { public void test ( ) {   try   {   parseAsStaticResourceAttribute ( illegalStaticResourceAttributeValue . value ) ;   fail ( " Expect an exception thrown " ) ;   } catch ( MalformedAttributeException e )   {     } } }  
public class MockComponentManager extends UserDataHolderBase implements Componen     { public void dispose ( ) { {   myMessageBus . dispose ( ) ;   }       } }  
class ConfigThread extends Thread {   private Configuration config ;   private boolean done = false ;   private ConfigurationDialog cfgDialog ;   ConfigThread ( final Language docLanguage , final Configuration config ) {     } }  
public abstract class HardwareRenderer {   public static boolean sSystemRendererDisabled = false ;     public static boolean sUseRenderThread = false ;   private boolean mEnabled ;   private boolean mRequested = true ;     }  
public class PrivacyManager {     public int hashCode ( ) {   return ( mRestrictionName . hashCode ( ) ^ mMethodName . hashCode ( ) ) ;   }       }  
public class Caches implements BatchComponent , Startable {     public void start ( ) {     }       }  
public class GroupLocalServiceImpl extends GroupLocalServiceBaseImpl {     protected List < PortletDataHandler > getPortletDataHandlers ( Group group ) {     List < Portlet > portlets = portletLocalService . getPortlets (   group . getCompanyId ( ) ) ;     } }  
public class HomeActivity extends Activity { public void test ( ) { {   }   MainApplication . checkForProVersion ( getApplicationContext ( ) ) ;   Util . checkForTamper ( this , mTamperPromptEventListener ) ;   }       }  
public abstract class Pair < T1 , T2 >     { public T1 first ( )   { {   return first ;   }       } }  
public class ReaderPostListFragment extends Fragment     { public FilterCriteria onRecallSelection ( ) { {   return mCurrentTag ;   }       } }  
public class NotDefinedException extends RuntimeException { public void test ( ) { {   }   }     }  
class Http2Parser { public void test ( ) {   }           }  
public class TileEngineIron extends TileEngineWithInventory implements IFluidHan     { public void overheat ( ) { {   super . overheat ( ) ;     tankCoolant . setFluid ( null ) ;   }     } }  
public class PipeTransportItems extends PipeTransport { public void test ( ) { { {     }   }   delay = 2 ;   }       }  
public class DBPort { public void test ( ) {   _socket . setTcpNoDelay ( ! USE_NAGLE ) ;   _socket . setSoTimeout ( _options . socketTimeout ) ;   _in = new BufferedInputStream ( _socket . getInputStream ( ) ) ;   _out = _socket . getOutputStream ( ) ;   return true ;     } }  
public class IntervalHistogramRecorder {     public synchronized Histogram getIntervalHistogram ( ) {   Histogram intervalHistogram = new Histogram ( inactiveHistogram ) ;   getIntervalHistogramInto ( intervalHistogram ) ;   return intervalHistogram ;   }     }  
public class ResourceCertificateSource implements CertificateSource {   public ResourceCertificateSource ( int resourceId , Context context ) {   mResourceId = resourceId ;   mContext = context ;   }   private void ensureInitialized ( ) {     } }  
public class MDCInterceptor implements ExecInterceptor {     public static MDCInterceptor instance ( ) {   return INSTANCE ;   }     }  
public class ActivityItemBase implements TraktEntity {     public Date timestamp ;   public Date watched ;   public When when ;   public Elapsed elapsed ;   public ActivityType type ;     }  
public class ConvertAtomicToLongAdderIntention extends PsiElementBaseIntentionAc     { public boolean startInWriteAction ( ) { {   return false ;   }       } }  
public class HttpConfiguration {   public String getRootPath ( ) {   return rootPath ;   }   }      
public class HttpUtils {     public void configHttpGetCacheDefaultExpiry ( long defaultExpiry ) {   currRequestExpiry = defaultExpiry ;   sHttpGetCache . setDefaultExpiryTime ( defaultExpiry ) ;   }     }  
public final class BluetoothLeAdvertiser {     public void stopAdvertising ( final AdvertiseCallback callback ) {   synchronized ( mLeAdvertisers ) {   if ( callback == null ) {   throw new IllegalArgumentException ( " callback cannot be null " ) ;   }     } } }  
public class VertxOptions {       public long getWarningExceptionTime ( ) {   return warningExceptionTime ;   }       }  
public abstract class DockingStation {     public boolean linkIsDocked ( ) {   if ( robotTaking ( ) != null ) {   return robotTaking ( ) . getDockingStation ( ) == this ;   } else {   return false ;     } } } 
public class MasterClient extends CommunicationProtocol implements Master , Chann   { public void test ( ) { {   msgLog . logMessage ( " MasterClient shutdown " , true ) ;   channelPool . close ( true ) ;   executor . shutdownNow ( ) ;   }   }     }  
public abstract class AbstractJRubyMojo extends AbstractMojo {           protected File gemDirectory ;     }  
import java . util . Set ;     public class PointQuadTree < T extends PointQuadTree . Item > {   } public interface Item {   Point getPoint ( ) ;   }      
public class Solo {     public void clickOnView ( View view ) {   clicker . clickOnScreen ( view ) ;   }     }  
public class HexDumpProxyInboundHandler extends SimpleChannelUpstreamHandler { public void test ( ) { { {   e . getChannel ( ) . close ( ) ;   }   }   }     }  
public class MemoryCache {   public void clear ( ) {   cache . clear ( ) ;   size = 0 ;   }   long getSizeInBytes ( Bitmap bitmap ) {     } }  
public class MotionTrack extends AbstractCinematicEvent implements Control {     public void onStop ( ) {   setCurrentWayPoint ( path . getNbWayPoints ( ) - 1 ) ;   currentWayPoint = 0 ;   }     }  
public class From implements Sqlable {   public < T extends Model > T executeSingle ( ) {   if ( mQueryBase instanceof Select ) {   limit ( 1 ) ;   return SQLiteUtils . rawQuerySingle ( mType , toSql ( ) , getArguments ( ) ) ;   }   else {     } } }  
import io . realm . RealmChangeListener ;   import io . realm . RealmList ;   public class RealmTest extends AndroidTestCase {   private Realm realm ;     } 
package android . text . method ;   import android . text . Selection ;   import android . text . SpannableStringBuilder ;   import android . icu . text . BreakIterator ;   import java . util . Locale ;        
public class MaterialMatParamOverrideTest {       public void testChildOverridesParent ( ) {   material ( " Common / MatDefs / Light / Lighting . j3md " ) ;     } }  
public class Http11NioProcessor implements ActionHook { public void test ( ) {   keptAlive = true ;   if ( ! inputBuffer . parseHeaders ( ) ) {   openSocket = true ;   recycle = false ;   break ;   }     } }  
public class BuildCraftCore {     public void serverStarting ( FMLServerStartingEvent event ) {   event . registerServerCommand ( new CommandBuildCraft ( ) ) ;   }   public void loadRecipes ( ) {     } }  
public class JSONObjectBody implements AsyncHttpRequestBody < JSONObject > {     public String getContentType ( ) {   return CONTENT_TYPE ;   }       }  
public class SmsBackupService extends ServiceBase {   private int skip ( ) {   updateMaxSyncedDateSms ( getMaxItemDateSms ( ) ) ;   updateMaxSyncedDateMms ( getMaxItemDateMms ( ) ) ;   updateMaxSyncedDateCalllog ( getMaxSyncedDateCalllog ( ) ) ;   sItemsToSync = 0 ;   sCurrentSyncedItems = 0 ;     } }  
public class PyMagicLiteralRenameHandler implements RenameHandler {     public boolean isRenaming ( DataContext dataContext ) {   return isAvailableOnDataContext ( dataContext ) ;   }       }  
public class RepositoryInfo { 	public String getUrl ( ) { 	return myRepository . getChildText ( " url " ) + " . git " ;	} } public abstract class AbstractFailureDetector implements FailureDetector { public void test ( ) {   NodeStatus nodeStatus = getNodeStatus ( node ) ;   synchronized ( nodeStatus ) {   while ( ! isAvailable ( node ) )   nodeStatus . wait ( ) ;   }   }     }  
public abstract class AbstractFailureDetector implements FailureDetector { public void test ( ) { NodeStatus nodeStatus = getNodeStatus ( node ) ; synchronized ( nodeStatus ) { while ( ! isAvailable ( node ) )  nodeStatus . wait ( ) ; }  } } 
public class AsyncTwitterTest extends TestCase implements TwitterListener {     public void testGetFriends ( ) throws Exception {   twitterAPI2 . createFriendship ( id1 ) ;   twitterAPI1 . getFriendsAsync ( id2 , this ) ;   waitForResponse ( ) ;   boolean found = false ;     } }  
public class Result {   public static int SC_403_FORBIDDEN = 403 ;   public static int SC_404_NOT_FOUND = 404 ;   public static int SC_500_INTERNAL_SERVER_ERROR = 500 ;   public static int SC_501_NOT_IMPLEMENTED = 501 ;     }  
import java . util . Set ;   public final class ChannelPromiseAggregator implements ChannelFutureListener {   private final ChannelPromise aggregatePromise ;   private Set < ChannelPromise > pendingPromises ;     }  
public final class EditorHistoryManager implements ProjectComponent , JDOMExterna     { public void selectionChanged ( final FileEditorManagerEvent event ) { { {   updateHistoryEntry ( event . getNewFile ( ) , true ) ;   }   }     } }  
public class MultiTerrainLodControl extends TerrainLodControl {       public void removeTerrain ( TerrainQuad tq ) {   removedTerrains . add ( tq ) ;   }       }  
public class TtsSpan implements ParcelableSpan {       public MeasureBuilder setIntegerPart ( long integerPart ) {   return setIntegerPart ( String . valueOf ( integerPart ) ) ;   }       }  
public class PrivacyService { public void test ( ) {   result . methodName = restriction . methodName ;   result . restricted = restrict ;   result . asked = true ;   result . extra = restriction . extra ;   setRestrictionInternal ( result ) ;   }     }  
public class JavaDebuggerSupport extends DebuggerSupport {       public DebuggerActionHandler getEvaluateHandler ( ) {   return DISABLED ;   }       }  
public class BroadcasterTest {     public void unSetUp ( ) throws Exception {   broadcaster . removeAtmosphereResource ( ar ) ;   atmosphereHandler . value . set ( new HashSet ( ) ) ;   }       }  
public class EpisodesAdapter extends CursorAdapter { public void test ( ) {   mLayoutInflater = ( LayoutInflater ) context   . getSystemService ( Context . LAYOUT_INFLATER_SERVICE ) ;   mOnClickListener = listener ;   mOnFlagListener = flagListener ;   }       }  
package net . minecraftforge . event . entity ;   import net . minecraft . src . Entity ;   import net . minecraft . src . World ;   import net . minecraftforge . event . Cancelable ;     public class EntityJoinWorldEvent extends EntityEvent   {     }  
import org . jetbrains . annotations . NotNull ;   import java . util . List ;   import java . util . Set ;       public class GitFetch extends GitRepositoryAction {         }  
public class MessageSummary {   public Object getField ( String key ) {   return message . getField ( key ) ;   }       public Message getRawMessage ( ) { return message ; }   }      
public class DeepLearningSpiralsTest extends TestUtil { public void test ( ) { { { {   }   pred . delete ( ) ;   mymodel . delete ( ) ;   mymodel . delete_best_model ( ) ;   }   }   }     }  
public class ApkDecoder {   public void setFrameworkTag ( String tag ) throws AndrolibException {   mFrameTag = tag ;   if ( mResTable != null ) {   getResTable ( ) . setFrameTag ( tag ) ;   }   }     } 
public class GitBlit implements ServletContextListener { public void test ( ) { {   return null ;   }   addToCachedRepositoryList ( model ) ;   return DeepCopier . copy ( model ) ;   }       }  
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 2 . 1 " ;   public static String getVersion ( ) {   return VERSION ;     } }  
public class SourceMapGeneratorV2 implements SourceMapGenerator { private static final String BASE64_MAP =  " ABCDEFGHIJKLMNOPQRSTUVWXYZ " + "abcdefghijklmnopqrstuvwxyz " +  " 0123456789 + / " ; } 
public class ByteFormat extends Format {       public String format ( long bytes ) {   return super . format ( bytes ) ;   }       }  
public abstract class ResultMessage extends Message . Response   { public static class SetKeyspace extends ResultMessage   {   } public final String keyspace ;   public SetKeyspace ( String keyspace )   {     } }  
public abstract class AbstractJPATest {         public void Substring2 ( ) {   QCompany company = QCompany . company ;   StringExpression name = company . name ;     } }  
public class LocalBlueprintsTest extends GraphTest {     public Graph generateGraph ( String uid ) {     throw new UnsupportedOperationException ( ) ;   }     }  
public class SherpafyStageFragment extends SherlockFragment {   public SherpafyStageFragment ( ) {   }     public void onAttach ( Activity activity ) {   super . onAttach ( activity ) ;     } }  
public class Note extends Syncable { public void test ( ) {   mNoteJSON = json ;     mTimestamp = 0 ;   mComment = null ;   mCommentPreview = null ;   mSubject = null ;     } }  
public class InstalledPluginsTableModel extends PluginTableModel { public void test ( ) { {   }   if ( ! enabled . booleanValue ( ) ) {   deps . add ( pluginId ) ;   }   return true ;   }     }  
public class View implements Drawable . Callback , KeyEvent . Callback , Accessibility       { public void dispatchSystemUiVisibilityChanged ( int visibility ) {   if ( mOnSystemUiVisibilityChangeListener != null ) {   mOnSystemUiVisibilityChangeListener . onSystemUiVisibilityChange (   visibility & ~ PUBLIC_STATUS_BAR_VISIBILITY_MASK ) ;     } } }  
public class StandardContext extends ContainerBase       { public void setPath ( String path ) { {     setName ( path ) ;   }     } }  
public class VideoplayerActivity extends MediaplayerActivity {   private static class VideoControlsHider extends Handler {   private static final int DELAY = 2500 ;   private WeakReference < VideoplayerActivity > activity ;     } }  
public class PostfixCompletionConfigurable implements SearchableConfigurable , Ed       { public String getHelpTopic ( ) { {   return null ;   }       } }  
public class Http11OutputBuffer implements OutputBuffer {   public void init ( SocketWrapperBase < ? > socketWrapper ) {   this . socketWrapper = socketWrapper ;   }     }  
public class MainMenuActivity extends Activity { public void test ( ) {   getMyApplication ( ) . setAppCustomization ( new SherpafyCustomization ( ) ) ;   startActivity ( mapIntent ) ;   finish ( ) ;   return ;   }   boolean exit = false ;     }  
public class Html2Text     { public static synchronized String extractText ( String html )   {   if ( html == null )   return null ;     if ( parser == null )   parser = new HTMLParserCallBack ( ) ;     } }  
public abstract class PythonModuleTypeBase < T extends ModuleBuilder > extends Modu     { public String getDescription ( ) {   return " Provides facilities for developing Python and Django applications " ;   }   public Icon getBigIcon ( ) {     } }  
public class IndexCreator { public void test ( ) {       if ( logMapDataWarn == null ) {   logMapDataWarn = log ;   }   if ( renderingTypes == null ) {     } } }  
class ParseState {   public void reset ( ) { {   this . state = 0 ;   this . pos = 0 ;   this . leftOver = 0 ;   }   }     }  
public class WebView extends AbsoluteLayout       { public static void freeMemoryForTests ( ) { {   getFactory ( ) . getStatics ( ) . freeMemoryForTests ( ) ;   }     } }  
public class Reference < T > {       public boolean isNotSet ( ) { {   return value == null ;   }   }     }  
public class ImageWallpaper extends WallpaperService {   private void updateWallpaperLocked ( ) {   Throwable exception = null ;   try {   mBackground = null ;   mBackground = mWallpaperManager . getBitmap ( ) ;   } catch ( RuntimeException e ) {     } } }  
import com . facebook . android . Facebook ;   import com . facebook . android . Facebook . DialogListener ;   import com . facebook . android . FacebookError ;   public class ConnectPlugin extends CordovaPlugin { public static final String SINGLE_SIGN_ON_DISABLED = " service_disabled " ;   private final String TAG = " ConnectPlugin " ;   }     
public abstract class Optional < T > implements Serializable { public void test ( ) { { { { { {   return endOfData ( ) ;   }   } ;   }   } ;   }     }  }
public class PhoneAccount implements Parcelable { public void test ( ) {   if ( mIconBitmap == null ) {   out . writeInt ( 0 ) ;   } else {   out . writeInt ( 1 ) ;   mIconBitmap . writeToParcel ( out , flags ) ;   }   out . writeInt ( mIconTint ) ;     } }  
import java . util . HashMap ;   import java . util . List ;   import java . util . Map ;   import rx . Observable ;      
public class GitVcsConfigurable implements Configurable {       public String getHelpTopic ( ) {   return " project . propVCSSupport . VCSs . Git " ;   }       }  
public class Tmp { public void test ( ) {           } }  
public class CuboidRegion extends AbstractRegion implements FlatRegion { public void test ( ) {   super ( world ) ;   this . pos1 = pos1 ;   this . pos2 = pos2 ;   recalculate ( ) ;   }       }  
public class NettyResponse implements Response { public void test ( ) {   for ( HttpResponseBodyPart part : bodyParts )   target . put ( part . getBodyPartBytes ( ) ) ;   target . flip ( ) ;   return target ;   }     }  
public class LocalOpenstreetmapActivity extends ListActivity {   private OpenstreetmapRemoteUtil remotepoi ;   private OsmBugsRemoteUtil remotebug ;   protected OsmPoint [ ] toUpload = new OsmPoint [ 0 ] ;   private ArrayList < OsmPoint > dataPoints ;     }  
public class XHTMLText {       public XHTMLText appendBrTag ( ) {   text . emptyElement ( BR ) ;   return this ;   }     }  
public class WebViewDatabase { public void test ( ) {   }   long getCacheTotalSize ( ) {   if ( mCacheDatabase == null ) {   return 0 ;   }   long size = 0 ;   Cursor cursor = null ;   final String query = " SELECT SUM ( contentlength ) as sum FROM cache " ;     } }  
public class ABTestingUtils {   public static boolean isFeatureEnabled ( Feature feature ) {   switch ( feature ) {   case HELPSHIFT :   return true ;   }   return false ;   }     }  
public class PoshiRunnerGetterUtil { public void test ( ) {   Element rootElement = document . getRootElement ( ) ;   return rootElement ;   }     }  
public class RealTimeCounter { public void test ( ) {  } void incrementPosition ( ) { counter . set ( ( pos + 1 ) % GRANULARITY , 0 ) ;  pos = ( pos + 1 ) % GRANULARITY ;  }   } 
public class PortletProviderUtil { public void test ( ) {   _addServiceTrackerMap . open ( ) ;   _browseServiceTrackerMap . open ( ) ;   _editServiceTrackerMap . open ( ) ;   _manageServiceTrackerMap . open ( ) ;   _viewServiceTrackerMap . open ( ) ;   }     }  
public abstract class MongoCollectionSplitter extends MongoSplitter {   public static final MaxKey MAX_KEY_TYPE = new MaxKey ( ) ;   protected Mongo mongo ;   protected DBCollection inputCollection ;   protected MongoURI inputURI ;   protected MongoURI authURI ;     }  
public class VertxImpl implements VertxInternal , MetricsProvider {     public synchronized TimeoutStream resume ( ) {   this . paused = false ;   return this ;   }       }  
public class ConnectorServerTest         { public void testConnServerWithRmiDefaultPort ( ) throws Exception   {       } }  
public class FreeFlowContainer extends AbsLayoutContainer { public void test ( ) {   if ( viewPortY > mScrollableHeight )   viewPortY = mScrollableHeight ;   }     }  
public class SchematicTile extends SchematicBlock { public void test ( ) { {   if ( tile != null ) {   tile . writeToNBT ( tileNBT ) ;   }   tileNBT = ( NBTTagCompound ) tileNBT . copy ( ) ;   }   }     }  
public class VoldemortConfig implements Serializable {   private final long pusherPollMs ;   public VoldemortConfig ( Properties props ) {   this ( new Props ( props ) ) ;   }     }  
package javaslang ;   import java . lang . reflect . Constructor ;   import java . lang . reflect . InvocationTargetException ;     public final class Assertions { public void test ( ) {       } }  
public class RendererConfiguration implements Cloneable , JDOMExternalizable {     public void addRenderer ( NodeRenderer renderer ) {   myRepresentationNodes . add ( 0 , renderer ) ;   }       }  
public class ImportTrayPreferences extends TrayModulePreferences {     protected void onCreate ( final int initialVersion ) {   }     }  
package flow ;   final class Preconditions {   private Preconditions ( ) {   }     }  
import com . google . javascript . rhino . Node ;           public class ProcessClosurePrimitivesTest extends CompilerTestCase {   private String additionalCode ;   private String additionalEndCode ;     }  
public class CustomTemplateCallback {   public PsiFile getFile ( ) {   return myFile ;   }     public Project getProject ( ) {   return myProject ;   }   }      
public final class Fun {     }   public interface Function0 < R > {   R run ( ) ;   }       public interface Function1 < R , A > {   R run ( A a ) ;   }      
public class StorageService implements IEndpointStateChangeSubscriber , StorageSe   { public void test ( ) {   if ( daemon == null )   {   return false ;   }   return daemon . isRPCServerRunning ( ) ;   }     }  
import java . util . logging . Logger ;     public class DepsGenerator {   public static enum InclusionStrategy {   ALWAYS ,   WHEN_IN_SRCS ,   DO_NOT_DUPLICATE     } }   
class IntroduceFieldDialog extends DialogWrapper { public void test ( ) {   JavaRefactoringSettings . getInstance ( ) . INTRODUCE_FIELD_VISIBILITY = getFieldVisibility ( ) ;   myNameSuggestionsManager . nameSelected ( ) ;   myTypeSelectorManager . typeSelected ( getFieldType ( ) ) ;   super . doOKAction ( ) ;   }     }  
public class PFont implements PConstants {     public void setSubsetting ( ) {   subsetting = true ;   }       public String getPostScriptName ( ) {   return psname ;   }     }  
public class GitBranchIsNotFullyMergedDialog extends DialogWrapper { public void test ( ) {   setTitle ( " Branch Is Not Fully Merged " ) ;   setOKButtonText ( " Delete " ) ;   setOKButtonMnemonic ( ' D ' ) ;   setCancelButtonText ( " Cancel " ) ;   }     }  
package com . puppycrawl . tools . checkstyle . coding ;     class OverloadInput   { public void test ( ) {     } }  
public class ServiceManager implements ServiceManagerMBean {     public boolean isActive ( ) {   return ServiceMonitorAdvice . isActive ( ) ;   }       }  
public class MaterialRefreshLayout extends FrameLayout { public void test ( ) { {   progressSize = BIG_PROGRESS_SIZE ;   }   isLoadMore = t . getBoolean ( R . styleable . MaterialRefreshLayout_isLoadMore , false ) ;   t . recycle ( ) ;   }     }  
public class CachedListTest extends TestBase {    public void testReloadUpdatesListObjects ( ) {   ModelCache modelCache = new ModelCache ( 2 , 1 , 1 ) ;   String id = " 123 " ;     }    } 
public final class Bootstrap { public void test ( ) {                   } }  
import javax . annotation . concurrent . ThreadSafe ;   public final class RetryHandlingBlockMasterClient extends AbstractMasterClient   implements BlockMasterClient {   private BlockMasterClientService . Client mClient ;       }  
public class Tmp { public interface IdeaPlugin extends DomElement {   GenericAttributeValue < String > getUrl ( ) ;     GenericAttributeValue < Boolean > getUseIdeaClassloader ( ) ;       GenericDomValue < String > getName ( ) ;     } }  
public class Tmp { public interface QueryHandler {         boolean createNativeQueryTyped ( ) ;         }  }
public final class R {   public static final class anim {   } public static final int test_anim_1 = 0x10700 ;   public static final int animation_list = 0x10701 ;   }   public static final class raw {     }  
public class KeyguardUpdateMonitor {   private int mFailedAttempts = 0 ;   private int mFailedBiometricUnlockAttempts = 0 ;   private static final int FAILED_BIOMETRIC_UNLOCK_ATTEMPTS_BEFORE_BACKUP = 3 ;   private boolean mClockVisible ;     }  
import com . jwetherell . algorithms . graph . TopologicalSort ;   public class DataStructures {   private static final int SIZE = 100 ;   private static Integer [ ] unsorted = null ;   public static void main ( String [ ] args ) {     } }  
public class TestRemoteIpFilter extends TomcatBaseTest {   private static final long serialVersionUID = 1L ;   private transient HttpServletRequest request ;   public HttpServletRequest getRequest ( ) {   return request ;     } }  
public class PersonDetailFragment extends Fragment {   public void setPersonDetails ( long personID , int localTableBlogID ) { {   mPersonID = personID ;   mLocalTableBlogID = localTableBlogID ;   refreshPersonDetails ( ) ;   }   }     }  
public abstract class AlertCondition implements EmbeddedPersistable { public void test ( ) { {   return false ;   }   return lastAlertSecondsAgo < ( grace * 60 ) - 2 ;   }       }  
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 3 . 4 " ;   }   public static String getSignature ( ) {     } }  
public class SampleFactory implements SampleSource {   public SampleFactory ( Graph graph ) {   this . graph = graph ;   this . setSearchRadiusM ( 500 ) ;   }   private Graph graph ;     }  
class ConnectionContext {     public void onFailure ( Throwable t ) { {   Messages . sendReadyForQuery ( channel ) ;   }   }     }  
public class Location implements Cloneable {       public Location clone ( ) { {   return new Location ( world , x , y , z , yaw , pitch ) ;   }   }     } 
final class SQLiteBooksDatabase extends BooksDatabase { public void test ( ) {   statement . bindLong ( 2 , lastModified ) ;   try {   return statement . simpleQueryForString ( ) ;   } catch ( SQLException e ) {   return null ;   }   }     }  
public class LocalComponentDependencyMetadata implements LocalOriginDependencyMe     { public String getDependencyConfiguration ( ) { {   return getOrDefaultConfiguration ( dependencyConfiguration ) ;   }       } }  
public class VectAlignTest {     public void testRandomLinearInterpolateAligns ( ) throws Exception {   testRandomAligns ( VectAlign . Mode . LINEAR ) ;   }   public void testRandomAligns ( VectAlign . Mode mode ) throws Exception {     } }  
public class JobUtil { public void test ( ) {   try {   job . scheduleAndWaitForResults ( ) ;   }   catch ( RuntimeException e ) {   throw e ;   }   catch ( Throwable throwable ) {     } } } 
public class AtmosphereInterceptorWriter extends AsyncIOWriterAdapter {     public LinkedList < AsyncIOInterceptor > filters ( ) { {   return filters ;   }   }     }  
public class PythonParsingTest extends ParsingTestCase {   protected void setUp ( ) throws Exception {   super . setUp ( ) ;   registerExtensionPoint ( PythonDialectsTokenSetContributor . EP_NAME , PythonDialectsTokenSetContributor . class ) ;   registerExtension ( PythonDialectsTokenSetContributor . EP_NAME , new PythonTokenSetContributor ( ) ) ;   }       }  
public class QueueContainer implements IdentifiedDataSerializable { public void test ( ) { { {   throw new HazelcastException ( e ) ;   }   }   return item ;   }     }  
public class IWindowManagerImpl implements IWindowManager {       public IBinder getFocusedWindowToken ( ) {     return null ;     } }  
public class NotImplementedRequestDelayControl implements RequestDelayControl {     public void clearDelay ( ) {     }       }  
import java . io . IOException ;     public class DiandianProcessorTest {       public void test ( ) throws IOException {   DiandianBlogProcessor diaoyuwengProcessor = new DiandianBlogProcessor ( ) ;     } }  
public class PGraphicsOpenGL extends PGraphics {       public PSurface createSurface ( ) {   return surface = new PSurfaceJOGL ( this ) ;   }     }  
abstract class RequestArcAction extends FeatureAction { public void test ( ) { { {   return ;   }   disableArcTransmission ( ) ;   finish ( ) ;   }   }     }  
abstract class HeadlessBootstrap extends ZapBootstrap {   public HeadlessBootstrap ( CommandLine args ) {   super ( args ) ;     System . setProperty ( " java . awt . headless " , " true " ) ;   }       }  
public class MtpDatabase {   protected void finalize ( ) throws Throwable {   try {   native_finalize ( ) ;   } finally {   super . finalize ( ) ;   }     } }  
public class NativeRunnable implements Runnable {   private final HybridData mHybridData ;     private NativeRunnable ( HybridData hybridData ) {   mHybridData = hybridData ;   }     }  
public class IntentionSettingsConfigurable extends BaseConfigurable implements A     { public String getHelpTopic ( ) {   return " preferences . intentionPowerPack " ;   }   public void disposeComponent ( ) {     } }  
public class KeyguardManager {     public boolean isKeyguardLocked ( ) {   try {   return mWM . isKeyguardLocked ( ) ;   } catch ( RemoteException ex ) {   return false ;   }     } }  
final class DefaultChannelPipeline implements ChannelPipeline { public void test ( ) { {   }   }   final Channel channel ;   final DefaultChannelHandlerContext head ;     }  
public class KeyguardManager {     public boolean isKeyguardLocked ( ) {   try {   return mWM . isKeyguardLocked ( ) ;   } catch ( RemoteException ex ) {   return false ;   }     } }  
package com . mongodb ;       public class MongoInterruptedException extends MongoException {   private static final long serialVersionUID = - 4110417867718417860L ;     public MongoInterruptedException ( final InterruptedException e ) {   super ( " A driver operation has been interrupted " , e ) ;   }     }  
public class PApplet implements PConstants { public void test ( ) {                   } }  
public class TextureView extends View {     public void setLayerType ( int layerType , Paint paint ) {   if ( paint != mLayerPaint ) {   mLayerPaint = paint == null ? new Paint ( ) : paint ;   invalidate ( ) ;   }   }     }  
public class WebView extends AbsoluteLayout       { public static String findAddress ( String addr ) { {   return getFactory ( ) . getStatics ( ) . findAddress ( addr ) ;   }     } }  
class PublicationImagePadding4 extends PublicationImageStatusFields     { public class PublicationImage   extends PublicationImagePadding4   implements NakMessageSender , DriverManagedResource   {   } public enum Status   {     } }  
public final class PageDecorations implements ServerComponent {     public PageDecoration [ ] get ( ) { {   return decorations ;   }   }     }  
public abstract class BaseTransformer implements Transformer { public void test ( ) {   try {   templateParser =   ( TemplateParser ) InstanceFactory . newInstance (   PortalClassLoaderUtil . getClassLoader ( ) ,   templateParserClassName ) ;   }   catch ( Exception e ) {     } } }  
public class MainActivity extends Activity {   protected void onCreate ( Bundle savedInstanceState ) {   super . onCreate ( savedInstanceState ) ;   setContentView ( R . layout . activity_main ) ;         }     }  
public class FakeTextView extends FakeView {   public void setText ( CharSequence text ) {   this . textResourceId = UNINITIALIZED_ATTRIBUTE ;   if ( text == null ) {   text = " " ;   }   this . text = text ;   }     }  
package org . json ;                 public class JSONPointerException extends JSONException {   private static final long serialVersionUID = 8872944667561856751L ;     }  
public class JmeSystem {     public static String getFullName ( ) {   return " jMonkeyEngine 3 . 0 . 0 Beta " ;   }   public static InputStream getResourceAsStream ( String name ) {     } }  
class TestJavaLR { public void test ( ) { {   System . err . println ( " exception : " + e ) ;   e . printStackTrace ( System . err ) ;   }   System . gc ( ) ;   }     }  
public abstract class AttributeDefinition {     public String [ ] getRequires ( ) {   return requires ;   }   public EnumSet < AttributeAccess . Flag > getFlags ( ) {     } }  
public final class Versioned < T > implements Serializable {   private static final long serialVersionUID = 1 ;   private final VectorClock version ;   private volatile T object ;   public Versioned ( T object ) {     } }  
public final class CallOptions { public void test ( ) {   deadlineNanoTime = other . deadlineNanoTime ;   authority = other . authority ;   requestKey = other . requestKey ;   executor = other . executor ;   }       }  
package water . exec ;   import java . util . * ;   import water . * ;   import water . fvec . * ;      
public class TreeTraversalInSpiralOrder {             public void spiralWithOneDeque ( Node root ) {   if ( root == null ) {     } } }  
public class PyUnboundLocalVariableInspection extends LocalInspectionTool {     public boolean isEnabledByDefault ( ) {   return false ;   }       }  
public abstract class ContentResolver {   public ContentResolver ( Context context ) {   mContext = context != null ? context : ActivityThread . currentApplication ( ) ;   mPackageName = mContext . getBasePackageName ( ) ;   }       }  
public class RandomTransitionGenerator implements TransitionGenerator { public void test ( ) {   mLastGenTrans = new Transition ( srcRect , dstRect , mTransitionDuration ,   mTransitionInterpolator ) ;   mLastDrawableBounds = new RectF ( drawableBounds ) ;   return mLastGenTrans ;   }     }  
public abstract class AbstractLocalTachyonCluster {   protected BlockWorker mWorker ;   protected LineageWorker mLineageWorker ;   protected UnderFileSystemCluster mUfsCluster ;   protected String mTachyonHome ;   protected String mHostname ;     }  
package com . google . bitcoin . core ;   import java . io . IOException ;   import java . io . OutputStream ;   import java . io . Serializable ;      
public class XDebuggerMultilineEditor extends XDebuggerEditorBase { public void test ( ) { { {   return false ;   }   } ;   myEditorTextField . setFontInheritedFromLAF ( false ) ;   }       }  
public class MetricRegistry implements MetricSet {     public Map < String , Metric > getMetrics ( ) {   return Collections . unmodifiableMap ( metrics ) ;   }       }  
public class LineageFileOutStream extends FileOutStream {     protected void scheduleAsyncPersist ( ) throws IOException {     }   }      
public class WifiScanner { public void test ( ) {   validateChannel ( ) ;   HotlistSettings settings = new HotlistSettings ( ) ;   settings . bssidInfos = bssidInfos ;   settings . apLostThreshold = apLostThreshold ;   sAsyncChannel . sendMessage ( CMD_SET_HOTLIST , 0 , putListener ( listener ) , settings ) ;   }     }  
public class JmsNamespaceHandlerTests extends TestCase {   static class TestErrorHandler implements ErrorHandler {   public void handleError ( Throwable t ) { {   }   }     } }  
public class PImage implements PConstants , Cloneable { public void test ( ) {   modified = true ;   mx1 = 0 ;   my1 = 0 ;   mx2 = width - 1 ;   my2 = height - 1 ;   }     }  
import java . util . Random ;   public class NeuronsTest extends water . TestUtil {   public static void setup ( ) { stall_till_cloudsize ( 1 ) ; }       public void matrixVecTest ( ) {   int rows = 2048 ;     } }  
import java . util . Set ;             public class RequestFileFilter {   private final StoreDefinition storeDefinition ;     }  
public class Tmp { public interface DsGetDC extends StdCallLibrary {   } public DS_DOMAIN_TRUSTS ( Pointer p ) { { { {   super ( p ) ;   read ( ) ;   }   } ;   }     } }  
import java . io . IOException ;     public class InstallCommand extends AbstractCommandRunner < InstallCommandOptions > {   public InstallCommand ( CommandRunnerParams params ) {   super ( params ) ;   }     } 
public class WebSettings { public void test ( ) {   if ( mBlockNetworkLoads != flag ) {   mBlockNetworkLoads = flag ;   verifyNetworkAccess ( ) ;   postSync ( ) ;   }   }     }  
public class SquidCursorTest extends DatabaseTestCase { public void test ( ) { { {   evens . moveToPosition ( i ) ;   assertEquals ( i * 2 , evens . get ( Thing . BAR ) . intValue ( ) ) ;   }   evens . close ( ) ;   }   }     }  
public class AsmClassGenerator extends ClassGenerator { public void test ( ) {   Variable variable = compileStack . getVariable ( variableName , false ) ;   if ( variable == null ) {   processClassVariable ( variableName ) ;   } else {     } } }  
public class GradientDrawable extends Drawable { public void test ( ) {   mUseLevel = state . mUseLevel ;   mUseLevelForShape = state . mUseLevelForShape ;   mOpaqueOverBounds = state . mOpaqueOverBounds ;   mOpaqueOverShape = state . mOpaqueOverShape ;   mThemeAttrs = state . mThemeAttrs ;   mAttrSize = state . mAttrSize ;   mAttrGradient = state . mAttrGradient ;     } }  
public class SliderLayout extends RelativeLayout {   ;   public void startAutoCycle ( ) {   startAutoCycle ( mSliderDuration , mSliderDuration , mAutoRecover ) ;   }       }  
public abstract class HazelcastTestSupport { public void test ( ) { {   }   printAllStackTraces ( ) ;   throw error ;   }     }  
public class CoreProxy {     public static void setField804 ( EntityItem item , float value ) {   item . hoverStart = value ;   }   public static File getPropertyFile ( ) {     } }  
class DatabaseDumpHandler extends BaseWikipediaDumpHandler { public void test ( ) {   contextTools . setContextSize ( CONTEXT_SIZE ) ;   contextTools . setErrorMarkerStart ( MARKER_START ) ;   contextTools . setErrorMarkerEnd ( MARKER_END ) ;   contextTools . setEscapeHtml ( false ) ;   }       }  
import jackpal . androidterm . emulatorview . TermSession ;   import jackpal . androidterm . util . TermSettings ;   public class TermView extends EmulatorView {   public TermView ( Context context , TermSession session , DisplayMetrics metrics ) {   super ( context , session , metrics ) ;     } }  
package biz . bokhorst . xprivacy ;   import java . util . Date ;   public class CRestriction {   private long mExpiry ;   public int mUid ;     }  
public class PermissionCheckerBagImpl implements PermissionCheckerBag { public void test ( ) { { {   }   }   if ( _userGroups . contains ( group ) ) {   return true ;   }     return false ;   }     }  
public class Downloader   { public String downloadAsString ( String url ) throws IOException   { { {   return Helper . isToString ( fetch ( url ) ) ;   }   }     } }  
public class UrlMappingUtils { public void test ( ) { { {   WebUtils . cleanupIncludeRequestAttributes ( request , toRestore ) ;   }   }   }     }  
public class LiquibaseServletListener implements ServletContextListener { public void test ( ) { {   }   if ( connection != null ) {   connection . close ( ) ;   }   }     }  
import php . runtime . reflection . ModuleEntity ;   import java . io . File ;   import java . io . PrintStream ;   public class CLI {   private final Arguments arguments ;     }  
public class GridSectionLayoutManager extends SectionLayoutManager { public void test ( ) { { {   bottomMostEdge = bottomEdge ;   }   }   return bottomMostEdge ;   }       }  
public class AppWidgetHost {   private OnClickHandler mOnClickHandler ;   public AppWidgetHost ( Context context , int hostId ) {   this ( context , hostId , null , context . getMainLooper ( ) ) ;   }       }  
public class WebappServiceLoader < T > { public void test ( ) { {   if ( line . length ( ) == 0 ) {   continue ;   }   servicesFound . add ( line ) ;   }   }     }  
public class DLAppLocalServiceTest {     private Group _group ;   private Repository _repository ;   }      
public class AsyncDataSetIterator implements DataSetIterator {     public List < String > getLabels ( ) {   return baseIterator . getLabels ( ) ;   }       }  
public abstract class UpdaterTestCase {     public void setUp ( ) throws Exception {   Runner . initLogger ( System . getProperty ( " java . io . tmpdir " ) ) ;   myTempDirFixture = IdeaTestFixtureFactory . getFixtureFactory ( ) . createTempDirTestFixture ( ) ;   myTempDirFixture . setUp ( ) ;     } }  
public class RunTests { public void test ( ) { { { {   }   }   TestRunner . run ( s ) ;   System . exit ( 0 ) ;   }   }     }  
public final class AccessibilityManager { public void test ( ) { { {   sInstance = new AccessibilityManager ( context , service ) ;   }   }   return sInstance ;   }     }  
public class RibbonConfig { public void test ( ) {   }                 }  
public abstract class CompletionPhase implements Disposable { public int newCompletionStarted ( int time , boolean repeated ) { 	{ CompletionServiceImpl . setCompletionPhase ( NoCompletion ) ; 	return time + 1 ; 	} }  } 
public class ConfusionMatrix extends Iced { public void test ( ) {   prediction_error_by_class = classErr ( ) ;   prediction_error = err ( ) ;   this . domain = domain ;   table = toTable ( ) ;   }       }  
final class MountListener implements Runnable { public void test ( ) {   byte [ ] buffer = new byte [ 100 ] ;   writeCommand ( VOLD_CMD_SEND_UMS_STATUS ) ;   mountMedia ( Environment . getExternalStorageDirectory ( ) . getAbsolutePath ( ) ) ;   while ( true ) {   int count = inputStream . read ( buffer ) ;     } } }  
import org . wordpress . android . ui . stats . WPComLoginActivity ;           public class AuthErrorDialogFragment extends SherlockDialogFragment { public void test ( ) {     } }  
public class MatcherFilter implements Filter { public void test ( ) {   boolean consumedByStaticFile = StaticFiles . consume ( httpRequest , httpResponse ) ;   if ( consumedByStaticFile ) {   return ;   }     } }  
public class TestBug49158 extends CookiesBaseTest { public void test ( ) { {   session . invalidate ( ) ;   session = req . getSession ( ) ;   session . invalidate ( ) ;   req . getSession ( ) ;   }   }     }  
public class LogEvent extends AbstractBuckEvent {     public boolean eventsArePair ( BuckEvent event ) {   if ( ! ( event instanceof LogEvent ) ) {   return false ;   }     } } 
class TreeJCodeGen extends TreeVisitor < RuntimeException > { public void test ( ) { {   visit ( ) ;   closure ( _sb ) ;   _sb . p ( _csb ) ;   }   }     }  
public class ArgumentsMarshalTest extends TestCase {   TestLibrary lib ;   protected void setUp ( ) {   lib = ( TestLibrary ) Native . loadLibrary ( " testlib " , TestLibrary . class ) ;   }     }  
public class GCMIntentService extends GCMBaseIntentService {   private UserActivityDao userActivityDao ;   public GCMIntentService ( ) {   super ( SENDER_ID ) ;   DependencyInjectionService . getInstance ( ) . inject ( this ) ;   }     }  
public class SeriesGuideApplication extends Application { public void test ( ) {     ImageCache . getInstance ( getApplicationContext ( ) ) ;   Utils . runNotificationService ( this ) ;   }     }  
public class ErrorBar extends JPanel {     protected void done ( ) {   int totalLines = 0 ;   int currentTab = 0 ;   for ( SketchCode sc : editor . getSketch ( ) . getCode ( ) ) {     } } }  
package com . intellij . codeInsight . daemon ;           public abstract class LineMarkerProviderDescriptor extends GutterIconDescriptor implements LineMarkerProvider { public void test ( ) {   }     }  
public class OrchidSocketImpl extends SocketImpl {     public void setOption ( int optID , Object value ) throws SocketException {     }   public Object getOption ( int optID ) throws SocketException {     } }  
public class QuartzEndpoint extends DefaultEndpoint {     public boolean isSingleton ( ) {   return true ;   }       }  
public class Tmp { public interface ClientDiscoveryHandler {   }     public void onDiscoveredHost ( DatagramPacket datagramPacket , Kryo kryo ) { {     }     } }   
import com . zaxxer . hikari . util . UtilityElf ;   public class ConnectionStateTest   {     public void testAutoCommit ( ) throws SQLException   {   try ( HikariDataSource ds = new HikariDataSource ( ) ) {     } } }  
public class HttpLocationFactory       { public URI createQueryLocation ( QueryId queryId )   {   Preconditions . checkNotNull ( queryId , " queryId is null " ) ;     } }  
class Slurper implements Runnable {   private DBCursor processFullOplog ( ) throws InterruptedException , SlurperException {   Timestamp < ? > currentTimestamp = getCurrentOplogTimestamp ( ) ;   return oplogCursor ( currentTimestamp ) ;   }     }  
public class InternalOsmAndAPIImpl implements InternalOsmAndAPI {     public TargetPointsHelper getTargetPointsHelper ( ) {   return app . getTargetPointsHelper ( ) ;   }       }  
import java . util . Vector ;       public class PortalInitableUtil {     public synchronized static void init ( PortalInitable initable ) {   if ( _initables == null ) {   initable . portalInit ( ) ;     } } }  
class CatalogExpander extends NetworkItemsLoader { public void test ( ) { { {   if ( myAuthenticator != null ) {   myAuthenticator . run ( f . URL ) ;   }   }   }   }     }  
package com . mongodb ;   public class MongoException extends RuntimeException {  public MongoException ( String msg ) {   super ( msg ) ;     }   } 
class InstanceInfoReplicator implements Runnable {     public void stop ( ) {   scheduler . shutdownNow ( ) ;   started . set ( false ) ;   }     }  
package com . jwetherell . algorithms . sequence ;   public class SubsequenceCounter {     private static char [ ] seq = null ;   private static char [ ] subseq = null ;   private static int [ ] [ ] tbl = null ;     }  
public class PortletConfigurationPortlet extends StrutsPortlet {     }   private class ConfigurationPortletPortletConfig extends PortletConfigImpl {   ConfigurationPortletPortletConfig (   PortletConfigImpl wrappedPortletConfig ) {     } } 
public class PythonUtil { public void test ( ) { { {   allComponents . addNativeLibraries (   Paths . get ( ent . getKey ( ) ) ,   ent . getValue ( ) ,   nativeLinkable . getBuildTarget ( ) ) ;   }   }   }     }  
public class Tmp { public void test ( ) {             } }  
public class CompilerOptions implements Serializable {     public static LanguageMode fromString ( String value ) {   if ( value == null ) {   return null ;   }   switch ( value ) {   case " ECMASCRIPT6_STRICT " :   case " ES6_STRICT " :     } } }  
public class SQLExprParser extends SQLParser { public void test ( ) {   SQLExpr notTarget = expr ( ) ;   accept ( Token . RPAREN ) ;   sqlExpr = new SQLNotExpr ( notTarget ) ;     } }  
public class K2JvmCliTest extends CliBaseTest {   public void script ( ) throws Exception {   executeCompilerCompareOutputJVM ( ) ;   }       public void classpath ( ) throws Exception {   executeCompilerCompareOutputJVM ( ) ;   }   }      
public class LocalTachyonClusterResource implements TestRule { public void test ( ) {   mConfParams = confParams ;   }           }  
public final class UiAutomation { public void test ( ) {   canvas . translate ( - screenshotWidth / 2 , - screenshotHeight / 2 ) ;   canvas . drawBitmap ( screenShot , 0 , 0 , null ) ;   canvas . setBitmap ( null ) ;   screenShot . recycle ( ) ;   screenShot = unrotatedScreenShot ;   }     }  
public class TxLog     { public void close ( ) throws IOException   { {   logBuffer . force ( ) ;   logBuffer . getFileChannel ( ) . close ( ) ;   }     } }  
public class Tmp { public void test ( ) {               } }  
package android . animation ;   import java . util . ArrayList ;   import java . util . Collection ;   import java . util . HashMap ;   import java . util . List ;        
public class MetaHistoryServiceImpl   { public void test ( ) {   synchronized ( progressListeners )   {   if ( ! progressListeners . contains ( listener ) )   progressListeners . add ( listener ) ;   }   }     }  
import java . util . Map ;   public class MapSizeRequest extends MapAllPartitionsClientRequest implements Portable , RetryableRequest , SecureRequest {   public MapSizeRequest ( ) {   }     }  
public class HeadlessMaterial extends BaseMaterial {     public void reload ( MaterialData newData ) {   this . data = newData ;   }       }  
import android . test . suitebuilder . annotation . LargeTest ;   import java . io . File ;   public class SQLiteStatementTest extends AndroidTestCase {   private SQLiteDatabase mDatabase ;   private File mDatabaseFile ;     }  
public class HttpRequest {     public static class HttpRequestException extends RuntimeException {   private static final long serialVersionUID = - 1170466989781746231L ;       } }  
public class TestSelectorOptions {     public String getDefaultMetaVariable ( ) { { {   return " TEST - SELECTOR " ;   }   }   }     }  
public final class UndertowSession implements Session {     public String getNegotiatedSubprotocol ( ) {   return " " ;   }       }  
public class BubbleView extends FrameLayout {     protected void loadFavicon ( ) {   mThemeColor = null ;   maybeCancelFaviconLoad ( ) ;   final int tabFaviconSize = getResources ( ) . getDimensionPixelSize ( R . dimen . browser_toolbar_favicon_size ) ;     } }  
public class SourceCodeTraversal extends TraversalHelper { public void test ( ) { { { {   break ;   }   }   acceptSiblings ( currentNode , followSiblings ) ;   }   }     }  
public class TileBuilder extends TileAbstractBuilder implements IMachine { public void test ( ) {   updateRequirements ( ) ;   sendNetworkUpdate ( ) ;     return ;   }     }  
public class IdeSettingsDialog extends DialogWrapper implements DataProvider { public void test ( ) { { {   myEditor . apply ( ) ;   myEditor . revalidate ( ) ;   myEditor . repaint ( ) ;   updateStatus ( ) ;   }   }   }     }  
public class ZenFooter extends LinearLayout {   public void onConfigurationChanged ( ) { {   mSpTexts . update ( ) ;   Util . setText ( mEndNowButton , mContext . getString ( R . string . volume_zen_end_now ) ) ;   }   }     }  
public class Tmp { public ISeq rest ( ) {   } public int count ( ) { {   if ( oa != null )   return oa . length - i ;   return Array . getLength ( array ) - i ;   }     } }  
class AccessibilityInjectorFallback { public void test ( ) { {   event . setFromIndex ( 0 ) ;   event . setToIndex ( selection . length ( ) ) ;   sendAccessibilityEvent ( event ) ;   }   }     }  
public class PhoneWindowManager implements WindowManagerPolicy { public void test ( ) { { {   msg . setAsynchronous ( true ) ;   msg . sendToTarget ( ) ;   }   break ;   }   }     }  
public class ViewOverlay {   public void clear ( ) {   removeAllViews ( ) ;   if ( mDrawables != null ) {   for ( Drawable drawable : mDrawables ) {   drawable . setCallback ( null ) ;   }   mDrawables . clear ( ) ;   }   }     }  
public class GridSearch extends Job { public void test ( ) {   }   void updateErrors ( ArrayList < JobInfo > infos ) {   if ( jobs == null ) return ;   errors = new double [ jobs . length ] ;   int i = 0 ;   for ( Job job : jobs ) {     } } }  
public class ViaInstruction extends Instruction { public int getViaCount ( ) {{ if ( viaPosition < 0 ) throw new IllegalStateException ( " Uninitialized via count in instruction " + getName ( ) ) ; return viaPosition ; 	} } } 
public abstract class MediaBrowserService extends Service {             public class Result < T > {   private Object mDebug ;     } }  
public class WifiConfiguration implements Parcelable {       public boolean isValid ( ) {   if ( allowedKeyManagement == null )   return false ;     } }  
public class BuildoutConfigurable implements Configurable , NonDefaultProjectConf       { public String getDisplayName ( ) { {   return " Buildout " ;   }       } }  
public class MainActivity extends ReactActivity {     protected List < ReactPackage > getPackages ( ) {   return Arrays . < ReactPackage > asList (   new MainReactPackage ( )   ) ;   }   }      
public abstract class BaseDownloadTask {       public boolean isRunning ( ) {     if ( ! isUsing ( ) ) {   return false ;   }     } }  
public class PortletDisplayTemplateImpl implements PortletDisplayTemplate {     private static final Transformer _transformer = new Transformer (   PropsKeys . PORTLET_DISPLAY_TEMPLATES_ERROR , true ) ;   }      
public final class AlluxioLineage extends AbstractLineageClient {             public static synchronized AlluxioLineage get ( LineageContext context ) {     } }  
public class DistTest         { public void testLikeDistro_SetupDemoBase ( ) throws Exception   {   File basePath = testdir . getEmptyDir ( ) ;     } }  
public class Poller extends PollerBase implements Runnable   { public void start ( )   { {   worker = new Thread ( this , name ) ;   worker . setDaemon ( true ) ;   worker . start ( ) ;   }     } }  
public class OperationDialog extends JDialog { public void test ( ) {   contentPane . add ( makeButtonPanel ( ) , BorderLayout . SOUTH ) ;   pack ( ) ;   setResizable ( false ) ;   }       }  
public class TemplateContextHelper { public void test ( ) {   try {   variables . put (   " saxReader " ,   utilLocator . findUtil ( SAXReaderUtil . class . getName ( ) ) ) ;   }   catch ( SecurityException se ) {     } } }  
public class ServerTestCase { public void test ( ) { {   if ( server != null )   server . stop ( ) ;   }   }     }  
public class PhotoView extends ImageView implements IPhotoView {     public Matrix getDisplayMatrix ( ) {   return mAttacher . getDisplayMatrix ( ) ;   }       }  
public class DiagnosticGroups { public void test ( ) {   DiagnosticGroups . registerGroup ( " invalidProvide " ,   ProcessClosurePrimitives . INVALID_PROVIDE_ERROR ) ;   DiagnosticGroups . registerGroup ( " lateProvide " ,   ProcessClosurePrimitives . LATE_PROVIDE_ERROR ) ;     DiagnosticGroups . registerGroup ( " es6Typed " ,   RhinoErrorReporter . MISPLACED_TYPE_SYNTAX ) ;   }     }  
public class Tmp { public interface ExecHandle {     ExecHandle start ( ) ;   ExecHandleState getState ( ) ;     void abort ( ) ;   ExecResult waitForFinish ( ) ;     } }  
public class WorldSpecificSaveHandler implements ISaveHandler     { public File getMapFileFromName ( String name )   { { {   return new File ( dataDir , name + " . dat " ) ;   }   }     } }  
public class Tmp { public enum TreeType {     SMALL_JUNGLE ,         COCOA_TREE ,         JUNGLE_BUSH ,     } }  
public class CommonShortcuts {     public static ShortcutSet getMoveEnd ( ) {   return shortcutsById ( IdeActions . ACTION_EDITOR_MOVE_LINE_END ) ;   }   public static ShortcutSet getRecentFiles ( ) {     } }  
public class MockFSDirectoryService extends FsDirectoryService {     public Directory [ ] build ( ) throws IOException {   return delegateService . build ( ) ;   }       }  
public class TileLaser extends TileBuildCraft implements IPowerReceptor {     protected void findTable ( ) {   int meta = worldObj . getBlockMetadata ( xCoord , yCoord , zCoord ) ;   int minX = xCoord - 5 ;     } }  
public class Astroboy2Test {     public void teardown ( ) {     RoboGuice . destroyInjector ( Robolectric . application ) ;   }     }  
public class ShadowLocation {   public void __constructor__ ( String provider ) {   this . provider = provider ;   time = System . currentTimeMillis ( ) ;   }       }  
class ItemLoader {     public void run ( ) {   Process . setThreadPriority ( Process . THREAD_PRIORITY_BACKGROUND ) ;     if ( itemViewReused ( mRequest ) ) {   return ;   }     } }  
public class JmfMediaManager extends JingleMediaManager {     public JmfMediaManager ( ) {   setupPayloads ( ) ;   }       }  
import de . danielnaber . languagetool . rules . RuleMatch ;         class Main {   private final static int CONTEXT_SIZE = 25 ;     } 
package mypackage ;   import java . io . IOException ;   import java . io . PrintWriter ;   import javax . servlet . ServletException ;   import javax . servlet . http . HttpServlet ;      
public class Tmp { public interface DSLContext extends Scope , AutoCloseable {                 } }  
public class DescriptorResolver {     public static ConstructorDescriptorImpl createPrimaryConstructorForObject (   PsiElement object ,   ClassDescriptor classDescriptor ,   BindingTrace trace   ) {     } }  
public class PluginManagerMain {   public void filter ( ) {   if ( installedPluginTable . isShowing ( ) ) {   filter ( installedPluginsModel , myFilteredInstalled ) ;   installedPluginsModel . modifyData ( pluginsList ) ;   }   else {   filter ( availablePluginsModel , myFilteredAvailable ) ;     } } }  
public class PhotoViewerActivity extends SherlockFragmentActivity implements OnP     { public void onPhotoLoadStatusChanged ( boolean finished ) {     }   public void onPlacePicked ( Place place ) {     } }  
public class PhoneWindow extends Window implements MenuBuilder . Callback { public void test ( ) {   if ( cb == null ) {   return false ;   } else {   sendCloseSystemWindows ( ) ;   return cb . onSearchRequested ( ) ;   }   }     }  
public class CordovaActivity extends Activity {   protected void onSaveInstanceState ( Bundle outState )   {   cordovaInterface . onSaveInstanceState ( outState ) ;   super . onSaveInstanceState ( outState ) ;   }       }  
public class SvnVersionFilterComponent extends StandardVersionFilterComponent {   protected void installCheckBoxListener ( final ActionListener filterListener ) {   super . installCheckBoxListener ( filterListener ) ;   myUseAuthorFilter . addActionListener ( filterListener ) ;   myAuthorField . addActionListener ( filterListener ) ;   }     }  
class PreferenceInflater { public void test ( ) {   for ( final String prefix : prefixes ) {   try {   clazz = classLoader . loadClass ( prefix + name ) ;   break ;   } catch ( final ClassNotFoundException e ) {   notFoundException = e ;   }     } } }  
public class LibraryLoadTest extends TestCase {     public void testLoadAWTAfterJNA ( ) {   if ( GraphicsEnvironment . isHeadless ( ) ) return ;     if ( Pointer . SIZE > 0 ) {   Toolkit . getDefaultToolkit ( ) ;   }     } }  
public class MarkupBuilder extends BuilderSupport {    public MarkupBuilderHelper getMkp ( ) {   return new MarkupBuilderHelper ( this ) ;   }         }  
public class S3Client { public void test ( ) { { {   }   }         }     }  
public abstract class AbstractBaseTest {   protected Configuration configuration = Connections . getConfiguration ( ) ;     protected String expectedQuery ;     }  
import java . util . Properties ;           public class ExternalResources {   private ExternalResources ( ) {     } }  
public class CommandFailureException extends MongoException {               public CommandResult getCommandResult ( ) {   return commandResult ;   }     }  
public final class MeasureKey {    public Developer getDeveloper ( ) {   return developer ;   }   }      
import sun . misc . URLClassPath ;         public final class QuasarURLClassLoaderHelper {   private final URLClassLoader cl ;   private final QuasarInstrumentor instrumentor ;     } 
class TiffUtil {   public static int getAutoRotateAngleFromOrientation ( int orientation ) {   switch ( orientation ) {   case ExifInterface . ORIENTATION_NORMAL :   case ExifInterface . ORIENTATION_UNDEFINED :   return 0 ;   case ExifInterface . ORIENTATION_ROTATE_180 :   return 180 ;     } } }  
public class TrainParser { public void test ( ) { { { {   state = transition . apply ( state ) ;   }   }   }   }     }  
public class BasicBSONObject extends LinkedHashMap < String , Object > implements BSO           { public boolean containsKey ( String key ) { {   return containsField ( key ) ;   }     } }  
public class ClientSession extends Session { public void packetReceived ( Packet packet ) { packet . setFrom ( getAddress ( ) ) ; } public String toString ( ) { return super . toString ( ) + " presence : " + presence ; } } 
public abstract class StoreBase   { public void processExpires ( ) {   String [ ] keys = null ;   if ( ! started ) {   return ;   }     } } 
public class Tmp { public enum SQLDialect {                 ;   private static final SQLDialect [ ] FAMILIES ;     } }  
public class MockitoTest extends TestBase { public void test ( ) {         }     }  
public class DebugProcessEvents extends DebugProcessImpl { public void test ( ) { { { { {   return ;   }   }   ( ( SuspendManagerImpl ) getSuspendManager ( ) ) . popContext ( context ) ;   }   }   }     }  
public class WsSession implements Session { public void test ( ) { { { {   }   }   }   }     }  
import java . text . ParseException ;   import java . util . ArrayList ;   import java . util . Date ;   import java . util . List ;   import org . joda . time . DateTime ;   import org . joda . time . DateTimeConstants ;      
public class EmojiconTextView extends TextView {     public void setEmojiconSize ( int pixels ) {   mEmojiconSize = pixels ;     super . setText ( getText ( ) ) ;   }       }  
abstract public class GraphView extends LinearLayout { public void test ( ) {   setLayoutParams ( new LayoutParams ( LayoutParams . FILL_PARENT , LayoutParams . FILL_PARENT ) ) ;   if ( title == null )   this . title = " " ;   else   this . title = title ;     } }  
public class TermSettings {   private String mShell ;   private String mInitialCommand ;   private boolean mUTF8ByDefault = false ;   private int mBackKeyAction = BACK_KEY_STOPS_SERVICE ;   private String mTermType ;   private boolean mCloseOnExit = true ;     }  
import java . util . regex . Pattern ;               public class DefaultGroovyMethods { public void test ( ) {     } }  
public class RouterImpl implements Router {     public List < Route > getRoutes ( ) {   return new ArrayList < > ( _routes ) ;   }       }  
public class PyStringLiteralFileReferenceSet extends RootFileReferenceSet {     protected void reparse ( ) {     if ( myStringLiteralExpression != null ) {   MyTextRangeConsumer textRangeConsumer = new MyTextRangeConsumer ( this ) ;     } } }  
import java . util . List ;   import java . util . Random ;   import android . content . Context ;   import android . os . Build ;   import android . os . Process ;   import android . util . Log ;      
public class Client implements Runnable { public void test ( ) { {   }   if ( isDisposeRegistered ) {   parent . unregisterMethod ( " dispose " , this ) ;   isDisposeRegistered = false ;   }   dispose ( ) ;   }     }  
import java . io . IOException ;             public class AssetBundleEntryInfo implements Struct { public void test ( ) {     } }  
public class GPXUtilities { public void test ( ) {   double totalSpeedSum = 0 ;   points = 0 ;   double channelThres = 10 ;   double channelBase ;   double channelTop ;   double channelBottom ;     } }  
public abstract class GoStubbedElementImpl < T extends StubBase < ? > > extends StubBa     { public String toString ( ) { {   return getElementType ( ) . toString ( ) ;   }       } }  
import alluxio . client . WriteType ;   import alluxio . shell . AbstractAlluxioShellTest ;   import org . junit . Assert ;   import org . junit . Ignore ;   import org . junit . Test ;        
public class ExpandedActivity extends Activity { public void test ( ) {   if ( Constant . EXPANDED_ACTIVITY_DEBUG ) {   rootView . setBackgroundColor ( 0x5500ff00 ) ;   } else {   rootView . setWillNotDraw ( true ) ;   }   initHotwordService ( ) ;     } }  
package tachyon . util . io ;   import java . io . FileOutputStream ;   import java . io . IOException ;   import java . nio . ByteBuffer ;      
public class ModifyKeyboardShortcutsWidget extends ModalDialogBase     { public Object getKey ( CommandBinding item )   { { {   return item . hashCode ( ) ;   }   } ;     } }  
class PowerManagerService extends IPowerManager . Stub   { public void enableUserActivity ( boolean enabled ) { {   synchronized ( mLocks ) {   mUserActivityAllowed = enabled ;   }   }     } }  
public class YAxis extends AxisBase {       public void setGranularityEnabled ( boolean enabled ) {   mGranularityEnabled = enabled ;   }       }  
final class Log4JLogger extends Logger {       public void error ( String message , Throwable th ) { {   LOGGER . error ( message , th ) ;   }   }     }  
public class NativeLibraryHelper {     public static boolean removeNativeBinariesLI ( String nativeLibraryPath ) {   if ( nativeLibraryPath == null ) return false ;   return removeNativeBinariesFromDirLI ( new File ( nativeLibraryPath ) ) ;   }     }  
import android . widget . FrameLayout ;   import android . widget . ImageView ;   import android . widget . LinearLayout ;   import android . widget . PopupWindow ;   import android . widget . ScrollView ;   import android . widget . TextView ;        
import java . util . concurrent . ConcurrentHashMap ;   import java . util . concurrent . atomic . AtomicInteger ;   public final class Var implements IFn {   static class Frame {       } }   
import voldemort . utils . Time ;   public class KeyedResourcePoolTest {   protected static int POOL_SIZE = 5 ;   protected static long TIMEOUT_MS = 200 ;   protected TestResourceFactory factory ;   protected KeyedResourcePool < String , TestResource > pool ;     }  
public class GroupLocalServiceImpl extends GroupLocalServiceBaseImpl { public void test ( ) {     exportImportConfigurationLocalService .   deleteGroupExportImportConfigurations ( group . getGroupId ( ) ) ;     unscheduleStaging ( group ) ;   if ( group . hasStagingGroup ( ) ) {     } } }  
public class FileConsumerCustomExceptionHandlerTest extends ContextTestSupport { public void test ( ) { { {   }   } ;   }           }  
public class WordPress extends Application {     public void onActivityCreated ( Activity activity , Bundle arg1 ) {     WPActivityUtils . applyLocale ( activity ) ;   }     }  
public class SubtasksListFragment extends TaskListFragment {     protected void refresh ( ) {   initializeTaskListMetadata ( ) ;   setUpTaskList ( ) ;   }     }  
public class IndexRangesMigrationPeriodical extends Periodical {     public boolean isDaemon ( ) {   return true ;   }       }  
public class SimpleAppServer extends AbstractAppServer     { public String getDescription ( )   { { { {   return " Exits the client " ;   }   }   }     } }  
public class AtmosphereFramework {     public void objectFactory ( AtmosphereObjectFactory objectFactory ) {   this . objectFactory = objectFactory ;   this . objectFactory . configure ( config ) ;   }       }  
public class GitMergeUtil { public void test ( ) {   for ( String fileName : unmergedNames ) {   VirtualFile f = lfs . findFileByPath ( fileName ) ;   if ( f != null ) {   f . refresh ( false , false ) ;   unmerged . add ( f ) ;   }   }     } }  
public class ResourceLinkFactory       { public static void setGlobalContext ( Context newGlobalContext ) { {   globalContext = newGlobalContext ;   }     } }  
public class DBObjectCodec implements CollectibleCodec < DBObject > {   private final CodecRegistry codecRegistry ;   private final BsonTypeClassMap bsonTypeClassMap ;   private final DBObjectFactory objectFactory ;   private final IdGenerator idGenerator = new ObjectIdGenerator ( ) ;     }  
public class Leg {         public Boolean interlineWithPreviousLeg ;       }  
package voldemort . server . protocol . admin ;       public class AsyncOperationStatus {   private String status = " initializing " ;   private boolean complete = false ;   private final int id ;     }  
public class CameraPreview extends SurfaceView implements SurfaceHolder . Callback     { public void surfaceCreated ( SurfaceHolder surfaceHolder ) { {   mSurfaceCreated = true ;   }       } }  
public class TridentKafkaState implements State { public void test ( ) {}} 
public final class ServerImpl extends Server { public void test ( ) {   if ( shutdown ) {   return this ;   }   shutdown = true ;   transportServer . shutdown ( ) ;   timeoutService . shutdown ( ) ;   return this ;   }     }  
public class ClassFilterEditor extends JPanel implements ComponentWithEmptyText   { public void removeRow ( final int idx ) { { {   myFilters . remove ( idx ) ;   fireTableRowsDeleted ( idx , idx ) ;   }   }     } }  
public class CompilerOptions implements Serializable , Cloneable {           private LanguageMode languageOut ;     }  
final class ZLOwnXMLParser { public void test ( ) {   while ( true ) {   int count = streamReader . read ( buffer ) ;   if ( count <= 0 ) {   streamReader . close ( ) ;   return ;   }   if ( count < buffer . length ) {     } } } }  
public final class MediaBrowserCompat {         static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } }   
public class DefaultBroadcaster implements Broadcaster {     protected void entryDone ( final BroadcasterFuture < ? > f ) {   if ( f != null ) f . done ( ) ;   }     }  
public abstract class FilteredSearchContext extends SearchContext {     public void accessed ( long accessTime ) {   in . accessed ( accessTime ) ;   }       }  
public class RedisClient extends DB { public void test ( ) {   String password = props . getProperty ( PASSWORD_PROPERTY ) ;   if ( password != null ) {   jedis . auth ( password ) ;   }   }     }  
public class SchedulingPolicyService extends ISchedulingPolicyService . Stub {     private static final int PRIORITY_MIN = 1 ;   private static final int PRIORITY_MAX = 3 ;   public SchedulingPolicyService ( ) {   }     }  
public class OpenIDAuthenticationProcessingFilter extends AbstractProcessingFilt     { public int getOrder ( ) { { {   return FilterChainOrder . OPENID_PROCESSING_FILTER ;   }   }     } }  
class TelephonyRegistry extends ITelephonyRegistry . Stub { public void test ( ) {   if ( ! checkNotifyPermission ( " notifyDataActivity ( ) " ) ) {   return ;   }   synchronized ( mRecords ) {   mDataActivity = state ;   for ( Record r : mRecords ) {     } } } }  
public class PortletPreferencesListener implements ModelListener {     public void onAfterCreate ( BaseModel model ) throws ModelListenerException {   }   public void onBeforeRemove ( BaseModel model ) throws ModelListenerException {     } }  
public class XIoBridge extends XHook { public void test ( ) { {   return ;     if ( isRestricted ( param , mFileName ) )   param . setResult ( new FileNotFoundException ( ) ) ;   }   }     }  
public class DelaunayTriangulatorTest extends GdxTest { public void test ( ) {   }   void triangulate ( ) {     MathUtils . random . setSeed ( seed ) ;   int pointCount = 100 ;     } }  
public class FocusTrackback {     private boolean wrongOS ( ) {   return ! SystemInfo . isMac ;   }   private void register ( final Window parent ) {     } }  
public class ActivityShare extends Activity { public void test ( ) {     setContentView ( R . layout . sharelist ) ;     if ( action . equals ( ACTION_TOGGLE ) ) {     } } }  
public class PacketTransceiverImpl implements PacketTransceiver {       public void receive ( Packet packet ) {   if ( packet . isHeaderSet ( Packet . HEADER_OP ) ) {   operationService . executeOperation ( packet ) ;     } } }  
public class ClientConfig {               public TimeoutConfig getTimeoutConfig ( ) {   return timeoutConfig ;     } }  
public class DrawerLayout extends ViewGroup {     public int getViewHorizontalDragRange ( View child ) {   return isDrawerView ( child ) ? child . getWidth ( ) : 0 ;   }       }  
public class AtmosphereRequest extends HttpServletRequestWrapper {       public HttpSession getSession ( ) {   return getSession ( false ) ;   }       }  
public class PLWJGL extends PGL {     protected void getGL ( PGL pgl ) {   glThread = pgl . glThread ;   }   }      
public class FreeFlowContainer extends AbsLayoutContainer { public void test ( ) {   v . setRotation ( 0 ) ;   v . setScaleX ( 1f ) ;   v . setScaleY ( 1f ) ;   v . setAlpha ( 1f ) ;   viewpool . returnViewToPool ( v ) ;   }     }  
public class CompatibilityEngine extends AbstractEngine {     public void initScreenshot ( GL gl , GLU glu ) {   initDisplayLists ( gl , glu ) ;   textManager . initRenderer ( ) ;   }       }  
public class Form {   public static final String TYPE_FORM = " form " ;   public static final String TYPE_SUBMIT = " submit " ;   public static final String TYPE_CANCEL = " cancel " ;   public static final String TYPE_RESULT = " result " ;   private DataForm dataForm ;     }  
public class StreamRule { public void test ( ) { {   for ( Type type : Type . values ( ) )   if ( type . id == id )   return type ;   return null ;   }   }     }  
import org . codehaus . groovy . runtime . InvokerInvocationException ;               public class GroovyMain { public void test ( ) {     } }  
public class Canvas {                 public final Matrix getMatrix ( ) {   Matrix m = new Matrix ( ) ;       } }  
public class ProjectJdkImpl extends UserDataHolderBase implements JDOMExternaliz     { public void rootsChanged ( ) {   resetVersionString ( ) ;   if ( myListeners . isEmpty ( ) ) {   return ;   }     } }  
import water . * ;   public class WaterMeterCpuTicks extends Iced {     public int nodeidx ;     public long [ ] [ ] cpu_ticks ;     }  
import java . util . List ;   public class ReadonlyStatusHandlerImpl extends ReadonlyStatusHandler implements ProjectComponent , JDOMExternalizable {   private final Project myProject ;   public boolean SHOW_DIALOG = true ;   public ReadonlyStatusHandlerImpl ( Project project ) {   myProject = project ;     } }  
public class Client implements IConnection {   private final int buffer_size ;   private boolean closing ;   private int messageBatchSize ;   private AtomicLong pendings ;     }  
public class Tmp { public enum Material {   RAW_CHICKEN ( 365 ) ,   COOKED_CHICKEN ( 366 ) ,   ROTTEN_FLESH ( 367 ) ,   ENDER_PEARL ( 368 , 16 ) ,   BLAZE_ROD ( 369 ) ,   GHAST_TEAR ( 370 ) ,   GOLD_NUGGET ( 371 ) ,     } }  
public class PShader { public void test ( ) {   parent = null ;   pgMain = null ;   pgl = null ;   context = - 1 ;   this . vertexURL = null ;   this . fragmentURL = null ;     } }  
public class RecyclerView extends ViewGroup { public void test ( ) { {   mLayout . onAdapterChanged ( oldAdapter , mAdapter ) ;   }   mRecycler . onAdapterChanged ( oldAdapter , mAdapter ) ;   mStructureChanged = true ;   markKnownViewsInvalid ( ) ;   requestLayout ( ) ;   }     }  
public class StorageService implements IEndpointStateChangeSubscriber , StorageSe   {   public void run ( )   {   stopRPCServer ( ) ;   Gossiper . instance . stop ( ) ;   MessagingService . instance ( ) . shutdown ( ) ;   StageManager . shutdownNow ( ) ;     } }  
public final class ContactsContract {   public static final int TYPE_HOME = 1 ;   public static final int TYPE_WORK = 2 ;   public static final int TYPE_OTHER = 3 ;   public static final int TYPE_MOBILE = 4 ;         }  
public class PlaybackService { public void test ( ) {   if ( mSeek > 0 ) {   mPlayer . seekTo ( mSeek ) ;   }   mPlayer . setLooping ( true ) ;   mPlayer . start ( ) ;   break ;   }     }  
public class ClearScrollResponse extends ActionResponse implements StatusToXCont     { public XContentBuilder toXContent ( XContentBuilder builder , Params params ) throws IOException { {   return builder ;   }     } }  
public class FMLServerHandler implements IFMLSidedHandler   { public void test ( ) {   server = minecraftServer ;   ObfuscationReflectionHelper . detectObfuscation ( World . class ) ;   Loader . instance ( ) . loadMods ( ) ;   }     }  
public class Tmp { public void test ( ) {               } }  
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 3 . 0 " ;   public static String getVersion ( ) {   return VERSION ;     } }  
public class RequestFacade implements HttpServletRequest {   public void login ( String username , String password )   throws ServletException {   request . login ( username , password ) ;   }   public void logout ( ) throws ServletException {     } }  
public class MessageHistoryServiceImpl   { public void localUserPresenceChanged ( LocalUserChatRoomPresenceChangeEvent evt )   {   if ( evt . getEventType ( ) ==   LocalUserChatRoomPresenceChangeEvent . LOCAL_USER_JOINED )   {   evt . getChatRoom ( ) . addMessageListener ( this ) ;   }     } }  
public class AccelListener extends Plugin implements SensorEventListener { public void test ( ) { if ( this . status == AccelListener . STOPPED ) { return ; } Log . d ( " ACCEL " , " accuracy is now " + accuracy ) ; this . accuracy = accuracy ; } } 
public class HikariDataSource extends HikariConfig implements DataSource     { public int hashCode ( )   { {   return ( password == null ? 0 : password . hashCode ( ) ) ;   }       } }  
public abstract class BaseDataReader {   public void stop ( ) {   isStopped = true ;   resumeReading ( ) ;   }   public void waitFor ( ) throws InterruptedException {     } }  
public class FloatTextureData implements TextureData {   public boolean isManaged ( ) {   return true ;   }     public FloatBuffer getBuffer ( ) {   return buffer ;   }   }      
public class TwoWayView extends AdapterView < ListAdapter > { public void test ( ) { {   }   lp . id = mAdapter . getItemId ( position ) ;   child . setLayoutParams ( lp ) ;   }     }  
package zmq ;   public class YQueue < T >   {     private static class Chunk < T >   {   final T [ ] values ;   final int [ ] pos ;     } }  
public final class RingBuffer < T > extends Sequencer   { public void test ( ) {   this ( eventFactory , size ,   ClaimStrategy . Option . MULTI_THREADED ,   WaitStrategy . Option . BLOCKING ) ;   }       }  
public class TtsService extends Service implements OnCompletionListener { public void test ( ) { { {   if ( synthAvailable ) {   synthesizerLock . unlock ( ) ;   }   processSpeechQueue ( ) ;   }   }   }     }  
import javax . swing . * ;       public class UnassignedVariableAccessInspection extends GroovyLocalInspectionBase {   public boolean myIgnoreBooleanExpressions = true ;         }  
public class Helper   { public static final double round2 ( double value )   { { {   return Math . round ( value * 100 ) / 100d ;   }   }     } }  
public class NumpyUfuncs { public void test ( ) { {   UFUNC_LIST . add ( " ceil " ) ;   UFUNC_LIST . add ( " trunc " ) ;   UFUNC_LIST . add ( " fabs " ) ;   }   }     }  
public class ZContext implements Closeable     { public ZContext ( int ioThreads_ ) {   sockets = new CopyOnWriteArrayList < Socket > ( ) ;   ioThreads = ioThreads_ ;   linger = 0 ;     } }  
public class NinePatch {   public float getTotalHeight ( ) {   return topHeight + middleHeight + bottomHeight ;   }   }      
public abstract class TwoWayLayoutManager extends LayoutManager {     public int getFirstVisiblePosition ( ) {   if ( getChildCount ( ) == 0 ) {   return RecyclerView . NO_POSITION ;   }     return mFirstPosition ;   }     }  
public class UserGroupLocalServiceImpl extends UserGroupLocalServiceBaseImpl {     public UserGroup fetchUserGroup ( long companyId , String name )   throws SystemException {   return userGroupPersistence . fetchByC_N ( companyId , name ) ;   }     }  
import android . webkit . WebView ;       class WebElementCreator {   private ArrayList < WebElement > webElements ;   private Sleeper sleeper ;     } 
public class PortletDisplay implements Serializable {     public void setTitle ( String title ) {   _title = title ;       } }  
public class SSLHostConfigCertificate {   public Type getType ( ) {   return type ;   }   }     
public class BlockDoesNotExistException extends AlluxioException {             public BlockDoesNotExistException ( String message ) {     } }  
public class AIRobotLookForStation extends AIRobot { public void test ( ) {   return ;   }   double potentialStationDistance = Float . MAX_VALUE ;   DockingStation potentialStation = null ;     }  
public class VoldemortIOUtilsTest {     public void testCloseQuietlyNullHttpResponse ( ) {   VoldemortIOUtils . closeQuietly ( ( HttpResponse ) null ) ;   }       }  
public class CommitLog implements CommitLogMBean     { public void resetUnsafe ( )   { {   sync ( true ) ;   allocator . resetUnsafe ( ) ;   }     } }  
public class ContentExchange extends CachedExchange   {   int _contentLength = 1024 ;   String _encoding = " utf - 8 " ;   protected ByteArrayOutputStream _responseContent ;   File _fileForUpload ;     }  
final class SocketReceiveBufferPool { public void test ( ) { {   }   ByteBuffer buf = ByteBuffer . allocateDirect ( normalizeCapacity ( size ) ) ;   return buf ;   }     }  
public class TextureView extends View {   public void setOpaque ( boolean opaque ) {   if ( opaque != mOpaque ) {   mOpaque = opaque ;   if ( mLayer != null ) {   updateLayer ( ) ;   }   }   }     }  
public class ApplicationMode {     public static List < ApplicationMode > allPossibleValues ( OsmandSettings settings ) {   return new ArrayList < ApplicationMode > ( values ) ;   }     }  
public class JournalShutdownIntegrationTest {   private ExecutorService mExecutorsForClient ;     public static SystemPropertyRule sDisableHdfsCacheRule =   new SystemPropertyRule ( " fs . hdfs . impl . disable . cache " , " true " ) ;       }  
import org . opensolaris . opengrok . web . Util ;   public class TarAnalyzer extends FileAnalyzer {   private StringBuilder content ;   private static final Reader dummy = new StringReader ( " " ) ;     }  
public class Editor { public void test ( ) {   if ( mPositionListener != null ) {   mPositionListener . onScrollChanged ( ) ;   }   if ( mSelectionActionMode != null ) {   mSelectionActionMode . invalidateContentRect ( ) ;   }   }       }  
public class BooksIntegrationTest {     public static void tearDown ( ) {   Spark . stop ( ) ;   }     }  
public class ConsistencyCheck { public void test ( ) { { {   }   }   }     }  
package com . mongodb ;               public class MongoServerSelectionException extends MongoClientException {   private static final long serialVersionUID = - 1497309903649297430L ;     }  
public class User implements Cacheable {     public String getEmail ( ) {   return email == null ? " " : email ;   }   public void setEmail ( String email ) {     } }  
public class Tool {     public File inputDirectory ;   public String outputDirectory ;   public String libDirectory ;   public boolean generate_ATN_dot = false ;     }  
public class CommonUtils { public void test ( ) {   ByteBuffer ret = ByteBuffer . allocate ( buf . limit ( ) - buf . position ( ) ) ;   ret . put ( buf ) ;   ret . flip ( ) ;   buf . flip ( ) ;   return ret ;   }     }  
public class EventDispatcher extends VirtualFileAdapter implements VirtualFileMa     { public void updatingDone ( ) {   if ( myRefreshDepth == 0 ) {       } } }  
public class LocalSession {               public void setCUIVersion ( int cuiVersion ) {   this . cuiVersion = cuiVersion ;     } }  
public class ConversationPrefsHelper {     public SharedPreferences getConversationPrefs ( ) { {   return mConversationPrefs ;   }   }     }  
public class MainService extends Service {     public void onCreate ( ) {   super . onCreate ( ) ;   Crashlytics . start ( this ) ;     } }  
public final class Internal {       public static boolean inMilliseconds ( final byte [ ] qualifier ,   final int offset ) {   return inMilliseconds ( qualifier [ offset ] ) ;   }     } 
class WifiController extends StateMachine { public void test ( ) {   registerForStayAwakeModeChange ( handler ) ;   readWifiIdleTime ( ) ;   registerForWifiIdleTimeChange ( handler ) ;   readWifiSleepPolicy ( ) ;   registerForWifiSleepPolicyChange ( handler ) ;   }     }  
public class HttpUtils {     public void configHttpGetCacheDefaultExpiry ( long defaultExpiry ) {   HttpGetCache . setDefaultExpiryTime ( defaultExpiry ) ;   currRequestExpiry = HttpGetCache . getDefaultExpiryTime ( ) ;   }   public void configCurrRequestExpiry ( long currRequestExpiry ) {     } }  
package com . notnoop . apns ;         public final class APNS {   private APNS ( ) { throw new AssertionError ( " Uninstantiable class " ) ; }     }   
public class RenderPipe extends TileEntitySpecialRenderer {   final static private int renderDistanceSq = 24 * 24 ;   final static private int numItemsToRender = 5 ;   private final static EntityItem dummyEntityItem = new EntityItem ( null ) ;     }  
class IonDrawable extends Drawable {   private WeakReference < IonDrawable > ionDrawableRef ;   private WeakReference < ImageView > imageViewRef ;   private String bitmapKey ;   private SimpleFuture < ImageView > imageViewFuture = new SimpleFuture < ImageView > ( ) ;   private Animation inAnimation ;   private int inAnimationResource ;     }  
package rajawali . animation ;   import java . util . Stack ;   import rajawali . math . Vector3 ;   public class BezierPath3D implements ISpline {     }  
import php . runtime . ext . support . compile . ConstantsContainer ;   public class InfoConstants extends ConstantsContainer {   public static String PATH_SEPARATOR = Constants . PATH_SEPARATOR ;   public static String DIRECTORY_SEPARATOR = Constants . DIRECTORY_SEPARATOR ;   }      
public final class KeyDispatcher implements Flow . Dispatcher {   public static final class Builder {   private final Activity activity ;   private final KeyChanger keyChanger ;   private Builder ( Activity activity , KeyChanger keyChanger ) {   this . activity = activity ;     } } }  
public class VariableInspector extends JDialog { public void test ( ) {   thisFields = new ArrayList < VariableNode > ( ) ;   declaredThisFields = new ArrayList < VariableNode > ( ) ;   scrollPane . setBorder ( BorderFactory . createEmptyBorder ( 0 , 0 , 0 , 0 ) ) ;   return scrollPane ;   }     }  
public class Base { public void test ( ) {   getSketchbookToolsFolder ( ) . mkdirs ( ) ;   getSketchbookModesFolder ( ) . mkdirs ( ) ;   getSketchbookExamplesFolder ( ) . mkdirs ( ) ;   getSketchbookTemplatesFolder ( ) . mkdirs ( ) ;   }     }  
public class ConstantIntroduceHandler extends IntroduceHandler {     protected String getHelpId ( ) {   return " python . reference . introduceConstant " ;   }   }      
public class WebView extends AbsoluteLayout       { public Picture capturePicture ( ) {   if ( mNativeClass == 0 ) return null ;   Picture result = new Picture ( ) ;   nativeCopyBaseContentToPicture ( result ) ;   return result ;     } }  
  package dagger . internal ;   import dagger . internal . Binding . InvalidBindingException ;   import java . util . ArrayList ;   import java . util . Collections ;      
package com . iluwatar ;   public class Item { public void test ( ) {   String name ;   int level ;   }     }  
public class EmbeddedElasticSearchClient { public void test ( ) { {     deleteIndex ( indexName ) ;   server . getMongoBridge ( ) . removeIndexDateRange ( indexName ) ;   }   }     }  
public class Image extends Widget {   public void setAlign ( int align ) {   this . align = align ;   invalidate ( ) ;   }   public float getMinWidth ( ) {     } }  
public class LabelAdjust extends AbstractLayout implements Layout {     public void initAlgo ( ) {   setConverged ( false ) ;   }   public void goAlgo ( ) {     } }  
public class WXRequest {         public static final int DEFAULT_TIMEOUT_MS = 3000 ;   }      
public class WSDecoder { public void test ( ) {   if ( finalFlag ) {   if ( fragmentedOpCode > 0 )   opcode = fragmentedOpCode ;   fragmentedOpCode = - 1 ;   switch ( opcode ) {   case OPCODE_TEXT :   return new Frame . TextFrame ( content ) ;     } } } }  
public class Activity extends ContextThemeWrapper     { public boolean onMenuOpened ( int featureId , Menu menu ) {   if ( featureId == Window . FEATURE_ACTION_BAR ) {   initActionBar ( ) ;   if ( mActionBar != null ) {   mActionBar . dispatchMenuVisibilityChanged ( true ) ;   } else {     } } } }  
public class MBCategoryLocalServiceImpl extends MBCategoryLocalServiceBaseImpl { public void test ( ) { {   curCategory . setDisplayStyle ( displayStyle ) ;   mbCategoryPersistence . update ( curCategory ) ;   }   }     }  
public class ActivityStack { public void test ( ) { {   }   if ( w > 0 ) {     }   return null ;   }     }  
public class Configuration             { public void setAllowPackage ( boolean aAllowPackage )   {     } }  
public abstract class GroovyPage extends Script {     public String getPluginContextPath ( ) {   return pluginContextPath != null ? pluginContextPath : BLANK_STRING ;   }   public void cleanup ( ) {     } }  
package jackpal . androidterm ;   import android . content . Context ;   import android . util . DisplayMetrics ;   import jackpal . androidterm . emulatorview . ColorScheme ;   import jackpal . androidterm . emulatorview . EmulatorView ;      
public class HttpRequest {       public String getParas ( ) {   return HttpUtils . joinParasWithEncodedValue ( parasMap ) ;   }       }  
public class HTML5VideoFullScreen extends HTML5VideoView     { public void showControllerInFullScreen ( ) { {   if ( mMediaController != null ) {   mMediaController . show ( 0 ) ;   }   }       } }  
public final class StripedExecutor implements Executor { public void test ( ) {   for ( Worker worker : workers ) {   worker . workQueue . clear ( ) ;   worker . interrupt ( ) ;   }   }     }  
final class ActivityStack { public void test ( ) {   mWindowManager . moveTaskToTop ( tr . taskId ) ;   mLastPausedActivity = null ;   mStackSupervisor . resumeTopActivitiesLocked ( ) ;   EventLog . writeEvent ( EventLogTags . AM_TASK_TO_FRONT , tr . userId , tr . taskId ) ;     } }  
public class NativeMemoryChunk implements Closeable {   private static final String TAG = " NativeMemoryChunk " ;   static {   SoLoaderShim . loadLibrary ( " memchunk " ) ;   }     }  
public class JBTabbedPane extends JTabbedPane implements HierarchyListener { public void test ( ) {   UIUtil . setNotOpaqueRecursively ( component ) ;   setInsets ( component ) ;   revalidate ( ) ;   repaint ( ) ;   }     }  
public class BinaryRoutePlanner { public void test ( ) { {   ctx . finalReverseEndSegment = next . segmentStart ;   ctx . finalReverseRoute = opposite ;   }   return true ;   }     boolean alreadyVisited = visitedSegments . contains ( nts ) ;     }  
package com . iluwatar . delegation . simple ;   import org . junit . Test ;   public class AppTest { public void test ( ) {     } }  
public abstract class AbstractContextSelectToolbarStatusPanel extends AbstractPa   { public void contextsChanged ( ) { {   log . debug ( " Contexts changed . . . " ) ;   contextSelectBox . reloadContexts ( false ) ;   contextSelectBox . setSelectedIndex ( - 1 ) ;   }       } }  
public class DRFTest extends TestUtil { public void test ( ) {   parms . _max_depth = 2 ;   parms . _nfolds = 2 ;   parms . _ntrees = 3 ;   parms . _seed = 11233 ;   DRF job = new DRF ( parms ) ;     } }  
public class MasterClient extends CommunicationProtocol implements Master , Chann   { public void test ( ) { {   msgLog . logMessage ( " MasterClient shutdown " , true ) ;   channelPool . close ( true ) ;   executor . shutdownNow ( ) ;   }   }     }  
public final class ActivityThread {     private void handleBindApplication ( AppBindData data ) {     VMRuntime . registerSensitiveThread ( ) ;   if ( data . trackAllocation ) {   DdmVmInternal . enableRecentAllocations ( true ) ;   }     } }  
public class PostsActivity extends WPActionBarActivity implements OnPostSelected   { public void onClick ( DialogInterface dialog ,   int whichButton ) { {   post . delete ( ) ;   popPostDetail ( ) ;   attemptToSelectPost ( ) ;   postList . loadPosts ( false ) ;   }     } }  
public class App extends Application {   public void onCreate ( ) { {   super . onCreate ( ) ;   PluginManager . init ( this ) ;   }   }     }  
public class StringOutputStream extends OutputStream {   StringBuilder mBuf ;     public void write ( int data ) throws IOException {   mBuf . append ( ( char ) data ) ;   }     }  
public final class Request { public void test ( ) {   parameters . setQuery ( queryMB ) ;   parameters . setURLDecoder ( urlDecoder ) ;   }     }  
final class CompilerExecutor { public void test ( ) {   return result ;   }   } 
public class BasicBSONList extends ArrayList < Object > implements BSONObject {           public boolean containsKey ( String key ) {   return containsField ( key ) ;   }     }  
public abstract class AbstractOutputBuffer < S > implements OutputBuffer {         protected OutputBuffer outputStreamOutputBuffer ;         }  
public class TerminalView { public void test ( ) {   if ( myDockContainer == null ) {   myDockContainer = new TerminalDockContainer ( toolWindow ) ;   Disposer . register ( myProject , myDockContainer ) ;   DockManager . getInstance ( myProject ) . register ( myDockContainer ) ;   }   }     }  
package Question9_1 ;   public class Question {   public static int countWaysDP ( int n , int [ ] map ) {     } }  
public class MultipleParentClassLoader extends ClassLoader { public void test ( ) { {   classLoaders . add ( type . getClassLoader ( ) ) ;   }   return append ( classLoaders ) ;   }       }  
package ninja ;   import java . lang . reflect . InvocationTargetException ;   import java . lang . reflect . Method ;   import java . util . ArrayList ;      
public class PhotosBaseAdapter extends BaseAdapter { public void test ( ) {   PhotoItemLayout layout = ( PhotoItemLayout ) view ;   layout . getImageView ( ) . requestThumbnail ( getItem ( position ) , true ) ;   return view ;   }     }  
public class Systrace {   public static final long TRACE_TAG_REACT_JAVA_BRIDGE = 0L ;   public static final long TRACE_TAG_REACT_FRESCO = 0L ;   public static final long TRACE_TAG_REACT_APPS = 0L ;   public enum EventScope {   THREAD ( ' t ' ) ,     } }  
public class CameraView extends ViewGroup implements AutoFocusCallback { public void test ( ) { {   previewDestroyed ( ) ;   removeView ( previewStrategy . getWidget ( ) ) ;   }     lastPictureOrientation = - 1 ;   }       }  
public class DownloadActivity extends SherlockFragmentActivity { public void test ( ) { {   }   getSupportActionBar ( ) . setHomeButtonEnabled ( true ) ;   getSupportActionBar ( ) . setDisplayHomeAsUpEnabled ( true ) ;   }       }  
final class PooledUnsafeDirectByteBuf extends PooledByteBuf < ByteBuffer > {     protected ByteBuffer newInternalNioBuffer ( ByteBuffer memory ) {   return memory ;   }       }  
public abstract class Pair < T1 , T2 >     { public T1 first ( )   { {   return first ;   }       } }  
public final class ClusterService implements Runnable , Constants {   private long lastCheck = 0 ;   private volatile boolean running = true ;   private final ThreadWatcher threadWatcher = new ThreadWatcher ( ) ;     }  
public class JUnit3RunnerWithInners extends Runner implements Filterable , Sortab     { public void filter ( Filter filter ) throws NoTestsRemainException { {   delegateRunner = new JUnit38ClassRunner ( klass ) ;   delegateRunner . filter ( filter ) ;   }     } }  
public class ScopeConfigurable extends NamedConfigurable < NamedScope > {       public String getHelpTopic ( ) {   return " project . scopes " ;   }   public JComponent createOptionsPanel ( ) {     } }  
public class Http11InputBuffer implements InputBuffer {         private class SocketInputBuffer implements InputBuffer {         } } 
package rx . exceptions ;   import static org . junit . Assert . assertEquals ;   import java . io . ByteArrayOutputStream ;   import java . io . PrintStream ;      
public class SelectTemplateStep extends ModuleWizardStep {     public void updateDataModel ( ) {   myContext . setProjectBuilder ( myModuleBuilder ) ;   if ( mySettingsStep != null ) {   mySettingsStep . updateDataModel ( ) ;   }     } }  
public abstract class FragmentHostCallback < E > extends FragmentContainer { public void test ( ) {   }   void onAttachFragment ( Fragment fragment ) {   }   void doLoaderStart ( ) {     } }  
public class MotionGroup extends AbstractActionGroup   { public void test ( ) {   int line = EditorHelper . normalizeVisualLine ( editor , EditorHelper . getCurrentVisualLine ( editor ) + cntForward ) ;   if ( line < 0 )   {   return 0 ;   }     } }  
package org . opensolaris . opengrok . history ;   import java . io . BufferedReader ;   import java . io . StringReader ;   import org . junit . After ;   import org . junit . AfterClass ;      
import serializers . JavaBuiltIn ;   import serializers . Serializer ;   import serializers . TestGroups ;   import data . media . MediaContent ;   import com . alibaba . fastjson . JSON ;      
import io . undertow . util . HttpString ;               public class SetHeaderHandler implements HttpHandler { public void test ( ) {     } }  
public class CursorWindow extends SQLiteClosable { public void test ( ) {   if ( mWindowPtr != null ) {     nativeDispose ( mWindowPtr ) ;   mWindowPtr = null ;   }   }     }  
public class Peer {       public VersionMessage getVersionMessage ( ) {   return conn . getVersionMessage ( ) ;   }       }  
public class DebugFlags {   public static final boolean COOKIE_SYNC_MANAGER = false ;   public static final boolean TRACE_API = false ;   public static final boolean TRACE_CALLBACK = false ;   public static final boolean URL_UTIL = false ;   public static final boolean WEB_SYNC_MANAGER = false ;     }  
public final class Response {                 public String getContentLanguage ( ) {     } }  
public class DrawerLayout extends ViewGroup { public void test ( ) { {   if ( mListener != null ) {   mListener . onDrawerClosed ( drawerView ) ;   }   getRootView ( ) . sendAccessibilityEvent ( AccessibilityEvent . TYPE_WINDOW_STATE_CHANGED ) ;   }   }     }  
public final class Resources {     public String toString ( ) { return " Resources . asByteSource ( " + url + " ) ";   }   } 
public class ThreadRenamingRunnable implements Runnable { public void test ( ) {   try {   currentThread . setName ( threadName ) ;   renamed = true ;   } catch ( SecurityException e ) {     }     } }  
public class ConversationFragment extends Fragment {     public void success ( Contact contact ) {   chatMsg . setText ( " " ) ;   activity . encryptTextMessage ( message ) ;   }     }  
public class Http11AprProcessor implements ActionHook { public void test ( ) {     error = false ;   comet = false ;   keepAlive = true ;   int keepAliveLeft = maxKeepAliveRequests ;     } }  
public class DownloadStatus {   public DownloadStatus ( FeedFile feedfile , String title ) {   this . feedfile = feedfile ;   if ( feedfile != null ) {   feedfileType = feedfile . getTypeAsInt ( ) ;   }   this . title = title ;   }     }  
import buildcraft . BuildCraftBuilders ;   import buildcraft . core . ItemBuildCraft ;   import buildcraft . core . blueprints . BptBase ;   import net . minecraft . src . CreativeTabs ;   import net . minecraft . src . Entity ;   import net . minecraft . src . ItemStack ;   import net . minecraft . src . World ;      
public class SecureNio2Channel extends Nio2Channel {   public void reset ( AsynchronousSocketChannel channel , SocketWrapperBase < Nio2Channel > socket )   throws IOException {   super . reset ( channel , socket ) ;   sslEngine = null ;   sniComplete = false ;   handshakeComplete = false ;   closed = false ;     } }  
import org . gradle . platform . base . TransformationFileType ;           public class JvmResources implements TransformationFileType { public void test ( ) {   }     }  
public class DirectRequestDispatcherUtil { public void test ( ) {   if ( pos != - 1 ) {   queryString = fullPath . substring ( pos + 1 ) ;     fullPath = fullPath . substring ( 0 , pos ) ;   }     } }  
public class SchematicToBuild {   public Schematic getSchematic ( ) {   if ( schematic == null ) {   return new SchematicMask ( false ) ;   } else {   return schematic ;   }   }     }  
public final class Constants {         public static final boolean ASTRID_LITE = false ;         }  
package spark . embeddedserver ;     public class NotSupportedException extends RuntimeException {   private static final long serialVersionUID = 1L ;             }  
import com . hazelcast . nio . Address ;           class Router {   private final LoadBalancer loadBalancer ;     }  
public class UndertowConnector implements Connector {     public boolean isReverse ( ) {   return false ;   }       }  
public class CxxBuckConfig {   public CxxCompilationDatabaseFormat getCompilationDatabaseFormat ( ) { {   return delegate   . getEnum ( cxxSection , " compilation_database_format " , CxxCompilationDatabaseFormat . class )   . or ( CxxCompilationDatabaseFormat . CLANG ) ;   }   }     }  
public class OutputChannel extends Channel { public void test ( ) {     if ( buffer . size ( ) == 0 ) {   buffer . recycleBuffer ( ) ;   return ;   }     } }  
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParen           { public Behavior getBehavior ( ) { {   return mBehavior ;   }     } }  
public class ClipboardManager extends android . text . ClipboardManager {     public boolean hasText ( ) {   try {   return getService ( ) . hasClipboardText ( ) ;   } catch ( RemoteException e ) {   return false ;   }     } }  
public class RedissonLockEntry {   public RedissonLockEntry ( Promise < Boolean > promise ) {   super ( ) ;   this . latch = new Semaphore ( 0 ) ;   this . promise = promise ;   }     }  
import org . junit . Test ;   import cucumber . runtime . RuntimeOptions ;       public class RuntimeOptionsFactoryTest   { public void test ( ) {       } }  
public class FlowManager {     public static synchronized void destroy ( ) {   context = null ;   mDatabaseHolder = null ;   }       }  
public class AccessCanBeTightenedInspection extends BaseJavaBatchLocalInspection       { public String getGroupDisplayName ( ) { {   return GroupNames . VISIBILITY_GROUP_NAME ;   }       } }  
public final class Settings {     public static final String [ ] CLONE_TO_MANAGED_PROFILE = {   DATE_FORMAT ,   HAPTIC_FEEDBACK_ENABLED ,   SOUND_EFFECTS_ENABLED ,   TEXT_SHOW_PASSWORD ,   TIME_12_24   } ;     }  
public class CodeFormatterFacade implements Constants {     private boolean useNewFormatter ( FileType fileType ) {   return fileType instanceof LanguageFileType ;   }   private ASTNode processRange ( ASTNode element , int [ ] bounds ) {     } }  
public class MetaDataMappingService extends AbstractComponent {     public void onAckTimeout ( ) {   listener . onResponse ( new ClusterStateUpdateResponse ( false ) ) ;   }       }  
final class ActivityStack { public void test ( ) {   mWindowManager . moveTaskToTop ( tr . taskId ) ;   mLastPausedActivity = null ;   mStackSupervisor . resumeTopActivitiesLocked ( ) ;   EventLog . writeEvent ( EventLogTags . AM_TASK_TO_FRONT , tr . userId , tr . taskId ) ;     } }  
public class BroadcastFilterTest {     }   public final static class Filter implements BroadcastFilter {   final String msg ;     } 
public class BinaryMapIndexReader {   ;   private final RandomAccessFile raf ;   protected final File file ;       }  
public class Tmp { public interface Exchange {   String GROUPED_EXCHANGE = " CamelGroupedExchange " ;   String HTTP_BASE_URI = " CamelHttpBaseUri " ;   String HTTP_CHARACTER_ENCODING = " CamelHttpCharacterEncoding " ;   String HTTP_METHOD = " CamelHttpMethod " ;   String HTTP_PATH = " CamelHttpPath " ;     } }  
public class ActionBarView extends AbsActionBarView {     public void setLogo ( int resId ) {   setLogo ( mContext . getResources ( ) . getDrawable ( resId ) ) ;   }       }  
public class AccessibilityNodeInfo implements Parcelable { public void test ( ) {   }                 }  
public class BlockInStream extends InStream {   private InputStream mCheckpointInputStream = null ;   private long mCheckpointReadByte ;   private BlockOutStream mBlockOutStream = null ;     private boolean mClosed = false ;   BlockInStream ( TachyonFile file , ReadType readType , int blockIndex ) throws IOException {     } }  
public class addAccount extends Activity { public void test ( ) {   boolean success = false ;   if ( blogName == " " ) {   blogNames [ blogCtr ] = " ( No Blog Title ) " ;   }   boolean wpcomFlag = false ;     } }  
public class FileTypeIndex extends ScalarIndexExtension < FileType >     { public boolean dependsOnFileContent ( ) { {   return false ;   }       } }  
import java . util . Arrays ;   import java . util . List ;   import javax . security . auth . login . LoginContext ;   import org . apache . catalina . Realm ;      
public class EntityMechanicalArm extends Entity implements IEntityAdditionalSpaw   { public EntityMechanicalArm ( World world ) {   super ( world ) ;   makeParts ( world ) ;     dataWatcher . addObject ( 2 , 1 ) ;     } }  
public class PyExtractSuperclassDialog extends UpDirectedMembersMovingDialog {     protected String getHelpId ( ) {   return " python . reference . extractSuperclass " ;   }       }  
public class Authentication extends Model {   private boolean valid ; public boolean isValid ( ) {   return valid ;   }       } 
public abstract class PGL {       public void requestFBOLayer ( ) {   enableFBOLayer ( ) ;   }       public void enableFBOLayer ( ) {   fboLayerEnabledReq = true ;   }     }  
public class Http11NioProtocol extends AbstractHttp11JsseProtocol < NioChannel > {     public int getPollerThreadPriority ( ) {   return ( ( NioEndpoint ) getEndpoint ( ) ) . getPollerThreadPriority ( ) ;   }     }  
public class DeltaRequest implements Externalizable { public void test ( ) {   }               }  
public class HighlightableComponent extends JComponent { public void test ( ) {     UIUtil . applyRenderingHints ( g ) ;   FontMetrics defFontMetrics = getFontMetrics ( getFont ( ) ) ;   if ( myText == null ) {     } } }  
public class HitTest { public void test ( ) {   o1 . setFilename ( " bar " ) ;   assertFalse ( o2 . equals ( o1 ) ) ;   assertFalse ( o1 . equals ( o2 ) ) ;   assertFalse ( o1 . equals ( new Object ( ) ) ) ;   }       }  
public class HomeActivity extends Activity {       public void onResume ( ) {   super . onResume ( ) ;     } }  
import cpw . mods . fml . common . registry . LanguageRegistry ;   public class ModLoader   {   public static final String fmlMarker = " This is an FML marker " ;           }  
import java . io . File ;   public class GroovycTask   extends CompileTaskSupport   {   protected boolean force ;   public void setForce ( final boolean flag ) {   this . force = flag ;     } }  
public class ImageWallpaper extends WallpaperService {   private static final boolean DEBUG = false ;   static final boolean FIXED_SIZED_SURFACE = true ;   static final boolean USE_OPENGL = true ;   WallpaperManager mWallpaperManager ;     }  
public class View implements Drawable . Callback2 , KeyEvent . Callback , Accessibilit       { public void setBackgroundDrawable ( Drawable d ) {   if ( d == mBGDrawable ) {   return ;   }     boolean requestLayout = false ;   mBackgroundResource = 0 ;     } }  
public class FileListListAdapter extends BaseAdapter implements ListAdapter { public void test ( ) { { {   }   }   break ;   }     }  
public class MenuDrawer extends ViewGroup { public void test ( ) { {   Bundle state = ( Bundle ) in ;   final boolean menuOpen = state . getBoolean ( STATE_MENU_VISIBLE ) ;   setContentLeft ( menuOpen ? mMenuWidth : 0 ) ;   mDrawerState = menuOpen ? STATE_OPEN : STATE_CLOSED ;   }   }     }  
public class HistoryEntry { public void test ( ) {   if ( date != null ) {   this . date = ( Date ) date . clone ( ) ;   } else {   this . date = null ;   }   }     }  
public class DataFlowRunner { public void test ( ) { {   for ( DfaVariableValue value : vars ) {   copy . flushDependencies ( value ) ;   }   copy . emptyStack ( ) ;   return copy ;   }   }     }  
import android . graphics . Bitmap ;     public class WebHistoryItem implements Cloneable {         public WebHistoryItem ( ) {   }       }  
public class TextIconGenerator { public void test ( ) {   switch ( style ) {   case STYLE_DEFAULT :   case STYLE_WHITE :   return R . style . Bubble_TextAppearance_Dark ;   case STYLE_RED :   case STYLE_BLUE :   case STYLE_GREEN :     } } }  
public class AstCache {   public void close ( ) {   parser . close ( ) ;     }     }  
public class ApplicationServletRegistration     { public String getClassName ( ) {   return wrapper . getServletClass ( ) ;   }   public String getInitParameter ( String name ) {     }   }
public class PortletKeys {   public static final String DOCUMENT_LIBRARY_DISPLAY = " 110 " ;   public static final String DOCUMENT_SELECTOR =   " com_liferay_document_selector_web_portlet_DocumentSelectorPortlet " ;   public static final String DYNAMIC_DATA_LIST_DISPLAY = " 169 " ;     }  
public class NodePencil implements Tool {   public NodePencil ( ) {     color = Color . BLACK ;   size = 10f ;   }   public void select ( ) {     } }  
public class BatteryProperty implements Parcelable {   public static final int BATTERY_PROP_CHARGE_COUNTER = 1 ;   public static final int BATTERY_PROP_CURRENT_NOW = 2 ;   public static final int BATTERY_PROP_CURRENT_AVG = 3 ;   public static final int BATTERY_PROP_CAPACITY = 4 ;   public int valueInt ;     }  
public interface CommonClassNames { public void test ( ) {   String CLASS_FILE_EXTENSION = " . class " ;   String JAVA_LANG_STRING_SHORT = " String " ;     String JAVA_UTIL_CONCURRENT_FUTURE = " java . util . concurrent . Future " ;   }     }  
  package zmq ;   import java . util . Iterator ;   import java . util . Map ;   import java . util . Map . Entry ;      
public class DataStructures {   private static Integer [ ] unsorted = null ;   private static String string = null ;   private static boolean debug = false ;   private static boolean debugTime = false ;   public static void main ( String [ ] args ) {     } }  
public class TestsuiteSanityTestCase { public void test ( ) {   }       }  
public class ContextConfig implements LifecycleListener {     private String getJaspicAppContext ( ) {     return context . getServletContext ( ) . getVirtualServerName ( ) + " " + context . getPath ( ) ;   }     }  
public class MenuDrawer extends ViewGroup {public void test ( ) { { break ; Log . d ( TAG , " [ DrawerState ] Unknown : " + state ) ; } } } 
public class Tmp { public enum Material {   NETHER_BRICK ( 112 ) ,   NETHER_FENCE ( 113 ) ,   NETHER_BRICK_STAIRS ( 114 ) ,   NETHER_WARTS ( 115 ) ,   ENCHANTMENT_TABLE ( 116 ) ,   BREWING_STAND ( 117 ) ,   CAULDRON ( 118 ) ,     } }  
public class DrawableContainer extends Drawable implements Drawable . Callback {   private long mExitAnimationEnd ;   private Drawable mLastDrawable ;   private Insets mInsets = Insets . NONE ;       }  
import java . lang . reflect . Field ;     public abstract class AbstractViewModel {   public void unsubscribe ( ) { {   SubscriptionAnnotationUtils . unsubscribeAllAnnotated ( this ) ;   }   }     }  
public class EditPostActivity extends Activity {   private static int PAGE_SETTINGS = 1 ;   private static int PAGE_PREVIEW = 2 ;   private static final int AUTOSAVE_INTERVAL_MILLIS = 5000 ;   private Handler mAutoSaveHandler ;       }  
import java . util . regex . Pattern ;               public class DefaultGroovyMethods { public void test ( ) {     } }  
public abstract class BSONReader implements Closeable {  public enum State {           }     }   
public class AsmClassGenerator extends ClassGenerator {     public void visitTryCatchFinally ( TryCatchStatement statement ) {   visitStatement ( statement ) ;   MethodVisitor mv = controller . getMethodVisitor ( ) ;   CompileStack compileStack = controller . getCompileStack ( ) ;     } }  
class DatabaseHelper extends SQLiteOpenHelper {   private void executeSqlScript ( SQLiteDatabase db , String file ) {   Log . d ( Params . LOGGING_TAG , file ) ;   db . execSQL ( file ) ;   }   private static void createTable ( SQLiteDatabase db , Class < ? extends ActiveRecordBase < ? > > table ) {     } }  
import net . minecraft . src . ItemStack ;   public class LiquidManager {   public static final int BUCKET_VOLUME = 1000 ;   public static LinkedList < LiquidData > liquids = new LinkedList < LiquidData > ( ) ;   public static LiquidStack getLiquidForFilledItem ( ItemStack filledItem ) {     } }  
public class LambdaExpression { public void test ( ) {   if ( formalParamCount > argCount ) {   throw new ELException ( Util . message ( context ,   " lambdaExpression . tooFewArgs " ,   Integer . valueOf ( argCount ) ,   Integer . valueOf ( formalParamCount ) ) ) ;   }     } }  
public class ParserAnnotator implements Annotator {     public Set < Requirement > requires ( ) {   return parser . requiresTags ( ) ? TOKENIZE_SSPLIT_POS : TOKENIZE_AND_SSPLIT ;   }       }  
public class ExportImportImpl implements ExportImport { public void test ( ) {   portletDataContext . addReferenceElement (   entityStagedModel , entityElement , fileEntry ,   DLFileEntry . class ,   PortletDataContext . REFERENCE_TYPE_DEPENDENCY ,   ! exportReferencedContent ) ;     } }  
public class TestBatchInsert         { public void makeSureLoopsCanBeCreated ( )   {   BatchInserter graphDb = newBatchInserter ( ) ;     } }  
import tachyon . worker . WorkerContext ;     public final class LocalTachyonCluster extends AbstractLocalTachyonCluster {   private LocalTachyonMaster mMaster ;         }  
import android . app . FragmentManager ;   import android . content . Context ;   import android . support . v13 . app . FragmentPagerAdapter ;   public class SampleAdapter extends FragmentPagerAdapter {   Context ctxt = null ;     }  
public class ProtocolProviderServiceJabberImpl     { public SmackServiceNode getJingleNodesServiceNode ( )   { {   synchronized ( jingleNodesSyncRoot )   {   return jingleNodesServiceNode ;   }   }       } }  
package com . ning . billing . account ;   import com . ning . billing . KillbillTestSuite ;   public abstract class AccountTestSuite extends KillbillTestSuite {   }     
public class Auth     { public static void setup ( )   {   if ( DatabaseDescriptor . getAuthenticator ( ) instanceof AllowAllAuthenticator )   return ;     setupAuthKeyspace ( ) ;   setupUsersTable ( ) ;     } }  
public class NotificationCompat { public void test ( ) {   CharSequence mContentInfo ;   int mNumber ;   int mPriority ;   boolean mShowWhen = true ;   boolean mUseChronometer ;   Style mStyle ;   CharSequence mSubText ;     } }  
public abstract class MasterDetailsComponent implements Configurable , DetailsCom     { public JComponent createComponent ( ) {   myTree . updateUI ( ) ;   reInitWholePanelIfNeeded ( ) ;   updateSelectionFromTree ( ) ;     } }  
public final class Multimaps { public void test ( ) {     }     }  
class EmbeddedChannel extends AbstractChannel {       protected int doRead ( ChannelBufferHolder < Object > buf ) throws Exception {   return 0 ;   }     }  
import java . util . Random ;     public class ControlledRandom extends Random {   public ControlledRandom ( ) {   super ( 123 ) ;   }         }  
public class SingleInspectionProfilePanel extends JPanel {     protected void onScopeAdded ( ) {   myTreeTable . getTree ( ) . updateUI ( ) ;   updateOptionsAndDescriptionPanel ( ) ;   }   } ;      
public class MyListActivity extends ListActivity {   String [ ] bestFoods ;     ListAdapter adapter ;     protected void onCreate ( Bundle savedInstanceState ) {     } }  
public class ListScrollingUtil { public void test ( ) {   Rectangle cellBounds = list . getCellBounds ( top , bottom ) ;   if ( cellBounds != null ) {   cellBounds . x = 0 ;   list . scrollRectToVisible ( cellBounds ) ;   }   }     }  
public class GroupRole extends BaseIdentifiable {     public boolean isAnyone ( ) {   return groupId == null ;   }       }  
public class SubscriptionInfo implements Parcelable {   private CharSequence mDisplayName ;             private CharSequence mCarrierName ;     }  
public class TCKTest { public void test ( ) { {   Config conf = FluxMain . buildConfig ( topologyDef ) ;   StormTopology topology = FluxMain . buildTopology ( topologyDef ) ;   assertNotNull ( topology ) ;   topology . validate ( ) ;   }   }     }  
public class IconTag extends IncludeTag { public void test ( ) { {   id = PortalUtil . generateRandomKey ( request , IconTag . class . getName ( ) ) ;   }   id = HtmlUtil . getAUICompatibleId ( id ) ;     return id ;   }     }  
package org . json ;               public class JSONException extends RuntimeException { public void test ( ) {       } }  
public abstract class Constant {       public String toString ( ) {   return " [ " + tag + " ] " ;     } }  
public class SPTWalker { public void test ( ) {     if ( speed > avgSpeed )   speed = avgSpeed ;   }       }  
public class LayoutManager extends RecyclerView . LayoutManager { public void test ( ) {   isHeader = a . getBoolean (   R . styleable . superslim_LayoutManager_slm_isHeader ,   false ) ;     headerDisplay = a . getInt (   R . styleable . superslim_LayoutManager_slm_headerDisplay ,   DEFAULT_HEADER_DISPLAY ) ;     } }  
public class PhoneStatusBar extends BaseStatusBar {     public void createAndAddWindows ( ) {   addStatusBarWindow ( ) ;   }   private void addStatusBarWindow ( ) {     } }  
public class Main { public void test ( ) {   if ( options . has ( HELP ) ) {   parser . printHelpOn ( System . out ) ;   exitWithSuccess ( options ) ;   }   configureLogger ( options ) ;     } }  
public class FindMethodDuplicatesTest extends LightCodeInsightTestCase {     protected Sdk getProjectJDK ( ) {   return JavaSdkImpl . getMockJdk15 ( " java 1 . 5 " ) ;   }   private void doTest ( ) throws Exception {     } }  
class IInputMethodSessionWrapper extends IInputMethodSession . Stub     { public void executeMessage ( Message msg ) {   if ( mInputMethodSession == null ) return ;     switch ( msg . what ) {   case DO_FINISH_INPUT :   mInputMethodSession . finishInput ( ) ;     } } }  
public class BatteryProperty implements Parcelable {     public static final int BATTERY_PROP_CHARGE_COUNTER = 1 ;   public static final int BATTERY_PROP_CURRENT_NOW = 2 ;   public static final int BATTERY_PROP_CURRENT_AVG = 3 ;   public int valueInt ;     }  
public class TestTomcatClassLoader extends TomcatBaseTest {   private static final class ClassLoaderReport extends HttpServlet {   private static final long serialVersionUID = 1L ;   private transient ClassLoader custom ;   public ClassLoaderReport ( ClassLoader custom ) {   this . custom = custom ;     } } }  
package org . geometerplus . android . fbreader ;   import java . util . LinkedList ;   import android . app . SearchManager ;   import android . content . Content ;   import android . content . Intent ;   import android . net . Uri ;   import android . os . Bundle ;      
public class NetworkIdentity {     public int hashCode ( ) {   return Objects . hashCode ( mType , mSubType , mSubscriberId , mRoaming ) ;   }       }  
      public class PlaceHolder { }    
public class TestDistributeConfigSerialization extends AbstractServerClusterTest     { public void test ( ) throws Exception { {   init ( 1 ) ;   execute ( ) ;   }     } }  
import junit . framework . TestCase ;   import edu . stanford . nlp . parser . lexparser . LexicalizedParser ;   import edu . stanford . nlp . tagger . maxent . MaxentTagger ;          
public class FMLCommonHandler   { public boolean shouldServerBeKilledQuietly ( )   { {   if ( sidedDelegate == null )   {   return false ;   }   return sidedDelegate . shouldServerShouldBeKilledQuietly ( ) ;   }     } }  
public class ShadowTextView extends ShadowView {     public void setText ( int textResourceId ) {   this . text = getResources ( ) . getText ( textResourceId ) ;   }       }  
public class CallbackProxy extends Handler implements EventSender , LayoutTestCon     { public void clearAllDatabases ( ) {   WebStorage . getInstance ( ) . deleteAllData ( ) ;   }   public void setDatabaseQuota ( long quota ) {     } }  
import antlr . LexerSharedInputState ;             public class UnicodeLexerSharedInputState extends LexerSharedInputState {   private final UnicodeEscapingReader escapingReader ;     }  
public class SpringLoadedPositionManager implements PositionManager { public void test ( ) { { {   }   }   if ( element != null ) {   return getClassNameForJvm ( ( PsiClass ) element ) ;   }     return null ;   }     }  
public class DatePicker extends FrameLayout { public void test ( ) {   mYear = ss . getYear ( ) ;   mMonth = ss . getMonth ( ) ;   mDay = ss . getDay ( ) ;   updateSpinners ( ) ;   }       }  
public class Tmp { public enum BSONType {   MAX_KEY ( 0x7f ) ;   private static final BSONType [ ] LOOKUP_TABLE = new BSONType [ MIN_KEY . getValue ( ) + 1 ] ;   private final int value ;   static {     } } }  
import tachyon . conf . TachyonConf ;   public final class Version {   public static final String VERSION ;   private Version ( ) { }   static {   TachyonConf tachyonConf = new TachyonConf ( ) ;     } }  
public class Stage extends InputAdapter implements Disposable {   public void reset ( ) { { {   listenerActor = null ;   listener = null ;   target = null ;   }   }   }     }  
public class GenericExporter { public void test ( ) {   }                 }  
import tachyon . TachyonURI ;   import tachyon . conf . TachyonConf ;   import tachyon . thrift . InvalidPathException ;   import tachyon . underfs . UnderFileSystem ;     import sun . misc . Cleaner ;   import sun . nio . ch . DirectBuffer ;      
package org . graylog2 . messagehandlers . gelf ;   import java . net . DatagramPacket ;   import java . util . concurrent . ExecutorService ;   import java . util . concurrent . Executors ;      
import io . realm . RealmChangeListener ;   import io . realm . RealmList ;   public class ParameterizedTestExample extends AndroidTestCase {   private Realm realm ;     } 
public class ResourceBundleRenameUtil {     public boolean checkInput ( final String inputString ) {   return true ;   }       }  
public class ThemePreviewFragment extends Fragment { public void test ( ) {   mWebView . getSettings ( ) . setCacheMode ( WebSettings . LOAD_NO_CACHE ) ;   mWebView . getSettings ( ) . setSavePassword ( false ) ;   mWebView . getSettings ( ) . setJavaScriptEnabled ( true ) ;   loadAuthenticatedUrl ( previewURL ) ;     } }  
public class MediaPlayer               { public native boolean isPlaying ( ) ;     }  
public abstract class WsRemoteEndpointImplBase implements RemoteEndpoint {           private static class OutputBufferFlushSendHandler implements SendHandler {     } }  
package tachyon . master . next . filesystem ;   import java . io . IOException ;   import java . util . ArrayList ;   import java . util . Collections ;      
public class PApplet extends Activity implements PConstants , Runnable {   public void onDestroy ( ) {   System . out . println ( " PApplet . onDestroy ( ) called " ) ;   super . onDestroy ( ) ;   finish ( ) ;   }     }  
public class XmppConnectionService extends Service {     public void deleteAccount ( Account account ) {   if ( account . getXmppConnection ( ) != null ) {   this . disconnect ( account , true ) ;   }     } }  
public class MapConfig implements DataSerializable {   private StorageType storageType = null ;   private boolean statisticsEnabled = true ;   public enum InMemoryFormat {   BINARY , OBJECT , CACHED     } }  
public class RedissonConcurrentMapTest extends BaseConcurrentTest { public void test ( ) { {   }   assertMapSize ( 5 , name ) ;   }       }  
public class PSurfaceNEWT implements PSurface { public void test ( ) { {   System . err . println ( " 3 . set size " ) ;   sketchWidth = sketch . width = width ;   sketchHeight = sketch . height = height ;   graphics . setSize ( width , height ) ;   }   }     }  
public class MockFactory < T > { public void test ( ) {         enhancer . setClassLoader ( MockFactory . class . getClassLoader ( ) ) ;   return enhancer ;     } }  
public class StreamStateMachine {   public synchronized void closeIfIdle ( ) {   stateChange ( State . IDLE , State . CLOSED_FINAL ) ;   }     }  
public class VideoEditorImpl implements VideoEditor { public void test ( ) {     int height = 480 ;   int width = 854 ;   switch ( mI . getAspectRatio ( ) ) {   case MediaProperties . ASPECT_RATIO_3_2 :   width = 720 ;   break ;     } } } 
class InstallPluginCommand extends CliTool . Command { public void test ( ) { { {   zipInput . closeEntry ( ) ;   }   }   Files . delete ( zip ) ;   return target ;   }     }  
public class DataStructures {   private static Integer [ ] unsorted = null ;   private static String string = null ;   private static boolean debug = false ;   private static boolean debugTime = false ;   public static void main ( String [ ] args ) {     } }  
public final class AnimChannel { public void test ( ) { { {   }   }   animation = null ;   notified = false ;   }     }  
public class MustacheWriter extends Writer {   private static ExecutorService es = Executors . newCachedThreadPool ( ) ;   private Writer writer ;   public MustacheWriter ( Writer writer ) {   this . writer = writer ;   }     } 
public class GraphCommitCellRender extends AbstractPaddingCellRender {     private GraphCommitCell getAssertGraphCommitCell ( Object value ) {   return ( GraphCommitCell ) value ;   }     }  
public class JSError {   public final String sourceName ;     public final Node node ;     public final int lineNumber ;     }  
public class ImportingJob implements Jsonizable { public void test ( ) {   JSONUtilities . safePut ( cfg , " hasData " , false ) ;   this . config = cfg ;   lastTouched = System . currentTimeMillis ( ) ;     dir . mkdirs ( ) ;   }     }  
public class ProcessorUtility implements ControllerListener {     public synchronized boolean waitForState ( Processor processor , int state )   {   processor . addControllerListener ( this ) ;   setFailed ( false ) ;     } }  
public class KeyguardUpdateMonitor { public void test ( ) {     mSimState = IccCard . State . READY ;   mBatteryStatus = BATTERY_STATUS_UNKNOWN ;   mBatteryLevel = 100 ;   mTelephonyPlmn = getDefaultPlmn ( ) ;     } }  
import org . apache . commons . lang . builder . HashCodeBuilder ;     public class FieldModifiers {   public String one ;   String two ;   protected String three ;   private String four ;     }  
class TemplateParser {     protected void onValue ( DbSqlBuilder sqlBuilder , String expression ) {   sqlBuilder . colvalue ( expression ) ;   }     }  
import com . liferay . portal . kernel . exception . PortalException ;           public class ReservedUserScreenNameException extends PortalException {   public ReservedUserScreenNameException ( ) {     } }  
public class ImageListActivity extends AbsListViewBaseActivity { public void test ( ) { {   if ( firstDisplay ) {   FadeInBitmapDisplayer . animate ( imageView , 500 ) ;   displayedImages . add ( imageUri ) ;   }   }   }     }  
public final class EmbeddedNeo implements NeoService   { public EmbeddedNeo ( String storeDir )   { {   this . shellServer = null ;   NeoJvmInstance . start ( null , storeDir , true ) ;   }       } }  
public class DrmManagerClient {     public int acquireRights ( DrmInfoRequest drmInfoRequest ) {   DrmInfo drmInfo = acquireDrmInfo ( drmInfoRequest ) ;   if ( null == drmInfo ) {   return ERROR_UNKNOWN ;   }   return processDrmInfo ( drmInfo ) ;   }     }  
public class TouchFeedbackDrawable extends LayerDrawable { public void test ( ) {   if ( mActiveRipplesCount >= MAX_RIPPLES ) {   Log . e ( LOG_TAG , " Max ripple count exceeded " , new RuntimeException ( ) ) ;   return ;   }   final Ripple ripple = mTouchedRipples . get ( id ) ;     } }  
public abstract class MasterBase implements Master {   protected boolean isLeaderMode ( ) {   return mIsLeader ;   }     protected boolean isStandbyMode ( ) {   return ! mIsLeader ;   }     }  
public class FastArray implements Cloneable {   public Object [ ] getArray ( ) {   return data ;   }     public String toString ( ) {   return toList ( ) . toString ( ) ;   }   }      
import rx . plugins . RxJavaPlugins ;         public final class Schedulers {   private final Scheduler computationScheduler ;   private final Scheduler ioScheduler ;     } 
public class Allocation extends BaseObj { public void test ( ) {   if ( typeID != 0 ) {   mType = new Type ( typeID , mRS ) ;   mType . updateFromNative ( ) ;   updateCacheInfo ( mType ) ;   }   }     }  
public class ActivityStack { public void test ( ) { {   }   if ( w > 0 ) {     }   return null ;   }     }  
public abstract class TWLayoutManager extends LayoutManager {     public void scrollToPosition ( int position ) {   scrollToPositionWithOffset ( position , 0 ) ;   }     }  
public class S3Client { public void test ( ) { { {   }   }   }     }  
public class MockBlock extends Block   {   public MockBlock ( int id )   { {   super ( id , Material . field_76259_v ) ;   }   }     }  
public class OtpsEvaluatedIndividual {   private OtpsIndividual individual ;   private long time ;   private int boardings ;     }  
public class NewLineBlocksIterator implements Iterator < Block > {     public void remove ( ) { {   throw new UnsupportedOperationException ( ) ;   }   }     }  
public class JazzyViewPager extends ViewPager { public void test ( ) { { {   ViewHelper . setScaleY ( right , mScale ) ;   ViewHelper . setTranslationX ( right , mTrans ) ;   }   if ( left != null ) {   left . bringToFront ( ) ;   }   }   }     }  
public final class GitPusher { public void test ( ) { { {   break ;   }   }   GitRepositoryManager . getInstance ( myProject ) . updateAllRepositories ( GitRepository . TrackedTopic . BRANCHES ) ;   return pushResult ;   }     }  
public class ConcurrentMapConfiguration extends AbstractConfiguration {       protected void addPropertyDirect ( String key , Object value ) {   props . put ( key , value ) ;   }     } 
public class ZooClient extends AbstractZooKeeperManager     { public void shutdown ( )   { {   msgLog . close ( ) ;   this . shutdown = true ;   super . shutdown ( ) ;   }     } }  
import static com . zegoggles . smssync . App . TAG ;   public class ThreadHelper {   private Class < ? > telephonyThreads ;   private Method getOrCreateThreadId ;   private boolean threadsAvailable = true ;     }  
public class ShadowAdapterView extends ShadowViewGroup {   public Object getSelectedItem ( ) {   int pos = getSelectedItemPosition ( ) ;   return getItemAtPosition ( pos ) ;   }    }      
public final class GnssStatus {       public float getElevationDegrees ( int satIndex ) {   return mElevations [ satIndex ] ;   }       }  
public class ServletRequestWrapper implements ServletRequest {     public void addAsyncListener ( AsyncListener listener ,   ServletRequest servletRequest , ServletResponse servletResponse ) {   request . addAsyncListener ( listener , servletRequest , servletResponse ) ;   }       }  
import java . util . Date ;   import android . app . Activity ;   import android . os . Bundle ;   import android . widget . TextView ;   import com . googlecode . androidannotations . annotations . EActivity ;      
public class BatteryStatsImpl extends BatteryStats {       public LongSamplingCounter getIdleTimeCounter ( ) {   return mIdleTimeMillis ;   }       }  
class SwitchProfileAction extends FBAction {   public void run ( ) { {   Reader . setColorProfileName ( myProfileName ) ;   Reader . resetView ( ) ;   Reader . repaintView ( ) ;   }   }     }  
public final class HandlerScheduler extends Scheduler {   static class HandlerWorker extends Worker {   final Handler handler ;   private final CompositeSubscription compositeSubscription = new CompositeSubscription ( ) ;     } }  
public final class ReinitializeFileEntry extends JournalEntry {               public long getTTL ( ) {     } }  
public class GitVcs extends AbstractVcs < CommittedChangeList > {       public GitVersion getVersion ( ) {   if ( myVersion == null ) {   checkVersion ( ) ;   }   return myVersion ;   }     }  
class InterceptedInvocation implements Invocation , VerificationAwareInvocation {     public int hashCode ( ) {     return 1 ;   }     }  
public abstract class AbstractAndroidMojo extends AbstractMojo {             private Sdk sdk ;     }  
public class PGraphicsOpenGL extends PGraphics {   protected void reinitPrimary ( ) {   allocate ( ) ;       } }  
import buildcraft . transport . BlockGenericPipe ;   import buildcraft . transport . Gate ;   import buildcraft . transport . GateVanilla ;   import buildcraft . transport . Pipe ;   import net . minecraft . src . Block ;   import net . minecraft . src . ItemStack ;      
public class BSONBinaryWriterTest {     public void testWriteObjectId ( ) {   final ObjectId id = new ObjectId ( " 50d3332018c6a1d8d1662b61 " ) ;   writer . writeStartDocument ( ) ;     } }  
public class ServiceBeanMethodInvocationFactoryImplTest { public void test ( ) {   EmailAddress emailAddress = EmailAddressUtil . create ( emailAddressId ) ;   emailAddress . setCompanyId ( TestPropsValues . getCompanyId ( ) ) ;   emailAddress . setAddress ( address ) ;   return emailAddress ;     } }  
public class AccessorForPropertyDescriptor extends PropertyDescriptor { public void test ( ) { { {   super ( property , Collections . < AnnotationDescriptor > emptyList ( ) , Modality . FINAL , Visibilities . PUBLIC ,   false ,   false , Kind . DECLARATION ) ;   initializeDefault ( ) ;   }   }   }     }  
public final class TimestampType       { public String getName ( )   {   return " timestamp " ;     } }  
public class MessageList   { public void test ( ) { {   finish ( ) ;     Accounts . listAccounts ( this ) ;   }   }     }  
package com . interview . tree ;     class Count { public void test ( ) {   int size ;   }     }  
public class JDBCStore extends StoreBase { public void test ( ) {                   } }  
final class ActivityRecord { public void test ( ) {   configDestroy = false ;   keysPaused = false ;   inHistory = false ;   visible = false ;   nowVisible = false ;   idle = false ;   hasBeenLaunched = false ;     } }  
public class Explode extends Visibility {   public Explode ( Context context , AttributeSet attrs ) {   super ( context , attrs ) ;   setPropagation ( new CircularPropagation ( ) ) ;   }   private void captureValues ( TransitionValues transitionValues ) {     } }  
public class IconDrawable extends Drawable {     public int getOpacity ( ) { {   return this . alpha ;   }   }     }  
public class AsyncHttpClientConfig {     public Builder addResponseFilter ( ResponseFilter responseFilter ) {   responseFilters . add ( responseFilter ) ;   return this ;   }    }     
public class DrawHandler extends Handler {     public long getCurrentTime ( ) {   if ( ! mReady ) {   return 0 ;   }   if ( mInSeekingAction ) {   return mDesireSeekingTime ;   }     } }  
public class BikeRentalStationService {     public void addStation ( BikeRentalStation station ) {   stations . remove ( station ) ;   stations . add ( station ) ;   }     }  
public class DB {       public void dropDatabase ( ) { {   database . admin ( ) . drop ( ) ;   }   }     }  
public class QueryOperators {   public static final String SIZE = " $ size " ;   public static final String EXISTS = " $ exists " ;   public static final String WHERE = " $ where " ;   public static final String NEAR = " $ near " ;   }      
public class FileProjectManager extends ProjectManager { public void test ( ) { { { {   }   }   }     tin . close ( ) ;   }       }  
public class NativeObjectManager { public void test ( ) { { {   }   }   refMap . clear ( ) ;   refQueue = new ReferenceQueue < Object > ( ) ;   }       }  
public abstract class NanoHTTPD {   private final int myPort ;   private volatile ServerSocket myServerSocket ;   private SSLServerSocketFactory sslServerSocketFactory ;     }  
import org . mockito . stubbing . Answer ;   public class ReturnsVoid implements Answer < Object > {   public Object answer ( InvocationOnMock invocation ) throws Throwable {   return null ;   }     }  
public class TwoWayView extends AdapterView < ListAdapter > {     }   static class SavedState extends BaseSavedState {   int position ;   int offset ;     } 
public final class ContactsContract {         public static final String RAW_CONTACT_IS_READ_ONLY = " raw_contact_is_read_only " ;   }        
public abstract class Visibility extends Transition { public void test ( ) { {   if ( mIsForcedVisibility ) {   mView . setTransitionAlpha ( 0 ) ;   } else {   mView . setVisibility ( mFinalVisibility ) ;   }   }   }     }  
public class RunMojo             { public ActivityNotFoundException ( )   {     } }  
public class StringServletResponse extends HttpServletResponseWrapper { public void test ( ) {   _unsyncByteArrayOutputStream . reset ( ) ;   _unsyncStringWriter . reset ( ) ;   _printWriter = new PrintWriter ( _unsyncStringWriter ) ;   }     }  
public class FakeBase64 {     public static String encodeToString ( byte [ ] input , int flags ) { {   return new String ( input ) + " __fake_Base64_encode_string__ " + flags ;   }   }     }  
public class ExecutionDelayTest extends HazelcastTestSupport {   public static class Task implements Callable , Serializable {   } public Task ( ) {   }     }  
import org . junit . * ;   import water . * ;   import water . fvec . * ;   public class DRFTest extends TestUtil {  public static void stall ( ) { stall_till_cloudsize ( 1 ) ; }   }   
package android . view ;   import android . animation . Animator ;   import android . animation . ValueAnimator ;   import android . animation . TimeInterpolator ;      
public class KafkaUtils { public void test ( ) { { { {   }   }   }   }     }  
public class Account implements BaseAccount   { public void test ( ) {   try   {   getLocalStore ( ) . resetVisibleLimits ( getDisplayCount ( ) ) ;   }   catch ( MessagingException e )   {     } } }  
public class Mockito extends Matchers { public void test ( ) {   }                 }  
public class FilterInvocation {     public HttpServletResponse getHttpResponse ( ) {   return response ;   }       }  
public class PyPreFormatProcessor implements PreFormatProcessor { public void test ( ) { {   }   myRange = range ;   element . accept ( this ) ;   return range ;   }       }  
import java . io . * ;   import java . util . zip . Inflater ;   public class GELFServer {   private static final int MAX_PACKET_SIZE = 8192 ;   private DatagramSocket serverSocket = null ;     }  
public class CheckerTest   { public void testPackageNames ( ) throws CheckstyleException   {   final Checker c = new Checker ( ) ;   assertNotNull ( c ) ;         } }  
public class RotateAnimation3D extends Animation3D {   protected double mDegreesToRotate ;   protected double mRotateFrom ;   protected double mRotationAngle ;   protected double mRotateX ;   protected double mRotateY ;   protected double mRotateZ ;   protected Number3D mRotationAxis ;   protected Quaternion mQuat ;   protected Quaternion mQuatFrom ;     }  
public abstract class Structure {   public AutoAllocated ( int size ) { {   super ( size ) ;     super . clear ( ) ;   }   }     }  
public class MtpDatabase { public void test ( ) {   return new int [ ] {     MtpConstants . FORMAT_UNDEFINED ,   MtpConstants . FORMAT_ASSOCIATION ,   MtpConstants . FORMAT_ABSTRACT_AV_PLAYLIST ,   } ;   }     }  
class AndroidParcelableExtension implements TypeGenerationExtension {   private final Types types ;   AndroidParcelableExtension ( Types types ) {   this . types = types ;   }     } 
public class ServletContextImpl implements ServletContext {     public String getServerInfo ( ) {   return " Undertow 1 . 0 . Alpha1 " ;   }       }  
public class DeltaSession extends StandardSession implements Externalizable , Clus       { public void setId ( String id ) { {   super . setId ( id , true ) ;   resetDeltaRequest ( ) ;   }     } }  
final class DefaultChannelPipeline implements ChannelPipeline {     }   abstract static class HeadHandler implements ChannelOutboundHandler {   protected final Unsafe unsafe ;   ByteBuf byteSink ;     }  
package com . phonegap ;   import android . app . Activity ;   import android . os . Bundle ;   public class StandAlone extends DroidGap {     }  
public class ApplicationInitializerTest {   private FeatureToggleService featureToggleService ;     private CcTrayActivityListener ccTrayActivityListener ;     private ConsoleService consoleService ;     private ContextRefreshedEvent contextRefreshedEvent ;     }  
package tachyon . master ;   import java . io . File ;   import java . io . IOException ;   import java . util . ArrayList ;   import java . util . List ;      
public class ProjectCommandTest { public void test ( ) {   checkPredicate ( projectConfigPredicate , EMPTY_PARSE_DATA , javaLibraryRule , false ) ;   checkPredicate ( projectConfigPredicate , EMPTY_PARSE_DATA , ruleConfig , true ) ;   BuildCommandOptions buildOptions = command . buildCommandOptions ;   MoreAsserts . assertContainsOne (   buildOptions . getArguments ( ) , javaLibraryTargetName . getFullyQualifiedName ( ) ) ;     } }  
public class CypherPluginFunctionalTest implements GraphHolder     { public void startServer ( ) {   graphdb . cleanContent ( ) ;   server = new WrappingNeoServerBootstrapper (   graphdb ) ;   server . start ( ) ;     } }  
public abstract class DataConnection extends HierarchicalStateMachine { public void test ( ) {   clearSettings ( ) ;   setDbg ( false ) ;   addState ( mDefaultState ) ;   addState ( mInactiveState , mDefaultState ) ;   addState ( mActivatingState , mDefaultState ) ;     } }  
package com . liferay . portal . model . impl ;     public class ReleaseImpl extends ReleaseBaseImpl {     public String getBundleSymbolicName ( ) {   return getServletContextName ( ) ;   }     }  
public class WriteResult {                 public int getN ( ) {     } }  
public class ShadowView {   public void clearAnimation ( ) {   if ( animation != null ) {   animation . cancel ( ) ;   animation = null ;   }   }     }  
import java . util . Set ;               final class PolymerPass extends AbstractPostOrderCallback implements HotSwapCompilerPass { public void test ( ) {     } }  
public final class SQLiteDebug {             public static class DbStats {       } }  
public abstract class TableRef {   public abstract String getName ( ) ;   public boolean isRoot ( ) {   return ! getParent ( ) . isPresent ( ) ;   }       }  
public class SortedQueryResultSet extends AbstractSet < Map . Entry > {     }   private static class EmptyIterator implements Iterator {     public boolean hasNext ( ) {     } } 
public class FieldTripRequest extends GenericModel {   public List < FieldTripNote > notes ;       public String submitterNotes ;       }  
public final class PropertiesExpander             { public PropertiesExpander ( Properties properties ) {   if ( properties == null ) {     } } }  
public class Music extends BaseAudioEntity {     public void stop ( ) {   this . mMediaPlayer . stop ( ) ;   }       }  
public class ScriptIntrinsicColorMatrix extends ScriptIntrinsic { public void test ( ) {   }                 }  
public abstract class AbstractChartView extends View implements Chart {     public void selectValue ( SelectedValue selectedValue ) {   chartRenderer . selectValue ( selectedValue ) ;   callTouchListener ( ) ;   ViewCompat . postInvalidateOnAnimation ( this ) ;   }     }  
public abstract class Structure {         protected int calculateSize ( boolean force ) {   return calculateSize ( force , false ) ;   }     } 
import io . airlift . configuration . Config ;   public class CompilerConfig   {   private boolean interpreterEnabled = true ;   public boolean isInterpreterEnabled ( )   {     } }  
public class CharTableImpl implements CharTable {     }   private static final class WeakCharEntryMap extends ReferenceMap {   public WeakCharEntryMap ( ) {   super ( ReferenceMap . WEAK , ReferenceMap . WEAK , true ) ;   }     } 
public final class JGroupsFilters { public void test ( ) { { { {   return true ;   }   } ;   }   }     }  
import groovy . text . SimpleTemplateEngine ;   import groovy . text . Template ;   import junit . framework . TestCase ;   import java . io . IOException ;   import java . io . StringWriter ;   import java . io . Writer ;      
import android . content . Context ;   import android . content . ContextWrapper ;   import android . view . LayoutInflater ;   class MortarContextWrapper extends ContextWrapper implements HasMortarScope {   private final MortarScope scope ;   private LayoutInflater inflater ;     } 
public final class Futures { public void test ( ) { { { {   }   }   }   }       }  
public class WordPress extends Application { public void test ( ) {   editor . putBoolean ( IS_SIGNED_OUT_PREFERENCE , true ) ;   editor . commit ( ) ;   wpDB . updateLastBlogId ( - 1 ) ;   currentBlog = null ;     } }  
import com . fasterxml . jackson . annotation . JsonProperty ;   public class RetryQueryRunnerConfig   {     private int numTries = 0 ;     private boolean returnPartialResults = false ;     }  
public class FirebirdDatabase extends AbstractDatabase {     public boolean supportsDDLInTransaction ( ) {   return false ;   }       }  
public class SubtasksTagListFragment extends TagViewFragment {     protected void refresh ( ) {   initializeTaskListMetadata ( ) ;   setUpTaskList ( ) ;   }     }  
import java . util . List ;   import java . util . Map ;   import java . util . UUID ;   import android . content . SharedPreferences ;   import android . util . Log ;      
public final class MenuItemImpl implements MenuItem {     public boolean expandActionView ( ) {   if ( ! hasCollapsibleActionView ( ) ) {   return false ;   }     } } 
public class BottomSheetLayout extends FrameLayout {   protected void onDetachedFromWindow ( ) {   super . onDetachedFromWindow ( ) ;   velocityTracker . clear ( ) ;   cancelCurrentAnimation ( ) ;   }       }  
public class JarFileUrlNestedJar implements Jar {     public InputStream getEntryInputStream ( ) throws IOException {   if ( jarInputStream == null ) {   jarInputStream = createJarInputStream ( ) ;   }   return jarInputStream ;   }     }  
public class TransportStopsLayer extends OsmandMapLayer implements ContextMenuLa     { public boolean drawInScreenPixels ( ) { {   return true ;   }       } }  
class IdentityVirtualFilePointer implements VirtualFilePointer {     public VirtualFile getFile ( ) {   return isValid ( ) ? myFile : null ;   }       }  
public class Shader {   public boolean getLocalMatrix ( Matrix localM ) {   if ( mLocalMatrix != null ) {   localM . set ( mLocalMatrix ) ;   return ! mLocalMatrix . isIdentity ( ) ;   }   return false ;   }     }  
public class Node implements Writable {     public List children ( ) {   return this . children ;   }   public void addChild ( final Object child ) {     } }  
public abstract class AbstractSchedulerTests {     public void onError ( Throwable e ) {   error . set ( e ) ;   completed . countDown ( ) ;   }       }  
class ApplicationHttpRequest extends HttpServletRequestWrapper {       public String getPathTranslated ( ) {   if ( getPathInfo ( ) == null ) {   return null ;   }     return getServletContext ( ) . getRealPath ( getPathInfo ( ) ) ;   }     }  
public class NativeFormatPlugin extends FormatPlugin {     public void detectLanguageAndEncoding ( Book book ) {   detectLanguageAndEncodingNative ( book ) ;   }   public native void detectLanguageAndEncodingNative ( Book book ) ;     }  
abstract class BaseActivity extends Activity { public void test ( ) { {   onCurrentDirectoryChanged ( ANIM_NONE ) ;   onStackRestored ( mRestoredStack , mExternal ) ;   }   }     }  
public class BazelCppRuleClasses { public void test ( ) {   new String [ ] {   " cc_inc_library " ,   " cc_library " ,   " objc_library " ,   } ;       } }  
public class PyFileElementType extends IStubFileElementType < PyFileStub > {     public int getStubVersion ( ) {   return 41 ;   }       }  
public class Circle implements Serializable , Shape {   public Vector3 getCenter ( ) { {   return new Vector3 ( x , y , 0 ) ;   }   }     }  
public class ListeningMultiSemaphore {     private boolean fairnessAllowsReordering ( ) {   return fairness == ResourceAllocationFairness . FAST ;   }   }      
import org . mockito . exceptions . base . MockitoException ;   public class MockitoAnnotations { public void test ( ) {               } }  
import java . util . HashSet ;   import java . util . Hashtable ;   import java . util . Iterator ;   import java . util . List ;   import java . util . Set ;   import javax . naming . Context ;      
public class Select < T > implements Iterable { public void test ( ) {   return sql . toString ( ) ;   }   String getWhereCond ( ) {   return whereClause ;   }     } 
package processing . app . windows ;   import java . io . File ;   import java . io . UnsupportedEncodingException ;   import processing . app . Base ;   import processing . app . Preferences ;      
public class SyncManager { public void test ( ) { { { {   Slog . v ( TAG , " Pushing back running sync due to a higher priority sync " ) ;   }   deferActiveSyncH ( asc ) ;   break ;   }   }   }     }  
import java . util . List ;         class RuleMatchesAsJsonSerializer {   private static final int API_VERSION = 1 ;     }  
package android . database . sqlite ;             public class DatabaseObjectNotClosedException extends RuntimeException   { public void test ( ) {     } }  
public class AppleTest extends AbstractBuildRule implements TestRule {   public ImmutableList < Step > getBuildSteps (   BuildContext context ,   BuildableContext buildableContext ) {   return ImmutableList . of ( ) ;   }       }  
public class LabelPropertyRenderer < V > extends JLabel implements PropertyRenderer   { public LabelPropertyRenderer ( ) {   setOpaque ( true ) ;   putClientProperty ( " html . disable " , true ) ;   }   public LabelPropertyRenderer ( String staticText ) {     } }  
public class ValueAnimator extends Animator { public void test ( ) {   mRunning = false ;   mStarted = false ;   mStartListenersCalled = false ;   mPlayingBackwards = false ;   }       }  
public class PJOGL extends PGL {     public void reshape ( GLAutoDrawable glDrawable , int x , int y , int w , int h ) {     }   private void getGL ( GLAutoDrawable glDrawable ) {     } }  
public class WordPress extends Application { public void test ( ) {   EventBus . builder ( )   . logNoSubscriberMessages ( false )   . sendNoSubscriberEvent ( false )   . throwSubscriberException ( true )   . installDefaultEventBus ( ) ;   RestClientUtils . setUserAgent ( getUserAgent ( ) ) ;     } }  
public class CheckerTest   {   public BriefLogger ( OutputStream out )   {   super ( out , false ) ;   }   public void auditStarted ( AuditEvent evt ) { }   public void fileFinished ( AuditEvent evt ) { }     }  
public class CommonLVCS extends LocalVcs implements ProjectComponent , FileConten     { public synchronized void endAction ( LvcsActionImpl action ) {   if ( ! isOldLvcsEnabled ( ) ) return ;   commitAllUnsavedDocuments ( ) ;   if ( LOG . isDebugEnabled ( ) ) {     } } }  
public class CDMAPhone extends PhoneBase { public void test ( ) {   CdmaCallTracker mCT ;   CdmaSMSDispatcher mSMS ;   CdmaServiceStateTracker mSST ;   RuimRecords mRuimRecords ;   RuimCard mRuimCard ;   ArrayList < CdmaMmiCode > mPendingMmis = new ArrayList < CdmaMmiCode > ( ) ;     } }  
public final class NioEventLoop extends SingleThreadEventLoop { public void test ( ) { {   logger . debug ( " Epoll - bug workaround enabled = " + EPOLL_BUG_WORKAROUND ) ;   }   }             }  
public abstract class DjangoManageTestTask extends PyExecutionFixtureTestTask { public void test ( ) {   task . setParameters ( parametersString . build ( ) ) ;   myProcessHandler = task . createProcess ( null ) ;   myProcessHandler . addProcessListener ( createProcessListener ( ) ) ;     } }  
public class ViewTest {   public void testHasEmptyLayoutParams ( ) throws Exception {   DroidSugarAndroidTestRunner . addProxy ( View . class , FakeView . class ) ;     ViewGroup . LayoutParams layoutParams = new View ( null ) . getLayoutParams ( ) ;   assertThat ( layoutParams , notNullValue ( ) ) ;   }     }  
package org . wordpress . android . ui ;   import android . view . View ;   abstract class MenuDrawerItem { public void test ( ) {       } }  
public class WikiSubscriptionLocalizedContentTest   extends BaseSubscriptionLocalizedContentTestCase {       public void setUp ( ) throws Exception {   super . setUp ( ) ;     } }  
final class DefaultPermissionGrantPolicy { public void test ( ) { {   grantRuntimePermissionsLPw ( wearHomePackage , PHONE_PERMISSIONS , true , userId ) ;   grantRuntimePermissionsLPw ( wearHomePackage , MICROPHONE_PERMISSIONS , false ,   userId ) ;   grantRuntimePermissionsLPw ( wearHomePackage , LOCATION_PERMISSIONS , false ,   userId ) ;   }   }     }  
public class HqlDomain {     public static class SimpleTypes {   transient int test ( ) ;   long id ;   BigDecimal bigDecimal ;   Byte bbyte ;     } }  
public class PolishWordRepeatRule extends PolishRule {       public void reset ( ) {     }     }  
public class PeerEurekaNode { public void test ( ) {   cancelProcessor . shutdown ( ) ;   statusProcessor . shutdown ( ) ;   asgStatusProcessor . shutdown ( ) ;   replicationClient . shutdown ( ) ;   }       }  
public class GitPushDialog extends DialogWrapper { public void test ( ) {   init ( ) ;   setOKButtonText ( " Push " ) ;   setOKButtonMnemonic ( ' P ' ) ;   setTitle ( " Git Push " ) ;   }     }  
public class RemoteExportException extends PortalException {   public static final int NO_PERMISSIONS = 5 ;   public static final int SAME_GROUP = 4 ;     public RemoteExportException ( int type ) {   _type = type ;   }     }  
public class MersenneRandom extends Random {   public double nextGaussian ( ) {   return mersenne . nextGaussian ( ) ;   }     }    
public class BinaryDoubleExpressionHelper extends BinaryLongExpressionHelper {     protected ClassNode getNormalOpResultType ( ) {   return ClassHelper . double_TYPE ;   }       }  
public class CvsHistoryProvider implements VcsHistoryProvider {     public String getHelpId ( ) {   return " reference . versionControl . toolwindow . history " ;   }       }  
import java . util . concurrent . ConcurrentHashMap ;               public class PresenceUpdateHandler extends BasicModule implements ChannelHandler { public void test ( ) {     } }  
public class TraversalRequirements { public void test ( ) { { {   return false ;   }   }   return e . canTraverse ( modes ) ;   }       }  
public class TitlePageIndicator extends View implements PageIndicator {   public void setFooterLineHeight ( float footerLineHeight ) {   mFooterLineHeight = footerLineHeight ;   mPaintFooterLine . setStrokeWidth ( mFooterLineHeight ) ;   invalidate ( ) ;   }     }  
public abstract class Conference implements IConferenceable {   private final List < Connection > mUnmodifiableConferenceableConnections =   Collections . unmodifiableList ( mConferenceableConnections ) ;   protected PhoneAccountHandle mPhoneAccount ;   private AudioState mAudioState ;   private int mState = Connection . STATE_NEW ;   private DisconnectCause mDisconnectCause ;     }  
public class PortletServletRequest extends HttpServletRequestWrapper { public void test ( ) { { {   }   }   return retVal ;   }     }  
public class AudioFormat { public void test ( ) {   switch ( audioFormat ) {   case ENCODING_PCM_8BIT :   return 1 ;   case ENCODING_PCM_FLOAT :   return 4 ;   case ENCODING_PCM_16BIT :   case ENCODING_DEFAULT :   return 2 ;     } } }  
import java . util . Set ;     public class PointQuadTree < T extends PointQuadTree . Item > {   } public interface Item {   Point getPoint ( ) ;   }     
public abstract class HardwareRenderer {         private static final int PROFILE_MAX_FRAMES = 128 ;         }  
public class Tmp { public void test ( ) {         } }  
public class TachyonFile {   public void append ( byte b ) throws IOException {     appendCurrentBuffer ( Config . USER_BUFFER_PER_PARTITION_BYTES ) ;     mBuffer . put ( b ) ;   }     }  
package org . mockito ;   import org . mockito . internal . returnvalues . EmptyReturnValues ;     public class DefaultMockitoConfiguration implements IMockitoConfiguration {   public ReturnValues getReturnValues ( ) {     } }  
public class JarHell { public void test ( ) { { {   }   }   }       }  
public final class Settings {     public static final String CERT_PIN_UPDATE_METADATA_URL = " cert_pin_metadata_url " ;             }  
package a ;   import kotlin . jvm . functions . Function0 ;     public class A { public void test ( ) {   }     }  
import android . telephony . Rlog ;   public final class CellInfoLte extends CellInfo implements Parcelable {   private static final String LOG_TAG = " CellInfoLte " ;   private static final boolean DBG = false ;   private CellIdentityLte mCellIdentityLte ;   private CellSignalStrengthLte mCellSignalStrengthLte ;     }  
package org . mapdb ;   import java . lang . ref . ReferenceQueue ;   import java . lang . ref . SoftReference ;   import java . lang . ref . WeakReference ;      
public class LocalIndexesFragment extends OsmandExpandableListFragment { public void test ( ) { {   listAdapter . addLocalIndexInfo ( info ) ;   }   listAdapter . sortData ( ) ;   getExpandableListView ( ) . setAdapter ( listAdapter ) ;   }   ActionBar actionBar = getDownloadActivity ( ) . getSupportActionBar ( ) ;       }  
public class Tmp { public interface Part {               } public String getSubmittedFileName ( ) ;     }  
public class Python2Target extends Target {     public String getVersion ( ) {   return " 4 . 5 . 1 " ;   }   public Set < String > getBadWords ( ) {     } }  
public class ConsoleConfigurable implements SearchableConfigurable , Configurable       { public String getDisplayName ( ) { {   return " Console " ;   }       } }  
public class Graylog2Reporter extends ScheduledReporter {     public String buildShortMessage ( String name ) { {   return " metrics " ;   }   }     }  
import org . codehaus . groovy . runtime . InvokerInvocationException ;               public class GroovyMain { public void test ( ) {     } }  
public abstract class BuilderSupport extends GroovyObjectSupport {   protected Object getCurrent ( ) {   return current ;   }     protected void setCurrent ( Object current ) {   this . current = current ;   }   }      
public class RequestSchemeAttribute implements ExchangeAttribute {     public String readAttribute ( final HttpServerExchange exchange ) {   return exchange . getRequestScheme ( ) ;   }       }  
class SourceMapLineDecoder { private static final String BASE64_MAP =  " ABCDEFGHIJKLMNOPQRSTUVWXYZ " +  " abcdefghijklmnopqrstuvwxyz " +  " 0123456789 + / " ; } 
public class TerminateRemoteProcessDialog {     public boolean isToBeShown ( ) {   return myAlwaysUseDefault ? myDetachIsDefault : myDontTerminate ;   }       }  
public class ContextForcedUserPanel extends AbstractContextPropertiesPanel {     public User getElementAt ( int index ) {   return tableModel . getElement ( index ) ;   }     }  
public class ManagedServlet implements Lifecycle {     public void release ( ) { { {     }   } ;   }     }  
public class BlockFlowEvent extends BlockEvent {     public boolean equals ( BlockFlow flow ) {   return flowDirection . equals ( flow . flowDirection ) ;   }       }  
public class TestContextConfigAnnotation extends TestCase { public void test ( ) { { {   if ( antFile . lastModified ( ) >= eclipseFile . lastModified ( ) ) {   return antFile ;   }   return eclipseFile ;   }   return antFile ;   }   return eclipseFile ;   }     }  
public class PyDuplocatorTest extends PyTestCase {   public void testIgnoreStringLiteral ( ) throws Exception {   myDuplocatorSettings . DISTINGUISH_LITERALS = false ;   try {   doTest ( 1 ) ;   }   finally {   myDuplocatorSettings . DISTINGUISH_LITERALS = true ;     } } }  
public class Tmp { public interface JSONWebServiceActionMapping {   } public Object getActionObject ( ) ;   public String getContextName ( ) ;     public String getContextPath ( ) ;   public String getMethod ( ) ;     }  
public class RaptorWorkerData implements Serializable { public void test ( ) {   continue ;   timetablesForPattern . add ( timetable ) ;   timetable . raptorData = this ;       } }  
public class SlidingLayer extends FrameLayout {     public void setOpenOnTapEnabled ( boolean _openOnTapEnabled ) {   openOnTapEnabled = _openOnTapEnabled ;   }     }  
final class PooledUnsafeDirectByteBuf extends PooledByteBuf < ByteBuffer > {     protected ByteBuffer newInternalNioBuffer ( ByteBuffer memory ) {   return memory . duplicate ( ) ;   }       }  
public class PreferenceManager {   private OnPreferenceTreeClickListener mOnPreferenceTreeClickListener ;       PreferenceManager ( Activity activity , int firstRequestCode ) {   mActivity = activity ;   mNextRequestCode = firstRequestCode ;     } } 
import java . util . Set ;       public class NodeTraversal {   private final AbstractCompiler compiler ;   private final Callback callback ;     }  
public class DeepLearningSpiralsTest extends TestUtil { public void test ( ) { { { { {   }   }   }   frame . delete ( ) ;   Scope . exit ( ) ;   }   }     }  
public class ByteDecoder extends Bytes { public void test ( ) {   switch ( type ) {   case NULL :   case UNDEFINED :   break ;   case BOOLEAN :     } } }  
public class NavBarPanel extends JPanel implements DataProvider , PopupOwner , Dis     { public void dispose ( ) { {   getNavBarUI ( ) . clearItems ( ) ;   myDisposed = true ;   NavBarListener . unsubscribeFrom ( this ) ;   }     } }  
public abstract class ATransformable3D extends AFrameTask implements IGraphNodeM     { public void setScale ( Vector3 scale ) { {   mScale . setAll ( scale ) ;   if ( mGraphNode != null ) mGraphNode . updateObject ( this ) ;   }     } }  
package com . zaxxer . hikari . metrics ;     public class MetricsTracker   {   protected static final Context NO_CONTEXT = new Context ( ) ;   public static class Context   {     } }  
public final class Calendar {   public static final int EDITOR_ACCESS = 600 ;     public static final int OWNER_ACCESS = 700 ;     public static final int ROOT_ACCESS = 800 ;       }  
public final class DiskLruCache implements Closeable {    public synchronized long getMaxSize ( ) {   return maxSize ;   }        }   
public class EpisodesFragment extends SherlockFragment { public void test ( ) { { {   }   }   resetContextMenuSelection ( ) ;   return handled ;   }     }  
public abstract class RajawaliRenderer implements IRajawaliSurfaceRenderer {   final AFrameTask task = new AFrameTask ( ) {     protected void doTask ( ) {   renderTarget . create ( ) ;   mRenderTargets . add ( renderTarget ) ;   }   } ;     }  
public class MapReduceOutput { public void test ( ) {   }                 }  
public class CatchablePokemon { public void test ( ) {   try {   response = CatchPokemonResponse . parseFrom ( result ) ;   } catch ( InvalidProtocolBufferException e ) {   throw new RemoteServerException ( e ) ;   }     } }  
public class EthernetDataTracker implements NetworkStateTracker {   public String getTcpBufferSizesPropName ( ) {   return " net . tcp . buffersize . wifi " ;   }     public void setDependencyMet ( boolean met ) {     }   }      
public class LabeledScoredTreeReaderFactory implements TreeReaderFactory {   private final TreeNormalizer tm ;           public LabeledScoredTreeReaderFactory ( ) {   lf = CoreLabel . factory ( ) ;     } }  
public class Publication implements AutoCloseable     { public boolean hasBeenConnected ( )   { {   ensureOpen ( ) ;     return positionLimit . getVolatile ( ) > 0 ;   }     } }  
public class AndroidPrebuiltAar extends AndroidLibrary implements HasAndroidReso     { public void addToCollector ( AndroidPackageableCollector collector ) { { {   super . addToCollector ( collector ) ;   collector . addNativeLibsDirectory ( getBuildTarget ( ) , nativeLibsDirectory ) ;   }   }     } }  
public class TileBlueprintLibrary extends TileBuildCraft implements IInventory {     public int getInventoryStackLimit ( ) {   return 1 ;   }       }  
public class BlogsIndexer extends BaseIndexer {   public static final String PORTLET_ID = PortletKeys . BLOGS ;   public BlogsIndexer ( ) {   setFilterSearch ( true ) ;   setPermissionAware ( true ) ;   }     }  
public class PlaybackService extends Service { public void test ( ) { {   Log . w ( TAG , " Something went wrong . Shutting down . . . " ) ;   stopSelf ( ) ;   }   return Service . START_NOT_STICKY ;   }       }  
public class EditingTargetCodeExecution   { public void test ( ) { {   if ( ! docDisplay_ . moveSelectionToNextLine ( true ) )   docDisplay_ . moveSelectionToBlankLine ( ) ;   docDisplay_ . ensureCursorVisible ( ) ;   }   }     }  
public class ThrottleService extends IThrottleManager . Stub {   private void checkThrottleAndPostNotification ( long currentTotal ) {     if ( mPolicyThreshold == 0 ) {   clearThrottleAndNotification ( ) ;   return ;   }     } }  
public class TestModulePropertiesImpl extends TestModuleProperties implements Pe     { public void loadState ( TestModulePropertiesState state ) {   setProductionModuleName ( state . moduleName ) ;   }   public static class TestModulePropertiesState {     } }  
public class SpanishXMLTreeReader implements TreeReader {   private static final String ATTR_ELLIPTIC = " elliptic " ;   private static final String EMPTY_LEAF = " - NONE - " ;   private NodeList sentences ;   private int sentIdx ;     }  
public class PrivacyService { public void test ( ) {   if ( hook . isDangerous ( ) ) {   result . methodName = hook . getName ( ) ;   result . restricted = false ;   result . asked = true ;   setRestrictionInternal ( result ) ;   }   }     }  
import java . util . List ;     public abstract class ByteToMessageDecoder extends ChannelInboundHandlerAdapter {   ByteBuf cumulation ;   private boolean singleDecode ;   private boolean decodeWasNull ;     }  
public class RecoveryTests extends CrateIntegrationTest { public void test ( ) { { {   assertThat ( length , greaterThanOrEqualTo ( 1L ) ) ;   }   for ( Thread writer : writers ) {   writer . join ( 6000 ) ;   }   }   }     }  
public class VcsLogUiImpl implements VcsLogUi , Disposable {     public void dispose ( ) { {   getTable ( ) . removeAllHighlighters ( ) ;   myVisiblePack = VisiblePack . EMPTY ;   }   }     }  
public class Table extends JTable { public void test ( ) {   add ( editorComp ) ;   editorComp . validate ( ) ;   editorComp . requestFocusInWindow ( ) ;     setCellEditor ( editor ) ;   setEditingRow ( row ) ;   setEditingColumn ( column ) ;     } }  
public class Tmp { public interface PacketExtension {   } public String getNamespace ( ) ;                 }  
public class SerializableHasSerialVersionUIDFieldInspection   extends SerializableInspection {     public boolean isEnabledByDefault ( ) {   return true ;   }         public String getID ( ) {   return " serial " ;     } }  
public final class ContactsContract {   public static final int TYPE_WORK_MOBILE = 17 ;   public static final int TYPE_WORK_PAGER = 18 ;   public static final int TYPE_ASSISTANT = 19 ;   public static final int TYPE_MMS = 20 ;         }  
import static org . elasticsearch . action . ValidateActions . addValidationError ;       public class ClearScrollRequest extends ActionRequest < ClearScrollRequest > {   private List < String > scrollIds ;     } 
public final class Annotation implements Comparable < Annotation > { public void test ( ) {   boolean has_changes = false ;   for ( Map . Entry < String , Boolean > entry : changed . entrySet ( ) ) {   if ( entry . getValue ( ) ) {   has_changes = true ;   break ;   }     } } }  
public class SchematicDoor extends SchematicBlock {     public void rotateLeft ( IBuilderContext context ) {   meta = rotateMeta ( meta ) ;   }   private int rotateMeta ( int meta ) {     } }  
public class Drawer {     public Drawer withAccountHeader ( AccountHeader . Result accountHeader ) {   this . mAccountHeader = accountHeader ;     mHeaderOffset = 1 ;   return this ;   }     }  
public class XPrivacy implements IXposedHookLoadPackage , IXposedHookZygoteInit { public void test ( ) {     hookAll ( XCamera . getInstances ( ) ) ;     hookAll ( XConnectivityManager . getInstances ( ) ) ;     } }  
public class FileDisplayActivity extends HookActivity     { public void onBrowsedDownTo ( OCFile directory ) {   cleanSecondFragment ( ) ;   setFile ( directory ) ;   updateActionBarTitle ( ) ;     startSyncFolderOperation ( directory , false ) ;     } }  
public final class From implements Sqlable { public void test ( ) {   if ( mLimit != null ) {   sql . append ( " LIMIT " ) ;   sql . append ( mLimit ) ;   sql . append ( " " ) ;   }     } }  
public class Constants {   public static final long SCALE_ANIMATION_DURATION_FULL_DISTANCE = 800 ;   public static final int DISPLAY_PHOTO_SIZE = 640 ;   public static final String FACEBOOK_APP_ID = " 134669876670695 " ;     }  
public class MainService extends Service { public void test ( ) {   unregisterReceiver ( mPackageBroadcastReceiver ) ;   unregisterReceiver ( mDialogReceiver ) ;   unregisterReceiver ( mBroadcastReceiver ) ;   MainController . destroy ( ) ;   }     }  
public class Switch extends CompoundButton {     public void setChecked ( boolean checked ) {   super . setChecked ( checked ) ;   mThumbPosition = isChecked ( ) ? getThumbScrollRange ( ) : 0 ;   invalidate ( ) ;   }     }  
public class Tmp { public enum TreeType {     BIRCH ,         JUNGLE ,         RED_MUSHROOM ,     } }  
public abstract class AbstractBasicTest {     public void onThrowable ( Throwable t ) { {   t . printStackTrace ( ) ;   }   }     }  
public class OsmBugsDbHelper extends SQLiteOpenHelper { public void test ( ) { { { {   } while ( query . moveToNext ( ) ) ;   }   query . close ( ) ;   db . close ( ) ;   }   return cachedOsmbugsPoints ;   }     }  
import android . content . pm . PackageInfo ;   import android . content . pm . PackageManager ;   import android . net . Uri ;   import android . support . v4 . app . NotificationCompat ;   public class PackageChange extends BroadcastReceiver {     }  
public class CalendarView extends FrameLayout {         private int mCurrentMonthDisplayed = - 1 ;         }  
public class ApplicationInfo extends PackageItemInfo implements Parcelable { public void test ( ) {   manageSpaceActivityName = orig . manageSpaceActivityName ;   descriptionRes = orig . descriptionRes ;   uiOptions = orig . uiOptions ;   backupAgentName = orig . backupAgentName ;   }     }  
public class ConsistencyCheck { public void test ( ) { { {   }   }   }       }  
public abstract class WindowOrientationListener { public void test ( ) {   if ( LOG ) {   Log . d ( TAG , " WindowOrientationListener enabled " ) ;   }   mSensorEventListener . reset ( ) ;   mSensorManager . registerListener ( mSensorEventListener , mSensor , mRate ) ;   mEnabled = true ;   }     }  
public class PythonDocumentationConfigurable implements SearchableConfigurable {     public String getHelpTopic ( ) {   return " preferences . ExternalDocumentation " ;   }       }  
public class AjaxStatus { public void test ( ) {                   } }  
import android . test . InstrumentationTestCase ;   import java . util . ArrayList ;   import java . util . List ;          
public class PGraphicsPDF extends PGraphicsJava2D {  public boolean save ( String filename ) {   nope ( " save " ) ;   return false ;   }        } 
public final class AlluxioFuse {   private static final Logger LOG = LoggerFactory . getLogger ( Constants . LOGGER_TYPE ) ;   private static Configuration sConfiguration ;     private AlluxioFuse ( ) {   }     }  
public class UnderlinePageIndicator extends View implements PageIndicator {     public void setSelectedColor ( int selectedColor ) {   mPaint . setColor ( selectedColor ) ;   invalidate ( ) ;   }     }  
class FastScroller { public void test ( ) { { {   break ;   }   }   ta . recycle ( ) ;   updateAppearance ( ) ;   }     }  
public class RandomAccessSparseVector extends AbstractVector {     private static class AddToVector implements IntDoubleProcedure {   final Vector v ;   private AddToVector ( Vector v ) {     } } } 
public class Compile extends ConventionTask {   protected AntJavac antCompile = new AntJavac ( ) ;   protected ClasspathConverter classpathConverter = new ClasspathConverter ( ) ;   public Compile ( Project project , String name ) {     } }  
public final class ChannelPromiseAggregator implements ChannelFutureListener {   private final ChannelPromise aggregatePromise ;   private Set < ChannelPromise > pendingPromises ;           }  
public class FakeContext implements Context {   public Validation getValidation ( ) {   return validation ;   }       public String getPathParameterEncoded ( String name ) {   return this . getPathParameterEncoded ( name ) ;   }   }      
public class SwipeFlingAdapterView extends BaseFlingAdapterView implements CardE     { public View getSelectedView ( ) { {   if ( topView == null ) {   return null ;   }   return topView . get ( ) ;   }     } }  
  package com . alibaba . druid . pool ;   import java . sql . Wrapper ;   public class WrapperAdapter implements Wrapper { public void test ( ) {     } }  
public class UpgradeResourcePermissionTest extends UpgradeResourcePermission {     public void setUp ( ) throws Exception {   _company = CompanyTestUtil . addCompany ( ) ;     _user = UserTestUtil . addUser ( ) ;   }     }  
import antlr . LexerSharedInputState ;             public class UnicodeLexerSharedInputState extends LexerSharedInputState {   private final UnicodeEscapingReader escapingReader ;     }  
class Searcher { public void test ( ) { { {   logMatchesFound ( regex ) ;   return false ;   }   sleeper . sleep ( ) ;   }   }     }  
public class MessageList extends K9FragmentActivity implements MessageListFragme     { public void updateMenu ( ) { {   invalidateOptionsMenu ( ) ;   }       } }  
public class WXEnvironment {   public static final String SETTING_EXCLUDE_X86SUPPORT = " env_exclude_x86 " ;   public static boolean SETTING_FORCE_VERTICAL_SCREEN = false ;           }  
public class DataStructures { public void test ( ) {   System . out . println ( " Removing a previously added node " + next ) ;   minHeap . remove ( next ) ;   System . out . println ( minHeap . toString ( ) ) ;   System . out . println ( ) ;   }   {     } }  
public class FieldIntroduceHandler extends IntroduceHandler {     protected String getHelpId ( ) {   return " python . reference . introduceField " ;   }       }  
public class TestJsonStringEncoder     { public void testQuoteLongCharSequenceAsString ( ) throws Exception   {   JsonStringEncoder encoder = new JsonStringEncoder ( ) ;     } }  
public final class Futures { public void test ( ) { { { {   }   }   }   }       }  
public final class CollapsePropertiesTest extends CompilerTestCase {     public CompilerPass getProcessor ( Compiler compiler ) {   return new CollapseProperties ( compiler , true ) ;   }     }  
public class JsonCodeStyleSettingsProvider extends CodeStyleSettingsProvider {       public String getHelpTopic ( ) { { {   return " reference . settingsdialog . codestyle . json " ;   }   } ;   }     }  
import java . io . Serializable ;     public class MySerialBean implements Serializable {   private static final long serialVersionUID = 1L ;   private int id ;   private String name ;     }  
public class MetricsSystem {   private MetricRegistry mMetricRegistry = new MetricRegistry ( ) ;   private MetricsConfig mMetricsConfig ;   private boolean mRunning = false ;         }  
public class ClusterStateManager {   private static final class StateManagerExceptionHandler implements FutureUtil . ExceptionHandler {   private final ILogger logger ;     private Throwable error ;   private StateManagerExceptionHandler ( ILogger logger ) {     } } }  
public class Tmp { public interface PConstants {   static final int ARGB = 2 ;   static final int HSB = 3 ;   static final int ALPHA = 4 ;   static final int CMYK = 5 ;       } }  
public abstract class Pair < T1 , T2 >     { public T1 first ( )   { {   return first ;   }       } }  
public class HazelcastXaTest {       public void testRecovery ( ) throws Exception {   HazelcastInstance instance1 = Hazelcast . newHazelcastInstance ( ) ;   HazelcastInstance instance2 = Hazelcast . newHazelcastInstance ( ) ;     } }  
public class Tmp { public enum RegExpCapability {   OMIT_NUMBERS_IN_QUANTIFIERS ,   COMMENT_MODE ,   ALLOW_HEX_DIGIT_CLASS ,         ALLOW_EMPTY_CHARACTER_CLASS ,   ALLOW_HORIZONTAL_WHITESPACE_CLASS ,   UNICODE_CATEGORY_SHORTHAND ,     } }  
import java . util . List ;   import org . springframework . stereotype . Component ;   public class PeriodicGraphUpdater {   private UpdateTask updater ;     }  
public class SubtasksListFragment extends TaskListFragment {     protected void onTaskDelete ( Task task ) {   super . onTaskDelete ( task ) ;   helper . onDeleteTask ( task ) ;   }     }  
public final class Realm implements Closeable { public void test ( ) { { {   handler . sendEmptyMessage ( REALM_CHANGED ) ;   }   }   }       }  
public class NestedScrollView extends FrameLayout implements NestedScrollingPare     { public void onAttachedToWindow ( ) { {   super . onAttachedToWindow ( ) ;     mIsLaidOut = false ;   }     } }  
import java . util . * ;   public class MessagePool {   private static int MAX_POOL_SIZE_FOR_FATALS = 100 ;   private static MessagePool ourInstance ;     }  
public class SmackAndroid {   private SmackAndroid ( Context ctx ) {   mCtx = ctx ;   InitStaticCode . initStaticCode ( ctx ) ;   ConfigureProviderManager . configureProviderManager ( ) ;   maybeRegisterReceiver ( ) ;   }     }  
public final class NIOConverter { public void test ( ) { {   bytes = value . getBytes ( ) ;   }   buf . put ( bytes ) ;   buf . flip ( ) ;   return buf ;   }     }  
import org . codehaus . groovy . syntax . Types ;   import java . io . BufferedWriter ;   import java . io . IOException ;   import java . io . Writer ;   import java . net . URL ;   import java . util . * ;      
public class BufferPool {   protected static volatile BufferPool instance = null ;   protected BufferPoolAPI pool = null ;   private BufferPool ( BufferPoolAPI pool ) {     } }  
public class JSONPointer {     public JSONPointer ( List < String > refTokens ) {   this . refTokens = new ArrayList < String > ( refTokens ) ;   }   private String unescape ( String token ) {     } }  
package redis . clients . jedis ;   import redis . clients . util . SafeEncoder ;   import java . util . * ;   public class BuilderFactory {     }  
public class RippleDrawable extends LayerDrawable { public void test ( ) {   if ( super . setDrawableByLayerId ( id , drawable ) ) {   if ( id == R . id . mask ) {   mMask = drawable ;   mHasValidMask = false ;   }   return true ;     } } }  
public class DefaultGlobalDisplay extends GlobalDisplay   { public void onError ( String message )   { {   dismissProgress ( ) ;   showMessage ( GlobalDisplay . MSG_ERROR , errorCaption , message ) ;   }     } }  
public class MapTileLayer extends BaseMapLayer {     public void drawTileMap ( Canvas canvas , RotatedTileBox tileBox ) {   ITileSource map = this . map ;   if ( map == null ) {   return ;   }     } }  
package org . bukkit . event . block ;   import org . bukkit . Block ;   import org . bukkit . Material ;   import org . bukkit . event . Event ;      
public class StringServletResponse extends HttpServletResponseWrapper {   public void setStatus ( int status ) {   _status = status ;     super . setStatus ( _status ) ;   }   public void setString ( String string ) {     } }  
public class SkeletonControl extends AbstractControl implements Cloneable {     public void setSpatial ( Spatial spatial ) {   super . setSpatial ( spatial ) ;   if ( spatial != null ) {   Node node = ( Node ) spatial ;   targets = findTargets ( node ) ;     } } }  
import org . springframework . mock . web . MockServletContext ;   import org . springframework . util . Assert ;   import java . io . IOException ;   import java . io . PrintWriter ;   import java . util . HashMap ;   import java . util . Map ;      
public class AccountHeaderBuilder {       protected boolean mDividerBelowHeader = true ;         }  
import java . io . File ;   import java . util . * ;   import java . util . concurrent . ExecutionException ;   import hex . glm . GLM2 ;   import hex . glm . GLMParams ;   import water . * ;      
public class PhoneWindowManager implements WindowManagerPolicy {   PowerManager . WakeLock mBroadcastWakeLock ;   class SettingsObserver extends ContentObserver {   SettingsObserver ( Handler handler ) {   super ( handler ) ;   }     } }  
public class TrustAgentWrapper {     public void destroy ( ) {   mContext . unregisterReceiver ( mBroadcastReceiver ) ;   mHandler . removeMessages ( MSG_RESTART_TIMEOUT ) ;   if ( ! mBound ) {     } } }  
public class Profile implements User {    public Integer getTimeZone ( ) {   return mTimeZone ;   }          } 
package com . wrapp . floatlabelededittext ;   import com . wrapp . floatlabelededittext . Utils ;   import android . annotation . TargetApi ;   import android . content . Context ;   import android . content . res . ColorStateList ;      
import cpw . mods . fml . common . eventhandler . SubscribeEvent ;   import cpw . mods . fml . common . gameevent . PlayerEvent ;   import buildcraft . BuildCraftBuilders ;   import buildcraft . BuildCraftCore ;   import buildcraft . BuildCraftEnergy ;   import buildcraft . BuildCraftFactory ;   import buildcraft . BuildCraftSilicon ;      
public class ReformatCodeAction extends AnAction implements DumbAware { public void test ( ) { { {   new ReformatCodeProcessor ( project , dir , dialog . isIncludeSubdirectories ( ) ) . run ( ) ;   }   }   }   final TextRange range ;     }  
public class WifiConfiguration implements Parcelable {       public boolean isValid ( ) {   if ( allowedKeyManagement == null )   return false ;     } }  
public class FragmentMain extends Fragment { public void test ( ) {   searchView . setOnQueryTextListener ( onQuerySearchView ) ;   menu . findItem ( R . id . menu_add ) . setVisible ( true ) ;     mSearchCheck = false ;   }     }  
public class NodeIndicesStats implements Streamable , Serializable , ToXContent {     public RefreshStats refresh ( ) {   return this . refreshStats ;   }   public RefreshStats getRefresh ( ) {     } }  
package serializers ;   import de . undercouch . bson4jackson . BsonFactory ;   public class BsonJackson   { public void test ( ) {     } }  
public abstract class Context {           public static final String NETWORKMANAGEMENT_SERVICE = " network_management " ;     }  
public final class CameraManager {               public static abstract class AvailabilityCallback {     } }  
package info . ata4 . unity ;     public class DisUnity {   private static final String VERSION = " 0 . 2 . 0 " ;   public static String getVersion ( ) {   return VERSION ;     } }  
package org . jivesoftware . smack ;   import java . util . LinkedList ;   import java . io . * ;   import org . jivesoftware . smack . packet . Packet ;      
public class IdeRootPane extends JRootPane implements UISettingsListener { public void test ( ) { { {   Disposer . dispose ( myStatusBar ) ;   }   removeToolbar ( ) ;   setJMenuBar ( null ) ;   }   super . removeNotify ( ) ;   }     }  
import java . util . ResourceBundle ;             public class SentenceWhitespaceRule extends Rule { public void test ( ) {     } }  
public class SlicedMapImpl implements MutableSlicedMap {     public void clear ( ) {   map . clear ( ) ;   collectiveSliceKeys = null ;   }       }  
import org . junit . Test ;   import org . mockitousage . IMethods ;   import org . mockitoutil . TestBase ;       public class ThreadsShareAMockTest extends TestBase {     }  
public final class Response {       public void setErrorException ( Exception ex ) {   errorException = ex ;   }     }  
public class TwitterSocialNetwork extends OAuthSocialNetwork { public void test ( ) {   mSharedPreferences . edit ( )   . remove ( SAVE_STATE_KEY_OAUTH_TOKEN )   . remove ( SAVE_STATE_KEY_OAUTH_SECRET )   . remove ( SAVE_STATE_KEY_USER_ID )   . apply ( ) ;   mTwitter = null ;     } }  
public class ProjectSharingPreferencesPane extends ProjectPreferencesPane     { public boolean onApply ( RProjectOptions prefs )   { { {   return false ;   }   }     } }  
public class DSLPlatform {     public String getName ( ) {   return " minified - json / dsl - platform " ;   }       }  
public final class LocalProperties implements Cloneable { public void test ( ) { {   }   return ! isTrivial ( ) ;   }     }  
public class HadoopDruidIndexerConfig   { public void setVersion ( DateTime version )   { {   this . version = version == null ? new DateTime ( ) : version ;   }       } }  
public class Decoder extends DecoderBase { public void test ( ) {   int first = tmpbuf [ 0 ] ;   in_progress . set_flags ( first & Msg . more ) ;   next_step ( in_progress ,   message_ready ) ;     } }  
public abstract class SlidingActivity extends AppCompatActivity {     public void disableHeader ( ) {   scroller . disableHeader ( ) ;   content . setPadding ( 0 , 0 , 0 , 0 ) ;   }       }  
public class CoyoteOutputStream   { public void print ( String s )   throws IOException { {   super . print ( s ) ;   }     } }  
public class DataDiff {     public boolean wasCompared ( ) { {   return false ;   }   }     }  
public final class DlvDebugProcess extends DebugProcessImpl < RemoteVmConnection >     { public void consume ( final DebuggerState o ) {   if ( o . exited ) {   stop ( ) ;   return ;   }     } }  
import java . net . SocketOptions ;     public class LocalSocket implements Closeable {   private final LocalSocketImpl impl ;   private volatile boolean implCreated ;   private LocalSocketAddress localAddress ;   private boolean isBound ;     }  
public class PopupWindow {       private void invokePopup ( WindowManager . LayoutParams p ) {   p . packageName = mContext . getPackageName ( ) ;   mWindowManager . addView ( mPopupView , p ) ;   }     }  
public class FastArray implements Cloneable {     public String toString ( ) { {   if ( size ( ) == 0 ) return " [ ] " ;   return toList ( ) . toString ( ) ;   }   }     }  
public class PsiGotoRelatedItem extends GotoRelatedItem {     public PsiFile getContainingFile ( ) { {   return myElement instanceof PsiFile ? null : myElement . getContainingFile ( ) ;   }   }     }  
public abstract class NativeObject implements Cloneable {     public void dispose ( ) { {   if ( objectManager != null ) {   objectManager . enqueueUnusedObject ( this ) ;   }   }   }     }  
public class IndexPrimaryShardNotAllocatedException extends IndexException {     public RestStatus status ( ) { {   return RestStatus . INTERNAL_SERVER_ERROR ;   }   }     }  
package net . simonvt . menudrawer . compat ;   import android . app . Activity ;   import android . graphics . drawable . Drawable ;   import android . os . Build ;      
class NewPropertyAction extends AnAction {     public boolean checkInput ( final String inputString ) {   return ! inputString . isEmpty ( ) ;   }       }  
public class StickyListHeadersListView extends FrameLayout {       public void onRestoreInstanceState ( Parcelable state ) {   super . onRestoreInstanceState ( BaseSavedState . EMPTY_STATE ) ;   mList . onRestoreInstanceState ( state ) ;   }     } 
public class MockitoConfiguration {     public void setReturnValues ( ReturnValues returnValues ) {     this . returnValues = returnValues ;   }     }  
public abstract class ATransformable3D {     public Quaternion getOrientation ( ) {   setOrientation ( ) ;   return new Quaternion ( mOrientation ) ;   }     }  
public class MappedRecordSet     { public Type getType ( int field )   { {   return delegate . getType ( toDelegateField ( field ) ) ;   }       } }  
public abstract class Animator implements Disposable {     public void suspend ( ) {   myStartTime = - 1 ;   stopTicker ( ) ;   }     }  
package liquibase . structure . core ;   import liquibase . structure . AbstractDatabaseObject ;   import liquibase . structure . DatabaseObject ;   import java . math . BigInteger ;      
public class AsmClassGenerator extends ClassGenerator {     public void visitBlockStatement ( BlockStatement block ) {   visitStatement ( block ) ;   int mark = controller . getOperandStack ( ) . getStackLength ( ) ;     } }  
public final class LineageMasterTest { public void test ( ) {   }                 }  
public class AndroidSdkImpl extends AndroidSdk {     public int getPlatformToolsRevision ( ) {     return 7 ;   }   private static class MyTargetWrapper implements IAndroidTarget {     } }  
public class TelephonyManager {         public static final boolean EMERGENCY_ASSISTANCE_ENABLED = true ;         }  
public final class EmbeddedNeo implements NeoService   { public EmbeddedNeo ( String storeDir )   { {   this . shellServer = null ;   NeoJvmInstance . start ( null , storeDir , true ) ;   }       } }  
public class DruidDataSource extends DruidAbstractDataSource   { public boolean isClosed ( ) { return this . closed ;   }   } 
public class MockitoTest extends TestBase {   public void shouldValidateMockWhenCreatingInOrderObject ( ) { {   Mockito . inOrder ( " notMock " ) ;   }         }     }  
public class K9 extends Application     { public static int DEFAULT_VISIBLE_LIMIT = 25 ;   public static int MAX_SEND_ATTEMPTS = 1 ;         }  
class InterceptedInvocation implements Invocation , VerificationAwareInvocation {     public int hashCode ( ) {     return 1 ;   }     }  
public final class EmailIntentSenderFactory implements ReportSenderFactory {       public ReportSender create ( Context context , ACRAConfiguration config ) { {   return new EmailIntentSender ( config ) ;   }   }     }  
public class JBScrollPane extends JScrollPane {   public void setUI ( ScrollPaneUI ui ) {   super . setUI ( ui ) ;   updateViewportBorder ( ) ;   setBorder ( IdeBorderFactory . createBorder ( ) ) ;   }       }  
class MockTaskManager implements TaskOperationProtocol {   public void recoverAll ( ChannelID sourceChannelID ) {   }     public void restart ( ExecutionVertexID executionVertexID ) {   }     }      
public final class PowerHandler { public void test ( ) {                     } }  
public class SSLCertificateSocketFactory extends SSLSocketFactory {     public String [ ] getDefaultCipherSuites ( ) {   return getDelegate ( ) . getDefaultCipherSuites ( ) ;   }       }  
public class CompileStack implements Opcodes { public void test ( ) {   superBlockNamedLabels . clear ( ) ;   currentBlockNamedLabels . clear ( ) ;   namedLoopBreakLabel . clear ( ) ;   namedLoopContinueLabel . clear ( ) ;   continueLabel = null ;   breakLabel = null ;   finallyLabel = null ;     } }  
import org . springframework . util . ReflectionUtils ;         class RuntimeTestWalker {   private static final Field residualTestField ;     }   
public class InternalAprOutputBuffer extends AbstractOutputBuffer < Long > {           protected synchronized boolean flushBuffer ( boolean block )   throws IOException {     } }  
public class PipeTransportItems extends PipeTransport { public void test ( ) {   item . setSpeed ( packet . getSpeed ( ) ) ;   item . toCenter = true ;   item . input = packet . getInputOrientation ( ) ;   item . output = packet . getOutputOrientation ( ) ;   item . color = packet . getColor ( ) ;     } }  
public class AutomaticRenamingDialog extends DialogWrapper { public void test ( ) { { {   for ( final int row : rows ) {   myShouldRename [ row ] = valueToBeSet ;   }   fireDataChanged ( ) ;   }   }   }     }  
public class CustomViewBehind extends ViewGroup {     public boolean menuOpenTouchAllowed ( View content , int currPage , float x ) {   switch ( mTouchMode ) {   case SlidingMenu . TOUCHMODE_FULLSCREEN :   return true ;     } } }  
import java . util . List ;         public final class ShortcutBadger {   private static final String LOG_TAG = ShortcutBadger . class . getSimpleName ( ) ;     } 
import javax . annotation . concurrent . ThreadSafe ;         public final class LineageFileSystem extends BaseFileSystem {   private LineageContext mLineageContext ;       }  
public class DeskShareStream implements NewScreenListener {   private String outStreamName ;   private IScope scope ;   public static final int LARGER_DIMENSION = 1280 ;       }  
public class SchemaResolver implements EntityResolver {           public InputSource resolveEntity ( String publicId , String systemId )   throws SAXException {     } }  
public class JavaSourceProcessor extends BaseSourceProcessor { public void test ( ) { {   }   }       String newContent = checkJavaFieldTypes (   fileName , packagePath , className , content ) ;     }  
public class JavaStackFrame extends XStackFrame {       public Object getEqualityObject ( ) { {   return myDescriptor . getMethod ( ) ;   }   }     }  
public class Geometry3D {     public void setBuffersCreated ( boolean created ) { {   mHaveCreatedBuffers = created ;   }   }     }  
import gnu . trove . map . hash . TLongObjectHashMap ;   public class GeoIntentActivity extends OsmandListActivity {   private ProgressDialog progressDlg ;   private LatLon location ;     }  
public class AprEndpoint extends AbstractEndpoint < Long > { public void test ( ) { {   }   removeFromPoller ( socket ) ;   destroySocket ( socket ) ;   closeList . remove ( socket ) ;   socket = timeouts . check ( date ) ;   }     }  
public final class MessageList < T > implements Iterable < T > {     public void remove ( ) { { {   throw new UnsupportedOperationException ( ) ;   }   }   }     }  
public class NetworkCatalogTree extends NetworkTree {     public String getName ( ) {   return Item . Title != null ? Item . Title . toString ( ) : " " ;   }       }  
public class PyNonAsciiCharInspection extends PyInspection {     public void visitPyStringLiteralExpression ( PyStringLiteralExpression node ) { {   checkString ( node , node . getText ( ) ) ;   }   }     }  
public abstract class DGLM { public void test ( ) {   _deviance = dev ;   _nullDeviance = nDev ;   _n = n ;   _aic = aic + 2 * rank ;   }     }  
public class Note extends Syncable {  }     
public class SSLHostConfigCertificate {     }   private enum StoreType {   KEYSTORE ,   PEM   }     
public class GracePeriodTest { public void test ( ) { {   sut . close ( ) ;   sut . join ( ) ;   }   DateTimeUtils . setCurrentMillisSystem ( ) ;   }       }  
public class PolygonSpriteBatch implements Batch {     public boolean isDrawing ( ) { {   return drawing ;   }   }     }  
public class XmlNamespace extends RubyObject { public void test ( ) {   this . href = href ;   this . prefixString = prefixString ;   this . hrefString = hrefString ;   setInstanceVariable ( " " , xmlDocument ) ;   }     }  
public class PGraphics extends PImage implements PConstants { public void test ( ) {   vertex [ X ] = x ;   vertex [ Y ] = y ;   vertex [ Z ] = 0 ;   vertex [ EDGE ] = edge ? 1 : 0 ;     } }  
public class AsmClassGenerator extends ClassGenerator {     public void visitBlockStatement ( BlockStatement block ) {   visitStatement ( block ) ;   int mark = controller . getOperandStack ( ) . getStackLength ( ) ;     } }  
public class TesterServletContext implements ServletContext {     public Object getAttribute ( String name ) {     return null ;   }       }  
public class PhotoManager {     public void cancelTask ( Object token ) {   if ( token != null ) {   backgroundHandler . removeCallbacksAndMessages ( token ) ;   }   }   public void acquireBitmap ( Bitmap b ) {     } }  
public class JSSESupport implements SSLSupport , SSLSessionManager {   private SSLSession session ;   public JSSESupport ( SSLSession session ) {   this . session = session ;   }     } 
public class Mockito extends Matchers {    public static VerificationAfterDelay after ( long millis ) {   return new After ( millis , VerificationModeFactory . times ( 1 ) ) ;   }      }     
import java . text . SimpleDateFormat ;   import java . util . Date ;   import java . util . Locale ;            
public class UpdateConfigurable extends BaseConfigurable {     public String getHelpTopic ( ) {   return " reference . versionControl . cvs . options " ;   }   public JComponent createComponent ( ) {     } }  
public final class EmbeddedNeo implements NeoService   { public EmbeddedNeo ( String storeDir )   { {   this . shellServer = null ;   NeoJvmInstance . start ( null , storeDir , true ) ;   }       } }  
public class ImmediateAuthenticationMechanismFactory implements AuthenticationMe     { public AuthenticationMechanism create ( String mechanismName , FormParserFactory formParserFactory , Map < String , String > properties ) { { {   return authenticationMechanism ;   }   }     } }  
public class Http11Processor extends AbstractHttp11Processor < Socket > { public void test ( ) {     error = false ;   keepAlive = true ;   comet = false ;   if ( maxKeepAliveRequests > 0 ) {   socketWrapper . decrementKeepAlive ( ) ;     } } }  
public class GoConfigurableProvider extends ConfigurableProvider {   public static class GoProjectSettingsConfigurable extends GoModuleAwareConfigurable {   } public GoProjectSettingsConfigurable ( Project project ) {   super ( project , " Project Settings " , null ) ;   }       }  
public abstract class AbstractFindUsagesDialog extends DialogWrapper { public void test ( ) {   myProject = project ;   myFindUsagesOptions = findUsagesOptions ;   myToShowInNewTab = toShowInNewTab ;   myIsShowInNewTabEnabled = ! mustOpenInNewTab ;   myIsShowInNewTabVisible = ! isSingleFile ;   mySearchForTextOccurencesAvailable = searchForTextOccurencesAvailable ;   mySearchInLibrariesAvailable = searchInLibrariesAvailable ;     } }  
public class JSONException extends RuntimeException {   public JSONException ( final String message , final Throwable cause ) {   super ( message , cause ) ;   }        }   
public class ExtensionStdMenus extends ExtensionAdaptor {   private void initialize ( ) {   this . setName ( NAME ) ;   this . setOrder ( 31 ) ;   }       }  
public class GwtGraphics implements Graphics {     public boolean isContinuousRendering ( ) {   return true ;   }       }  
public class StringUtils { {     return new String ( randBuffer ) ;   }     private StringUtils ( ) {     }   }      
public class HgVcs extends AbstractVcs < CommittedChangeList > {       public boolean fileListenerIsSynchronous ( ) {   return false ;   }       public CommittedChangesProvider getCommittedChangesProvider ( ) {   return commitedChangesProvider ;   }     }  
public abstract class SquidDatabase {           protected void setFastInsertEnabled ( boolean enabled ) {   fastInsertEnabled = enabled ;   }     }  
public class Tmp { public interface JsonProvider {   Object createMap ( ) ;   Object createArray ( ) ;   Object clone ( Object model ) ;     } }  
public class CordovaWebViewImpl implements CordovaWebView { public void test ( ){ 	{ 		return true ; 	} 	LOG . w ( TAG , " Blocked navigation because URL was not whitelisted : " + url ) ; 	return true ; } } 
package org . mongodb . impl ;   import org . mongodb . MongoClientOptions ;   import org . mongodb . MongoClientURI ;   import org . mongodb . ServerAddress ;      
public class WifiConfiguration implements Parcelable {     public static final String hiddenSSIDVarName = " scan_ssid " ;     public class EnterpriseField {   private String varName ;   private String value ;     } }  
public class BootstrapThumbnail extends FrameLayout   { public void setImage ( int drawable )   { {   this . placeholder . setBackgroundResource ( drawable ) ;   invalidate ( ) ;   requestLayout ( ) ;   }       } }  
public final class AsyncHttpClientConfigDefaults {public static boolean defaultAcceptAnyCertificate ( ) { { return getBoolean ( ASYNC_CLIENT + " acceptAnyCertificate " , false ) ; } 	}  } 
public class NotificationBuilder extends NotificationCompat . Builder {     public NotificationCompat . Builder setNumber ( int number ) {   super . setNumber ( number ) ;   mNumber = number ;   return this ;   }     }  
public class PortletDisplay implements Serializable { public void test ( ) {   _namespace = StringPool . BLANK ;   _portletName = StringPool . BLANK ;   _portletSetup = null ;   _resourcePK = StringPool . BLANK ;   _restoreCurrentView = false ;   _rootPortletId = StringPool . BLANK ;     } }  
public class NotificationUsageStats {   private final SQLiteLog mSQLiteLog ;   private final Context mContext ;   private final Handler mHandler ;   private long mLastEmitTime ;   public NotificationUsageStats ( Context context ) {     } }  
public class HttpRequestTest extends ServerTestCase { public void test ( ) { {   int code = get ( url ) . code ( ) ;   assertEquals ( 200 , code ) ;   }   }     }  
public class VerificationModeImpl implements VerificationMode {   enum Verification { EXPLICIT , NO_MORE_WANTED ;   private final Integer wantedInvocationCount ;     private final Integer minInvocationCount ;   private final List < ? extends Object > mocksToBeVerifiedInOrder ;   private final Verification verification ;     } }  
public class ImageWallpaper extends WallpaperService {   private static final boolean DEBUG = false ;   static final boolean FIXED_SIZED_SURFACE = true ;   static final boolean USE_OPENGL = true ;   WallpaperManager mWallpaperManager ;     }  
public final class Gmail { public void test ( ) {   if ( unreadConversations == null ) {   return 0 ;   } else {   return unreadConversations < 0 ? 0 : unreadConversations ;   }   }     }  
public class SQLDemoActivity extends Activity {   private void addEvent ( String title ) {   SQLiteDatabase db = eventsData . getWritableDatabase ( ) ;       ContentValues values = new ContentValues ( ) ;   values . put ( EventDataSQLHelper . TIME , System . currentTimeMillis ( ) ) ;   values . put ( EventDataSQLHelper . TITLE , title ) ;     } }  
public class BuildCraftSilicon extends BuildCraftMod { public void test ( ) {   BuildCraftCore . mainConfiguration . save ( ) ;   laserBlock = new BlockLaser ( ) ;   laserBlock . setBlockName ( " laserBlock " ) ;   CoreProxy . proxy . registerBlock ( laserBlock ) ;   assemblyTableBlock = new BlockLaserTable ( ) ;     } }  
public class KeyguardManager {     public boolean isKeyguardLocked ( ) {   try {   return mWM . isKeyguardLocked ( ) ;   } catch ( RemoteException ex ) {   return false ;   }     } }  
public class AsyncHttpClientConfig { public void test ( ) {   strict302Handling = prototype . isStrict302Handling ( ) ;   useRelativeURIsWithSSLProxies = prototype . isUseRelativeURIsWithSSLProxies ( ) ;   timeConverter = prototype . getTimeConverter ( ) ;   acceptAnyCertificate = prototype . isAcceptAnyCertificate ( ) ;   }       }  
final public class H2O { public void test ( ) {     new HeartBeatThread ( ) . start ( ) ;   if ( GA != null )   startGAStartupReport ( ) ;   }       }  
public final class Cache {   public static synchronized void clear ( ) {   sEntities . evictAll ( ) ;   Log . v ( " Cache cleared . " ) ;   }     }  
public final class FileSystemWorker extends AbstractWorker {       public void stop ( ) {   mSessionCleaner . stop ( ) ;   if ( mFilePersistenceService != null ) {   mFilePersistenceService . cancel ( true ) ;   }     } }  
public abstract class AbstractPythonRunConfiguration extends ModuleBasedConfigur   { public AbstractPythonRunConfiguration ( final String name , final RunConfigurationModule module , final ConfigurationFactory factory ) {   super ( name , module , factory ) ;   module . init ( ) ;   }   public List < Module > getValidModules ( ) {     } }  
public class BookCollection extends AbstractBookCollection { public void test ( ) {   final Book book = getBookByFile ( file ) ;   if ( book != null ) {   saveBook ( book ) ;   getHash ( book ) ;   }   }     }  
public class SpringCli {     public String getUsageHelp ( ) {   return " command " ;   }       }  
public class Animation3D {   long timeInPause ;   boolean wasPaused = false ;    public void run ( ) {   if ( mIsPaused ) {   if ( ! wasPaused ) timeInPause = SystemClock . uptimeMillis ( ) ;   wasPaused = true ;     } } } 
public final class PreconditionMessage {   public static final String ERR_PUT_NULL_KEY = " Cannot put a null key " ;   public static final String ERR_PUT_NULL_VALUE = " Cannot put a null value " ;   private PreconditionMessage ( ) { }   }      
public class BitmapUtils implements BitmapGlobalConfigChangeCallBack {     public void stopTasks ( ) {   mPause = true ;   synchronized ( mPauseWorkLock ) {   mPauseWorkLock . notifyAll ( ) ;   }     } }  
public class LocalActivityManager { public void test ( ) {   if ( r != null ) {   win = performDestroy ( r , finish ) ;   if ( finish ) {   mActivities . remove ( id ) ;   }   }   return win ;     } }  
public class CommandLineArguments {     public boolean isLocal ( ) {   return local ;   }   public void setDebug ( boolean debug ) {     } }  
public class DefaultProjectProfileManager extends ProjectProfileManager {     public Map < String , Profile > getProfiles ( ) {   getProjectProfileImpl ( ) ;   return myProfiles ;   }     }  
public class LayoutLocalServiceImpl extends LayoutLocalServiceBaseImpl { public void test ( ) {                 } }  
public class DragSortListView extends ListView { public void test ( ) { { {   divider . setBounds ( l , t , r , b ) ;   divider . draw ( canvas ) ;   }   }   }     }  
public class SyncStorageEngine extends Handler { public void test ( ) { { {   syncs = new ArrayList < SyncInfo > ( ) ;   mCurrentSyncs . put ( userId , syncs ) ;   }   return syncs ;   }   }     }  
import java . util . List ;   import java . util . concurrent . ConcurrentHashMap ;   import java . util . concurrent . ConcurrentMap ;   import org . bson . io . PoolOutputBuffer ;        
public class PortletDataContextImpl implements PortletDataContext { public void test ( ) {   _userIdStrategy = null ;   _startDate = startDate ;   _endDate = endDate ;   _zipReader = null ;   _zipWriter = zipWriter ;     } }  
public class RecyclerView extends ViewGroup { public void test ( ) {   if ( mEatRunOnAnimationRequest ) {   mReSchedulePostAnimationCallback = true ;   } else {   removeCallbacks ( this ) ;   ViewCompat . postOnAnimation ( RecyclerView . this , this ) ;   }   }     }  
public class Runtime {   public World getWorld ( ) {   return world ;   }   }      
public class BlockedNumberContract {     public final long untilTimestampMillis ;    public BlockSuppressalStatus ( boolean isSuppressed , long untilTimestampMillis ) {   this . isSuppressed = isSuppressed ;   this . untilTimestampMillis = untilTimestampMillis ;   }     }
import org . jetbrains . annotations . Nullable ;             public class PyResolveUtil {   private PyResolveUtil ( ) {     } }  
public class ClientBootstrap extends Bootstrap { public void test ( ) { { {   }   } while ( future == null ) ;   return future ;   }     }  
public class FocusWatcher implements ContainerListener , FocusListener { public void test ( ) {   if ( getFocusedComponent ( ) == component ) {   setFocusedComponentImpl ( null , cause ) ;   }   myTopComponent = null ;   }       }  
public class FileChecker extends BaseChecker { public void test ( ) {     if ( _rootDir != null ) {   paths . add ( _rootDir ) ;   paths . add ( _rootDir + " - " ) ;   }     } }  
public final class OperatorZipIterable < T1 , T2 , R > implements Operator < R , T1 > {     public void onError ( Throwable e ) {   if ( done ) {   Exceptions . throwIfFatal ( e ) ;   return ;   }   done = true ;     } }  
public abstract class PullToRefreshBase < T extends View > extends LinearLayout {       public void setLongClickable ( boolean longClickable ) { {   getRefreshableView ( ) . setLongClickable ( longClickable ) ;   }   }     }  
class SnackContainer extends FrameLayout {   public void clearSnacks ( boolean animate ) {   mSnacks . clear ( ) ;   removeCallbacks ( mHideRunnable ) ;   if ( animate ) mHideRunnable . run ( ) ;   }     }  
public class TypedTableDefinition { public void test ( ) {   java . util . Date dateCol ;   double doubleCol ;   int intCol ;   float floatCol ;   String stringCol ;   byte [ ] byteCol ;     } }  
public class StaticLayout extends Layout { public void test ( ) { { {   }   if ( mLineCount >= mMaximumVisibleLineCount ) {   return ;   }   }   }     }  
public class MediaRouteButton extends View { public void test ( ) { { { { {   }   }   }   }   }     }  
public class GitCheckinEnvironment implements CheckinEnvironment {     public boolean isRefreshAfterCommitNeeded ( ) {   return true ;   }       }  
public class SearchView extends LinearLayout implements CollapsibleActionView {       protected void onDetachedFromWindow ( ) {   removeCallbacks ( mUpdateDrawableStateRunnable ) ;   super . onDetachedFromWindow ( ) ;   }     }  
import org . geometerplus . zlibrary . core . util . ZLNetworkUtil ;   import org . geometerplus . fbreader . network . atom . ATOMLink ;   class CatalogInfoReader implements OPDSFeedReader {   public boolean FeedStarted ;   public String Icon ;   public String Title ;     }  
public class SweetAlertDialog extends Dialog implements View . OnClickListener {     protected void onStart ( ) {   getWindow ( ) . getDecorView ( ) . getBackground ( ) . setAlpha ( 255 ) ;   mDialogView . startAnimation ( mModalInAnim ) ;   playAnimation ( ) ;   }     }  
public class XMLChangeLogSAXParser implements ChangeLogParser {     public static String getSchemaVersion ( ) {   return " 3 . 2 " ;   }       }  
import com . googlecode . totallylazy . Option ;   import com . googlecode . totallylazy . annotations . multimethod ;   import com . googlecode . totallylazy . functions . Reducer ;   import javarepl . expressions . * ;   import javarepl . expressions . Type ;   import javarepl . expressions . Value ;   import javax . tools . DiagnosticCollector ;      
class LogbackModule extends Module {     public String getModuleName ( ) {   return " LogbackModule " ;   }       }  
public class IntIntMap { public void test ( ) {   if ( index < lastIndex ) {   keyTable [ index ] = keyTable [ lastIndex ] ;   valueTable [ index ] = valueTable [ lastIndex ] ;   }   }     }  
public class PlayerProfile { public void test ( ) {                 } }  
public class ForegroundLinearLayout extends LinearLayoutCompat {   boolean mForegroundBoundsChanged = false ;   public ForegroundLinearLayout ( Context context ) {   this ( context , null ) ;   }   public ForegroundLinearLayout ( Context context , AttributeSet attrs ) {     } }  
public class LowLevelSearchUtil { public void test ( ) { { {   }   }   if ( ! processor . execute ( run , start ) ) {   return false ;   }   }     }  
abstract class Node implements TagConstants { public void test ( ) {   this . el = null ;   this . dynamic = dyn ;   this . namedAttribute = true ;   this . tai = tai ;   }       }  
import java . util . concurrent . TimeUnit ;   public final class DefaultStepRunner implements StepRunner , Closeable {   private static final long SHUTDOWN_TIMEOUT_SECONDS = 15 ;   private final ExecutionContext context ;   private final ListeningExecutorService listeningExecutorService ;     }  
public class SecureNio2Channel extends Nio2Channel { public void test ( ) {   handshakeComplete = false ;   closed = false ;   closing = false ;   netInBuffer . clear ( ) ;   }       }  
public class BlobStoreAPIWordCountTopology {     public static class FilterWords extends BaseBasicBolt {   String fileName = " blacklist . txt " ;     } public void execute ( Tuple tuple , BasicOutputCollector collector ) {     } }  
public class Log { public void test ( ) {     Handler jdkLogHandler = new JiveLogHandler ( ) ;   jdkLogHandler . setLevel ( Level . ALL ) ;   java . util . logging . Logger . getLogger ( " " ) . addHandler ( jdkLogHandler ) ;   }     }  
abstract class AbstractDelayedEntry < K > {   private final long storeTime ;     private final int partitionId ;   protected AbstractDelayedEntry ( K key , long storeTime , int partitionId ) {     } }  
public class Cache {   public void clear ( ) {   resourceCache . clear ( ) ;   size . set ( 0 ) ;   }   public long getSize ( ) {     } }  
public abstract class BaseTest {     public static void afterClass ( ) throws IOException , InterruptedException {   if ( ! RedissonRuntimeEnvironment . isTravis ) {   RedisRunner . shutDownDefaultRedisServerInstance ( ) ;   defaultRedisson . shutdown ( ) ;   }   }     }  
public class PhoneStateListener {               public void onSignalStrengthChanged ( int asu ) {       } }  
public class PythonLibraryDescription implements Description < Arg > {   public static class Arg implements ConstructorArg {   } public ImmutableSortedSet < SourcePath > srcs ;   public Optional < ImmutableSortedSet < BuildRule > > deps ;   public Optional < ImmutableSortedSet < SourcePath > > resources ;   }        
public class GradientDrawable extends Drawable {       public ColorFilter getColorFilter ( ) {   return mColorFilter ;   }       public void setColorFilter ( ColorFilter cf ) {   if ( cf != mColorFilter ) {   mColorFilter = cf ;     } } }  
class NioDatagramChannel extends AbstractChannel     { public boolean isConnected ( ) { {   return datagramChannel . isConnected ( ) ;   }       } }  
public class PostfixTemplatesConfigurable implements SearchableConfigurable , Edi       { public String getHelpTopic ( ) { {   return getId ( ) ;   }       } }  
public final class ACRAConstants {   public static final boolean DEFAULT_REPORT_TO_ANDROID_FRAMEWORK = false ;   public static final int DEFAULT_SOCKET_TIMEOUT = 20000 ;   public static final int DEFAULT_CONNECTION_TIMEOUT = 5000 ;     }  
public class ZipSplitter {   public static enum DexSplitStrategy {   MAXIMIZE_PRIMARY_DEX_SIZE ,   MINIMIZE_PRIMARY_DEX_SIZE ,   ;   }   private final Set < File > inFiles ;     }  
public final class Terasology {     public long getTimeInMs ( ) {   if ( _timer == null ) {   initTimer ( ) ;   }   return _timer . getTimeInMs ( ) ;   }     }  
public class ProgressBar extends View { public void test ( ) { {   if ( mProgress > max ) {   mProgress = max ;   refreshProgress ( R . id . progress , mProgress , false ) ;   }   }   }     }  
public class StorageDumper { public void test ( ) {   final PrintStream p = new PrintStream ( outputPath ) ;   mappings . toStream ( p ) ;   mappings . close ( ) ;   p . close ( ) ;   }     }  
package org . apache . tomcat ;   import java . io . InputStream ;   import java . util . Properties ;         public class Apr {   private static String aprInfo = null ;     }  
package rajawali . wallpaper ;   import javax . microedition . khronos . egl . EGL10 ;   import javax . microedition . khronos . egl . EGLConfig ;   import javax . microedition . khronos . egl . EGLDisplay ;   import rajawali . renderer . RajawaliRenderer ;      
public class ShadowBitmap {     public Matrix getCreatedFromMatrix ( ) {   return createdFromMatrix ;   }   }  
public class LayoutExporter { public void test ( ) {   portletDataContext . setMissingReferencesElement (   missingReferencesElement ) ;     portletDataContext . addDeletionSystemEventStagedModelTypes (   new StagedModelType ( Layout . class ) ) ;     } }  
public class AccelListener extends Plugin implements SensorEventListener { public void test ( ) {   if ( this . status == AccelListener . STOPPED ) {   return ;   }   this . accuracy = accuracy ;   }     }  
public class AsyncTaskTest {   public void setUp ( ) throws Exception {   transcript = new Transcript ( ) ;   Robolectric . logMissingInvokedShadowMethods ( ) ;   }       }  
public abstract class SocketWrapperBase < E > {     public boolean isReadyForWrite ( ) {     return ! hasDataToWrite ( ) ;   }     }  
public class ExtensionFunctionsTest extends CodegenTestCase {     public void testKt475 ( ) throws Exception { {     }   }     }  
import voldemort . utils . Utils ;     public class ClientConfig {   private volatile int maxConnectionsPerNode = 10 ;   private volatile int maxTotalConnections = 500 ;   private volatile int maxThreads = 5 ;   private volatile int maxQueuedRequests = 50 ;     }  
public class Tmp { public interface PsiElement extends UserDataHolder , Iconable {         PsiFile getContainingFile ( ) ;         } }  
public class GitPushRebaseProcess extends GitBaseRebaseProcess {   protected void cleanupHandler ( VirtualFile root , GitLineHandler h ) {   if ( myRebaseEditorNo != null ) {   myRebaseEditorService . unregisterHandler ( myRebaseEditorNo ) ;   myRebaseEditorNo = null ;   }   }     }  
class XMLSerializer extends AbstractSerializer { public void test ( ) { {   myBook . addUidWithNoCheck ( uid ) ;   }   myBook . setSeriesInfoWithNoCheck ( string ( mySeriesTitle ) , string ( mySeriesIndex ) ) ;   myBook . setProgressWithNoCheck ( myProgress ) ;   myBook . HasBookmark = myHasBookmark ;   }     }  
public final class CursorToBulkCursorAdaptor extends BulkCursorNative   { public void close ( ) {   maybeUnregisterObserverProxy ( ) ;   mCursor . close ( ) ;   }   public int requery ( IContentObserver observer , CursorWindow window ) {     } }  
public class ViewPager extends ViewGroup { public void test ( ) { { {   }   completeScroll ( false ) ;   scrollTo ( destX , 0 ) ;   pageScrolled ( destX ) ;   }   }     }  
public class CompletionPanel {   private String subWord ;           private int insertionPosition ;     }  
public abstract class Config {     public static final List < String > LIB_FILES_WITH_CODE = Arrays . asList (   " / stdlib / TuplesCode . kt " ,   " / core / javautilCode . kt "   ) ;     }  
public class Recurrence implements Serializable { public void test ( ) { {   1 ;   return ( - position == negativeCandidatePosition ) ;   }   }       }  
public class PropertyAttributeParserTest   { public void test ( ) {   try   {   parseAsStaticResourceAttribute ( illegalStaticResourceAttributeValue . value ) ;   fail ( " Expect an exception thrown " ) ;   } catch ( MalformedAttributeException e )   {     } } }  
public class FakeAlertDialog extends FakeDialog {   private AlertDialog realDialog ;   private boolean isMultiItem ;   private DialogInterface . OnMultiChoiceClickListener multiChoiceClickListener ;   public boolean [ ] checkedItems ;   public FakeAlertDialog ( AlertDialog dialog ) {   super ( dialog ) ;     } }  
public class CompilerTest extends GroovyTestCase { public void test ( ) {   dir . mkdirs ( ) ;   CompilerConfiguration config = new CompilerConfiguration ( ) ;   config . setTargetDirectory ( dir ) ;   config . setDebug ( dumpClass ) ;   compiler = new Compiler ( config ) ;     } }  
public class PGraphicsOpenGL extends PGraphics {   public void lights ( ) {   enableLighting ( ) ;     lightCount = 0 ;       int colorModeSaved = colorMode ;   colorMode = RGB ;     } }  
public class GpsLocationProvider implements LocationProviderInterface {   private GpsStatusListenerHelper mListenerHelper = new GpsStatusListenerHelper ( ) {     protected boolean isSupported ( ) {   return GpsLocationProvider . isSupported ( ) ;   }   } ;     }  
public class BookmarkItem implements ItemWrapper {     public void execute ( Project project , JBPopup popup ) {   popup . cancel ( ) ;   myBookmark . navigate ( ) ;   }     }  
public class SSTableReader extends SSTable implements Comparable < SSTableReader >   { public void test ( ) { {   throw new IOError ( e ) ;   }   components . add ( Component . COMPACTED_MARKER ) ;   phantomReference . deleteOnCleanup ( ) ;   }     }  
public class ByteBufferBackedInputStream extends InputStream { public void test ( ) {   if ( ! buffer . hasRemaining ( ) )   return - 1 ;   return buffer . get ( ) & 0xff ;   }       }  
public class SelectWordUtil { public void test ( ) { {   }   if ( firstChild == null ) break ;   element = firstChild ;   }     }  
public class AbsSpinnerTest {     public void setUp ( ) throws Exception {   TestUtil . addAllProxies ( ) ;   adapterView = new Gallery ( new Activity ( ) ) ;   }     }  
public abstract class TestBase     { public void tearDown ( ) { { {   dropDB ( ) ;   mongo . close ( ) ;   }   }     } }  
public class JavaRegExpHost implements RegExpLanguageHost {     public boolean supportsPossessiveQuantifiers ( ) {   return true ;   }       }  
import java . util . Vector ;     public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {   private static final int MIN_DIMENSION_TO_RECUR = 100 ;   private final Reader delegate ;     }  
import android . database . Cursor ;   import android . database . MatrixCursor ;   import android . net . Uri ;   import android . os . Binder ;   import android . text . TextUtils ;   import android . util . Log ;      
public class SortedQueryResultSet extends AbstractSet < Map . Entry > {     }   private static class EmptyIterator implements Iterator {     public boolean hasNext ( ) {     } } 
public abstract class HardwareRenderer { public void test ( ) { {   if ( ! createSurface ( holder ) ) {   return ;   }   if ( mCanvas != null ) {   setEnabled ( true ) ;   }   }   }     }  
public final class Constants {         public static final boolean DEBUG = false ;       }  
public class PropertiesComponent extends DefaultComponent {     public PropertiesComponent ( boolean isDefaultCreated ) {   this ( ) ;   this . isDefaultCreated = isDefaultCreated ;   }     }  
import hex . rf . RFModel ;   import java . util . Arrays ;   import water . * ;   import com . google . gson . JsonArray ;   import com . google . gson . JsonPrimitive ;      
public abstract class BaseAsyncDestination extends BaseDestination {     public void close ( boolean force ) {   PortalExecutorManagerUtil . shutdown ( getName ( ) , force ) ;   }   public DestinationStatistics getDestinationStatistics ( ) {     } }  
public class Tmp { public interface Rule {   boolean template ( ) ;     RuleKey templateKey ( ) ;       } }  
public abstract class CommonJobs   { public void test ( ) {   tx = db . beginTx ( ) ;   Node node = db . createNode ( ) ;   return null ;   }     }  
public abstract class RequestBuilderBase < T extends RequestBuilderBase < T > > { public void test ( ) {   request . byteData = null ;   request . stringData = null ;   request . streamData = null ;   request . bodyGenerator = null ;   request . length = - 1 ;   }     }  
public class BeaconManager {     protected BeaconManager ( Context context ) {   mContext = context . getApplicationContext ( ) ;   if ( ! sManifestCheckingDisabled ) {   verifyServiceDeclaration ( ) ;   }     } }  
public class RequestBuilders extends RequestQueries {   protected final JsonObject _response ;   protected final Request _req ;   protected boolean _strictJsonCompliance = true ;         }  
public class ViewFlow extends AdapterView < Adapter > {     public void onGlobalLayout ( ) { {   getViewTreeObserver ( ) . removeGlobalOnLayoutListener ( orientationChangeListener ) ;   setSelection ( mCurrentAdapterIndex ) ;   }   } ;     }  
public class PSurfaceAWT extends PSurfaceNone { public void test ( ) {     Component canvas ;     int sketchWidth ;   int sketchHeight ;     } }  
public final class CameraManager {               public static abstract class AvailabilityCallback {     } }  
public class LocationManager { public void test ( ) {   }                 }  
public class EdgeDataImpl implements EdgeData , DynamicData {     public float getRadius ( ) {   return 0 ;   }   public float getSize ( ) {     } }  
public class SetHeaderHandler implements HttpHandler {     } public static class Builder implements HandlerBuilder {      public String name ( ) {   return " header " ;     }} 
public class PsiTypeElementImpl extends CompositePsiElement implements PsiTypeEl     { public PsiAnnotation addAnnotation ( String qualifiedName ) { { {   throw new UnsupportedOperationException ( ) ;   }   }     } }  
public class GetFileContentOperation extends LocalPathIndifferentOperation {     public boolean fileNotFound ( ) {   tryGetFileBytes ( ) ;   return myState == FILE_NOT_FOUND ;   }     }  
import static org . junit . Assert . fail ;   import com . google . common . collect . Sets ;   import java . util . Set ;   import org . junit . Test ;     public class ClassResolverTest   {       }  
import javaslang . Tuples . Tuple2 ;           public final class Strings { public void test ( ) {       } }  
public class BytesInputStream extends InputStream {   public void reset ( ) {   pos = mark ;   }     public int getCount ( ) {   return count ;   }   }      
public class ReplicatedMapTest extends ReplicatedMapAbstractTest { public void test ( ) { { {   return o1 == o2 ? 0 : o1 > o2 ? - 1 : 1 ;   }   }   }     }  
public class CodeItem extends Item < CodeItem > { public void test ( ) {   return ;   }   final SparseIntArray originalOffsetsByNewOffset = new SparseIntArray ( ) ;   final SparseIntArray newOffsetsByOriginalOffset = new SparseIntArray ( ) ;     }  
public class GroovyTemplatesProvider implements DefaultLiveTemplatesProvider {     public String [ ] getHiddenLiveTemplateFiles ( ) { {   return null ;   }   }     }  
public class TileAutoWorkbench extends TileEntity implements ISpecialInventory {     public IRecipe getCurrentRecipe ( ) {     return currentRecipe ;   }       public int getSizeInventory ( ) {     } }  
public class ColorPicker extends View { public void test ( ) { {   invalidate ( ) ;   break ;   }   getParent ( ) . requestDisallowInterceptTouchEvent ( true ) ;   return true ;   }     }  
public class SpriteBatch implements Batch {   public boolean isBlendingEnabled ( ) {   return ! blendingDisabled ;   }     public boolean isDrawing ( ) {   return drawing ;   }   }      
public class FieldLookup { public void test ( ) {   value = null ;   valueLoaded = false ;   values . clear ( ) ;   doc = null ;   }     }  
public abstract class AbstractFailureDetector implements FailureDetector { public void test ( ) {   NodeStatus nodeStatus = getNodeStatus ( node ) ;   synchronized ( nodeStatus ) {   while ( ! isAvailable ( node ) )   nodeStatus . wait ( ) ;   }   }     }  
public abstract class SessionPage extends WebPage { public void test ( ) { { { {   }   }   session . setUser ( user ) ;   session . continueRequest ( ) ;   return ;   }   }     }  
public final class Cache {         public static boolean isInitialized ( ) {   return sIsInitialized ;   }   public static synchronized SQLiteDatabase openDatabase ( ) {   return sDatabaseHelper . getWritableDatabase ( ) ;     } }  
public final class LocalTachyonCluster { public void test ( ) {   if ( mUfsCluster != null ) {   mUfsCluster . cleanup ( ) ;   }     System . clearProperty ( " tachyon . underfs . address " ) ;   }     }  
public class ShadowView {       public View . OnFocusChangeListener getOnFocusChangeListener ( ) {   return onFocusChangeListener ;   }       public void invalidate ( ) {   wasInvalidated = true ;   }     }  
public final class MediaBrowserCompat {         static class SubscriptionCallbackApi21 extends SubscriptionCallback {   SubscriptionCallback mSubscriptionCallback ;   private final Object mSubscriptionCallbackObj ;   private Bundle mOptions ;     } } 
package buildcraft . api . recipes ;   import java . util . LinkedList ;     import buildcraft . core . inventory . StackHelper ;   import net . minecraft . item . ItemStack ;   public class AssemblyRecipe {     }  
public class DeepLearningGradientCheck extends TestUtil {   public static void stall ( ) { stall_till_cloudsize ( 1 ) ; }       public void cancar ( ) {   Frame tfr = null ;   DeepLearningModel dl = null ;     } }  
public class ManagedServlet implements Lifecycle {     public void release ( ) { { {   instance . destroy ( ) ;   }   } ;   }     }  
public class CompileStack implements Opcodes { public void test ( ) {   superBlockNamedLabels . clear ( ) ;   currentBlockNamedLabels . clear ( ) ;   namedLoopBreakLabel . clear ( ) ;   namedLoopContinueLabel . clear ( ) ;   continueLabel = null ;   breakLabel = null ;   finallyLabel = null ;     } }  
public class Tmp { public interface ServletContext {   } public ServletContext getContext ( String uripath ) ;     public String getContextPath ( ) ;           }  
public final class DataIO {           public static final class HeartbeatFileLock {       } }  
package com . pokegoapi . util ;     public class Constant {   public static final int APP_VERSION = 3500 ;     public static final long UNK25 = 7363665268261373700L ;   }      
public class OracleStandardTest extends AbstractHibernateTest {     public void JoinEmbeddable ( ) { {     }   }     }  
package tachyon . master . block ;   public class BlockId {   private static final int CONTAINER_ID_BITS = 40 ;     }  
public class NearCacheContext {   private NearCacheManager nearCacheManager ;   private SerializationService serializationService ;   private NearCacheExecutor nearCacheExecutor ;   public NearCacheContext ( ) {     } }  
public class PGraphicsOpenGL2 extends PGraphics { public void test ( ) {   if ( raw != null ) {     }     vertexCount = 0 ;   triangleCount = 0 ;   }     }  
public class TestTextureArrayCompressed extends SimpleApplication     { public static void main ( String [ ] args )   { {   TestTextureArrayCompressed app = new TestTextureArrayCompressed ( ) ;   app . start ( ) ;   }     } }  
class DayView extends CheckedTextView {     public void setSelectionDrawable ( Drawable selectionDrawable ) {   this . selectionDrawable = selectionDrawable ;   regenerateBackground ( ) ;   }       }  
public final class Settings {       public static final String VENDING_PENDING_DOWNLOAD_RESEND_FREQUENCY_MS =   " vending_pd_resend_frequency_ms " ;         }  
public class Event < T > {     private int id ;     private Type type ;   private long timestamp ;   private T payload ;     }  
public class EditGroupAction extends PortletAction { public void test ( ) {   String friendlyURL = null ;   boolean active = false ;   boolean manualMembership = true ;     int membershipRestriction =   GroupConstants . DEFAULT_MEMBERSHIP_RESTRICTION ;     } }  
public class VcsManagerConfigurable extends SearchableConfigurable . Parent . Abstra     { public String getHelpTopic ( ) { { { {   return " project . propVCSSupport . VCSs " ;   }   } ;   }     } }  
package de . danoeh . antennapod ;   public final class AppConfig {   public final static boolean DEBUG = false ;   }      
public class CustomizationConfigurable extends BaseConfigurable implements Appli     { public String getHelpTopic ( ) { {   return " preferences . customizations " ;   }     } }  
public class PlaygroundTest extends TestBase { public void test ( ) {             }     }  
public class SeekableViewsForTest { public void test ( ) {   if ( is_integer ) {   current_data . reset ( generateTimestamp ( ) , current ) ;   } else {   current_data . reset ( generateTimestamp ( ) , ( double ) current ) ;   }   }     }  
public class FileInStreamIntegrationTest {                 public void seekExceptionTest1 ( ) throws IOException , TachyonException {     } }  
public class AsmClassGenerator extends ClassGenerator { public void test ( ) {   Variable variable = compileStack . getVariable ( variableName , false ) ;   if ( variable == null ) {   processClassVariable ( variableName ) ;   } else {     } } }  
public class RecipientListExchangePropertyTest extends ContextTestSupport {     private static final class MyStuff {   private String name ;     } } 
public class PhoneWindowManager implements WindowManagerPolicy { public void test ( ) { {   intent = mHomeIntent ;   }   startActivityAsUser ( intent , UserHandle . CURRENT ) ;   }       }  
public abstract class SshCommand extends BaseCommand { {     }   protected abstract void run ( ) throws Failure , Exception ;   }      
public class OperationsFacade     { public void unregisterExecutingQuery ( ExecutingQuery executingQuery )   { {   queryRegistrationOperations ( ) . unregisterExecutingQuery ( statement , executingQuery ) ;   }     } }  
package tachyon . command ;   import java . net . InetSocketAddress ;   import tachyon . Constants ;   import tachyon . thrift . InvalidPathException ;        
public class DefaultDBCallback extends BasicBSONCallback implements DBCallback { public void test ( ) {   }   DBObject dbget ( ) {   return ( DBObject ) get ( ) ;   }       }  
public class GoogleJavaScriptMinifier implements JavaScriptMinifier { public void test ( ) {   setCompileOptions ( compilerOptions ) ;   compiler . disableThreads ( ) ;     compiler . compile (   SourceFile . fromCode ( " extern " , StringPool . BLANK ) , sourceFile ,   compilerOptions ) ;     } }  
public abstract class Connection extends Conferenceable {       public final AudioState getAudioState ( ) {   if ( mCallAudioState == null ) {   return null ;   }   return new AudioState ( mCallAudioState ) ;   }     }  
public class HealthMonitor extends Thread {     }   private static final class GcMetrics {   final long minorCount ;   final long minorTime ;   final long majorCount ;     } 
public class FolderList extends K9ListActivity implements OnNavigationListener { public void test ( ) { {   return ;   }   mUnreadMessageCount = stats . unreadMessageCount ;   mHandler . refreshTitle ( ) ;   }       }  
public class RowDataResolver extends AbstractRowResolver   { public Row getData ( )   { {   assert ! replies . isEmpty ( ) ;   return replies . peek ( ) . payload . row ( ) ;   }     } }  
public class TransportNetworkCache { public void test ( ) { { {   cacheLocation . delete ( ) ;   }   return network ;   }   }     }  
public class JavaTestDocsGenerator extends AsciiDocGenerator   { public JavaTestDocsGenerator ( String title )   { {   super ( title , " docs " ) ;   }       } }  
package android . renderscript ;           public class FieldPacker {   public FieldPacker ( int len ) {   mPos = 0 ;     } }  
public class BadgeActivity extends AppCompatActivity { public void test ( ) { {   BottomBarTab nearby = bottomBar . getTabWithId ( R . id . tab_nearby ) ;   nearby . setBadgeCount ( 5 ) ;   }   }     }  
package tachyon ;     public class Version {     public static final String VERSION = " 0 . 2 . 1 - SNAPSHOT " ;   }      
public class Exif { public void test ( ) { { {   }   }     return 0 ;   }     }  
public class RedirectConfig {           public RedirectConfig and ( ) {   return this ;     } }  
public class ExternalJavacIntegrationTest {     public void whenBuckdUsesExternalJavacThenClientEnvironmentUsed ( ) throws IOException {   assumeTrue ( Platform . detect ( ) != Platform . LINUX ) ;   final ProjectWorkspace workspace = TestDataHelper . createProjectWorkspaceForScenario (   this , " external_javac " , tmp ) ;   workspace . setUp ( ) ;     } }  
public class TitanFactory {   private Builder ( ) {   super ( GraphDatabaseConfiguration . buildConfiguration ( ) ) ;   ReflectiveConfigOptionLoader . loadOnce ( ) ;   }       }  
public class MapConfig implements DataSerializable {   private MapStoreConfig mapStoreConfig = null ;   private NearCacheConfig nearCacheConfig = new NearCacheConfig ( ) ;   private boolean readBackupData = false ;     }  
import org . json . JSONArray ;   import org . json . JSONException ;   import android . app . Activity ;   import android . content . ContentValues ;   import android . content . Intent ;   import android . database . Cursor ;      
public class RareLogger extends Logger { public void test ( ) {   if ( fairSynch ) {   synchronized ( lock ) {   super . put ( key , value ) ;   return ;   }   }   super . put ( key , value ) ;     } }  
public final class DlvDebugProcess extends DebugProcessImpl < RemoteVmConnection >     { public void stop ( ) {   getSession ( ) . stop ( ) ;   }   private static class DlvSuspendContext extends XSuspendContext {     } }  
import java . nio . ByteBuffer ;   import javax . websocket . SendHandler ;   class MessagePart {   private final byte opCode ;   private final ByteBuffer payload ;   private final boolean last ;     } 
public class EditSession { public void test ( ) { { {   if ( setBlock ( pt , grass ) ) {   affected ;   }   break ;   }   }   }     }  
public class PackageParser { public void test ( ) {   if ( sa . getBoolean (   com . android . internal . R . styleable . AndroidManifestApplication_testOnly ,   false ) ) {   ai . flags |= ApplicationInfo . FLAG_TEST_ONLY ;   }     } }  
public class SnacktoryWebViewRenderer extends WebViewRenderer { public void test ( ) { {   }   mGetPageAsTextTask = new GetPageAsTextTask ( ) ;   mGetPageAsTextTask . execute ( urlAsString ) ;   }       }  
final class HttpRequestBuilder { public void test ( ) { {   }   HttpUriRequest request = requestLine . getHttpMethod ( ) . createFrom ( this ) ;   return request ;   }     }  
class DrawableCache extends ThemedResourceCache < Drawable . ConstantState > {     public boolean shouldInvalidateEntry ( Drawable . ConstantState entry , int configChanges ) { {   return Configuration . needNewResources ( configChanges , entry . getChangingConfigurations ( ) ) ;   }   }     }  
public abstract class RectangularShape extends Shape implements IAreaShape {     protected boolean isCulled ( final Camera pCamera ) {   return ! RectangularShapeCollisionChecker . isVisible ( pCamera , this ) ;   }       }  
class BaseRegion implements Region {     public int getTimeout ( ) { {   return Timestamper . ONE_MS * 600000 ;   }   }     }  
class GitSmartOperationDialog extends DialogWrapper {private class ForceCheckoutAction extends AbstractAction { ForceCheckoutAction ( String operationTitle ) { super ( " & Force " + capitalize ( operationTitle ) ) ; }  } } 
public class TestShellActivity extends Activity implements LayoutTestController     { public void clearCache ( ) { {   mWebView . freeMemory ( ) ;   }       } }  
public class LocalSearch implements SearchSpecification {       public String getName ( ) {   return ( mName == null ? " " : mName ) ;   }       }  
public class PyIntroduceVariableHandler extends IntroduceHandler {     protected String getHelpId ( ) {   return " python . reference . introduceVariable " ;   }   }      
public class Tmp { public enum SASLError {   invalid_authzid ,   invalid_mechanism ,   malformed_request ,   mechanism_too_weak ,   not_authorized ,   temporary_auth_failure ;     } }  
public abstract class BaseUpgradePortletId extends UpgradeProcess { public void test ( ) {   typeSettingsProperties . setProperty (   newStagingPortletId , stagingPortletSetting ) ;   typeSettingsProperties . remove ( oldStagingPortletId ) ;     return typeSettingsProperties . toString ( ) ;   }     }  
public class MarkupTemplateEngine extends TemplateEngine {     }   public static class TemplateResource {   private final String baseName ;   private final String locale ;   private final String extension ;     } 
import static org . junit . Assert . * ;   public class ErrorReportingTest extends BaseTest   {   public static class InvalidAwaitCall   {   public void invalidAwaitCall ( Task task )   {     } } }  
public class Compiler extends AbstractCompiler implements ErrorHandler {     private void processNewScript ( JsAst ast , Node originalRoot ) {   languageMode = options . getLanguageIn ( ) ;     Node js = ast . getAstRoot ( this ) ;   Preconditions . checkNotNull ( js ) ;     } }  
public class Container extends AbsLayoutContainer {   private EdgeEffect mLeftEdge , mRightEdge , mTopEdge , mBottomEdge ;   private float pullPastSlack = 150f ;         }  
public class PGraphics extends PImage implements PConstants {     public void blendMode ( int mode ) {   this . blendMode = mode ;   blendModeImpl ( ) ;   }     }  
public abstract class MultilanguageCodeStyleAbstractPanel extends CodeStyleAbstr   { public void setLanguageSelector ( LanguageSelector langSelector ) {   myLanguageSelector = langSelector ;   setPanelLanguage ( langSelector . getLanguage ( ) ) ;   }   public void setPanelLanguage ( Language language ) {     } }  
import javax . crypto . Mac ;           public final class FingerprintManagerCompatApi23 { public void test ( ) {     } }  
public class AccessibilityNodeInfo implements Parcelable {       public boolean refresh ( ) {   return refresh ( true ) ;   }       }  
public final class RuntimeConstants {   public static final String ALLUXIO_JAR =   " target / alluxio - " + VERSION + " - jar - with - dependencies . jar " ;   private RuntimeConstants ( ) { {   }   }     }  
import java . util . Optional ;   public class TSVSentenceIterator implements Iterator < Sentence > {     public enum SentenceField {   ID ,   DEPENDENCIES_STANFORD ,   DEPENDENCIES_EXTRAS ,     } } 
public class CompilerOptions implements Serializable , Cloneable {             public void setLanguageIn ( LanguageMode languageIn ) {   this . languageIn = languageIn ;     } }  
import java . util . * ;         public class DBMaker < DBMakerT extends DBMaker < DBMakerT > > {   protected final String TRUE = " true " ;     } 
public class DomModelTreeView extends Wrapper implements DataProvider {     public void dispose ( ) {   myBuilder . dispose ( ) ;   myDomManager . removeDomEventListener ( myDomEventListener ) ;   }     }  
public class CameraView extends ViewGroup implements AutoFocusCallback { public void test ( ) { {   }   removeView ( previewStrategy . getWidget ( ) ) ;   onOrientationChange . disable ( ) ;   lastPictureOrientation = - 1 ;   }     }  
public class PrestoConnection   { public int getTransactionIsolation ( )   throws SQLException   { {   return TRANSACTION_NONE ;   }       } }  
public class ExcelImporter extends TabularImportingParserBase {     public List < Object > getNextRowOfCells ( ) throws IOException {   if ( nextRow > lastRow ) {   return null ;   }     } }  
public class CoreProxy {     public static void setField804 ( EntityItem item , float value ) {   item . hoverStart = value ;   }   public static File getPropertyFile ( ) {     } }  
public abstract class BaseNetworkStateTracker implements NetworkStateTracker {       public void captivePortalCheckComplete ( ) {     }       public boolean setRadio ( boolean turnOn ) {     return true ;     } }  
abstract class CommunicationProtocol   { public void test ( ) { { {   dest . writeBytes ( bytes ) ;   }   channel . close ( ) ;   }   }     }  
public class ClassNode extends AnnotatedNode implements Opcodes {     public void setModifiers ( int modifiers ) {   redirect ( ) . modifiers = modifiers ;   }   public List < PropertyNode > getProperties ( ) {     } }  
public class SingleFilePageSwapperFactory implements PageSwapperFactory     { public String implementationName ( )   { {   return " single " ;   }       } }  
package org . apache . lucene . index ;           public class IndexWriterAccessor   { public void test ( ) {     } }  
public class ShellSpout implements ISpout { public void test ( ) {   LOG . error ( " Halting process : ShellSpout died . " , exception ) ;   _collector . reportError ( exception ) ;   _process . destroy ( ) ;   System . exit ( 11 ) ;   }     }  
public class CorruptSSTableException extends RuntimeException { public CorruptSSTableException ( Exception cause , File path ) { { super ( " Corrupted : " + path , cause ) ; this . path = path ; }} } 
public final class DiskLruCache implements Closeable {       public synchronized boolean isClosed ( ) {   return journalWriter == null ;   } }     
public class OtrChatManager implements OtrEngineListener , OtrSmEngineHost { public void test ( ) {   mSessions = new Hashtable < String , SessionID > ( ) ;   mOtrSms = new Hashtable < SessionID , OtrSm > ( ) ;     mContext = context ;   }     }  
public class ServletException extends Exception {       public ServletException ( Throwable rootCause ) {   super ( rootCause ) ;   }       }  
public class PartitionManager {     public void close ( ) {   commit ( ) ;   _connections . unregister ( _partition . host , _partition . partition ) ;   }     }  
public class SimpleCredentialsDialog extends DialogWrapper implements DocumentLi     { public JComponent getPreferredFocusedComponent ( ) {   return myUserNameText . isEnabled ( ) ? myUserNameText : myPasswordText ;   }   public boolean shouldCloseOnCross ( ) {     } }  
public final class SslHandshakeCompletionEvent {   private final Throwable cause ;   public SslHandshakeCompletionEvent ( Throwable cause ) {   this . cause = cause ;   }     } 
public class FunType extends Type { public void test ( ) { { {   }   }   return true ;   }     }  
public class HighlightUsagesHandler extends HighlightHandlerBase { public void test ( ) { {   }   final EditorSearchComponent header = new EditorSearchComponent ( editor , project ) ;   header . setRegexp ( false ) ;   editor . setHeaderComponent ( header ) ;   }     }  
public class IconMenuTag extends BaseBodyTagSupport implements BodyTag { public void test ( ) {   _localizeMessage = true ;   _maxDisplayItems = _DEFAULT_MAX_DISPLAY_ITEMS ;   _message = " actions " ;   _scroll = false ;   _select = false ;   _showArrow = true ;   _showExpanded = false ;     } }  
public class RNNOptions implements Serializable {     public int numClasses = 5 ;   public boolean lowercaseWordVectors = false ;   public boolean useTensors = true ;     }  
public class Scroller {       public final void setFriction ( float friction ) {   mDeceleration = computeDeceleration ( friction ) ;   }   private float computeDeceleration ( float friction ) {     } }  
public class CometConnectionManagerValve   { public void sessionCreated ( HttpSessionEvent se ) { {     }     } }  
class Waiter { public void test ( ) { {   sleeper . sleep ( ) ;   }   return view ;   }       }  
public class AssetPublisherImpl implements AssetPublisher { public void test ( ) {   assetEntryQuery . setAllCategoryIds ( allAssetCategoryIds ) ;   if ( overrideAllAssetTagNames != null ) {   allAssetTagNames = overrideAllAssetTagNames ;   }     } } 
public class RemoteServerConfiguration implements Cacheable , Externalizable {   private int remotePort ;   public RemoteServerConfiguration ( ) {   }     public RemoteServerConfiguration ( String domain ) {   this . domain = domain ;   }     }  
public class NioEndpoint extends AbstractEndpoint < NioChannel > { public void test ( ) {   fillReadBuffer ( false ) ;   boolean isReady = socketBufferHandler . getReadBuffer ( ) . position ( ) > 0 ;   return isReady ;   }     }  
public class XUtilHook extends XHook {     public String getClassName ( ) {   return Util . class . getName ( ) ;   }       }  
public class MarkupBuilder extends BuilderSupport {          public MarkupBuilderHelper getMkp ( ) {   return new MarkupBuilderHelper ( this ) ;   }}     
package org . apache . cordova . facebook ;   import java . io . UnsupportedEncodingException ;   import java . net . URLDecoder ;   import java . util . ArrayList ;   import java . util . Arrays ;   import java . util . Date ;      
public class Color { public void test ( ) {   this . mRed = pRed ;   this . mGreen = pGreen ;   this . mBlue = pBlue ;   this . mAlpha = pAlpha ;   this . pack ( ) ;   return true ;     } }  
public class Main {   public static void main ( String [ ] args ) { {     new Exception ( ) ;   }   }     }  
class InjectorImpl implements Injector { public void test ( ) {     if ( providedBinding == null ) {   handleMissingBinding ( key ) ;   return invalidBinding ( key ) ;   }     } }  
public final class Constants {         public static final boolean DEBUG = false ;         }  
public class Cookie implements Cloneable , Serializable { public void test ( ) {   try {   return super . clone ( ) ;   } catch ( CloneNotSupportedException e ) {   throw new RuntimeException ( e ) ;   }   }     }  
public class UserGroupsAdminPortletDataHandler extends BasePortletDataHandler {   public static final String NAMESPACE = " user_groups_admin " ;   public UserGroupsAdminPortletDataHandler ( ) {   setDataLevel ( DataLevel . PORTAL ) ;   }     }  
public class FolderList extends K9ListActivity { public void test ( ) {   if ( initialFolder != null ) {   intent . putExtra ( EXTRA_INITIAL_FOLDER , initialFolder ) ;   }   else {   intent . putExtra ( EXTRA_STARTUP , true ) ;   }   return intent ;   }     }  
public class Vector {   public int getAt ( int index ) {   return elements [ index ] ;   }     public int size ( ) {   return elements . length ;   }   }      
public class APCleanupAlgorithm implements EpisodeCleanupAlgorithm < Integer > {     public Integer getDefaultCleanupParameter ( Context context ) {   return getPerformAutoCleanupArgs ( context , 0 ) ;   }       }  
public class AudioRecord       { public int getRecordingState ( ) { {   synchronized ( mRecordingStateLock ) {   return mRecordingState ;   }   }       } }  
public class AQUtility {     public static File getCacheFile ( File dir , String url ) {   if ( url == null ) return null ;   String name = getCacheFileName ( url ) ;   File file = makeCacheFile ( dir , name ) ;   return file ;     } }  
public class TextView extends View implements ViewTreeObserver . OnPreDrawListener     { public boolean dispatchPopulateAccessibilityEvent ( AccessibilityEvent event ) {   if ( ! isShown ( ) ) {   return false ;   }     final boolean isPassword = isPasswordInputType ( mInputType ) ;   if ( ! isPassword ) {     } } }  
public class GestureDetector { public void test ( ) {   mVelocityTracker = null ;   mIsDoubleTapping = false ;   mStillDown = false ;   mAlwaysInTapRegion = false ;   mAlwaysInBiggerTapRegion = false ;   if ( mInLongPress ) {   mInLongPress = false ;   }     } }  
public class DocumentWindowImpl extends UserDataHolderBase implements Disposable     { public void moveText ( int srcStart , int srcEnd , int dstOffset ) { {   throw new UnsupportedOperationException ( ) ;   }     } }  
public class MocoServer { public void test ( ) {   if ( bossGroup != null ) {   bossGroup . shutdownGracefully ( ) ;   bossGroup = null ;   }     } }  
public class Validator { public void test ( ) {                 } }  
import java . util . List ;         public class DayViewFacade {   private boolean isDecorated ;     }   
import android . util . Log ;   import java . net . InetSocketAddress ;   import java . net . ProxySelector ;   import java . net . URI ;   import java . util . List ;   import java . util . regex . Matcher ;   import java . util . regex . Pattern ;      
public class BitmapDrawable extends Drawable { public void test ( ) { { {   mTargetDensity = state . mTargetDensity ;   }   mTintFilter = updateTintFilter ( mTintFilter , state . mTint , state . mTintMode ) ;   computeBitmapSize ( ) ;   }   }     }  
public class XmppConnection implements Runnable {   public void resetEverything ( ) {   resetStreamId ( ) ;   clearIqCallbacks ( ) ;   mStanzaQueue . clear ( ) ;   synchronized ( this . disco ) {   disco . clear ( ) ;   }     } }  
import java . util . Comparator ;               class PeepholeMinimizeConditions   extends AbstractPeepholeOptimization { public void test ( ) {     } }  
public class Tmp { public enum UniformBinding {   WorldViewProjectionMatrix ,                 } }  
public class StringPair { public String getTarget ( ) { return targetString ; }public String toString ( ) { return sourceString + " & " + targetString ; }  }
public class Snackbar extends SnackbarLayout {     protected void onDetachedFromWindow ( ) {   super . onDetachedFromWindow ( ) ;     mIsShowing = false ;     if ( mDismissRunnable != null ) {   removeCallbacks ( mDismissRunnable ) ;   }     } }  
public class DB2Database extends AbstractJdbcDatabase {   public String getDefaultCatalogName ( ) {   if ( defaultCatalogName != null ) {   return defaultCatalogName ;   }   if ( defaultSchemaName != null ) {     } } }  
public class RajawaliRenderer implements GLSurfaceView . Renderer , INode {     protected void destroyScene ( ) {   mSceneInitialized = false ;   for ( BaseObject3D child : mChildren ) {   child . destroy ( ) ;   }     } }  
public class UriUtils { public void test ( ) { { {   }   }     return displayName . replaceAll ( " / " , " - " ) ;   }     }  
static abstract class HostExpr implements Expr {     private static Class maybeClass ( Object form , boolean stringOk ) throws Exception {   if ( form instanceof Class )   return ( Class ) form ;   Class c = null ;   if ( form instanceof Symbol )   {     } } }  
public class FloatingActionButton extends ImageButton { public void test ( ) {   if ( mSettledScrollY != scrollY ) {   mSettledScrollY = scrollY ;   removeMessages ( 0 ) ;   sendEmptyMessage ( 0 ) ;   }   }     }  
public class PImage implements PConstants , Cloneable { public void test ( ) {   modified = true ;   mx1 = 0 ;   my1 = 0 ;   mx2 = width ;   my2 = height ;   }     }  
public class DefaultResultSetHandler implements ResultSetHandler { public void test ( ) { { { { {   }   }   }   autoMappingsCache . put ( mapKey , autoMapping ) ;   }   return autoMapping ;   }     }  
package org . codehaus . groovy . reflection ;   import java . util . AbstractList ;   import java . util . Collection ;   import java . util . Iterator ;      
public class TxEngine extends EngineWrapper {     protected volatile boolean uncommitedData = false ;   protected final boolean fullTx ;     }  
class ListRemoteViewsFactory implements RemoteViewsService . RemoteViewsFactory {   public ListRemoteViewsFactory ( Context applicationContext , Intent intent ) {   Log . d ( TAG , " ListRemoteViewsFactory instantiated " ) ;   m_app = ( TodoApplication ) applicationContext ;   onDataSetChanged ( ) ;   }       }  
public class ZFrame {       protected ZFrame ( ) {   }       }  
public class WifiConfiguration implements Parcelable {       public boolean isValid ( ) {   if ( allowedKeyManagement == null )   return false ;     } }  
public class TitleParserTest extends DatabaseTestCase {     private void insertTitleAddTask ( String title , Task task , TaskService taskService ) {   task . clear ( ) ;   task . setValue ( Task . TITLE , title ) ;   taskService . quickAdd ( task ) ;   }     }  
import com . siyeh . ipp . base . PsiElementPredicate ;         class NestedTryStatementsPredicate implements PsiElementPredicate {     public boolean satisfiedBy ( PsiElement element ) {     } } 
public class TemplateManagerUtil { public void test ( ) { {   registry . ungetService ( serviceReference ) ;   _templateManagers . remove ( templateManager . getName ( ) ) ;     templateManager . destroy ( ) ;   }   }     }  
public class RoundRobinConnectionPoolImplTest extends BaseConnectionPoolTest {         public void testAddingNewHost ( ) {   CountingConnectionPoolMonitor monitor = new CountingConnectionPoolMonitor ( ) ;     } }  
public class Log4JUtil { public void test ( ) {   return ;   }     DOMConfigurator domConfigurator = new DOMConfigurator ( ) ;     }  
public class ComponentAttributeSourceImpl implements ComponentAttributeSource {     public String getParentReferenceAttributeName ( ) {     return null ;   }     }  
public class SuggestionAutoCompleteText extends MultiAutoCompleteTextView { public void test ( ) { { {   }   }   return super . onKeyPreIme ( keyCode , event ) ;   }       }  
public class ViewOverlay {   public void clear ( ) {   removeAllViews ( ) ;   if ( mDrawables != null ) {   mDrawables . clear ( ) ;   }   }   boolean isEmpty ( ) {     } }  
public class PApplet implements PConstants { public void test ( ) {   }             }  
public class IsolatedContext extends ContextWrapper {       public void unregisterReceiver ( BroadcastReceiver receiver ) {     }       public void sendBroadcast ( Intent intent ) {   mBroadcastIntents . add ( intent ) ;   }     }  
import java . util . ArrayList ;   import java . util . concurrent . * ;   import jsr166y . CountedCompleter ;   import jsr166y . ForkJoinPool ;   import water . DException . DistributedException ;   import water . util . Log ;      
public class GeneralRouter implements VehicleRouter {     public long [ ] getImpassableRoadIds ( ) {   if ( impassableRoads == null ) {   return new long [ 0 ] ;   }   return impassableRoads . toArray ( ) ;   }     }  
public class SimpleHostConnectionPoolTest { public void test ( ) {   config . setMaxConnsPerHost ( 2 ) ;   config . setInitConnsPerHost ( 1 ) ;   config . setConnectTimeout ( 200 ) ;   config . initialize ( ) ;   return config ;   }     }  
import javax . inject . Inject ;   import dagger . ObjectGraph ;   public class CoffeeApp implements Runnable {   CoffeeMaker coffeeMaker ;   public void run ( ) {     } } 
public class HeadlessWorldRenderer implements WorldRenderer {     public void dispose ( ) {   worldProvider . dispose ( ) ;   }     }  
public class SerializationUtils { public void test ( ) { { {   QueryMessage query = new QueryMessage ( versions ) ;   return query ;     throw new IOException ( " Unknown message type . " ) ;   }   }   }     }  
public final class AnimChannel { public void test ( ) {   time = 0 ;   speed = 1f ;   loopMode = LoopMode . Loop ;   notified = false ;   }     }  
public class TestJsonPointer   extends BaseMapTest   {     public void testIt ( ) { { }   }     }  
public class FeedItemDialog extends Dialog { public void test ( ) { { {   return ;   }   actionButtonCallback . onActionButtonPressed ( item ) ;   if ( media . isDownloaded ( ) ) {     dismiss ( ) ;   }   }   }     }  
public abstract class TileMachine extends TileBuildCraft implements IMachine , IP     { public int powerRequest ( ) {   if ( isActive ( ) ) {   return getPowerProvider ( ) . getMaxEnergyReceived ( ) ;   } else {   return 0 ;   }     } }  
public class DefaultLayoutAnimator extends LayoutAnimator {   public int oldCellsRemovalAnimationStartDelay = 0 ;   public int cellPositionTransitionAnimationDuration = 250 ;         }  
public class AjpNioProtocol extends AbstractAjpProtocol {     public void release ( SocketWrapper < NioChannel > socket ,   AjpNioProcessor processor , boolean isSocketClosing ) {   processor . recycle ( isSocketClosing ) ;   recycledProcessors . offer ( processor ) ;   }     }  
public abstract class AbstractGrailsPluginManager implements GrailsPluginManager     { public boolean isShutdown ( ) { {   return shutdown ;   }     } }  
public class TaskAdapter extends CursorAdapter implements Filterable { public void test ( ) {     addListeners ( view ) ;   return view ;   }     }  
public final class TvContract {         String COLUMN_PACKAGE_NAME = " package_name " ;   }        
public class IntSet {     }   static public class IntSetIterator {   static final int INDEX_ILLEGAL = - 2 ;   static final int INDEX_ZERO = - 1 ;     } 
public class SpanishXMLTreeReader implements TreeReader {   private static final String ATTR_ELLIPTIC = " elliptic " ;   private static final String EMPTY_LEAF = " - NONE - " ;   private NodeList sentences ;   private int sentIdx ;     }  
public class RNNOptions implements Serializable {     public int numClasses = 5 ;   public boolean lowercaseWordVectors = false ;   public boolean useTensors = true ;     }  
public class JIoEndpoint {     public int getCurrentThreadsBusy ( ) {   return workers != null ? curThreads - workers . size ( ) : 0 ;   }     }  
public class AppleBundle extends AbstractBuildRule {       public ImmutableList < Step > getBuildSteps (   BuildContext context ,   BuildableContext buildableContext ) { {   return ImmutableList . of ( ) ;   }   }     }  
package org . apache . coyote . http11 ;   import org . junit . Assert ;   import org . junit . Test ;   import org . apache . catalina . Context ;      
public class ServiceBuilder     { public ServiceBuilder scope ( String scope )   { {   Preconditions . checkEmptyString ( scope , " Invalid OAuth scope " ) ;   this . scope = scope ;   return this ;   }     } }  
public class VcsHistoryProviderBackgroundableProxy { public void test ( ) {   if ( session != null ) {   partner . reportCreatedEmptySession ( session ) ;   partner . finished ( ) ;   return ;   }   }     }  
public class AaptStep extends ShellStep {     public String getShortName ( ) { {   return " aapt_package " ;   }   }     }  
public class CompilerOptions {     public void setInstrumentationTemplateFile ( String filename ) {   this . instrumentationTemplateFile = filename ;   }   public void setRecordFunctionInformation ( boolean recordFunctionInformation ) {     } }  
public class LuceneUtil {     public static void write ( IndexWriter writer ) throws IOException {   writer . optimize ( ) ;   writer . close ( ) ;   }     }  
public final class CalendarContract {         public static final String DEFAULT_SORT_ORDER = CALENDAR_DISPLAY_NAME ;         }  
public class EditNotesControlSet extends PopupControlSet {     protected void refreshDisplayView ( ) {   notesPreview . setText ( " " ) ;   notesPreview . setText ( editText . getText ( ) ) ;   linkifyDisplayView ( ) ;   }     }  
public class HomeActivity extends AppCompatActivity implements View . OnClickListe     { public void onTabUnselected ( int position ) { {   }       } }  
package org . apache . catalina . realm ;   import java . io . IOException ;   import java . net . URI ;   import java . net . URISyntaxException ;   import java . security . KeyManagementException ;      
public class IndicatorLayout extends FrameLayout implements AnimationListener {     public void show ( ) {   mArrowImageView . clearAnimation ( ) ;   startAnimation ( mInAnim ) ;   }     }  
public class Base { public void test ( ) { { { {   }   }   }   return found ;   }     }  
public class CoreProxy {     public static void setField804 ( EntityItem item , float value ) {   item . field_804_d = value ;   }   public static File getPropertyFile ( ) {     } }  
public class MetadataTest extends BaseDataTest {     public void setup ( ) throws Exception {   dataSource = createUnpooledDataSource ( BaseDataTest . BLOG_PROPERTIES ) ;   runScript ( dataSource , BLOG_DDL ) ;   }       }  
public class NotificationsTable { public void test ( ) {   getDb ( ) . delete ( NOTIFICATIONS_TABLE , null , null ) ;   }           }  
public abstract class DockerSupport {   public static DockerSupport getInstance ( ) {   return ServiceManager . getService ( DockerSupport . class ) ;   }     public abstract String getDefaultCertificatesFolder ( ) ;   }      
public class ChromeSettings extends BrowserSpecificSettings {   private int myRemoteShellPort = DEFAULT_REMOTE_SHELL_PORT ;   public ChromeSettings ( ) {   }       }  
public class PrincipalGroupCallback { public void test ( ) { {   return callerPrincipalCallback . getSubject ( ) ;   }   if ( groupPrincipalCallback != null ) {   return groupPrincipalCallback . getSubject ( ) ;   }   return null ;   }     }  
public class SecurityCheckInjectableTest {     public void   cookie_login_should_return_user_if_user_present_in_http_session ( ) {   User userInSession = new User ( ) ;   HttpSession session = mock ( HttpSession . class ) ;     } } 
public class HeadlessMaterial extends BaseMaterial {     public void reload ( MaterialData newData ) {   this . data = newData ;   }       }  
public class ErrorBar extends JPanel {     protected void done ( ) {   int totalLines = 0 ;   int currentTab = 0 ;   for ( SketchCode sc : editor . getSketch ( ) . getCode ( ) ) {     } } }  
public class IndexLookupSourceSupplier     { public void destroy ( )   { { {     }   }     } }  
public class ExpandableNotificationRow extends ActivatableNotificationView { public void test ( ) {   mMaxExpandHeight = 0 ;   mWasReset = true ;   onHeightReset ( ) ;   requestLayout ( ) ;   }       }  
class CopyFilesOrDirectoriesDialog extends DialogWrapper {     public JComponent getPreferredFocusedComponent ( ) {   return myShowNewNameField ? myNewNameField : myTargetDirectoryField . getChildComponent ( ) ;   }   protected JComponent createCenterPanel ( ) {     } }  
public class WifiP2pService extends IWifiP2pManager . Stub {     public void exit ( ) {   sendP2pDiscoveryChangedBroadcast ( false ) ;   sendP2pStateChangedBroadcast ( false ) ;   mNetworkInfo . setIsAvailable ( false ) ;   }     }  
public final class Internal {       public static boolean inMilliseconds ( final byte [ ] qualifier ,   final int offset ) {   return inMilliseconds ( qualifier [ offset ] ) ;   }     } 
public abstract class MasterBase implements Master {   protected boolean isLeaderMode ( ) {   return mIsLeader ;   }     protected boolean isStandbyMode ( ) {   return ! mIsLeader ;   }     }  
public final class IndexUtils { public void test ( ) {   indexMetaChangeTsk . setWork ( indexMetaChange ) ;   rootTask . addDependentTask ( indexMetaChangeTsk ) ;   driver . destroy ( ) ;     return rootTask ;   }     }  
public class WordPress extends Application {   public synchronized static void updateCurrentBlogStats ( ) {   Blog currentBlog = WordPress . getCurrentBlog ( ) ;   if ( currentBlog != null ) {   String blogID = null ;     } } }  
public class RoutedStore implements Store < ByteArray , byte [ ] > {     }   private static class GetAllResult {   final GetAllCallable callable ;   final Map < ByteArray , List < Versioned < byte [ ] > > > retrieved ;     } 
public abstract class TransactionBlock extends Transaction {   public void setClient ( Client client ) {   super . setClient ( client ) ;   }   }      
public class PGL { public void test ( ) {   fboLayerCreated = false ;   fboLayerInUse = false ;   firstFrame = false ;   GLProfile . shutdown ( ) ;   }     }  
public class PySignatureCacheManagerImpl extends PySignatureCacheManager { public void test ( ) {   try {   data = CALL_SIGNATURES_ATTRIBUTE . readAttributeBytes ( file ) ;   }   catch ( Exception e ) {   data = null ;   }     } } 
public class MapActivity extends AccessibleActivity implements IMapLocationListe     { public Location getLastKnownLocation ( ) { {   if ( mapLayers . getLocationLayer ( ) == null ) {   return null ;   }   return mapLayers . getLocationLayer ( ) . getLastKnownLocation ( ) ;   }     } }  
public class SlidingUpPanelLayout extends ViewGroup {     public void setCoveredFadeColor ( int color ) {   mCoveredFadeColor = color ;   requestLayout ( ) ;   }       }  
public class MacMainFrameDecorator extends IdeFrameDecorator implements UISettin   { public void windowEnteredFullScreen ( AppEvent . FullScreenEvent event ) { {   if ( ! ORACLE_BUG_ID_8003173 ) {   enterFullscreen ( ) ;   myFrame . validate ( ) ;   }   }     } }  
  package javaslang . collection ;   import javaslang . Lazy ;   import javaslang . Tuple2 ;   import javaslang . control . None ;   import javaslang . control . Option ;      
public class IWindowManagerImpl implements IWindowManager {       public void keyguardGoingAway ( ) throws RemoteException {   }       public void lockNow ( Bundle options ) {     }     }  
public class ContextThemeWrapperPlus extends ContextThemeWrapper implements Supe   { public ContextThemeWrapperPlus ( Context base , int themeres ) { {   super ( base , themeres ) ;   this . mTheme = themeres ;   }       } }  
public class TermSession {   public void reset ( ) {   mEmulator . reset ( ) ;   if ( mNotify != null ) {   mNotify . onUpdate ( ) ;   }   }       }  
final class YUVMonochromeBitmapSource extends BaseMonochromeBitmapSource {     public void cacheColumnForLuminance ( int x ) {     }             }  
public class GitCheckoutProvider extends CheckoutProviderEx {     public void doCheckout ( Project project ,   Listener listener ) { {   doCheckout ( project , listener , null ) ;   }   }     }  
public class CalendarPickerView extends ListView { public void test ( ) {   a . recycle ( ) ;   adapter = new MonthAdapter ( ) ;   setDivider ( null ) ;   setDividerHeight ( 0 ) ;   setBackgroundColor ( bg ) ;   setCacheColorHint ( bg ) ;   locale = Locale . getDefault ( ) ;     } }  
public class CachedClass {             public CachedClass getCachedClass ( ) {   return this ;     } }  
public class KeyButtonView extends ImageView { public void test ( ) { { { {     performLongClick ( ) ;   }   }   }   } ;     }  
class BrowserFrame extends Handler { public void test ( ) {   if ( sConfigCallback == null ) {   sConfigCallback = new ConfigCallback (   ( WindowManager ) appContext . getSystemService (   Context . WINDOW_SERVICE ) ) ;   ViewRoot . addConfigCallback ( sConfigCallback ) ;   }     } }  
public class ClosureCodegen extends MemberCodegen < JetElement > {     protected void done ( ) {   AsmUtil . writeOuterClassAndEnclosingMethod ( classDescriptor , funDescriptor , typeMapper , v ) ;   super . done ( ) ;   }     }  
public class ViewDragHelper { public void test ( ) {   }   void setDragState ( int state ) {   mParentView . removeCallbacks ( mSetIdleRunnable ) ;   if ( mDragState != state ) {   mDragState = state ;   mCallback . onViewDragStateChanged ( state ) ;     } } }  
public class Tmp { public enum Material {   GHAST_TEAR ( 370 ) ,   GOLD_NUGGET ( 371 ) ,   NETHER_STALK ( 372 ) ,   POTION ( 373 , 1 ) ,   GLASS_BOTTLE ( 374 ) ,   SPIDER_EYE ( 375 ) ,   FERMENTED_SPIDER_EYE ( 376 ) ,     } }  
public class RtspRequestDecoder extends HttpMessageDecoder {   protected boolean isDecodingRequest ( ) {   return true ;   }   }      
public class BeanInvocationThrowsExceptionTest extends ContextTestSupport { public void test ( ) { { { {   }   }   }     }     }  
public class Views {     public static class UnableToInjectException extends RuntimeException {   UnableToInjectException ( String message ) {   super ( message ) ;   }     UnableToInjectException ( String message , Throwable cause ) {   super ( message , cause ) ;   }     } }  
public class StartLocalClient   { public void test ( ) { {   System . err . println ( " Can ' t start client with local neo service : " +   e ) ;   e . printStackTrace ( System . err ) ;   }   }     }  
import morfologik . stemming . WordData ;   import org . languagetool . AnalyzedToken ;   import org . languagetool . JLanguageTool ;   public class BaseSynthesizer implements Synthesizer {     }  
public class UsageViewContext {     public VirtualFile [ ] getFiles ( ) {   return null ;   }   public String getName ( ) {     } }  
public final class OperationMerge {     public void unsubscribe ( ) {   unsubscribed = true ;   }     }  
public class LayoutModelImpl implements LayoutModel {   protected void setSelectedLayout ( Layout selectedLayout ) {   Layout oldValue = this . selectedLayout ;   this . selectedLayout = selectedLayout ;   this . selectedBuilder = selectedLayout . getBuilder ( ) ;   if ( oldValue != null ) {   saveProperties ( oldValue ) ;   }     } }  
public class rrclient { public void test ( ) { {   System . out . println ( " Received reply " + request_nbr + " [ " + reply + " ] " ) ;   }   requester . close ( ) ;   context . term ( ) ;   }     }  
public class ToolbarActionBar extends ActionBar { public void test ( ) {   mToolbar = toolbar ;   mDecorToolbar = new ToolbarWidgetWrapper ( toolbar ) ;   mWindowCallback = windowCallback ;   mDecorToolbar . setWindowCallback ( mWindowCallback ) ;   toolbar . setOnMenuItemClickListener ( mMenuClicker ) ;   mDecorToolbar . setWindowTitle ( title ) ;   }     }  
public class Scheduler {   private long currentTime = 0 ;   private boolean paused = false ;   public long getCurrentTime ( ) {   return currentTime ;   }   public void pause ( ) {   paused = true ;     } }  
import play . mvc . Result ;   import views . helpers . Permissions ;   import views . html . system . users . edit ;   import views . html . system . users . new_user ;   import javax . annotation . Nullable ;   import javax . inject . Inject ;      
import water . nbhm . NonBlockingHashMap ;     public final class Enum extends Iced {   public static final int MAX_ENUM_SIZE = 65000 ;   volatile NonBlockingHashMap < ValueString , Integer > _map ;     }  
public class StatsActivity extends WPActionBarActivity { public void test ( ) {   loadStatsFragments ( ) ;   setTitle ( R . string . stats ) ;   restoreState ( savedInstanceState ) ;   }       }  
public final class ScriptIntrinsicLUT extends ScriptIntrinsic { public void test ( ) { {   mCache [ ct + 512 ] = ( byte ) ct ;   mCache [ ct + 768 ] = ( byte ) ct ;   }   setVar ( 0 , mTables ) ;   }       }  
public class ElasticSearchConnection implements Connection {     public void close ( ) throws SQLException {   }       }  
public class GetPatternsFromDataMultiClass implements Serializable { public void test ( ) { { {   IOUtils . writeObjectToFile ( splitSents , newf ) ;   Data . sentsFiles . add ( newf ) ;   splitSents . clear ( ) ;   num = 0 ;   }   }   }     }  
public class NoSpamLoggerTest     { public void testLoggedResult ( ) throws Exception   {   now = 5 ;     NoSpamLogger . log ( mock , Level . INFO , 5 , TimeUnit . NANOSECONDS , statement , param ) ;   checkMock ( Level . INFO ) ;     } }  
public class SybaseDialect extends AbstractTransactSQLDialect {   public int getInExpressionCountLimit ( ) {   return PARAM_LIST_SIZE_LIMIT ;   }       public boolean supportsNotNullUnique ( ) {   return false ;   }   }      
public class FileColorsConfigurable implements Configurable , NonDefaultProjectCo     { public String getHelpTopic ( ) {   return " reference . settings . ide . settings . file - colors " ;   }   public JComponent createComponent ( ) {     } }  
public class Set < ModelClass extends Model > implements WhereBase < ModelClass > , Que     { public void queryClose ( ) { { {   query ( ) ;   }   }     } }  
public class ASTWrapperPsiElement extends ElementBase implements PsiElement , Nav     { public boolean canNavigate ( ) {   return EditSourceUtil . canNavigate ( this ) ;   }   public boolean canNavigateToSource ( ) {     } }  
public class Term extends Activity implements UpdateCallback {   private boolean mStopServiceOnFinish = false ;   private Intent TSIntent ;   public static final int REQUEST_CHOOSE_WINDOW = 1 ;   public static final String EXTRA_WINDOW_ID = " jackpal . androidterm . window_id " ;     }  
public class RegTestParams extends TestNet2Params { public void test ( ) {   port = 18444 ;   acceptableAddressCodes = new int [ ] { 0 } ;   addressHeader = 0 ;   dumpedPrivateKeyHeader = 128 ;   }       }  
class IonDrawable extends LayerDrawable { public void test ( ) {   try {   gifDecoder . nextFrame ( ) ;   }   catch ( OutOfMemoryError e ) {   exception = new Exception ( e ) ;   }   catch ( Exception e ) {   exception = e ;   }     } }  
public class Config   { public volatile Long request_timeout_in_ms = new Long ( 10000 ) ;   public Long read_request_timeout_in_ms = new Long ( 5000 ) ;   public Long range_request_timeout_in_ms = new Long ( 10000 ) ;     }  
public class CordovaWebView extends WebView {     private Context mCtx ;   CordovaWebViewClient viewClient ;   private CordovaChromeClient chromeClient ;       }  
public class Particle extends BaseObject3D { public void test ( ) { { {   throw new RuntimeException ( " You need to set a particle material first . " ) ;   }   mParticleShader . setCamera ( camera ) ;   mParticleShader . setCameraPosition ( camera . getPosition ( ) ) ;   mParticleShader . setPointSize ( mPointSize ) ;   }   }     }  
public abstract class Editor extends JFrame implements RunnerListener { public void test ( ) { {   sketchMenu . add ( item ) ;   menuList . add ( item ) ;   }   }       }  
public class IndexAccessorImpl implements IndexAccessor { public void test ( ) {   try {   _indexSearcherManager . close ( ) ;     _indexWriter . close ( ) ;     _directory . close ( ) ;   }   catch ( Exception e ) {     } } }  
public class CalendarPickerView extends ListView { public void test ( ) {   if ( wasSelected ) {   dateListener . onDateSelected ( clickedDate ) ;   } else {   dateListener . onDateUnselected ( clickedDate ) ;   }   }     }  
public class SocialConfigurationUtil { public void test ( ) {   if ( participationValueElement != null ) {   increment = GetterUtil . getInteger (   participationValueElement . getText ( ) ) ;   }   activityCounterDefinition . setIncrement ( increment ) ;     } }  
package com . mongodb ;       public class MongoInterruptedException extends MongoException {   private static final long serialVersionUID = - 4110417867718417860L ;     public MongoInterruptedException ( final InterruptedException e ) {   super ( " A driver operation has been interrupted " , e ) ;   }     }  
class Http2Parser {   private void readUnknownFrame ( int streamId , FrameType frameType , int flags , int payloadSize )   throws IOException {   output . swallow ( streamId , frameType , flags , payloadSize ) ;   }     }  
public abstract class BaseSubscriptionLocalizedContentTestCase       { public void tearDown ( ) throws Exception { {   LocaleThreadLocal . setDefaultLocale ( defaultLocale ) ;   }     } }  
import javax . annotation . Nullable ;     public class UniqueIndexViolationException extends UserException {   private static final long serialVersionUID = - 8679405097266977101L ;       private final String index ;       }  
public class VersionCheckThread extends Periodical {     public int getInitialDelaySeconds ( ) {   return ( int ) MINUTES . toSeconds ( 5 ) ;   }       }  
public class WebView extends AbsoluteLayout       { public static synchronized PluginList getPluginList ( ) { {   return new PluginList ( ) ;   }       } }  
public class DummyProxySession implements Session {   public void setValid ( boolean isValid ) {     }       public void tellChangedSessionId ( String newId , String oldId ,   boolean notifySessionListeners , boolean notifyContainerListeners ) {     }   }      
public class DevicePolicyManagerService extends IDevicePolicyManager . Stub { public void test ( ) { { { { {   }   }   }     return intent ;   }   }     }  
public class AndroidSafeDeleteProcessorDelegate implements SafeDeleteProcessorDe     { public UsageInfo [ ] preprocessUsages ( Project project , UsageInfo [ ] usages ) { {   return usages ;   }       } }  
public class PlaygroundTest extends TestBase { public void test ( ) {   static class Foo {   int doSomeThing ( ) {   return 0 ;   }     } } }  
public abstract class VirtualFile extends UserDataHolderBase implements Modifica       { public String getCanonicalPath ( ) { {   return getPath ( ) ;   }       } }  
public class PSurfaceJOGL implements PSurface { public void test ( ) {   KeyEvent tke = new KeyEvent ( nativeEvent , nativeEvent . getWhen ( ) ,   KeyEvent . TYPE , peModifiers ,   keyChar ,   0 ,   nativeEvent . isAutoRepeat ( ) ) ;   sketch . postEvent ( tke ) ;     } }  
public class NotificationStackScrollLayout extends ViewGroup     { public void onChildAnimationFinished ( ) { {   updateChildren ( ) ;   mAnimationEvents . clear ( ) ;   }     } }  
public class WsRemoteEndpoint implements RemoteEndpoint { public void test ( ) { {   }   sendMessage ( Constants . OPCODE_TEXT , textToByte , first , isLast ) ;   if ( ! isLast ) {   isText = Boolean . TRUE ;   }   }     }  
public class CacheOffHeap { public void test ( ) { {   }     cache . close ( ) ;   }     }  
public class KeyguardUpdateMonitor {   private int mFailedAttempts = 0 ;   private int mFailedBiometricUnlockAttempts = 0 ;   private static final int FAILED_BIOMETRIC_UNLOCK_ATTEMPTS_BEFORE_BACKUP = 5 ;   private boolean mClockVisible ;     }  
final class TaglibRule extends Rule {   final class TaglibUriRule extends Rule {     private boolean duplicateUri ;   public TaglibUriRule ( ) {     } } }  
public final class RxJavaHooks {             public static void lockdown ( ) {   lockdown = true ;     } }  
public class Tmp { public AFn ( IPersistentMap meta ) {   } public AFn ( ) {   }   public Obj withMeta ( IPersistentMap meta ) {   throw new UnsupportedOperationException ( ) ;   }   public Object call ( ) throws Exception {   return invoke ( ) ;     } }  
public class IOUtils { public void test ( ) {   for ( int i = 0 ; i < rtn . length ; + + i ) {   rtn [ i ] = linesReversed . get ( rtn . length - i - 1 ) ;   }   raf . close ( ) ;   return rtn ;   }     }  
public abstract class AbstractProcessor < S > implements ActionHook , Processor < S > {       public String getClientCertProvider ( ) {   return clientCertProvider ;   }     }  
import org . languagetool . Experimental ;         public class PatternTokenBuilder {   private PatternToken token ;     }  
public class CommitLogStressTest     { public void testRandomSize ( ) throws Exception   { {   randomSize = true ;   discardedRun = false ;   testAllLogConfigs ( ) ;   }     } }  
class ZoomManager {   private int mInitialScrollY ;   private long mZoomStart ;   private static final int ZOOM_ANIMATION_LENGTH = 175 ;     private boolean mSupportMultiTouch ;     }  
import java . util . * ;   import javax . swing . * ;   import processing . app . debug . Compiler ;   import processing . core . * ;      
public class GPUImage {     protected void onPostExecute ( Bitmap bitmap ) {   super . onPostExecute ( bitmap ) ;   mGPUImage . deleteImage ( ) ;   mGPUImage . setImage ( bitmap ) ;   }     }  
public class NetworkManager { public void test ( ) {   String type = " " ;   if ( info != null )   {   type = info . getTypeName ( ) ;   return type . equals ( " WIFI " ) ;   }   return false ;     } }  
public final class HikariPool implements HikariPoolMBean   { public void test ( ) {   if ( ! connectionProxy . isBrokenConnection ( ) )   {   connectionProxy . markLastAccess ( ) ;   idleConnectionCount . incrementAndGet ( ) ;     } } }  
  package org . opensolaris . opengrok . analysis ;   import java . io . FilterReader ;   import java . io . Reader ;   import java . util . HashMap ;      
public class ExecutionDelayTest extends HazelcastTestSupport {   public static class Task implements Callable , Serializable {   } public Task ( ) {   }     }  
public class CustomerDaoImplTest {     public void getNonExistinCustomerById ( ) {   final int nonExistingId = getNonExistingCustomerId ( ) ;   assertNull ( impl . getCustomerById ( nonExistingId ) ) ;   }     }  
public class TachyonMaster {             public void stop ( ) throws Exception {   if ( mIsServing ) {     } } }  
public class EthernetDataTracker implements NetworkStateTracker {       public String getTcpBufferSizesPropName ( ) {   return " net . tcp . buffersize . ethernet " ;   }   public void setDependencyMet ( boolean met ) {     } }  
abstract class AbstractTFS extends FileSystem {   public TachyonFS getTachyonFS ( ) {   return mTFS ;   }     public URI getUri ( ) {   return mUri ;   }     }  
package com . facebook ;   final class FacebookSdkVersion {   public static final String BUILD = " 3 . 0 . 0 " ;   public static final String MIGRATION_BUNDLE = " fbsdk : 20121026 " ;   }      
public class SimpleWebViewFragment extends Fragment implements OnClickListener {     public void onDetach ( ) { {   super . onDetach ( ) ;   mView . removeView ( mWebview ) ;   mWebview . removeAllViews ( ) ;   mWebview . destroy ( ) ;   }   }     }  
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 3 . 2 " ;   }   public static String getSignature ( ) {     } }  
public class TextIconGenerator { public void test ( ) {   switch ( style ) {   case STYLE_DEFAULT :   case STYLE_WHITE :   return R . style . Bubble_TextAppearance_Dark ;   case STYLE_RED :   case STYLE_BLUE :   case STYLE_GREEN :     } } }  
import java . util . List ;           public class TelecomManager { public void test ( ) {     } }  
final class AdvancedLeakAwareByteBuf extends WrappedByteBuf {     public int forEachByteDesc ( ByteProcessor processor ) {   recordLeakNonRefCountingOperation ( ) ;   return super . forEachByteDesc ( processor ) ;   }     }  
import edu . stanford . nlp . util . StringUtils ;   public class RNNOptions implements Serializable { public void test ( ) {             } }  
import java . io . OutputStream ;     public class StringOutputStream extends OutputStream {   StringBuilder mBuf = new StringBuilder ( ) ;     public void write ( int data ) throws IOException {     } }  
public class MenuDrawer extends ViewGroup {         private static final int MAX_DRAG_BEZEL_DP = 24 ;         }  
public class DeepLearning extends Job . ValidatedJob { public void test ( ) {   score_validation_samples = cp . score_validation_samples ;   shuffle_training_data = cp . shuffle_training_data ;   force_load_balance = cp . force_load_balance ;   classification = cp . classification ;   state = JobState . RUNNING ;   return ;   }     }  
public abstract class DBCollection {       protected List < DBObject > getHintFields ( ) {   return _hintFields ;   }       }  
public class BasketTree extends NetworkTree implements ZLAndroidTree {   public NetworkLibraryItem getHoldedItem ( ) {   return null ;   }       public String getUniqueKey ( ) {   return null ;   }   }      
public class ConstructorCallExpression extends Expression {   public boolean isUsingAnonymousInnerClass ( ) {   return usesAnonymousInnerClass ;   }   }      
public class HystrixTimerTest {   public void setUp ( ) {   HystrixTimer timer = HystrixTimer . getInstance ( ) ;   HystrixTimer . reset ( ) ;   HystrixPlugins . reset ( ) ;   }       }  
public final class FloatingToolbar { public void test ( ) {   super ( Preconditions . checkNotNull ( popup ) . mContext ) ;   this . mPopup = popup ;   setScrollBarDefaultDelayBeforeFade ( ViewConfiguration . getScrollDefaultDelay ( ) * 3 ) ;   setScrollIndicators ( View . SCROLL_INDICATOR_TOP | View . SCROLL_INDICATOR_BOTTOM ) ;   }       }  
public final class ContactsContract { public void test ( ) { {   intent . putExtra ( EXTRA_TARGET_RECT , target ) ;   intent . putExtra ( EXTRA_MODE , mode ) ;   intent . putExtra ( EXTRA_EXCLUDE_MIMES , excludeMimes ) ;   intent . setFlags ( Intent . FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET ) ;   context . startActivity ( intent ) ;   }   }     }  
import gherkin . formatter . Formatter ;   import gherkin . formatter . Reporter ;   import gherkin . formatter . model . Result ;       public class JUnitReporterTest   {     }  
public class ErrorReporter implements Thread . UncaughtExceptionHandler { public void test ( ) {     reportBuilder ( )   . exception ( e )   . endsApplication ( )   . send ( ) ;     } }  
import java . util . Iterator ;   import java . util . Map ;   import java . io . Serializable ;   public class PersistentStructMap extends APersistentMap {   } public static class Def implements Serializable {   final ISeq keys ;     } 
public class ViewConfiguration {                 public static long getGlobalActionKeyTimeout ( ) {     } }  
public class FileOperationsHelper {     public void toggleKeepInSync ( OCFile file , boolean isFavorite ) {   file . setKeepInSync ( isFavorite ) ;   mFileActivity . getStorageManager ( ) . saveFile ( file ) ;     } }  
public class RouteProvider { public void test ( ) { { { { {   }   }   pt . desc = pt . name ;   }   gpx . points . add ( pt ) ;   }   return gpx ;   }     }  
public class DrawHandler extends Handler {     public void quit ( ) {   removeMessages ( QUIT ) ;   sendEmptyMessage ( QUIT ) ;   }     }  
final class BasicOperationService implements InternalOperationService {     public int getRemoteOperationsCount ( ) {   return invocations . size ( ) ;   }       }  
public class VoiceInteractionService extends Service { public void test ( ) {   if ( curComp == null ) {   return false ;   }   return curComp . equals ( service ) ;   }       }  
public abstract class JspManager {     public abstract XmlNSDescriptor getActionsLibrary ( final PsiFile context ) ;     public abstract boolean isJsp_2_1_OrBetter ( final PsiFile context ) ;   }      
public abstract class AbstractService implements VoldemortService {   private static final Logger logger = Logger . getLogger ( VoldemortService . class ) ;   private final AtomicBoolean isStarted ;   private final String name ;   public AbstractService ( String name ) {     } }  
public class Bootstrap extends AbstractBootstrap < Bootstrap , Channel > {   private Bootstrap ( Bootstrap bootstrap ) {   super ( bootstrap ) ;   resolver = bootstrap . resolver ;   remoteAddress = bootstrap . remoteAddress ;   }     }  
public class Frequency extends Entity { public void test ( ) {   writeTimeField ( f . end_time ) ;   writeIntField ( f . headway_secs ) ;   writeIntField ( f . exact_times ) ;   endRecord ( ) ;   }       }  
public class WifiScanner { public void test ( ) {   validateChannel ( ) ;   HotlistSettings settings = new HotlistSettings ( ) ;   settings . bssidInfos = bssidInfos ;   settings . apLostThreshold = apLostThreshold ;   sAsyncChannel . sendMessage ( CMD_SET_HOTLIST , 0 , putListener ( listener ) , settings ) ;   }     }  
public class Tmp { public enum ChatColor {         BLACK ( ' 0 ' , 0x00 ) ,           } }  
public final class Response { public void test ( ) {   synchronized ( fireListenerLock ) {   if ( fireListener ) {     return false ;   }   action ( ActionCode . NB_WRITE_INTEREST , isReady ) ;   fireListener = ! isReady . get ( ) ;     } } }  
public class WsHttpUpgradeHandler implements HttpUpgradeHandler {   private String subProtocol ;   private Map < String , String > pathParameters ;   private boolean secure ;   private WebConnection connection ;   private WsSession wsSession ;     }  
public class WebView extends AbsoluteLayout               { public int getVisibleTitleHeight ( ) {       } }  
public class UpgradeServletOutputStream extends ServletOutputStream { public void test ( ) { {   return ;   }   closed = true ;   flushInternal ( false , false ) ;   }     }  
public abstract class MenuDrawer extends ViewGroup { public void test ( ) {   switch ( action ) {   case MotionEvent . ACTION_DOWN : {   mLastMotionX = mInitialMotionX = ev . getX ( ) ;   mLastMotionY = ev . getY ( ) ;   final boolean allowDrag = onDownAllowDrag ( ev ) ;   if ( allowDrag ) {     } } } } }  
public class AccessibilityNodeInfo implements Parcelable {       public boolean refresh ( ) {   return refresh ( true ) ;   }       }  
public class AstridActivity extends FragmentActivity     { public void onBackPressed ( ) { {   if ( isFinishing ( ) )   return ;   super . onBackPressed ( ) ;   }     } }  
public abstract class TextToSpeechService extends Service {   private boolean mFirstIdle = true ;   public SynthThread ( ) {   super ( SYNTH_THREAD_NAME , android . os . Process . THREAD_PRIORITY_DEFAULT ) ;   }       }  
public class Tmp { public interface FreeFlowEventListener {   } public void layoutComplete ( ) ;   public void layoutComputed ( ) ;           public void dataChanged ( ) ;       }  
public class HorizontalChangeHandler extends AnimatorChangeHandler {     protected void resetFromView ( View from ) {   from . setTranslationX ( 0 ) ;   }   }      
public final class AudioAttributes implements Parcelable { public void test ( ) { {     Log . e ( TAG , " Invalid stream type " + streamType + " for AudioAttributes " ) ;   }   mUsage = usageForLegacyStreamType ( streamType ) ;   return this ;   }     }  
public class TextureView extends View {     public void setLayerType ( int layerType , Paint paint ) {   if ( paint != mLayerPaint ) {   mLayerPaint = paint == null ? new Paint ( ) : paint ;   invalidate ( ) ;   }   }     }  
public class MessagingListener {   public void folderStatusChanged ( Account account , String folderName , int unreadMessageCount ) { }   public void systemStatusChanged ( ) { }     }  
import java . util . List ;   public class ChooseIdentity extends K9ListActivity {   Account mAccount ;   ArrayAdapter < String > adapter ;   public static final String EXTRA_ACCOUNT = " com . fsck . k9 . ChooseIdentity_account " ;     }  
public class AudioHandler extends Plugin { public void test ( ) { {   return false ;   }   AudioPlayer audio = this . players . get ( id ) ;   this . players . remove ( id ) ;   audio . destroy ( ) ;   return true ;   }     }  
public class GitLogUI implements Disposable { public void test ( ) { { { {   }   myBranchSelectorAction . setSymbolicRefs ( myRecalculatedCommon ) ;   myBranchSelectorAction . asTextAction ( ) ;   }   } ;   }     }  
public class TestWebSocket extends TomcatBaseTest {   private static final long serialVersionUID = 1L ;     protected StreamHandler createWebSocketHandler ( String subProtocol ,   HttpServletRequest request ) {   return new Bug53339WsInbound ( ) ;   }     }  
public class AtmosphereFramework { public void test ( ) {   interceptors . clear ( ) ;   broadcasterFactory = null ;   arFactory = null ;   annotationFound = false ;   return this ;   }     }  
public class IWindowManagerImpl implements IWindowManager {     public void requestAppKeyboardShortcuts ( IResultReceiver receiver ) throws RemoteException {   }       public void getStableInsets ( Rect outInsets ) throws RemoteException {   }   }      
import org . mockito . internal . junit . JUnitRule ;           public class MockitoJUnitRule implements MethodRule , MockitoRule {     private final JUnitRule jUnitRule ;     }  
public class PreviewParseWriter extends Iced implements ParseWriter { public void test ( ) { { {   }     types [ i ] = Vec . T_NUM ;   }   return types ;   }     }  
public class ChatEventStream extends EventStream {     public String getApplication ( ) {   return " chatServer " ;   }   public void connectionOpened ( RTMPConnection conn , RTMP state ) {     } }  
public class EthernetDataTracker implements NetworkStateTracker {   public String getTcpBufferSizesPropName ( ) {   return " net . tcp . buffersize . wifi " ;   }     public void setDependencyMet ( boolean met ) {     }   }      
public class AbstractAggregationTest   { public static void startup ( ) { {   HAZELCAST_INSTANCE = Hazelcast . newHazelcastInstance ( ) ;   Hazelcast . newHazelcastInstance ( ) ;   }       } }  
public class SomeRunnableTask implements Runnable , Serializable , ApplicationCont   { public void setApplicationContext ( final ApplicationContext applicationContext ) throws BeansException { { {   context = applicationContext ;   }     }     } }  
public abstract class CreateStreamRequest {   public abstract String contentPack ( ) ;     public abstract Stream . MatchingType matchingType ( ) ;       }  
public class SlidingUpPanelLayout extends ViewGroup {               protected void onFinishInflate ( ) {     } }  
public class HighlightBuilder implements ToXContent {   int numOfFragments = - 1 ;   Boolean requireFieldMatch ;   public Field ( String name ) {   this . name = name ;   }     } 
public class Tmp { public static void main ( String [ ] args ) throws Exception { { { {   {   e . printStackTrace ( err ) ;   }   Agent . shutdown ( ) ;   }   }   }     } }  
import java . util . regex . Pattern ;             public class DefaultGroovyMethods extends DefaultGroovyMethodsSupport { public void test ( ) {     } }  
public class GroupServiceTest { public void test ( ) {   testGroup (   user , group , null , null , true , false , false , false , true , true ,   true ) ;   }       }  
public class Tmp { public enum Material {   SUGAR ( 353 ) ,   CAKE ( 354 , 1 ) ,   BED ( 355 ) ,   DIODE ( 356 ) ,   GOLD_RECORD ( 2256 , 1 ) ,   GREEN_RECORD ( 2257 , 1 ) ;     } }  
public abstract class Transition implements Cloneable {     public Transition removeTarget ( int targetId ) {   if ( targetId > 0 ) {   mTargetIds . remove ( ( Integer ) targetId ) ;   }   return this ;   }     }  
public class NoSpamLoggerTest     { public void testLoggedResult ( ) throws Exception   {   now = 5 ;     NoSpamLogger . log ( mock , Level . INFO , 5 , TimeUnit . NANOSECONDS , statement , param ) ;   checkMock ( Level . INFO ) ;     } }  
public class ByteBufferSend implements Send {     public boolean complete ( ) {   return remaining <= 0 ;   }       }  
public abstract class DurationType implements Serializable {   private static final class MillisType extends DurationType {   static final long serialVersionUID = - 4314867016852780422L ;   public MillisType ( ) {   }     public boolean isPrecise ( ) {   return true ;   }     } }  
public class BuildAndDecodeTest {     public static void afterClass ( ) throws BrutException {   OS . rmdir ( sTmpDir ) ;   }       }  
public class Matrix2f {       public Matrix2f ( float [ ] dataArray ) {   mMat = new float [ 4 ] ;   System . arraycopy ( dataArray , 0 , mMat , 0 , mMat . length ) ;   }     }  
public abstract class DebuggerTestCase extends ExecutionWithDebuggerToolsTestCas       { public ConfigurationType getType ( ) { {   return UnknownConfigurationType . INSTANCE ;   }       } }  
public class CallSessionImpl   { public void test ( ) {   Player player = ( Player ) playersIter . next ( ) ;   player . stop ( ) ;   player . deallocate ( ) ;   player . close ( ) ;   playersIter . remove ( ) ;   }     }  
import org . junit . Assert ;   import org . junit . Before ;   import org . junit . Test ;   public class IndexedSetTest {   private static class Pair {   private int mInt ;     } }  
public class RajawaliRenderer implements GLSurfaceView . Renderer , INode {   public void setCamera ( Camera mCamera ) {   this . mCamera = mCamera ;   mCamera . setProjectionMatrix ( mViewportWidth , mViewportHeight ) ;   }   public Camera getCamera ( ) {     } }  
public class Tmp { public interface CordovaWebView {   void setNetworkAvailable ( boolean online ) ;   String getUrl ( ) ;       Context getContext ( ) ;   void loadUrl ( String url ) ;     } }  
public class DBMaker {         public DBMaker asyncThreadSetDeamon ( ) {   this . _asyncThreadDeamon = true ;   return this ;   } }    
public class EditGroupAction extends PortletAction { public void test ( ) {   String friendlyURL = null ;   boolean active = false ;   boolean manualMembership = true ;   int membershipRestriction =   GroupConstants . DEFAULT_MEMBERSHIP_RESTRICTION ;     } }  
public class MasterClient extends CommunicationProtocol implements Master , Chann   { public void test ( ) { {   msgLog . logMessage ( " MasterClient shutdown " , true ) ;   channelPool . close ( true ) ;   executor . shutdownNow ( ) ;   }   }     }  
public final class Futures { public void test ( ) { }}  
package com . mongodb ;   import com . mongodb . util . TestCase ;   import org . testng . annotations . Test ;   import java . net . UnknownHostException ;      
public class Tmp { public interface PConstants {   static final int ENABLE_STROKE_PURE = 9 ;   static final int DISABLE_STROKE_PURE = - 9 ;   static final int HINT_COUNT = 11 ;       } }  
public class ExtractEditLayout extends LinearLayout { public void test ( ) {   mCallback . onDestroyActionMode ( this ) ;   mCallback = null ;   mMenu . close ( ) ;     mExtractActionButton . setVisibility ( VISIBLE ) ;   mEditButton . setVisibility ( INVISIBLE ) ;     } }  
public final class Util {           public static int getSize ( Bitmap bitmap ) {   return getBitmapByteSize ( bitmap ) ;   }     }  
public class ShutdownTest     { public void testShutdown4 ( ) throws SQLException   {   StubConnection . slowCreate = true ;   HikariConfig config = new HikariConfig ( ) ;     } }  
public abstract class BaseButtonBehavior {   private boolean myPressedByMouse ;   private boolean mySelected ;   private final TimedDeadzone myMouseDeadzone ;   private int myActionTrigger ;     }  
public class Instruction3rmi extends Instruction implements RegisterRangeInstruc     { public Format getFormat ( ) {   return Format . Format3rmi ;   }   public int getRegCount ( ) {     } }  
public final class CookieManager {   public void setCookie ( String url , String value ) {   if ( JniUtil . useChromiumHttpStack ( ) ) {   setCookie ( url , value , false ) ;   return ;   }   WebAddress uri ;     } }  
public class ConversationFragment extends Fragment {     public void onBackendConnected ( ) {   this . activity = ( ConversationActivity ) getActivity ( ) ;   this . conversation = activity . getSelectedConversation ( ) ;   if ( this . conversation == null ) {   return ;     } } }  
public final class ReplayOutputChannelContext extends AbstractOutputChannelConte     { public boolean isInputChannel ( ) { {   return false ;   }       } }  
public abstract class AbstractType     { public final int hashCode ( )   { { {   return signature . hashCode ( ) ;   }   }     } }  
public class NonBooleanMethodNameMayNotStartWithQuestionInspection     { public void readSettings ( Element element ) throws InvalidDataException { {   super . readSettings ( element ) ;   parseQuestionString ( ) ;   }     } }  
public class Sprite extends TextureRegion {       public Sprite ( ) {   setColor ( 1 , 1 , 1 , 1 ) ;   }       }  
public class ParticleSystem extends Entity {   public void reset ( ) {   super . reset ( ) ;   this . mParticlesDueToSpawn = 0 ;   this . mParticlesAlive = 0 ;   }     }  
package com . lmax . disruptor ;         public class EventPoller < T >   {   private final DataProvider < T > dataProvider ;     }  
public class FastArray implements Cloneable {     public String toString ( ) { {   if ( size ( ) == 0 ) return " [ ] " ;   return toList ( ) . toString ( ) ;   }   }     }  
public class ProjectSourceControlPreferencesPane extends ProjectPreferencesPane     { public String getName ( )   { {   return " Version Control " ;   }       } }  
public class AstridNewSyncMigrationTest extends NewSyncTestCase {   public void testAstridSyncMigration ( ) {   setupOldDatabase ( ) ;   new AstridNewSyncMigrator ( ) . performMigration ( ) ;   assertAllModelsHaveUUID ( ) ;   assertAllTagsHaveTagData ( ) ;     } }  
public class TvView extends ViewGroup { public void test ( ) {   if ( this != mSessionCallback ) {   return ;   }   mOverlayViewCreated = false ;   mOverlayViewFrame = null ;   mSessionCallback = null ;   mSession = null ;   if ( mListener != null ) {     } } }  
public class GCalControlSet extends PopupControlSet { public void test ( ) {   DependencyInjectionService . getInstance ( ) . inject ( this ) ;   this . title = title ;   calendars = Calendars . getCalendars ( ) ;   getView ( ) ;   }       }  
public class PortletKeys {   public static final String ITEM_SELECTOR =   " com_liferay_item_selector_web_portlet_ItemSelectorPortlet " ;   public static final String LAYOUTS_ADMIN =   " com_liferay_layout_admin_web_portlet_LayoutAdminPortlet " ;     }  
public class HighLevelFilter extends Filter { public void test ( ) { {   if ( loggingEvent . getMarker ( ) == Logging . LIFECYCLE ) {   return FilterReply . ACCEPT ;   } else {   return FilterReply . NEUTRAL ;   }   }   }     }  
public class AsyncStateMachine {      public synchronized void recycle ( ) {   asyncCtxt = null ;   state = AsyncState . DISPATCHED ;   }}     
abstract class Platform { public void test ( ) {   try {   Class . forName ( " rx . Observable " ) ;   return true ;   } catch ( ClassNotFoundException ignored ) {   }   return false ;   }     }  
public class YUICompressor { public void test ( ) {   if ( inputFilename . equals ( " - " ) ) {   in = new InputStreamReader ( System . in , charset ) ;   type = typeOverride ;   } else {     } } }  
public class Files { public void test ( ) {     class Native {   static {   System . loadLibrary ( " retrofit - android - native " ) ;   }   static native void sync ( String path ) ;     } } }  
public class MessageListFragment extends SherlockFragment implements OnItemClick     { public void onLoaderReset ( Loader < Cursor > loader ) { {   mSelected . clear ( ) ;   mAdapter . swapCursor ( null ) ;   }     } }  
public class PApplet extends Applet       { public boolean saveJSONArray ( JSONArray json , String filename ) { {   return saveJSONArray ( json , filename , null ) ;   }     } }  
public final class CdmaCallTracker extends CallTracker { public void test ( ) {   if ( ar . exception == null ) {     pendingMO . onConnectedInOrOut ( ) ;   pendingMO = null ;   }   break ;     } }  
public class WordPress extends Application { public void test ( ) {   editor . remove ( WordPress . ACCESS_TOKEN_PREFERENCE ) ;   editor . commit ( ) ;   if ( wpDB != null ) {   wpDB . updateLastBlogId ( - 1 ) ;   wpDB . deleteDatabase ( this ) ;   }     } }  
public final class Phases { public void test ( ) {   this . persistenceManager = persistenceManager ;   this . sensorContext = sensorContext ;   this . index = index ;   this . eventBus = eventBus ;   }       }  
import org . mockito . internal . matchers . Equals ;   public class Invocation implements PrintableInvocation {   private static final int MAX_LINE_LENGTH = 35 ;   private final int sequenceNumber ;   private final Object mock ;   private final Method method ;     }  
public class SnackBar {     public SnackBar show ( int message , short duration ) {   show ( message , 0 , duration ) ;   return this ;   }     }  
public class StreamStateMachine {     public synchronized void receivedPushPromise ( ) {   stateChange ( State . IDLE , State . RESERVED_REMOTE ) ;   } }    
class BazaarHistoryParser implements HistoryParser , Executor . StreamHandler { public void test ( ) { {   entries . add ( entry ) ;   }   history = new History ( ) ;   history . setHistoryEntries ( entries ) ;   }     }  
public final class MenuItemImpl implements MenuItem {     public boolean expandActionView ( ) {   if ( ! hasCollapsibleActionView ( ) ) {   return false ;   }     } } 
public class DisUnity {     public static String getVersion ( ) {   return " 0 . 4 . 0 " ;   }   public static String getSignature ( ) {     } }  
